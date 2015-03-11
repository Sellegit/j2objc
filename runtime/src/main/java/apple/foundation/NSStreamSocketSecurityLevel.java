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
public class NSStreamSocketSecurityLevel 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelNone")
    protected static native NSString NoneValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelSSLv2")
    protected static native NSString SSLv2Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelSSLv3")
    protected static native NSString SSLv3Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelTLSv1")
    protected static native NSString TLSv1Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelNegotiatedSSL")
    protected static native NSString NegotiatedSSLValue();
    
}
