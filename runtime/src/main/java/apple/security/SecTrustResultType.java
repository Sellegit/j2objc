package apple.security;


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





@Library("Security")
@Mapping("SecTrustResultType")
public final class SecTrustResultType extends ObjCEnum {
    
    @GlobalConstant("kSecTrustResultInvalid")
    public static final long Invalid = 0L;
    @GlobalConstant("kSecTrustResultProceed")
    public static final long Proceed = 1L;
    @GlobalConstant("kSecTrustResultConfirm")
    public static final long Confirm = 2L;
    @GlobalConstant("kSecTrustResultDeny")
    public static final long Deny = 3L;
    @GlobalConstant("kSecTrustResultUnspecified")
    public static final long Unspecified = 4L;
    @GlobalConstant("kSecTrustResultRecoverableTrustFailure")
    public static final long RecoverableTrustFailure = 5L;
    @GlobalConstant("kSecTrustResultFatalTrustFailure")
    public static final long FatalTrustFailure = 6L;
    @GlobalConstant("kSecTrustResultOtherError")
    public static final long OtherError = 7L;
    

}
