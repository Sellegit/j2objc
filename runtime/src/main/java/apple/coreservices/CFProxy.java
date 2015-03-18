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
public class CFProxy 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeKey")
    public static native CFString TypeKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyHostNameKey")
    public static native CFString HostNameKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyPortNumberKey")
    public static native CFString PortNumberKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationURLKey")
    public static native CFString AutoConfigurationURLKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationJavaScriptKey")
    public static native CFString AutoConfigurationJavaScriptKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyUsernameKey")
    public static native CFString UsernameKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyPasswordKey")
    public static native CFString PasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationHTTPResponseKey")
    public static native CFString AutoConfigurationHTTPResponseKey();
    
}
