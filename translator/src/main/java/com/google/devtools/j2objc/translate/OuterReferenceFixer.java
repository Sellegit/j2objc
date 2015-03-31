/*
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

import com.google.common.collect.Lists;
import com.google.devtools.j2objc.ast.ClassInstanceCreation;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.MethodInvocation;
import com.google.devtools.j2objc.ast.Name;
import com.google.devtools.j2objc.ast.SimpleName;
import com.google.devtools.j2objc.ast.SingleVariableDeclaration;
import com.google.devtools.j2objc.ast.SuperConstructorInvocation;
import com.google.devtools.j2objc.ast.SuperMethodInvocation;
import com.google.devtools.j2objc.ast.ThisExpression;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.types.GeneratedMethodBinding;

import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;

import java.util.List;

/**
 * Updates variable references outside an inner class to the new fields
 * injected into it.
 *
 * @author Keith Stanger
 */
public class OuterReferenceFixer extends TreeVisitor {

  private IVariableBinding outerParam = null;

  @Override
  public boolean visit(MethodDeclaration node) {
    IMethodBinding binding = node.getMethodBinding();
    if (binding.isConstructor()) {
      List<SingleVariableDeclaration> params = node.getParameters();
      if (params.size() > 0) {
        IVariableBinding firstParam = params.get(0).getVariableBinding();
        if (firstParam.getName().equals("outer$")) {
          outerParam = firstParam;
        }
      }
    }
    return true;
  }

  @Override
  public void endVisit(MethodDeclaration node) {
    outerParam = null;
  }

  @Override
  public boolean visit(ClassInstanceCreation node) {
    if (node.getTypeBinding() == null) {
      System.err.println(node + " has no type binding");
      System.err.println(node.getExpression());
    }
    ITypeBinding newType = node.getTypeBinding().getTypeDeclaration();
    ITypeBinding declaringClass = newType.getDeclaringClass();
    if (Modifier.isStatic(newType.getModifiers()) || declaringClass == null) {
      return true;
    }

    GeneratedMethodBinding binding =
        new GeneratedMethodBinding(node.getMethodBinding().getMethodDeclaration());
    node.setMethodBinding(binding);
    addOuterArg(node, binding, declaringClass);

    for (IVariableBinding capturedVar : getCapturedVariables(node)) {
      node.getArguments().add(new SimpleName(capturedVar));
      binding.addParameter(capturedVar.getType());
    }

    assert binding.isVarargs() || node.getArguments().size() == binding.getParameterTypes().length;
    return true;
  }

  private List<IVariableBinding> getCapturedVariables(ClassInstanceCreation node) {
    ITypeBinding newType = node.getTypeBinding().getTypeDeclaration();
    ITypeBinding owningType = TreeUtil.getOwningType(node).getTypeBinding().getTypeDeclaration();
    // Test for the recursive construction of a local class.
    if (owningType.isEqualTo(newType)) {
      return OuterReferenceResolver.getInnerFields(newType);
    }
    return OuterReferenceResolver.getCapturedVars(newType);
  }

  private void addOuterArg(
      ClassInstanceCreation node, GeneratedMethodBinding binding, ITypeBinding declaringClass) {
    ITypeBinding type = node.getTypeBinding().getTypeDeclaration();
    if (!OuterReferenceResolver.needsOuterParam(type)) {
      return;
    }

    Expression outerExpr = node.getExpression();
    List<IVariableBinding> path = OuterReferenceResolver.getPath(node);
    Expression outerArg = null;

    if (outerExpr != null) {
      node.setExpression(null);
      outerArg = outerExpr;
    } else if (path != null) {
      outerArg = Name.newName(fixPath(path));
    } else {
      outerArg = new ThisExpression(declaringClass);
    }

    node.getArguments().add(0, outerArg);
    binding.addParameter(0, declaringClass);
  }

  @Override
  public boolean visit(MethodInvocation node) {
    List<IVariableBinding> path = OuterReferenceResolver.getPath(node);
    if (path != null) {
      node.setExpression(Name.newName(fixPath(path)));
    }
    return true;
  }

  @Override
  public void endVisit(SuperMethodInvocation node) {
    List<IVariableBinding> path = OuterReferenceResolver.getPath(node);
    if (path != null) {
      // We substitute the qualifying type name with the outer variable name.
      node.setQualifier(Name.newName(fixPath(path)));
    } else {
      node.setQualifier(null);
    }
  }

  // For some reason this fixier would like to think that the generated parameters that
  //    an anonymous class referecen should be fixed as well. this is a hack to prevent this
  //    from visiting parameters. specific reasons TODO
  @Override
  public boolean visit(SingleVariableDeclaration node) {
    return false;
  }

  @Override
  public boolean visit(SimpleName node) {
    List<IVariableBinding> path = OuterReferenceResolver.getPath(node);
    if (path != null) {
      if (path.size() == 1 && path.get(0).getConstantValue() != null) {
        IVariableBinding var = path.get(0);
        node.replaceWith(TreeUtil.newLiteral(var.getConstantValue()));
      } else {
        node.replaceWith(Name.newName(fixPath(path)));
      }
    }
    return true;
  }

  @Override
  public boolean visit(ThisExpression node) {
    List<IVariableBinding> path = OuterReferenceResolver.getPath(node);
    if (path != null) {
      node.replaceWith(Name.newName(fixPath(path)));
    } else {
      node.setQualifier(null);
    }
    return true;
  }

  @Override
  public void endVisit(SuperConstructorInvocation node) {
    Expression outerExpression = node.getExpression();
    if (outerExpression == null) {
      return;
    }
    node.setExpression(null);
    ITypeBinding outerExpressionType = outerExpression.getTypeBinding();
    GeneratedMethodBinding binding =
        new GeneratedMethodBinding(node.getMethodBinding().getMethodDeclaration());
    node.setMethodBinding(binding);
    node.getArguments().add(0, outerExpression);
    binding.addParameter(0, outerExpressionType);
  }

  private List<IVariableBinding> fixPath(List<IVariableBinding> path) {
    if (path.get(0) == OuterReferenceResolver.OUTER_PARAMETER) {
      assert outerParam != null : "Trying to fix path: " + path;
      path = Lists.newArrayList(path);
      path.set(0, outerParam);
    }
    return path;
  }
}
