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
    protected static native CFString TypeKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyHostNameKey")
    protected static native CFString HostNameKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyPortNumberKey")
    protected static native CFString PortNumberKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationURLKey")
    protected static native CFString AutoConfigurationURLKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationJavaScriptKey")
    protected static native CFString AutoConfigurationJavaScriptKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyUsernameKey")
    protected static native CFString UsernameKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyPasswordKey")
    protected static native CFString PasswordKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyAutoConfigurationHTTPResponseKey")
    protected static native CFString AutoConfigurationHTTPResponseKey();
    
}
