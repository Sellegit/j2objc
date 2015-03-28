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

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSURLAuthenticationMethod 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSURLAuthenticationMethodDefault")
    public static native NSString DefaultValue();
    @GlobalConstant("NSURLAuthenticationMethodHTTPBasic")
    public static native NSString HTTPBasicValue();
    @GlobalConstant("NSURLAuthenticationMethodHTTPDigest")
    public static native NSString HTTPDigestValue();
    @GlobalConstant("NSURLAuthenticationMethodHTMLForm")
    public static native NSString HTMLFormValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodNTLM")
    public static native NSString NTLMValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodNegotiate")
    public static native NSString NegotiateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodClientCertificate")
    public static native NSString ClientCertificateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodServerTrust")
    public static native NSString ServerTrustValue();

}
