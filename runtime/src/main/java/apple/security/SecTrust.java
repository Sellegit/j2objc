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


/*<javadoc>*/
/*</javadoc>*/
@Library("Security")
public class SecTrust 
    extends CFType 
     {

    
    
    protected SecTrust() {}
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustEvaluationDate")
    public static native CFType EvaluationDate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustExtendedValidation")
    public static native CFType ExtendedValidation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustOrganizationName")
    public static native CFType OrganizationName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustResultValue")
    public static native CFType ResultValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustRevocationChecked")
    public static native CFType RevocationChecked();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecTrustRevocationValidUntilDate")
    public static native CFType RevocationValidUntilDate();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustCreateWithCertificates")
    public static native int createWithCertificates(CFType certificates, CFType policies, Todo trust);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("SecTrustSetPolicies")
    public native int setPolicies(CFType policies);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyPolicies")
    public native int copyPolicies(Todo policies);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustSetNetworkFetchAllowed")
    public native int setNetworkFetchAllowed(boolean allowFetch);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustGetNetworkFetchAllowed")
    public native int getNetworkFetchAllowed(Todo allowFetch);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetAnchorCertificates")
    public native int setAnchorCertificates(CFArray anchorCertificates);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetAnchorCertificatesOnly")
    public native int setAnchorCertificatesOnly(boolean anchorCertificatesOnly);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyCustomAnchorCertificates")
    public native int copyCustomAnchorCertificates(Todo anchors);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetVerifyDate")
    public native int setVerifyDate(CFDate verifyDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetVerifyTime")
    public native double getVerifyTime();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustEvaluate")
    public native int evaluate(Todo result);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustEvaluateAsync")
    public native int evaluateAsync(DispatchQueue queue, FunctionPtr result);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustGetTrustResult")
    public native int getTrustResult(Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustCopyPublicKey")
    public native SecKey copyPublicKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetCertificateCount")
    public native @MachineSizedSInt long getCertificateCount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetCertificateAtIndex")
    public native SecCertificate getCertificateAtIndex(@MachineSizedSInt long ix);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("SecTrustCopyExceptions")
    public native CFData copyExceptions();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("SecTrustSetExceptions")
    public native boolean setExceptions(CFData exceptions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustCopyProperties")
    public native CFArray copyProperties();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyResult")
    public native CFDictionary copyResult();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustSetOCSPResponse")
    public native int setOCSPResponse(CFType responseData);
    
}
