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
@Library("Foundation")
public class NSURLAuthenticationMethod 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSURLAuthenticationMethodDefault")
    protected static native NSString DefaultValue();
    @GlobalConstant("NSURLAuthenticationMethodHTTPBasic")
    protected static native NSString HTTPBasicValue();
    @GlobalConstant("NSURLAuthenticationMethodHTTPDigest")
    protected static native NSString HTTPDigestValue();
    @GlobalConstant("NSURLAuthenticationMethodHTMLForm")
    protected static native NSString HTMLFormValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodNTLM")
    protected static native NSString NTLMValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodNegotiate")
    protected static native NSString NegotiateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodClientCertificate")
    protected static native NSString ClientCertificateValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLAuthenticationMethodServerTrust")
    protected static native NSString ServerTrustValue();
    
}
