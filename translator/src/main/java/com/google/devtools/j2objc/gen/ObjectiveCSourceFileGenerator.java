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

package com.google.devtools.j2objc.gen;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.devtools.j2objc.Options;
import com.google.devtools.j2objc.ast.AbstractTypeDeclaration;
import com.google.devtools.j2objc.ast.Annotation;
import com.google.devtools.j2objc.ast.AnnotationTypeDeclaration;
import com.google.devtools.j2objc.ast.Block;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.CompilationUnit;
import com.google.devtools.j2objc.ast.EnumDeclaration;
import com.google.devtools.j2objc.ast.FieldDeclaration;
import com.google.devtools.j2objc.ast.FunctionDeclaration;
import com.google.devtools.j2objc.ast.Javadoc;
import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.Name;
import com.google.devtools.j2objc.ast.NativeDeclaration;
import com.google.devtools.j2objc.ast.NativeStatement;
import com.google.devtools.j2objc.ast.SingleVariableDeclaration;
import com.google.devtools.j2objc.ast.Statement;
import com.google.devtools.j2objc.ast.TagElement;
import com.google.devtools.j2objc.ast.TextElement;
import com.google.devtools.j2objc.ast.TreeNode;
import com.google.devtools.j2objc.ast.TreeNode.Kind;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.ast.VariableDeclaration;
import com.google.devtools.j2objc.ast.VariableDeclarationFragment;
import com.google.devtools.j2objc.types.IOSBlockTypeBinding;
import com.google.devtools.j2objc.types.IOSMethod;
import com.google.devtools.j2objc.types.IOSMethodBinding;
import com.google.devtools.j2objc.types.IOSParameter;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.devtools.j2objc.util.ErrorUtil;
import com.google.devtools.j2objc.util.NameTable;
import com.google.devtools.j2objc.ast.CompilationUnit;
import com.google.devtools.j2objc.ast.TreeUtil;
import com.google.devtools.j2objc.types.Import;
import com.google.devtools.j2objc.util.ErrorUtil;

import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.internal.compiler.lookup.Binding;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generates source files from AST types.  This class handles common actions
 * shared by the header and implementation generators.
 *
 * @author Tom Ball
 */
public abstract class ObjectiveCSourceFileGenerator extends AbstractSourceGenerator {

  private final GenerationUnit unit;
  private final List<AbstractTypeDeclaration> orderedTypes;
  private final Map<String, AbstractTypeDeclaration> typesByKey;

  /**
   * Create a new generator.
   *
   * @param unit The AST of the source to generate
   * @param emitLineDirectives if true, generate CPP line directives
   */
  protected ObjectiveCSourceFileGenerator(GenerationUnit unit, boolean emitLineDirectives) {
    super(new SourceBuilder(emitLineDirectives));
    this.unit = unit;
    orderedTypes = getOrderedTypes(unit);
    typesByKey = Maps.newHashMap();
    for (AbstractTypeDeclaration typeNode : orderedTypes) {
      typesByKey.put(typeNode.getTypeBinding().getKey(), typeNode);
    }
  }

  /**
   * Returns the suffix for files created by this generator.
   */
  protected abstract String getSuffix();

  protected String getOutputPath() {
    return getGenerationUnit().getOutputPath() + getSuffix();
  }

  protected GenerationUnit getGenerationUnit() {
    return unit;
  }

  protected List<AbstractTypeDeclaration> getOrderedTypes() {
    return orderedTypes;
  }

  protected AbstractTypeDeclaration getLocalTypeNode(ITypeBinding type) {
    return typesByKey.get(type.getKey());
  }

  protected boolean isLocalType(ITypeBinding type) {
    return typesByKey.containsKey(type.getKey());
  }

  protected void setGenerationContext(AbstractTypeDeclaration type) {
    TreeUtil.getCompilationUnit(type).setGenerationContext();
  }

  protected void save(String path) {
    try {
      File outputDirectory = Options.getOutputDirectory();
      File outputFile = new File(outputDirectory, path);
      File dir = outputFile.getParentFile();
      if (dir != null && !dir.exists()) {
        if (!dir.mkdirs()) {
          ErrorUtil.warning("cannot create output directory: " + outputDirectory);
        }
      }
      String source = getBuilder().toString();

      // Make sure file ends with a new-line.
      if (!source.endsWith("\n")) {
        source += '\n';
      }

      Files.write(source, outputFile, Options.getCharset());
    } catch (IOException e) {
      ErrorUtil.error(e.getMessage());
    } finally {
      reset();
    }
  }

  /** Ignores deprecation warnings. Deprecation warnings should be visible for human authored code,
   *  not transpiled code. This method should be paired with popIgnoreDeprecatedDeclarationsPragma.
   */
  protected void pushIgnoreDeprecatedDeclarationsPragma() {
    if (Options.generateDeprecatedDeclarations()) {
      newline();
      println("#pragma clang diagnostic push");
      println("#pragma GCC diagnostic ignored \"-Wdeprecated-declarations\"");
    }
  }

  /** Restores deprecation warnings after a call to pushIgnoreDeprecatedDeclarationsPragma. */
  protected void popIgnoreDeprecatedDeclarationsPragma() {
    if (Options.generateDeprecatedDeclarations()) {
      println("\n#pragma clang diagnostic pop");
    }
  }

  protected void printForwardDeclarations(Set<Import> forwardDecls) {
    Set<String> forwardStmts = Sets.newTreeSet();
    for (Import imp : forwardDecls) {
      forwardStmts.add(createForwardDeclaration(imp.getTypeName(), imp.isInterface()));
    }
    if (!forwardStmts.isEmpty()) {
      newline();
      for (String stmt : forwardStmts) {
        println(stmt);
      }
    }
  }

  private String createForwardDeclaration(String typeName, boolean isInterface) {
    return String.format("@%s %s;", isInterface ? "protocol" : "class", typeName);
  }

<<<<<<< HEAD
  @Override
  protected String getOutputFileName(CompilationUnit node) {
    String result = super.getOutputFileName(node);
    if (node.getMainTypeName().equals(NameTable.PACKAGE_INFO_MAIN_TYPE)) {
      return result.replace(NameTable.PACKAGE_INFO_MAIN_TYPE, NameTable.PACKAGE_INFO_FILE_NAME);
    }
    return result;
  }

  /**
   * Prints the list of instance variables in a type.
   *
   * @param node the type to examine
   * @param privateVars if true, only print private vars, otherwise print all but private vars
   */
  protected void printInstanceVariables(AbstractTypeDeclaration node, boolean privateVars) {
    indent();
    boolean first = true;
    boolean printAllVars = !Options.hidePrivateMembers() && !privateVars;
    for (FieldDeclaration field : TreeUtil.getFieldDeclarations(node)) {
      int modifiers = field.getModifiers();
      if (!Modifier.isStatic(field.getModifiers())
          && (printAllVars || (privateVars == isPrivateOrSynthetic(modifiers)))) {
        List<VariableDeclarationFragment> vars = field.getFragments();
        assert !vars.isEmpty();
        IVariableBinding varBinding = vars.get(0).getVariableBinding();
        ITypeBinding varType = varBinding.getType();
        // Need direct access to fields possibly from inner classes that are
        // promoted to top level classes, so must make all visible fields public.
        if (first) {
          println(" @public");
          first = false;
        }
        printDocComment(field.getJavadoc());
        printIndent();
        if (varType instanceof IOSBlockTypeBinding) {
          IOSBlockTypeBinding blockTypeBinding = (IOSBlockTypeBinding) varType;
          assert field.getFragments().size() == 1 : "TODO: can only suport one fragment for field";
          VariableDeclarationFragment f = field.getFragments().get(0);
          String name = NameTable.getName(f.getName().getBinding());
          String fieldName = (NameTable.javaFieldToObjC(name));
          if (BindingUtil.isWeakReference(varBinding)) {
            // We must add this even without -use-arc because the header may be
            // included by a file compiled with ARC.
            fieldName = "__weak " + fieldName;
          }
          print(blockTypeBinding.getNamedDeclaration(fieldName));
        } else {
          if (BindingUtil.isWeakReference(varBinding)) {
            // We must add this even without -use-arc because the header may be
            // included by a file compiled with ARC.
            print("__weak ");
          }
          String objcType = NameTable.getSpecificObjCType(varType);
          boolean needsAsterisk = !varType.isPrimitive() && !objcType.matches("id|id<.*>|Class")
                                  && !BindingUtil.isValueType(varType);
          if (needsAsterisk && objcType.endsWith(" *")) {
            // Strip pointer from type, as it will be added when appending fragment.
            // This is necessary to create "Foo *one, *two;" declarations.
            objcType = objcType.substring(0, objcType.length() - 2);
          }
          print(objcType);
          print(' ');
          for (Iterator<VariableDeclarationFragment> it = field.getFragments().iterator();
               it.hasNext(); ) {
            VariableDeclarationFragment f = it.next();
            if (needsAsterisk) {
              print('*');
            }
            String name = NameTable.getName(f.getName().getBinding());
            print(NameTable.javaFieldToObjC(name));
            if (it.hasNext()) {
              print(", ");
            }
          }
        }
        println(";");
=======
  private static List<AbstractTypeDeclaration> getOrderedTypes(GenerationUnit generationUnit) {
    // Ordered map because we iterate over it below.
    // We use binding keys because the binding objects are not guaranteed to be
    // unique.
    LinkedHashMap<String, AbstractTypeDeclaration> nodeMap = Maps.newLinkedHashMap();
    for (CompilationUnit unit : generationUnit.getCompilationUnits()) {
      for (AbstractTypeDeclaration node : unit.getTypes()) {
        ITypeBinding typeBinding = node.getTypeBinding();
        if (!BindingUtil.isAdapter(typeBinding)) {
          String key = typeBinding.getKey();
          assert nodeMap.put(key, node) == null;
        }
>>>>>>> 265232a8e65e415f261af90daaa719b8d2d88c3f
      }
    }

    LinkedHashSet<String> orderedKeys = Sets.newLinkedHashSet();

    for (Map.Entry<String, AbstractTypeDeclaration> entry : nodeMap.entrySet()) {
      collectType(entry.getValue().getTypeBinding(), orderedKeys, nodeMap);
    }

    LinkedHashSet<AbstractTypeDeclaration> orderedTypes = Sets.newLinkedHashSet();
    for (String key : orderedKeys) {
      orderedTypes.add(nodeMap.get(key));
    }
    return Lists.newArrayList(orderedTypes);
  }

  private static void collectType(
      ITypeBinding typeBinding, LinkedHashSet<String> orderedKeys,
      Map<String, AbstractTypeDeclaration> nodeMap) {
    if (typeBinding == null) {
      return;
    }
    typeBinding = typeBinding.getTypeDeclaration();
    String key = typeBinding.getKey();
    if (!nodeMap.containsKey(key)) {
      return;
    }
    collectType(typeBinding.getSuperclass(), orderedKeys, nodeMap);
    for (ITypeBinding superInterface : typeBinding.getInterfaces()) {
      collectType(superInterface, orderedKeys, nodeMap);
    }
    orderedKeys.add(key);
  }
}
