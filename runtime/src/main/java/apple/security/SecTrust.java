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
@Library("Security/Security.h")
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
    public static native int setPolicies(SecTrust trust, CFType policies);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyPolicies")
    public static native int copyPolicies(SecTrust trust, Todo policies);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustSetNetworkFetchAllowed")
    public static native int setNetworkFetchAllowed(SecTrust trust, boolean allowFetch);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustGetNetworkFetchAllowed")
    public static native int getNetworkFetchAllowed(SecTrust trust, Todo allowFetch);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetAnchorCertificates")
    public static native int setAnchorCertificates(SecTrust trust, CFArray anchorCertificates);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetAnchorCertificatesOnly")
    public static native int setAnchorCertificatesOnly(SecTrust trust, boolean anchorCertificatesOnly);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyCustomAnchorCertificates")
    public static native int copyCustomAnchorCertificates(SecTrust trust, Todo anchors);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustSetVerifyDate")
    public static native int setVerifyDate(SecTrust trust, CFDate verifyDate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetVerifyTime")
    public static native double getVerifyTime(SecTrust trust);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustEvaluate")
    public static native int evaluate(SecTrust trust, Todo result);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustEvaluateAsync")
    public static native int evaluateAsync(SecTrust trust, DispatchQueue queue, FunctionPtr result);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustGetTrustResult")
    public static native int getTrustResult(SecTrust trust, Todo result);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustCopyPublicKey")
    public static native SecKey copyPublicKey(SecTrust trust);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetCertificateCount")
    public static native @MachineSizedSInt long getCertificateCount(SecTrust trust);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustGetCertificateAtIndex")
    public static native SecCertificate getCertificateAtIndex(SecTrust trust, @MachineSizedSInt long ix);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("SecTrustCopyExceptions")
    public static native CFData copyExceptions(SecTrust trust);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("SecTrustSetExceptions")
    public static native boolean setExceptions(SecTrust trust, CFData exceptions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecTrustCopyProperties")
    public static native CFArray copyProperties(SecTrust trust);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustCopyResult")
    public static native CFDictionary copyResult(SecTrust trust);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecTrustSetOCSPResponse")
    public static native int setOCSPResponse(SecTrust trust, CFType responseData);
    
}
