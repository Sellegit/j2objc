package apple.localauthentication;


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
import apple.foundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("LocalAuthentication/LocalAuthentication.h")
@Mapping("LAErrorCode")
public final class LAErrorCode extends ObjCEnum {
    
    @GlobalConstant("LAErrorAuthenticationFailed")
    public static final long AuthenticationFailed = -1L;
    @GlobalConstant("LAErrorUserCancel")
    public static final long UserCancel = -2L;
    @GlobalConstant("LAErrorUserFallback")
    public static final long UserFallback = -3L;
    @GlobalConstant("LAErrorSystemCancel")
    public static final long SystemCancel = -4L;
    @GlobalConstant("LAErrorPasscodeNotSet")
    public static final long PasscodeNotSet = -5L;
    @GlobalConstant("LAErrorTouchIDNotAvailable")
    public static final long TouchIDNotAvailable = -6L;
    @GlobalConstant("LAErrorTouchIDNotEnrolled")
    public static final long TouchIDNotEnrolled = -7L;
    

}
