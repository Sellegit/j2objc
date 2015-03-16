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



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFBundleExecutableArchitectureType")
public final class CFBundleExecutableArchitectureType extends ObjCEnum {
    
    @GlobalConstant("kCFBundleExecutableArchitectureI386")
    public static final long I386 = 7L;
    @GlobalConstant("kCFBundleExecutableArchitecturePPC")
    public static final long PPC = 18L;
    @GlobalConstant("kCFBundleExecutableArchitectureX86_64")
    public static final long X86_64 = 16777223L;
    @GlobalConstant("kCFBundleExecutableArchitecturePPC64")
    public static final long PPC64 = 16777234L;
    

}
