package com.google.devtools.j2objc;

import com.google.devtools.j2objc.ast.MethodDeclaration;
import com.google.devtools.j2objc.ast.TreeVisitor;
import com.google.devtools.j2objc.ast.TypeDeclaration;
import com.google.devtools.j2objc.util.BindingUtil;
import com.google.devtools.j2objc.util.JdtParser;
import com.google.devtools.j2objc.util.TimeTracker;
import com.google.j2objc.annotations.Mapping;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;

import java.util.Map;

/**
 * Created by xichen on 1/22/15.
 */
//public class MappingPreProcessor extends FileProcessor {
//
//  public MappingPreProcessor(JdtParser parser) {
//    super(parser);
//  }
//
//  @Override
//  protected void processUnit(
//      String path, String source, CompilationUnit unit, TimeTracker ticker) {
//  }
//}
//
//class MappingExtractor extends TreeVisitor {
//
//  Map<IMethodBinding, String> methodBindingMappings;
//
//  MappingExtractor(Map<IMethodBinding, String> mappings) {
//    this.methodBindingMappings = mappings;
//  }
//
//  @Override
//  public boolean visit(TypeDeclaration node) {
//    // TODO: handle mapping of classes & import statement
//
//    return true;
//  }
//
//  @Override
//  public boolean visit(MethodDeclaration node) {
//    IMethodBinding binding = node.getMethodBinding();
//    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, Mapping.class);
//    if (annotation != null) {
//      String mappedName = (String) BindingUtil.getAnnotationValue(annotation, "value");
//      methodBindingMappings.put(binding, mappedName);
//    }
//
//    // collect anonymous class
//    return true;
//  }
//}

