package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.ast.SimpleType;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.Type;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.types.GeneratedTypeBinding;
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
        Type objType = Type.newType(Types.resolveJavaType("java.lang.Object"));
        ITypeBinding oldTypeBinding = node.getTypeBinding();
        GeneratedTypeBinding newTypeBinding = new GeneratedTypeBinding(
            oldTypeBinding.getName(), oldTypeBinding.getPackage(),
            objType.getTypeBinding(), false, oldTypeBinding.getComponentType(),
            oldTypeBinding.getDeclaringClass()
        );
        node.setSuperclassType(objType);

        for (ITypeBinding interfaze : binding.getInterfaces()) {
          node.getSuperInterfaceTypes().add(Type.newType(interfaze));
          newTypeBinding.addInterface(interfaze);
        }
        node.setTypeBinding(newTypeBinding);
      }
    }
    return true;
  }
}
