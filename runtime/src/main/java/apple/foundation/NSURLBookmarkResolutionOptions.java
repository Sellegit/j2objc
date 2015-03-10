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


@Mapping("NSURLBookmarkResolutionOptions")
public final class NSURLBookmarkResolutionOptions extends ObjCEnum {
    
    @GlobalConstant("NSURLBookmarkResolutionWithoutUI")
    public static final long outUI = 256L;
    @GlobalConstant("NSURLBookmarkResolutionWithoutMounting")
    public static final long outMounting = 512L;
    @GlobalConstant("NSURLBookmarkResolutionWithSecurityScope")
    public static final long SecurityScope = 1024L;
    

}
