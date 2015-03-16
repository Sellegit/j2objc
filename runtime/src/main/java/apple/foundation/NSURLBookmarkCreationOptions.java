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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSURLBookmarkCreationOptions")
public final class NSURLBookmarkCreationOptions extends ObjCEnum {
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalConstant("NSURLBookmarkCreationPreferFileIDResolution")
    public static final long PreferFileIDResolution = 256L;
    @GlobalConstant("NSURLBookmarkCreationMinimalBookmark")
    public static final long MinimalBookmark = 512L;
    @GlobalConstant("NSURLBookmarkCreationSuitableForBookmarkFile")
    public static final long SuitableForBookmarkFile = 1024L;
    @GlobalConstant("NSURLBookmarkCreationWithSecurityScope")
    public static final long WithSecurityScope = 2048L;
    @GlobalConstant("NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess")
    public static final long SecurityScopeAllowOnlyReadAccess = 4096L;
    

}
