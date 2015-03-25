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

package com.google.devtools.j2objc.gen;

import com.google.common.collect.Iterables;
import com.google.devtools.j2objc.ast.AbstractTypeDeclaration;
import com.google.devtools.j2objc.ast.BodyDeclaration;
import com.google.devtools.j2objc.ast.Expression;
import com.google.devtools.j2objc.ast.FieldDeclaration;
import com.google.devtools.j2objc.ast.FunctionDeclaration;
import com.google.devtools.j2objc.ast.VariableDeclarationFragment;

import org.eclipse.jdt.core.dom.Modifier;

/**
 * Generates private type declarations within the source file.
 *
 * @author Tom Ball, Keith Stanger
 */
public class TypePrivateDeclarationGenerator extends TypeDeclarationGenerator {

  protected TypePrivateDeclarationGenerator(SourceBuilder builder, AbstractTypeDeclaration node) {
    super(builder, node);
  }

  public static void generate(SourceBuilder builder, AbstractTypeDeclaration node) {
    new TypePrivateDeclarationGenerator(builder, node).generate();
  }

  @Override
  protected boolean printPrivateDeclarations() {
    return true;
  }

  // TODO(kstanger): Merge this with generate() in the superclass.
  private void generate() {
    printConstantDefines();
    printClassExtension();
    printFieldSetters();
    printStaticFieldDeclarations();
    printOuterDeclarations();
  }

  private void printClassExtension() {
    if (isInterfaceType()) {
      return;
    }
    Iterable<FieldDeclaration> privateFields = getInstanceFields();
    boolean hasPrivateFields = !Iterables.isEmpty(privateFields);
    Iterable<BodyDeclaration> privateDecls = getInnerDeclarations();
    if (!Iterables.isEmpty(privateDecls) || hasPrivateFields) {
      newline();
      printf("@interface %s ()", typeName);
      if (hasPrivateFields) {
        println(" {");
        printInstanceVariables();
        println("}");
      } else {
        newline();
      }
      printDeclarations(privateDecls);
      println("@end");
    }
  }

  @Override
  protected void printStaticFieldDeclaration(
      VariableDeclarationFragment fragment, String baseDeclaration) {
    Expression initializer = fragment.getInitializer();
    print("static " + baseDeclaration);
    if (initializer != null) {
      print(" = " + generateExpression(initializer));
    }
    println(";");
  }

  @Override
  protected void printFunctionDeclaration(FunctionDeclaration function) {
    newline();
    // We expect native functions to be defined externally.
    if (!Modifier.isNative(function.getModifiers())) {
      print("__attribute__((unused)) static ");
    }
    print(getFunctionSignature(function));
    if (function.returnsRetained()) {
      print(" NS_RETURNS_RETAINED");
    }
    println(";");
  }
}
