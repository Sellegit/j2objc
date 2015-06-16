package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.GenerationTest;

import java.io.IOException;

public class MappedNativeMethodRemoverTest extends GenerationTest {

  public void testNotRemovingOCNINativeMethod() throws IOException {
    String source = "import com.google.j2objc.annotations.*;\n"
                    + "\n"
                    + "public class Test {\n"
                    + "    @Mapping(\"go:\")\n"
                    + "    public native void nonSense(Object hehe) /*-[\n"
                    + "    ]-*/;"
                    + "}";
    String translation = translateSourceFile(source, "Test", "Test.m");
    assertTranslation(translation, "go");
  }

  public void testRemovingOCNINativeMethod() throws IOException {
    String source = "import com.google.j2objc.annotations.*;\n"
                    + "\n"
                    + "@Mapping(\"DUMMY\")\n"
                    + "public class Test {\n"
                    + "    @Mapping(\"go:\")\n"
                    + "    public native void go(Object hehe) /*-[\n"
                    + "    ]-*/;"
                    + "}";
    String translation = translateSourceFile(source, "Test", "Test.m");
    assertNotInTranslation(translation, "go");
  }

}
