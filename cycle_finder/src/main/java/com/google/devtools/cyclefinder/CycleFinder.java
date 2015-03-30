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

package com.google.devtools.cyclefinder;

import com.google.common.base.Strings;
import com.google.devtools.j2objc.ast.CompilationUnit;
import com.google.devtools.j2objc.ast.TreeConverter;
import com.google.devtools.j2objc.file.InputFile;
import com.google.devtools.j2objc.file.RegularInputFile;
import com.google.devtools.j2objc.translate.OuterReferenceResolver;
import com.google.devtools.j2objc.types.Types;
import com.google.devtools.j2objc.util.ErrorUtil;
import com.google.devtools.j2objc.util.FileUtil;
import com.google.devtools.j2objc.util.JdtParser;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A tool for finding possible reference cycles in a Java program.
 *
 * @author Keith Stanger
 */
public class CycleFinder {

  private final Options options;

  static {
    // Enable assertions in the cycle finder.
    ClassLoader loader = CycleFinder.class.getClassLoader();
    if (loader != null) {
      loader.setPackageAssertionStatus(CycleFinder.class.getPackage().getName(), true);
    }
  }

  public CycleFinder(Options options) {
    this.options = options;
  }

  private static JdtParser createParser(Options options) {
    JdtParser parser = new JdtParser();
    parser.addSourcepathEntries(Strings.nullToEmpty(options.getSourcepath()));
    parser.addClasspathEntries(Strings.nullToEmpty(options.getBootclasspath()));
    parser.addClasspathEntries(Strings.nullToEmpty(options.getClasspath()));
    parser.setEncoding(options.fileEncoding());
    return parser;
  }

  private static void exitOnErrors() {
    int nErrors = ErrorUtil.errorCount();
    if (nErrors > 0) {
      System.err.println("Failed with " + nErrors + " errors:");
      for (String error : ErrorUtil.getErrorMessages()) {
        System.err.println("error: " + error);
      }
      System.exit(nErrors);
    }
  }

  private void testFileExistence() {
    for (String filePath : options.getSourceFiles()) {
      File f = new File(filePath);
      if (!f.exists()) {
        ErrorUtil.error("File not found: " + filePath);
      }
    }
  }

  private NameList getBlacklist() throws IOException {
    List<String> blackListFiles = options.getBlacklistFiles();
    if (blackListFiles.isEmpty()) {
      return null;
    }
    return NameList.createFromFiles(blackListFiles);
  }

  public List<List<Edge>> findCycles() throws IOException {
    final TypeCollector typeCollector = new TypeCollector();

    JdtParser parser = createParser(options);
    JdtParser.Handler handler = new JdtParser.Handler() {
      @Override
      public void handleParsedUnit(
          InputFile file, org.eclipse.jdt.core.dom.CompilationUnit jdtUnit) {
        String source = "";
        try {
          source = FileUtil.readFile(file);
        } catch (IOException e) {
          ErrorUtil.error("Error reading file " + file.getPath() + ": " + e.getMessage());
        }
        Types.initialize(jdtUnit);
        CompilationUnit unit = TreeConverter.convertCompilationUnit(jdtUnit, file, source);
        typeCollector.visitAST(unit);
        OuterReferenceResolver.resolve(unit);
      }
    };
    List<InputFile> inputFiles = new ArrayList<InputFile>();
    for (String f: options.getSourceFiles()) {
      inputFiles.add(new RegularInputFile(f));
    }
    parser.parseFiles(inputFiles, handler);

    if (ErrorUtil.errorCount() > 0) {
      return null;
    }

    // Construct the graph and find cycles.
    ReferenceGraph graph = new ReferenceGraph(
        typeCollector, NameList.createFromFiles(options.getWhitelistFiles()),
        getBlacklist());
    return graph.findCycles();
  }

  public static void printCycles(Collection<? extends Iterable<Edge>> cycles, PrintStream out) {
    for (Iterable<Edge> cycle : cycles) {
      out.println();
      out.println("***** Found reference cycle *****");
      for (Edge e : cycle) {
        out.println(e.toString());
      }
      out.println("----- Full Types -----");
      for (Edge e : cycle) {
        out.println(e.getOrigin().getKey());
      }
    }
    out.println();
    out.println(cycles.size() + " CYCLES FOUND.");
  }

  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      Options.help(true);
    }
    Options options = Options.parse(args);
    CycleFinder finder = new CycleFinder(options);
    finder.testFileExistence();
    exitOnErrors();
    List<List<Edge>> cycles = finder.findCycles();
    exitOnErrors();
    printCycles(cycles, System.out);
    System.exit(ErrorUtil.errorCount() + cycles.size());
  }
}
