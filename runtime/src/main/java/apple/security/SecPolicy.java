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
public class SecPolicy 
    extends CFType 
     {

    
    
    protected SecPolicy() {}
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleX509Basic")
    public static native CFType AppleX509Basic();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleSSL")
    public static native CFType AppleSSL();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleSMIME")
    public static native CFType AppleSMIME();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleEAP")
    public static native CFType AppleEAP();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleIPsec")
    public static native CFType AppleIPsec();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleCodeSigning")
    public static native CFType AppleCodeSigning();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleIDValidation")
    public static native CFType AppleIDValidation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleTimeStamping")
    public static native CFType AppleTimeStamping();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyAppleRevocation")
    public static native CFType AppleRevocation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyOid")
    public static native CFType Oid();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyName")
    public static native CFType Name();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyClient")
    public static native CFType Client();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kSecPolicyRevocationFlags")
    public static native CFType RevocationFlags();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecPolicyGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecPolicyCopyProperties")
    public native CFDictionary copyProperties();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecPolicyCreateBasicX509")
    public static native SecPolicy createBasicX509();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("SecPolicyCreateSSL")
    public static native SecPolicy createSSL(boolean server, CFString hostname);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecPolicyCreateRevocation")
    public static native SecPolicy createRevocation(SecRevocation revocationFlags);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("SecPolicyCreateWithProperties")
    public static native SecPolicy createWithProperties(CFType policyIdentifier, CFDictionary properties);
    
}
