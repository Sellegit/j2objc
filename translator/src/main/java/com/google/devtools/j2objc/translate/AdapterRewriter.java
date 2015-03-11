package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.ast.SimpleType;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.Type;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.BindingUtil;

import org.eclipse.jdt.core.dom.ITypeBinding;

public class AdapterRewriter extends TreeVisitor {

  @Override
  public boolean visit(TypeDeclaration node) {
    Type superTpe = node.getSuperclassType();
    if (superTpe != null) {
      ITypeBinding binding = superTpe.getTypeBinding();
      if (BindingUtil.isAdapter(binding)) {
        // if it's an adapter, remove the adapter inheritance and inject corresponding
        //    protocols
        node.setSuperclassType(
            Type.newType(Types.resolveJavaType("java.lang.Object")));
        for (ITypeBinding interfaze : binding.getInterfaces()) {
          node.getSuperInterfaceTypes().add(Type.newType(interfaze));
        }
      }
    }
    return true;
  }
}
