# AvantX's J2ObjC: better interop primitives with ObjC world & access to Apple's APIs #

**Original Project site:** <http://j2objc.org><br>

### Overview ###
This is a fork of Google's J2Objc project that has has extentions that make it possible to write Java code that interacts with ObjC constructs including value types, C functions and blocks etc. Moreover, it comes with a relatively complete binding of the iOS system APIs so one can use this fork to write fully native iOS apps just in Java.

### Interop Primitives ###
Interoperation with ObjC world is provided mostly in the form of unintrusive Java Annotations. Here we introduce some of the most commonly used ones:

* `@Mapping("selector")`

`@Mapping` annotation can be applied on instance method and class method, that modifies the output selectors of annotated methods. For instance, if we have the following annotated method declaration:

```java
class Test {
	@Mapping("go")
	public static void test() {}
}
```

Then a method invocation like `Test.test()` will be translated into `[Test go]`.

* `@DotMapping("abc")`, `@GlobalConstant("abc")`, `@GlobalFunction("abc")`

These annotations all modify the translation of a method call just like the `@Mapping` annotation. They will result in respectively: dot-style access for structs, referencing a global constant, and invoking global functions. A good place to get a grasp of all of them is [CGRect.java](https://github.com/Sellegit/j2objc/blob/master/runtime/src/main/java/apple/coregraphics/CGRect.java)

* `@ExtensionMapping("abc")`

ObjC's extension has no counterpart in Java so we use an extension syntax that's kind of like C#'s, where the first argument will be translated as the receiver. Example: [NSCoderExtensions.java](https://github.com/Sellegit/j2objc/blob/master/runtime/src/main/java/apple/uikit/NSCoderExtensions.java)

* `@Mapping("UITableView")` for Class

`@Mapping` annotation can also be applied on a class declaration, which means the said class is mapped to some native class. This has two effects: 1. any class that has this annotation would not generate corresponding ObjC class headers or implementations as they should be provided elsewhere; 2. any method call(incl. instance instantiations etc) would resolve to the native class. For example,

```java
@Mapping("UITableView")
class Hehe {
	@Mapping("goWithInt:")
	public static void test(Int x) {}
}
```

would not generate any implementation/header for class Hehe. And a call like `Hehe.test(123)` would be translated into `[UITableView goWithInt:123]`.