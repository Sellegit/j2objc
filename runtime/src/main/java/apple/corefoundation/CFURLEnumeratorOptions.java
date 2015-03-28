package apple.corefoundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.dispatch.*;
import apple.foundation.*;


@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFURLEnumeratorOptions")
public final class CFURLEnumeratorOptions extends ObjCEnum {
    
    @GlobalConstant("kCFURLEnumeratorDefaultBehavior")
    public static final long DefaultBehavior = 0L;
    @GlobalConstant("kCFURLEnumeratorDescendRecursively")
    public static final long DescendRecursively = 1L;
    @GlobalConstant("kCFURLEnumeratorSkipInvisibles")
    public static final long SkipInvisibles = 2L;
    @GlobalConstant("kCFURLEnumeratorGenerateFileReferenceURLs")
    public static final long GenerateFileReferenceURLs = 4L;
    @GlobalConstant("kCFURLEnumeratorSkipPackageContents")
    public static final long SkipPackageContents = 8L;
    @GlobalConstant("kCFURLEnumeratorIncludeDirectoriesPreOrder")
    public static final long IncludeDirectoriesPreOrder = 16L;
    @GlobalConstant("kCFURLEnumeratorIncludeDirectoriesPostOrder")
    public static final long IncludeDirectoriesPostOrder = 32L;


}
