package com.google.devtools.j2objc.translate;

import com.google.common.collect.Lists;
import com.google.devtools.j2objc.ast.AnonymousClassDeclaration;
import com.google.devtools.j2objc.ast.Assignment;
import com.google.devtools.j2objc.ast.Block;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.ClassInstanceCreation;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.NativeStatement;
import com.google.devtools.j2objc.ast.SimpleName;
import com.google.devtools.j2objc.ast.SimpleType;
import com.google.devtools.j2objc.ast.SingleVariableDeclaration;
import com.google.devtools.j2objc.ast.Statement;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.VariableDeclarationFragment;
import com.google.devtools.j2objc.ast.VariableDeclarationStatement;
import com.google.devtools.j2objc.types.GeneratedMethodBinding;
import com.google.devtools.j2objc.types.GeneratedTypeBinding;
import com.google.devtools.j2objc.types.GeneratedVariableBinding;
import com.google.devtools.j2objc.types.IOSBlockTypeBinding;
import com.google.devtools.j2objc.types.IOSTypeBinding;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.j2objc.annotations.Representing;

import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Generated;
import javax.naming.Binding;

/**
 * This class only handles the rewriting of block parameter into corresponding Java class
 */
public class BlockRewriter extends TreeVisitor {

  @Override
  public void endVisit(MethodDeclaration node) {
    IMethodBinding binding = node.getMethodBinding();

    for (int i = 0; i < binding.getParameterTypes().length; i++) {
      IAnnotationBinding annotation = BindingUtil.getAnnotation(
          binding.getParameterAnnotations(i), com.google.j2objc.annotations.Block.class);
      if (annotation != null) {
        insertBlockWrappingStatement(node.getBody(), node, annotation, i);
      }
    }
  }

  private void insertBlockWrappingStatement(
      Block body, MethodDeclaration node, IAnnotationBinding annotation, int i) {
    IMethodBinding binding = node.getMethodBinding();
//    IAnnotationBinding representing = BindingUtil.getAnnotation(binding.getParameterAnnotations(i),
//                                                Representing.class);
//    IOSTypeBinding nativeBlockType = IOSTypeBinding.newUnmappedClass(
//        (String) BindingUtil.getAnnotationValue(representing, "value")
//    );
    IAnnotationBinding blockAnno = BindingUtil.getAnnotation(
        binding.getParameterAnnotations(i),
        com.google.j2objc.annotations.Block.class
    );
    Object[] argObjs = (Object[]) BindingUtil.getAnnotationValue(blockAnno, "params");
    List<String> args = Lists.newArrayList();
    for (Object argObj : argObjs) {
      args.add((String) argObj);
    }
    IOSBlockTypeBinding nativeBlockType = new IOSBlockTypeBinding(
        (String) BindingUtil.getAnnotationValue(blockAnno, "ret"),
        args
    );

    ITypeBinding blockType = binding.getParameterTypes()[i];
    assert blockType.getDeclaredMethods().length == 1 : "Block interface should only has one method";
    IMethodBinding runMethod = blockType.getDeclaredMethods()[0];
    assert runMethod.getName().equals("run") : "Block interface's invoke method should be named run";

    // rewrite the parameter's type to be the native block type
    GeneratedMethodBinding newMethodBinding = new GeneratedMethodBinding(binding);
    newMethodBinding.setParameter(i, nativeBlockType);
    node.setMethodBinding(newMethodBinding);
    SingleVariableDeclaration oldVarDecl = node.getParameters().get(i);
    SingleVariableDeclaration newVarDecl =
        new SingleVariableDeclaration(oldVarDecl);
    newVarDecl.setType(new SimpleType(nativeBlockType));
    IVariableBinding oldVarBinding = newVarDecl.getVariableBinding();
    GeneratedVariableBinding newVarBinding =
        new GeneratedVariableBinding(oldVarBinding.getName(), oldVarBinding.getModifiers(),
                                     nativeBlockType, oldVarBinding.isField(), oldVarBinding.isParameter(),
                                     oldVarBinding.getDeclaringClass(), oldVarBinding.getDeclaringMethod());
    newVarDecl.setVariableBinding(newVarBinding);
    node.getParameters().set(i, newVarDecl);

    // ignore generic version for now

    GeneratedMethodBinding methodBinding = new GeneratedMethodBinding(runMethod);
    methodBinding.setModifiers(0);
    MethodDeclaration method = new MethodDeclaration(methodBinding);

    final String blockLocalId = "__$block";
    StringBuilder blockCall = new StringBuilder();
    String blockRet = (String) BindingUtil.getAnnotationValue(annotation, "ret");
    if (!blockRet.equals("void")) {
      blockCall.append("return ");
    }

    blockCall.append(blockLocalId);
    blockCall.append("(");
    boolean first = true;
    for (SingleVariableDeclaration var : method.getParameters()) {
      if (first) {
        first = false;
      } else {
        blockCall.append(", ");
      }
      blockCall.append(var.getName());
    }
    blockCall.append(");");

    NativeStatement nativeInvoke = new NativeStatement(blockCall.toString());
    method.setBody(new Block());
    method.getBody().getStatements().add(
      new VariableDeclarationStatement(
        new GeneratedVariableBinding(blockLocalId, 0, nativeBlockType, false, false, null,
                                     method.getMethodBinding()),
        new SimpleName(node.getParameters().get(i).getVariableBinding())
    ));
    method.getBody().getStatements().add(nativeInvoke);

    GeneratedTypeBinding blockTypeBinding =
        new GeneratedTypeBinding("$block" + i, binding.getDeclaringClass().getPackage(), blockType, false, null, binding.getDeclaringClass());
    blockTypeBinding.addMethod(method.getMethodBinding());

    AnonymousClassDeclaration anon =
        new AnonymousClassDeclaration(blockTypeBinding, Lists.newArrayList((BodyDeclaration) method));
    ClassInstanceCreation newObj =
        new ClassInstanceCreation(
            new GeneratedMethodBinding(null, "<init>", 0, Types.instance.ast.resolveWellKnownType("java.lang.Void"), null, blockTypeBinding, true, false, true),
            false /* think about it*/, null,
            new SimpleType(blockType), new LinkedList<Expression>(), anon);

    String wrappedBlockIdent = "__wrapped_" + node.getParameters().get(i).getName();
    GeneratedVariableBinding wrappedBlockBinding =
        new GeneratedVariableBinding(wrappedBlockIdent, 0, blockType, false, false, null, binding);
    VariableDeclarationFragment varDecl =
        new VariableDeclarationFragment(wrappedBlockBinding, newObj);
    List<Statement> stmts = body.getStatements();
    stmts.add(0, new VariableDeclarationStatement(varDecl));

    // todo: rewrite all the references to original parameter

  }
}
