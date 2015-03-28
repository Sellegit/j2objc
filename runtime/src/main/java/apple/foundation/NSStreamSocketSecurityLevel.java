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
public class NSStreamSocketSecurityLevel 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelNone")
    public static native NSString NoneValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelSSLv2")
    public static native NSString SSLv2Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelSSLv3")
    public static native NSString SSLv3Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelTLSv1")
    public static native NSString TLSv1Value();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSStreamSocketSecurityLevelNegotiatedSSL")
    public static native NSString NegotiatedSSLValue();

}
