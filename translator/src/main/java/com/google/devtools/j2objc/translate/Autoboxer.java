/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.ast.ArrayAccess;
import com.google.devtools.j2objc.ast.ArrayInitializer;
import com.google.devtools.j2objc.ast.AssertStatement;
import com.google.devtools.j2objc.ast.Assignment;
import com.google.devtools.j2objc.ast.CastExpression;
import com.google.devtools.j2objc.ast.ClassInstanceCreation;
import com.google.devtools.j2objc.ast.ConditionalExpression;
import com.google.devtools.j2objc.ast.ConstructorInvocation;
import com.google.devtools.j2objc.ast.DoStatement;
import com.google.devtools.j2objc.ast.EnumConstantDeclaration;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.FunctionInvocation;
import com.google.devtools.j2objc.ast.IfStatement;
import com.google.devtools.j2objc.ast.InfixExpression;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.MethodInvocation;
import com.google.devtools.j2objc.ast.ParenthesizedExpression;
import com.google.devtools.j2objc.ast.PostfixExpression;
import com.google.devtools.j2objc.ast.PrefixExpression;
import com.google.devtools.j2objc.ast.ReturnStatement;
import com.google.devtools.j2objc.ast.SimpleName;
import com.google.devtools.j2objc.ast.SuperConstructorInvocation;
import com.google.devtools.j2objc.ast.SuperMethodInvocation;
import com.google.devtools.j2objc.ast.SwitchStatement;
import com.google.devtools.j2objc.ast.TreeNode;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.Type;
import com.google.devtools.j2objc.ast.VariableDeclarationFragment;
import com.google.devtools.j2objc.ast.WhileStatement;
import com.google.devtools.j2objc.types.IOSMethodBinding;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.devtools.j2objc.util.NameTable;

import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;

import java.util.List;

/**
 * Adds support for boxing and unboxing numeric primitive values.
 *
 * @author Tom Ball
 */
public class Autoboxer extends TreeVisitor {

  private static final String VALUE_METHOD = "Value";
  private static final String VALUEOF_METHOD = "valueOf";

  /**
   * Convert a primitive type expression into a wrapped instance.  Each
   * wrapper class has a static valueOf factory method, so "expr" gets
   * translated to "Wrapper.valueOf(expr)".
   */
  private Expression box(Expression expr) {
    ITypeBinding wrapperBinding = Types.getWrapperType(expr.getTypeBinding());
    if (wrapperBinding != null) {
      return newBoxExpression(expr, wrapperBinding);
    } else {
      return expr.copy();
    }
  }

  private Expression boxWithType(Expression expr, ITypeBinding wrapperType) {
    if (Types.isBoxedPrimitive(wrapperType)) {
      return newBoxExpression(expr, wrapperType);
    }
    return box(expr);
  }

  private Expression newBoxExpression(Expression expr, ITypeBinding wrapperType) {
    ITypeBinding primitiveType = Types.getPrimitiveType(wrapperType);
    assert primitiveType != null;
    IMethodBinding wrapperMethod = BindingUtil.findDeclaredMethod(
        wrapperType, VALUEOF_METHOD, primitiveType.getName());
    assert wrapperMethod != null : "could not find valueOf method for " + wrapperType;
    MethodInvocation invocation = new MethodInvocation(wrapperMethod, new SimpleName(wrapperType));
    invocation.getArguments().add(expr.copy());
    return invocation;
  }

  private ITypeBinding findWrapperSuperclass(ITypeBinding type) {
    while (type != null) {
      if (Types.isBoxedPrimitive(type)) {
        return type;
      }
      type = type.getSuperclass();
    }
    return null;
  }

  /**
   * Convert a wrapper class instance to its primitive equivalent.  Each
   * wrapper class has a "classValue()" method, such as intValue() or
   * booleanValue().  This method therefore converts "expr" to
   * "expr.classValue()".
   */
  private Expression unbox(Expression expr) {
    ITypeBinding wrapperType = findWrapperSuperclass(expr.getTypeBinding());
    ITypeBinding primitiveType = Types.getPrimitiveType(wrapperType);
    if (primitiveType != null) {
      IMethodBinding valueMethod = BindingUtil.findDeclaredMethod(
          wrapperType, primitiveType.getName() + VALUE_METHOD);
      assert valueMethod != null : "could not find value method for " + wrapperType;
      return new MethodInvocation(valueMethod, expr.copy());
    } else {
      return expr.copy();
    }
  }

  @Override
  public void endVisit(Assignment node) {
    Expression lhs = node.getLeftHandSide();
    ITypeBinding lhType = lhs.getTypeBinding();
    Expression rhs = node.getRightHandSide();
    ITypeBinding rhType = rhs.getTypeBinding();
    Assignment.Operator op = node.getOperator();
    if (op != Assignment.Operator.ASSIGN && !lhType.isPrimitive()
        && !lhType.equals(Types.resolveJavaType("java.lang.String"))) {
      // Not a simple assignment; need to break the <operation>-WITH_ASSIGN
      // assignment apart.
      node.setOperator(Assignment.Operator.ASSIGN);
      node.setRightHandSide(box(newInfixExpression(lhs, rhs, op, lhType)));
    } else {
      if (lhType.isPrimitive() && !rhType.isPrimitive()) {
        node.setRightHandSide(unbox(rhs));
      } else if (!lhType.isPrimitive() && rhType.isPrimitive()) {
        node.setRightHandSide(boxWithType(rhs, lhType));
      }
    }
  }

  private InfixExpression newInfixExpression(
      Expression lhs, Expression rhs, Assignment.Operator op, ITypeBinding lhType) {
    InfixExpression.Operator infixOp;
    // op isn't an enum, so this can't be a switch.
    if (op == Assignment.Operator.PLUS_ASSIGN) {
      infixOp = InfixExpression.Operator.PLUS;
    } else if (op == Assignment.Operator.MINUS_ASSIGN) {
      infixOp = InfixExpression.Operator.MINUS;
    } else if (op == Assignment.Operator.TIMES_ASSIGN) {
      infixOp = InfixExpression.Operator.TIMES;
    } else if (op == Assignment.Operator.DIVIDE_ASSIGN) {
      infixOp = InfixExpression.Operator.DIVIDE;
    } else if (op == Assignment.Operator.BIT_AND_ASSIGN) {
      infixOp = InfixExpression.Operator.AND;
    } else if (op == Assignment.Operator.BIT_OR_ASSIGN) {
      infixOp = InfixExpression.Operator.OR;
    } else if (op == Assignment.Operator.BIT_XOR_ASSIGN) {
      infixOp = InfixExpression.Operator.XOR;
    } else if (op == Assignment.Operator.REMAINDER_ASSIGN) {
      infixOp = InfixExpression.Operator.REMAINDER;
    } else if (op == Assignment.Operator.LEFT_SHIFT_ASSIGN) {
      infixOp = InfixExpression.Operator.LEFT_SHIFT;
    } else if (op == Assignment.Operator.RIGHT_SHIFT_SIGNED_ASSIGN) {
      infixOp = InfixExpression.Operator.RIGHT_SHIFT_SIGNED;
    } else if (op == Assignment.Operator.RIGHT_SHIFT_UNSIGNED_ASSIGN) {
      infixOp = InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED;
    } else {
      throw new IllegalArgumentException();
    }
    return new InfixExpression(Types.getPrimitiveType(lhType), infixOp, unbox(lhs), unbox(rhs));
  }

  @Override
  public void endVisit(ArrayAccess node) {
    Expression index = node.getIndex();
    if (!index.getTypeBinding().isPrimitive()) {
      node.setIndex(unbox(index));
    }
  }

  @Override
  public void endVisit(ArrayInitializer node) {
    ITypeBinding type = node.getTypeBinding().getElementType();
    List<Expression> expressions = node.getExpressions();
    for (int i = 0; i < expressions.size(); i++) {
      Expression expr = expressions.get(i);
      Expression result = boxOrUnboxExpression(expr, type);
      if (expr != result) {
        expressions.set(i, result);
      }
    }
  }

  @Override
  public void endVisit(AssertStatement node) {
    Expression expression = node.getMessage();
    if (expression != null) {
      ITypeBinding exprType = expression.getTypeBinding();
      if (exprType.isPrimitive()) {
        node.setMessage(box(expression));
      }
    }
  }

  @Override
  public void endVisit(CastExpression node) {
    ITypeBinding type = node.getTypeBinding();
    Expression expr = node.getExpression();
    ITypeBinding exprType = expr.getTypeBinding();
    if (type.isPrimitive() && !exprType.isPrimitive()) {
      // Casting an object to a primitive. Convert the cast type to the wrapper
      // so that we do a proper cast check, as Java would.
      type = Types.getWrapperType(type);
      node.setType(Type.newType(type));
    }
    Expression newExpr = boxOrUnboxExpression(expr, type);
    if (newExpr != expr) {
      TreeNode parent = node.getParent();
      if (parent instanceof ParenthesizedExpression) {
        parent.replaceWith(newExpr);
      } else {
        node.replaceWith(newExpr);
      }
    }
  }

  @Override
  public void endVisit(ClassInstanceCreation node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(ConditionalExpression node) {
    Expression expr = node.getExpression();
    ITypeBinding exprType = expr.getTypeBinding();
    if (!exprType.isPrimitive()) {
      node.setExpression(unbox(expr));
    }

    ITypeBinding nodeType = node.getTypeBinding();
    Expression thenExpr = node.getThenExpression();
    ITypeBinding thenType = thenExpr.getTypeBinding();
    Expression elseExpr = node.getElseExpression();
    ITypeBinding elseType = elseExpr.getTypeBinding();

    if (thenType.isPrimitive() && !nodeType.isPrimitive()) {
      node.setThenExpression(box(thenExpr));
    } else if (!thenType.isPrimitive() && nodeType.isPrimitive()) {
      node.setThenExpression(unbox(thenExpr));
    }

    if (elseType.isPrimitive() && !nodeType.isPrimitive()) {
      node.setElseExpression(box(elseExpr));
    } else if (!elseType.isPrimitive() && nodeType.isPrimitive()) {
      node.setElseExpression(unbox(elseExpr));
    }
  }

  @Override
  public void endVisit(ConstructorInvocation node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(DoStatement node) {
    Expression expression = node.getExpression();
    ITypeBinding exprType = expression.getTypeBinding();
    if (!exprType.isPrimitive()) {
      node.setExpression(unbox(expression));
    }
  }

  @Override
  public void endVisit(EnumConstantDeclaration node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(IfStatement node) {
    Expression expr = node.getExpression();
    ITypeBinding binding = expr.getTypeBinding();

    if (!binding.isPrimitive()) {
      node.setExpression(unbox(expr));
    }
  }

  @Override
  public void endVisit(InfixExpression node) {
    ITypeBinding type = node.getTypeBinding();
    Expression lhs = node.getLeftOperand();
    ITypeBinding lhBinding = lhs.getTypeBinding();
    Expression rhs = node.getRightOperand();
    ITypeBinding rhBinding = rhs.getTypeBinding();
    InfixExpression.Operator op = node.getOperator();

    // Don't unbox for equality tests where both operands are boxed types.
    if ((op == InfixExpression.Operator.EQUALS || op == InfixExpression.Operator.NOT_EQUALS)
        && !lhBinding.isPrimitive() && !rhBinding.isPrimitive()) {
      return;
    }
    // Don't unbox for string concatenation.
    if (op == InfixExpression.Operator.PLUS && Types.isJavaStringType(type)) {
      return;
    }

    if (!lhBinding.isPrimitive()) {
      node.setLeftOperand(unbox(lhs));
    }
    if (!rhBinding.isPrimitive()) {
      node.setRightOperand(unbox(rhs));
    }
    List<Expression> extendedOperands = node.getExtendedOperands();
    for (int i = 0; i < extendedOperands.size(); i++) {
      Expression expr = extendedOperands.get(i);
      if (!expr.getTypeBinding().isPrimitive()) {
        extendedOperands.set(i, unbox(expr));
      }
    }
  }

  @Override
  public void endVisit(MethodInvocation node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(PrefixExpression node) {
    PrefixExpression.Operator op = node.getOperator();
    Expression operand = node.getOperand();
    if (op == PrefixExpression.Operator.INCREMENT) {
      rewriteBoxedPrefixOrPostfix(node, operand, "PreIncr");
    } else if (op == PrefixExpression.Operator.DECREMENT) {
      rewriteBoxedPrefixOrPostfix(node, operand, "PreDecr");
    } else if (!operand.getTypeBinding().isPrimitive()) {
      node.setOperand(unbox(operand));
    }
  }

  @Override
  public void endVisit(PostfixExpression node) {
    PostfixExpression.Operator op = node.getOperator();
    if (op == PostfixExpression.Operator.INCREMENT) {
      rewriteBoxedPrefixOrPostfix(node, node.getOperand(), "PostIncr");
    } else if (op == PostfixExpression.Operator.DECREMENT) {
      rewriteBoxedPrefixOrPostfix(node, node.getOperand(), "PostDecr");
    }
  }

  private void rewriteBoxedPrefixOrPostfix(
      TreeNode node, Expression operand, String methodPrefix) {
    ITypeBinding type = operand.getTypeBinding();
    if (!Types.isBoxedPrimitive(type)) {
      return;
    }
    String funcName = methodPrefix + NameTable.capitalize(Types.getPrimitiveType(type).getName());
    FunctionInvocation invocation = new FunctionInvocation(funcName, type, type, type);
    invocation.getArguments().add(new PrefixExpression(
        PrefixExpression.Operator.ADDRESS_OF, TreeUtil.remove(operand)));
    node.replaceWith(invocation);
  }

  @Override
  public void endVisit(ReturnStatement node) {
    Expression expr = node.getExpression();
    if (expr != null) {
      MethodDeclaration methodDecl = TreeUtil.getOwningMethod(node);
      ITypeBinding returnType = methodDecl.getMethodBinding().getReturnType();
      ITypeBinding exprType = expr.getTypeBinding();
      if (returnType.isPrimitive() && !exprType.isPrimitive()) {
        node.setExpression(unbox(expr));
      }
      if (!returnType.isPrimitive() && exprType.isPrimitive()) {
        node.setExpression(box(expr));
      }
    }
  }

  @Override
  public void endVisit(SuperConstructorInvocation node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(SuperMethodInvocation node) {
    convertArguments(node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(VariableDeclarationFragment node) {
    Expression initializer = node.getInitializer();
    if (initializer != null) {
      ITypeBinding nodeType = node.getVariableBinding().getType();
      ITypeBinding initType = initializer.getTypeBinding();
      if (nodeType.isPrimitive() && !initType.isPrimitive()) {
        node.setInitializer(unbox(initializer));
      } else if (!nodeType.isPrimitive() && initType.isPrimitive()) {
        node.setInitializer(boxWithType(initializer, nodeType));
      }
    }
  }

  @Override
  public void endVisit(WhileStatement node) {
    Expression expression = node.getExpression();
    ITypeBinding exprType = expression.getTypeBinding();
    if (!exprType.isPrimitive()) {
      node.setExpression(unbox(expression));
    }
  }

  @Override
  public void endVisit(SwitchStatement node) {
    Expression expression = node.getExpression();
    ITypeBinding exprType = expression.getTypeBinding();
    if (!exprType.isPrimitive()) {
      node.setExpression(unbox(expression));
    }
  }

  private void convertArguments(IMethodBinding methodBinding, List<Expression> args) {
    if (methodBinding instanceof IOSMethodBinding) {
      return; // already converted
    }
    ITypeBinding[] paramTypes = methodBinding.getParameterTypes();
    for (int i = 0; i < args.size(); i++) {
      ITypeBinding paramType;
      if (methodBinding.isVarargs() && i >= paramTypes.length - 1) {
        paramType = paramTypes[paramTypes.length - 1].getComponentType();
      } else {
        paramType = paramTypes[i];
      }
      Expression arg = args.get(i);
      Expression replacementArg = boxOrUnboxExpression(arg, paramType);
      if (replacementArg != arg) {
        args.set(i, replacementArg);
      }
    }
  }

  private Expression boxOrUnboxExpression(Expression arg, ITypeBinding argType) {
    ITypeBinding argBinding = arg.getTypeBinding();
    if (argType.isPrimitive() && !argBinding.isPrimitive()) {
      return unbox(arg);
    } else if (!argType.isPrimitive() && argBinding.isPrimitive()) {
      return box(arg);
    } else {
      return arg;
    }
  }
}
