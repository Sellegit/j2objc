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


@Mapping("CFURLBookmarkCreationOptions")
public final class CFURLBookmarkCreationOptions extends ObjCEnum {
    
    @GlobalConstant("kCFURLBookmarkCreationMinimalBookmarkMask")
    public static final long MinimalBookmarkMask = 512L;
    @GlobalConstant("kCFURLBookmarkCreationSuitableForBookmarkFile")
    public static final long SuitableForBookmarkFile = 1024L;
    @GlobalConstant("kCFURLBookmarkCreationWithSecurityScope")
    public static final long WithSecurityScope = 2048L;
    @GlobalConstant("kCFURLBookmarkCreationSecurityScopeAllowOnlyReadAccess")
    public static final long SecurityScopeAllowOnlyReadAccess = 4096L;
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("kCFURLBookmarkCreationPreferFileIDResolutionMask")
    public static final long PreferFileIDResolutionMask = 256L;
    

}
