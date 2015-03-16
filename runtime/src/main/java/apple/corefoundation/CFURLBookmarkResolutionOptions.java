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
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFURLBookmarkResolutionOptions")
public final class CFURLBookmarkResolutionOptions extends ObjCEnum {
    
    @GlobalConstant("kCFURLBookmarkResolutionWithoutUIMask")
    public static final long kCFURLBookmarkResolutionWithoutUIMask = 256L;
    @GlobalConstant("kCFURLBookmarkResolutionWithoutMountingMask")
    public static final long kCFURLBookmarkResolutionWithoutMountingMask = 512L;
    @GlobalConstant("kCFURLBookmarkResolutionWithSecurityScope")
    public static final long kCFURLBookmarkResolutionWithSecurityScope = 1024L;
    @GlobalConstant("kCFBookmarkResolutionWithoutUIMask")
    public static final long WithoutUIMask = 256L;
    @GlobalConstant("kCFBookmarkResolutionWithoutMountingMask")
    public static final long WithoutMountingMask = 512L;
    

}
