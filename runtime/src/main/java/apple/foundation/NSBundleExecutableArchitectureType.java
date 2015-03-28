package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h")
@Mapping("NSBundleExecutableArchitectureType")
public final class NSBundleExecutableArchitectureType extends ObjCEnum {
    
    @GlobalConstant("NSBundleExecutableArchitectureI386")
    public static final long I386 = 7L;
    @GlobalConstant("NSBundleExecutableArchitecturePPC")
    public static final long PPC = 18L;
    @GlobalConstant("NSBundleExecutableArchitectureX86_64")
    public static final long X86_64 = 16777223L;
    @GlobalConstant("NSBundleExecutableArchitecturePPC64")
    public static final long PPC64 = 16777234L;


}
