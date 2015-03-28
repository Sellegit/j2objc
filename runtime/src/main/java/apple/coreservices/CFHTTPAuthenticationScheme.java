package apple.coreservices;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork/CFNetwork.h")
public class CFHTTPAuthenticationScheme 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeBasic")
    public static native CFString BasicValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeDigest")
    public static native CFString DigestValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNTLM")
    public static native CFString NTLMValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeKerberos")
    public static native CFString KerberosValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNegotiate")
    public static native CFString NegotiateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNegotiate2")
    public static native CFString Negotiate2Value();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeXMobileMeAuthToken")
    public static native CFString XMobileMeAuthTokenValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeOAuth1")
    public static native CFString OAuth1Value();

}
