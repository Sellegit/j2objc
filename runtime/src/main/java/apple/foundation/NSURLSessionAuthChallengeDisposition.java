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
@Mapping("NSURLSessionAuthChallengeDisposition")
public final class NSURLSessionAuthChallengeDisposition extends ObjCEnum {
    
    @GlobalConstant("NSURLSessionAuthChallengeUseCredential")
    public static final long UseCredential = 0L;
    @GlobalConstant("NSURLSessionAuthChallengePerformDefaultHandling")
    public static final long PerformDefaultHandling = 1L;
    @GlobalConstant("NSURLSessionAuthChallengeCancelAuthenticationChallenge")
    public static final long CancelAuthenticationChallenge = 2L;
    @GlobalConstant("NSURLSessionAuthChallengeRejectProtectionSpace")
    public static final long RejectProtectionSpace = 3L;
    

}
