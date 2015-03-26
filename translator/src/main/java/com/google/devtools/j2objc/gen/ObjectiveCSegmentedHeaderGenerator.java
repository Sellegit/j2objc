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

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.devtools.j2objc.ast.AbstractTypeDeclaration;
import com.google.devtools.j2objc.types.HeaderImportCollector;
import com.google.devtools.j2objc.types.Import;
import com.google.devtools.j2objc.util.NameTable;

import java.util.List;
import java.util.Map;

/**
 * Generates segmented Objective-C header files from compilation units. In a
 * segmented header each type is given separate header guards and can be
 * included without including the other types in the file.
 *
 * @author Keith Stanger
 */
public class ObjectiveCSegmentedHeaderGenerator extends ObjectiveCHeaderGenerator {

  private final String mainTypeName;

  private Map<AbstractTypeDeclaration, HeaderImportCollector> importCollectors = Maps.newHashMap();

  protected ObjectiveCSegmentedHeaderGenerator(GenerationUnit unit) {
    super(unit);
    // TODO(mthvedt): Remove this and implement -XcombineSrcJars for segmented headers.
    assert getGenerationUnit().getCompilationUnits().size() <= 1;
    mainTypeName = NameTable.getMainTypeFullName(getGenerationUnit().getCompilationUnits().get(0));
  }

  public static void generate(GenerationUnit unit) {
    // TODO(mthvedt): Remove this and implement -XcombineSrcJars for segmented headers.
    if (unit.getCompilationUnits().size() > 1) {
      new ObjectiveCHeaderGenerator(unit).generate();
    } else {
      new ObjectiveCSegmentedHeaderGenerator(unit).generate();
    }
  }

  @Override
  protected void generateFileHeader() {
    println("#include \"J2ObjC_header.h\"");
    newline();
    printf("#pragma push_macro(\"%s_INCLUDE_ALL\")\n", mainTypeName);
    printf("#if %s_RESTRICT\n", mainTypeName);
    printf("#define %s_INCLUDE_ALL 0\n", mainTypeName);
    println("#else");
    printf("#define %s_INCLUDE_ALL 1\n", mainTypeName);
    println("#endif");
    printf("#undef %s_RESTRICT\n", mainTypeName);

    for (AbstractTypeDeclaration type : Lists.reverse(getOrderedTypes())) {
      HeaderImportCollector collector =
          new HeaderImportCollector(HeaderImportCollector.Filter.PUBLIC_ONLY);
      collector.collect(type);
      importCollectors.put(type, collector);
      printLocalIncludes(type, collector);
    }
    pushIgnoreDeprecatedDeclarationsPragma();
  }

  /**
   * Given a {@link com.google.devtools.j2objc.ast.AbstractTypeDeclaration}
   * and its collected {@link com.google.devtools.j2objc.types.Import}s,
   * print its 'local includes'; viz.,
   * {@code INCLUDE} directives for all supertypes that are defined in the current segmented header.
   */
  private void printLocalIncludes(AbstractTypeDeclaration type, HeaderImportCollector collector) {
    List<Import> localImports = Lists.newArrayList();
    for (Import imp : collector.getSuperTypes()) {
      if (mainTypeName.equals(imp.getMainTypeName())) {
        localImports.add(imp);
      }
    }
    if (!localImports.isEmpty()) {
      printf("#if %s_INCLUDE\n", NameTable.getFullName(type.getTypeBinding()));
      for (Import imp : localImports) {
        printf("#define %s_INCLUDE 1\n", imp.getTypeName());
      }
      println("#endif");
    }
  }

  @Override
  protected void generateFileFooter() {
    // Don't need #endif for file-level header guard.
    popIgnoreDeprecatedDeclarationsPragma();
    printf("#pragma pop_macro(\"%s_INCLUDE_ALL\")\n", mainTypeName);
  }

  @Override
  public void generateType(AbstractTypeDeclaration node) {
    String typeName = NameTable.getFullName(node.getTypeBinding());
    newline();
    printf("#if !defined (_%s_) && (%s_INCLUDE_ALL || %s_INCLUDE)\n", typeName, mainTypeName,
           typeName);
    printf("#define _%s_\n", typeName);

    HeaderImportCollector collector = importCollectors.get(node);
    assert collector != null;
    printForwardDeclarations(collector.getForwardDeclarations());

    outer:
    for (Import imp : collector.getSuperTypes()) {
      if (mainTypeName.equals(imp.getMainTypeName())) {
        continue;
      }
      // Verify this import isn't declared in this source file.
      for (AbstractTypeDeclaration type : importCollectors.keySet()) {
        if (imp.getType().equals(type.getTypeBinding())) {
          continue outer;
        }
      }
      newline();
      printf("#define %s_RESTRICT 1\n", imp.getMainTypeName());
      printf("#define %s_INCLUDE 1\n", imp.getTypeName());
      printf("#include \"%s.h\"\n", imp.getImportFileName());
    }

    super.generateType(node);
    newline();
    println("#endif");
  }
}
