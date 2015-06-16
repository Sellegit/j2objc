package com.google.devtools.j2objc.translate;

import com.google.common.collect.Lists;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.util.BindingUtil;

import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.internal.compiler.lookup.Binding;

public class MappedNativeMethodRemover extends TreeVisitor {

  @Override
  public void endVisit(TypeDeclaration node) {
    for (BodyDeclaration decl : Lists.newArrayList(node.getBodyDeclarations())) {
      if (decl instanceof MethodDeclaration) {
        MethodDeclaration method = (MethodDeclaration) decl;
        IMethodBinding binding = method.getMethodBinding();
        if (BindingUtil.isNative(binding)) {
          if (BindingUtil.isMappedToNative(binding)) {
            if (method.getBody() == null
                || method.getBody().getStatements() == null
                || method.getBody().getStatements().size() == 0) {
              TreeUtil.remove(decl);
            }
          }
        }
      }
    }
  }
}
