package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.GenerationTest;

import java.io.IOException;

/**
 * Unit tests for {@link AdapterRewriter}.
 */
public class AdapterRewriterTest extends GenerationTest {

  /**
   * If a class inherits an Adapter class, the inheritance should be stripped
   *   with proper interfaces added.
   */
  public void testAbstractMethodsAdded() throws IOException {
    String source = "import com.google.j2objc.annotations.*;\n"
                    + "\n"
                    + "interface DummyProtocol {}\n"
                    + "class ImAdapter implements DummyProtocol {}\n"
                    + "class Implementer extends ImAdapter {}";

    String translation = translateSourceFile(source, "Test", "Test.h");
    assertTranslation(translation, "@interface ImAdapter : NSObject < DummyProtocol >");
  }
}
