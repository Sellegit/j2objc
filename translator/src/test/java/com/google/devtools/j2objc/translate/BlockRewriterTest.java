package com.google.devtools.j2objc.translate;

import com.google.devtools.j2objc.GenerationTest;

import java.io.IOException;

/**
 * Unit tests for {@link com.google.devtools.j2objc.translate.BlockRewriter}.
 *
 */

public class BlockRewriterTest extends GenerationTest {

  // rewrite the ObjC block object into an appropriate
  //   anonymous object
  public void testBlockRewriting() throws IOException {
    String source = "import com.google.j2objc.annotations.*;\n"
                    + "\n"
                    + "interface VoidBlock1<A> {\n"
                    + "    @Mapping(\"run:param:\")\n"
                    + "    void run(A a, String b);\n"
                    + "}\n"
                    + "public class BlockTester {\n"
                    + "    @Mapping(\"go:\")\n"
                    + "    public void go(@Block(ret=\"void\", params={\"NSString *\", \"NSString *\"}) final VoidBlock1<String> hehe) {\n"
                    + "        hehe.run(\"hehe\", \"haha\");\n"
                    + "    }\n"
                    + "}";
    String translation = translateSourceFile(source, "BlockTester", "BlockTester.m");
    assertTranslation(translation,
                      "[__wrapped_hehe run:@\"hehe\" param:@\"haha\"]");
    assertTranslation(translation, "void (^__$block)(NSString *, NSString *) = val$hehe_;");
    assertTranslation(translation, "__$block(string_0, string_1);");
  }
}
