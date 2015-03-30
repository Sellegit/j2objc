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

import com.google.devtools.j2objc.GenerationTest;
import com.google.devtools.j2objc.Options;

import java.io.IOException;

/**
 * Unit tests for {@link UnsequencedExpressionRewriter}.
 *
 * @author Keith Stanger
 */
public class UnsequencedExpressionRewriterTest extends GenerationTest {

  @Override
  protected void setUp() throws IOException {
    super.setUp();
    Options.enableExtractUnsequencedModifications();
  }

  @Override
  protected void tearDown() throws Exception {
    Options.resetExtractUnsequencedModifications();
    super.tearDown();
  }

  public void testUnsequencedPrefixExpression() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test(int i) { int j = ++i - ++i; } }", "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint unseq$1 = ++i;",
        "jint j = unseq$1 - ++i;");
  }

  public void testUnsequencedAssignmentExpression() throws IOException {
    String translation = translateSourceFile(
        "class Test { int test(int[] data, int i) { return data[i += 2] + i; } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "int unseq$1 = i += 2;",
        "return IOSIntArray_Get(nil_chk(data), unseq$1) + i;");
  }

  public void testUnsequencedConditionalInfixExpression() throws IOException {
    String translation = translateSourceFile(
        "class Test { boolean test(int i) { "
        + "return i == 0 || i == 1 || ++i + i == 2 || i++ + i == 3 || i == 4; } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jboolean unseq$1;",
        "if (!(unseq$1 = (i == 0 || i == 1))) {",
        "  jint unseq$2 = ++i;",
        "  if (!(unseq$1 = (unseq$2 + i == 2))) {",
        "    jint unseq$3 = i++;",
        "    unseq$1 = (unseq$1 || unseq$3 + i == 3 || i == 4);",
        "  }",
        "}",
        "return unseq$1;");
  }

  public void testUnsequencedConditionalExpression() throws IOException {
    String translation = translateSourceFile(
        "class Test { boolean test(int i) { "
        + "return i == 0 ? i++ + i == 0 || i++ + i == 0 : ++i == 1; } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jboolean unseq$1;",
        "if (i == 0) {",
        "  jint unseq$2 = i++;",
        "  jboolean unseq$3;",
        "  if (!(unseq$3 = (unseq$2 + i == 0))) {",
        "    jint unseq$4 = i++;",
        "    unseq$3 = (unseq$3 || unseq$4 + i == 0);",
        "  }",
        "  unseq$1 = unseq$3;",
        "}",
        "else {",
        "  unseq$1 = (++i == 1);",
        "}",
        "return unseq$1;");
  }

  public void testWhileLoop() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test(int i) { while (i + i++ < 10) {} } }", "Test", "Test.m");
    assertTranslatedLines(translation,
        "while (YES) {",
        "  jint unseq$1 = i;",
        "  if (!(unseq$1 + i++ < 10)) break;");
  }

  public void testVariableDeclarationStatementIsSplit() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test() { int i = 0, j = i++ + i, k = j, l = --k - k, m = 1; } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint i = 0;",
        "jint unseq$1 = i++;",
        "jint j = unseq$1 + i, k = j;",
        "jint unseq$2 = --k;",
        "jint l = unseq$2 - k, m = 1;");
  }

  public void testAssertStatement() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test(int i) { assert i++ + i++ == 0 : \"foo\" + i++ + i++; } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint unseq$1 = i++;",
        "jboolean unseq$2 = unseq$1 + i++ == 0;",
        "jint unseq$3 = i++;",
        " NSAssert(unseq$2, [JreStrcat(\"$II\" J2OBJC_COMMA() @\"foo\" J2OBJC_COMMA() unseq$3"
          + " J2OBJC_COMMA() i++) description]);");
  }

  public void testForInitStatements() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test() { int i = 0, j = 0, k = 0; "
        + "for (i = i++ + i++, j = i++ + i++, k = i++ + i++;;) { } } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint i = 0, j = 0, k = 0;",
        "jint unseq$1 = i++;",
        "jint unseq$2 = i++;",
        "i = unseq$1 + unseq$2;",
        "jint unseq$3 = i++;",
        "j = unseq$3 + i++;",
        "jint unseq$4 = i++;",
        "for (k = unseq$4 + i++; ; ) {",
        "}");
  }

  public void testForInitWithDeclaration() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test() { int k = 0; "
        + "for (int i = k++ + k++, j = i++ + i++;;) { } } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint k = 0;",
        "jint unseq$1 = k++;",
        "jint i = unseq$1 + k++;",
        "jint unseq$2 = i++;",
        "for (jint j = unseq$2 + i++; ; ) {",
        "}");
  }

  public void testIfConditionAndUpdaters() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test() { int k = 0; "
        + "for (int i = k++ + k++; i++ + i++ < 10; i++, k = i++ + i++) { "
        + "  String s = \"foo\" + i; } } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint k = 0;",
        "jint unseq$1 = k++;",
        "for (jint i = unseq$1 + k++; ; ) {",
        "  jint unseq$2 = i++;",
        "  if (!(unseq$2 + i++ < 10)) break;",
        "  NSString *s = JreStrcat(\"$I\", @\"foo\", i);",
        "  i++;",
        "  jint unseq$3 = i++;",
        "  k = unseq$3 + i++;",
        "}");
  }

  public void testIfStatement() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test(int i) { "
        + "if (i++ + i++ == 0) {} else if (i++ + i++ == 1) {} else {} } }",
        "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint unseq$1 = i++;",
        "if (unseq$1 + i++ == 0) {",
        "}",
        "else {",
        "  jint unseq$2 = i++;",
        "  if (unseq$2 + i++ == 1) {",
        "  }",
        "  else {",
        "  }",
        "}");
  }

  public void testAssignToArray() throws IOException {
    String translation = translateSourceFile(
        "class Test { void test(int[] arr, int i) { arr[i] = i++; } }", "Test", "Test.m");
    assertTranslatedLines(translation,
        "jint unseq$1 = i;",
        "*IOSIntArray_GetRef(nil_chk(arr), unseq$1) = i++;");
  }
}
