package com.google.devtools.j2objc.translate;

import com.google.common.collect.Lists;
import com.google.devtools.j2objc.ast.Assignment;
import com.google.devtools.j2objc.ast.CastExpression;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.ExpressionStatement;
import com.google.devtools.j2objc.ast.FieldAccess;
import com.google.devtools.j2objc.ast.FunctionInvocation;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.MethodInvocation;
import com.google.devtools.j2objc.ast.ParenthesizedExpression;
import com.google.devtools.j2objc.ast.QualifiedName;
import com.google.devtools.j2objc.ast.ReturnStatement;
import com.google.devtools.j2objc.ast.SimpleName;
import com.google.devtools.j2objc.ast.SingleVariableDeclaration;
import com.google.devtools.j2objc.ast.SuperMethodInvocation;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.Type;
import com.google.devtools.j2objc.ast.VariableDeclaration;
import com.google.devtools.j2objc.ast.VariableDeclarationFragment;
import com.google.devtools.j2objc.types.IOSMethod;
import com.google.devtools.j2objc.types.IOSMethodBinding;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.devtools.j2objc.util.NameTable;

import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;

import java.util.Arrays;
import java.util.List;

/**
 * Adds casts to make sure value types like CFTypes get properly casted to id
 */
public class CFTypeCastResolver extends TreeVisitor {

  private static void addCastToId(Expression expr) {
    CastExpression castExpr = new CastExpression(Types.resolveIOSType("id"), null);
    expr.replaceWith(ParenthesizedExpression.parenthesize(castExpr));
    castExpr.setExpression(expr);
  }

  private static void maybeAddCastToId(Expression expr, ITypeBinding binding) {
    if (expr != null) {
      if (NameTable.getObjCType(binding.getErasure()).equals(NameTable.ID_TYPE)
          && BindingUtil.isCFType(expr.getTypeBinding())) {
        addCastToId(expr);
      }
    }
  }

  @Override
  public void endVisit(MethodInvocation node) {
    IMethodBinding binding = node.getMethodBinding().getMethodDeclaration();

    ITypeBinding[] formals = binding.getParameterTypes();
    List<Expression> args = node.getArguments();
    for (int i = 0; i < args.size(); i++) {
      ITypeBinding expected;
      if (binding.isVarargs()) {
        expected = formals.length > i ? formals[i]
                                      : formals[formals.length - 1].getComponentType();
      } else {
        expected = formals[i];
      }

      maybeAddCastToId(args.get(i), expected);
    }
  }

  @Override
  public void endVisit(SuperMethodInvocation node) {
    IMethodBinding binding = node.getMethodBinding().getMethodDeclaration();

    ITypeBinding[] formals = binding.getParameterTypes();
    List<Expression> args = node.getArguments();
    for (int i = 0; i < formals.length; i++) {
      ITypeBinding expected = binding.getParameterTypes()[i];
      maybeAddCastToId(args.get(i), expected);
    }
  }

  @Override
  public void endVisit(MethodDeclaration node) {
    Type type = node.getReturnType();
    if (type != null) {
      final ITypeBinding returnTpe = type.getTypeBinding();
      node.accept(new TreeVisitor() {
        @Override
        public void endVisit(ReturnStatement ret) {
          maybeAddCastToId(ret.getExpression(), returnTpe);
        }
      });
    }
  }

  @Override
  public void endVisit(SingleVariableDeclaration node) {
    maybeAddCastToId(node.getInitializer(), node.getVariableBinding().getType());
  }

  @Override
  public void endVisit(VariableDeclarationFragment node) {
    maybeAddCastToId(node.getInitializer(), node.getVariableBinding().getType());
  }

  @Override
  public void endVisit(Assignment node) {
    maybeAddCastToId(node.getRightHandSide(), node.getLeftHandSide().getTypeBinding());
  }
}
