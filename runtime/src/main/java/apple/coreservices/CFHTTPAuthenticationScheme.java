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
    protected static native CFString BasicValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeDigest")
    protected static native CFString DigestValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNTLM")
    protected static native CFString NTLMValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeKerberos")
    protected static native CFString KerberosValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNegotiate")
    protected static native CFString NegotiateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeNegotiate2")
    protected static native CFString Negotiate2Value();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeXMobileMeAuthToken")
    protected static native CFString XMobileMeAuthTokenValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCFHTTPAuthenticationSchemeOAuth1")
    protected static native CFString OAuth1Value();
    
}
