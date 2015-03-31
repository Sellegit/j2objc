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
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.devtools.j2objc.Options;
import com.google.devtools.j2objc.ast.AbstractTypeDeclaration;
import com.google.devtools.j2objc.ast.AnnotationTypeDeclaration;
import com.google.devtools.j2objc.ast.Block;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.ClassInstanceCreation;
import com.google.devtools.j2objc.ast.CompilationUnit;
import com.google.devtools.j2objc.ast.ConstructorInvocation;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.ExpressionStatement;
import com.google.devtools.j2objc.ast.FieldAccess;
import com.google.devtools.j2objc.ast.FunctionDeclaration;
import com.google.devtools.j2objc.ast.FunctionInvocation;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.MethodInvocation;
import com.google.devtools.j2objc.ast.NormalAnnotation;
import com.google.devtools.j2objc.ast.QualifiedName;
import com.google.devtools.j2objc.ast.ReturnStatement;
import com.google.devtools.j2objc.ast.SimpleName;
import com.google.devtools.j2objc.ast.SingleMemberAnnotation;
import com.google.devtools.j2objc.ast.SingleVariableDeclaration;
import com.google.devtools.j2objc.ast.Statement;
import com.google.devtools.j2objc.ast.SuperConstructorInvocation;
import com.google.devtools.j2objc.ast.SuperFieldAccess;
import com.google.devtools.j2objc.ast.SuperMethodInvocation;
import com.google.devtools.j2objc.ast.ThisExpression;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.types.AbstractTypeBinding;
import com.google.devtools.j2objc.ast.VariableDeclarationStatement;
import com.google.devtools.j2objc.types.GeneratedVariableBinding;
import com.google.devtools.j2objc.types.IOSMethodBinding;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.devtools.j2objc.util.ErrorUtil;
import com.google.devtools.j2objc.util.NameTable;
import com.google.devtools.j2objc.util.TranslationUtil;

import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.internal.compiler.lookup.Binding;

import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Converts methods that don't need dynamic dispatch to C functions. This optimization
 * initially just targets private methods, but will be expanded to include final methods
 * that don't override superclass methods.
 *
 * @author Tom Ball
 */
public class Functionizer extends TreeVisitor {

  private final IOSMethodBinding autoreleaseBinding;
  private Set<IMethodBinding> functionizableMethods;
//  private Map<IMethodBinding, FunctionDeclaration> functionizedMethods = Maps.newHashMap();

  public Functionizer() {
    ITypeBinding idType = Types.resolveIOSType("id");
    autoreleaseBinding = IOSMethodBinding.newMethod(
        NameTable.AUTORELEASE_METHOD, Modifier.PUBLIC, idType, idType);
  }

  @Override
  public boolean visit(CompilationUnit node) {
    functionizableMethods = determineFunctionizableMethods(node);
    return true;
  }

  /**
   * Determines the set of methods to functionize. In addition to a method being
   * final we must also find an invocation for that method. Static methods, though,
   * are always functionized since there are no dynamic dispatch issues.
   */
  private Set<IMethodBinding> determineFunctionizableMethods(final CompilationUnit unit) {
    if (!Options.finalMethodsAsFunctions()) {
      return Collections.emptySet();
    }
    final Set<IMethodBinding> functionizableDeclarations = Sets.newHashSet();
    final Set<IMethodBinding> invocations = Sets.newHashSet();
    unit.accept(new TreeVisitor() {
      @Override
      public void endVisit(MethodDeclaration node) {
        if (canFunctionize(node)) {
          functionizableDeclarations.add(node.getMethodBinding());
        }
      }

      @Override
      public void endVisit(MethodInvocation node) {
        invocations.add(node.getMethodBinding().getMethodDeclaration());
      }
    });
    return Sets.intersection(functionizableDeclarations, invocations);
  }

  @Override
  public boolean visit(AnnotationTypeDeclaration node) {
    return false;
  }

  @Override
  public boolean visit(NormalAnnotation node) {
    return false;
  }

  @Override
  public boolean visit(SingleMemberAnnotation node) {
    return false;
  }

  /**
   * Determines whether an instance method can be functionized.
   */
  private boolean canFunctionize(MethodDeclaration node) {
    IMethodBinding m = node.getMethodBinding();
    int modifiers = node.getModifiers();

    // Never functionize these types of methods.
    if (Modifier.isStatic(modifiers) || Modifier.isAbstract(modifiers)
        || BindingUtil.isSynthetic(modifiers) || m.isAnnotationMember()
        || BindingUtil.isDestructor(m)) {
      return false;
    }

    // Don't functionize equals/hash, since they are often called by collections.
    String name = m.getName();
    if ((name.equals("hashCode") && m.getParameterTypes().length == 0)
        || (name.equals("equals") && m.getParameterTypes().length == 1)) {
      return false;
    }

    if (!BindingUtil.isPrivate(m) && !BindingUtil.isFinal(m)) {
      return false;
    }

    // Don't functionzie a mapped method
    if (BindingUtil.isMappedToNative(node.getMethodBinding())) {
      return false;
    }

    return !hasSuperMethodInvocation(node);
  }


  private static boolean hasSuperMethodInvocation(MethodDeclaration node) {
    final boolean[] result = new boolean[1];
    result[0] = false;
    node.accept(new TreeVisitor() {
      @Override
      public void endVisit(SuperMethodInvocation node) {
        result[0] = true;
      }
    });
    return result[0];
  }

  @Override
  public void endVisit(MethodInvocation node) {
    IMethodBinding binding = node.getMethodBinding().getMethodDeclaration();

    // Don't functionzie a mapped method
    if (BindingUtil.isMappedToNative(binding)) {
      return;
    }

    if (!BindingUtil.isStatic(binding) && !functionizableMethods.contains(binding)) {
      return;
    }

    FunctionInvocation functionInvocation = new FunctionInvocation(
        NameTable.getFullFunctionName(binding), node.getTypeBinding(), binding.getReturnType(),
        binding.getDeclaringClass());
    List<Expression> args = functionInvocation.getArguments();
    TreeUtil.moveList(node.getArguments(), args);

    if (!BindingUtil.isStatic(binding)) {
      Expression expr = node.getExpression();
      if (expr == null) {
        ITypeBinding thisClass = TreeUtil.getOwningType(node).getTypeBinding();
        expr = new ThisExpression(thisClass);
      }
      args.add(0, TreeUtil.remove(expr));
    }

    node.replaceWith(functionInvocation);
  }

  @Override
  public void endVisit(SuperMethodInvocation node) {
    IMethodBinding binding = node.getMethodBinding().getMethodDeclaration();
    // Yes, super method invocations can be static.
    if (!BindingUtil.isStatic(binding)) {
      return;
    }

    FunctionInvocation functionInvocation = new FunctionInvocation(
        NameTable.getFullFunctionName(binding), node.getTypeBinding(), binding.getReturnType(),
        binding.getDeclaringClass());
    TreeUtil.moveList(node.getArguments(), functionInvocation.getArguments());
    node.replaceWith(functionInvocation);
  }

  private void visitConstructorInvocation(
      Statement node, IMethodBinding binding, List<Expression> args) {
    if (BindingUtil.isMappedToNative(binding)) {
      return;
    }
    if (isConstructorOfMappedClass(binding)) {
      return;
    }

    ITypeBinding declaringClass = binding.getDeclaringClass();
    FunctionInvocation invocation = new FunctionInvocation(
        NameTable.getFullFunctionName(binding), declaringClass, declaringClass, declaringClass);
    invocation.getArguments().add(new ThisExpression(declaringClass));
    TreeUtil.moveList(args, invocation.getArguments());
    node.replaceWith(new ExpressionStatement(invocation));
  }

  @Override
  public void endVisit(SuperConstructorInvocation node) {
    visitConstructorInvocation(node, node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(ConstructorInvocation node) {
    visitConstructorInvocation(node, node.getMethodBinding(), node.getArguments());
  }

  @Override
  public void endVisit(ClassInstanceCreation node) {
    IMethodBinding binding = node.getMethodBinding();
    ITypeBinding type = binding.getDeclaringClass();
    if (BindingUtil.isMappedToNative(binding)) {
      return;
    }
    if (isConstructorOfMappedClass(binding)) {
      return;
    }

    FunctionInvocation invocation = new FunctionInvocation(
        NameTable.getAllocatingConstructorName(binding), type, type, type);
    TreeUtil.moveList(node.getArguments(), invocation.getArguments());
    Expression expression = invocation;
    if (Options.useReferenceCounting() && !node.hasRetainedResult()) {
      expression = new MethodInvocation(
          IOSMethodBinding.newTypedInvocation(autoreleaseBinding, type), expression);
    }
    node.replaceWith(expression);
  }

  @Override
  public void endVisit(MethodDeclaration node) {
    IMethodBinding binding = node.getMethodBinding();

    if (BindingUtil.isMappedToNative(binding)
        || isConstructorOfMappedClass(binding)) {
      // mapped method should not be functionized. they will not
      //   be called anyways
      if (binding.isConstructor()) {
        node.getBody()
            .getStatements()
            .add(new ReturnStatement(new ThisExpression(binding.getDeclaringClass())));
      }
      return;
    }

    FunctionDeclaration function = null;
    List<BodyDeclaration> declarationList = TreeUtil.asDeclarationSublist(node);
    List<String> extraSelectors = NameTable.getExtraSelectors(binding);
    if (BindingUtil.isStatic(binding) || binding.isConstructor()
        || Modifier.isNative(node.getModifiers()) || functionizableMethods.contains(binding)
        || !extraSelectors.isEmpty()) {
      ITypeBinding declaringClass = binding.getDeclaringClass();
      function = makeFunction(node);

      for (String selector : extraSelectors) {
        declarationList.add(makeExtraMethodDeclaration(node, selector, function));
      }
      declarationList.add(function);
      if (binding.isConstructor() && !BindingUtil.isAbstract(declaringClass)) {
        declarationList.add(makeAllocatingConstructor(node));
      }
      boolean keepMethod = !BindingUtil.isStatic(binding) || !Options.removeClassMethods();
      if (keepMethod || TranslationUtil.needsReflection(declaringClass)) {
        setFunctionCaller(node, function);
        if (!keepMethod) {
          // We're only keeping the method for reflection, so we can keep it out
          // of the declaration.
          node.addModifiers(BindingUtil.ACC_SYNTHETIC);
        }
        if (binding.isConstructor()) {
          node.getBody()
              .getStatements()
              .add(new ReturnStatement(new ThisExpression(binding.getDeclaringClass())));
        }
      } else {
        node.remove();
      }

      ErrorUtil.functionizedMethod();
    }
  }

  private MethodDeclaration makeExtraMethodDeclaration(
      MethodDeclaration original, String selector, FunctionDeclaration function) {
    IMethodBinding originalBinding = original.getMethodBinding();
    IOSMethodBinding binding = IOSMethodBinding.newMappedMethod(selector, originalBinding);
    MethodDeclaration declaration = new MethodDeclaration(binding);
    TreeUtil.copyList(original.getParameters(), declaration.getParameters());
    setFunctionCaller(declaration, function);
    return declaration;
  }

  /**
   * Create an equivalent function declaration for a given method.
   */
  private FunctionDeclaration makeFunction(MethodDeclaration method) {
    IMethodBinding m = method.getMethodBinding();
    ITypeBinding declaringClass = m.getDeclaringClass();
    boolean isInstanceMethod = !BindingUtil.isStatic(m) && !m.isConstructor();

    FunctionDeclaration function = new FunctionDeclaration(
        NameTable.getFullFunctionName(m), m.getReturnType());

    if (!BindingUtil.isStatic(m)) {
      GeneratedVariableBinding var = new GeneratedVariableBinding(NameTable.SELF_NAME, 0,
          declaringClass, false, true, declaringClass, null);
      function.getParameters().add(new SingleVariableDeclaration(var));
    }
    TreeUtil.copyList(method.getParameters(), function.getParameters());
    function.setModifiers(
        BindingUtil.isPrivate(m) || isInstanceMethod ? Modifier.PRIVATE : Modifier.PUBLIC);

    if (Modifier.isNative(method.getModifiers())) {
      function.addModifiers(Modifier.NATIVE);
      return function;
    }

    function.setBody(TreeUtil.remove(method.getBody()));

    if (BindingUtil.isStatic(m)) {
      // Add class initialization invocation, since this may be the first use of this class.
      if (!BindingUtil.isMappedToNative(declaringClass)) {
        // Note, if the class is mapped to a native class, such initialization is not needed
        String initName = String.format("%s_initialize", NameTable.getFullName(declaringClass));
        ITypeBinding voidType = Types.resolveJavaType("void");
        FunctionInvocation initCall =
            new FunctionInvocation(initName, voidType, voidType, declaringClass);
        function.getBody().getStatements().add(0, new ExpressionStatement(initCall));
      }
    }

    if (!BindingUtil.isStatic(m)) {
      FunctionConverter.convert(function);
    }

    return function;
  }

  /**
   * Create a wrapper for a constructor that does the object allocation.
   */
  private FunctionDeclaration makeAllocatingConstructor(MethodDeclaration method) {
    assert method.isConstructor();
    IMethodBinding binding = method.getMethodBinding();
    ITypeBinding voidType = binding.getReturnType();
    ITypeBinding declaringClass = binding.getDeclaringClass();

    FunctionDeclaration function = new FunctionDeclaration(
        NameTable.getAllocatingConstructorName(binding), declaringClass);
    function.setModifiers(BindingUtil.isPrivate(binding) ? Modifier.PRIVATE : Modifier.PUBLIC);
    function.setReturnsRetained(true);
    TreeUtil.copyList(method.getParameters(), function.getParameters());
    Block body = new Block();
    function.setBody(body);
    List<Statement> stmts = body.getStatements();

    // Add class initialization invocation, since this may be the first use of this class.
    GeneratedVariableBinding selfVar = new GeneratedVariableBinding(
        NameTable.SELF_NAME, 0, declaringClass, false, false, declaringClass, null);
    IOSMethodBinding allocBinding = IOSMethodBinding.newMethod(
        NameTable.ALLOC_METHOD, Modifier.PUBLIC, Types.resolveIOSType("id"),
        Types.resolveIOSType("NSObject"));
    stmts.add(new VariableDeclarationStatement(
        selfVar, new MethodInvocation(allocBinding, new SimpleName(declaringClass))));

    FunctionInvocation invocation = new FunctionInvocation(
        NameTable.getFullFunctionName(binding), voidType, voidType, declaringClass);
    List<Expression> args = invocation.getArguments();
    args.add(new SimpleName(selfVar));
    for (SingleVariableDeclaration param : function.getParameters()) {
      args.add(new SimpleName(param.getVariableBinding()));
    }
    stmts.add(new ExpressionStatement(invocation));

    stmts.add(new ReturnStatement(new SimpleName(selfVar)));
    return function;
  }

  /**
   *  Replace method block statements with single statement that invokes function.
   */
  private void setFunctionCaller(MethodDeclaration method, FunctionDeclaration function) {
    IMethodBinding methodBinding = method.getMethodBinding();
    ITypeBinding returnType = function.getReturnType().getTypeBinding();
    ITypeBinding declaringClass = methodBinding.getDeclaringClass();
    Block body = new Block();
    method.setBody(body);
    method.removeModifiers(Modifier.NATIVE);
    List<Statement> stmts = body.getStatements();
    FunctionInvocation invocation = new FunctionInvocation(
        function.getName(), returnType, returnType, declaringClass);
    List<Expression> args = invocation.getArguments();
    if (!BindingUtil.isStatic(methodBinding)) {
      args.add(new ThisExpression(methodBinding.getDeclaringClass()));
    }
    for (SingleVariableDeclaration param : method.getParameters()) {
      args.add(new SimpleName(param.getVariableBinding()));
    }
    if (Types.isVoidType(returnType)) {
      stmts.add(new ExpressionStatement(invocation));
    } else {
      stmts.add(new ReturnStatement(invocation));
    }
  }

  private boolean isConstructorOfMappedClass(IMethodBinding binding) {
    if (!binding.isConstructor()) {
      return false;
    }

    ITypeBinding current = binding.getDeclaringClass();
    while (current != null) {
      if (BindingUtil.isMappedToNative(current)) {
        return true;
      } else {
        current = current.getSuperclass();
      }
    }

    return false;
  }

  /**
   * Convert references to "this" in the function to a "self" parameter.
   */
  private static class FunctionConverter extends TreeVisitor {

    private final IVariableBinding selfParam;

    static void convert(FunctionDeclaration function) {
      IVariableBinding selfParam = function.getParameters().get(0).getVariableBinding();
      function.accept(new FunctionConverter(selfParam));
    }

    private FunctionConverter(IVariableBinding selfParam) {
      this.selfParam = selfParam;
    }

    @Override
    public boolean visit(FieldAccess node) {
      node.getExpression().accept(this);
      return false;
    }

    @Override
    public boolean visit(QualifiedName node) {
      node.getQualifier().accept(this);
      return false;
    }

    @Override
    public void endVisit(SimpleName node) {
      IVariableBinding var = TreeUtil.getVariableBinding(node);
      if (var != null && var.isField()) {
        // Convert name to self->name.
        node.replaceWith(new QualifiedName(var, new SimpleName(selfParam)));
      }
    }

    @Override
    public boolean visit(SuperFieldAccess node) {
      // Change super.field expression to self.field.
      SimpleName qualifier = new SimpleName(selfParam);
      FieldAccess newAccess = new FieldAccess(node.getVariableBinding(), qualifier);
      node.replaceWith(newAccess);
      return false;
    }

    @Override
    public void endVisit(ThisExpression node) {
      SimpleName self = new SimpleName(selfParam);
      node.replaceWith(self);
    }

    @Override
    public void endVisit(SuperMethodInvocation node) {
      // Super invocations won't work from a function. Setting the qualifier
      // will cause SuperMethodInvocationRewriter to rewrite this invocation.
      if (node.getQualifier() == null) {
        node.setQualifier(new SimpleName(selfParam));
      }
    }

  }
}
