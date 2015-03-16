package com.google.devtools.j2objc.translate;

import com.google.common.collect.Lists;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.util.BindingUtil;

import org.eclipse.jdt.core.dom.IMethodBinding;

public class MappedNativeMethodRemover extends TreeVisitor {

  @Override
  public void endVisit(TypeDeclaration node) {
    for (BodyDeclaration decl : Lists.newArrayList(node.getBodyDeclarations())) {
      if (decl instanceof MethodDeclaration) {
        MethodDeclaration method = (MethodDeclaration) decl;
        IMethodBinding binding = method.getMethodBinding();
        if (BindingUtil.isNative(binding)) {
          if (BindingUtil.extractMappingName(binding) != null
              || BindingUtil.extractDotMappingName(binding) != null
              || BindingUtil.extractGlobalConstantName(binding) != null
              || BindingUtil.extractGlobalFunctionName(binding) != null) {
            // NOTE: this again messes up the binding system so this is expected to be the last
            //     transformation to run
            TreeUtil.remove(decl);
          }
        }
      }
    }
  }
}
