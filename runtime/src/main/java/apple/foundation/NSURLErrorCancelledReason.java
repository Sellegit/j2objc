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
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation/Foundation.h")
@Mapping("NSURLErrorCancelledReason")
public final class NSURLErrorCancelledReason extends ObjCEnum {
    
    @GlobalConstant("NSURLErrorCancelledReasonUserForceQuitApplication")
    public static final long UserForceQuitApplication = 0L;
    @GlobalConstant("NSURLErrorCancelledReasonBackgroundUpdatesDisabled")
    public static final long BackgroundUpdatesDisabled = 1L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLErrorCancelledReasonInsufficientSystemResources")
    public static final long InsufficientSystemResources = 2L;
    

}
