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
public class CFSystemProxySettings 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesHTTPEnable")
    public static native CFString HTTPEnable();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesHTTPPort")
    public static native CFString HTTPPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesHTTPProxy")
    public static native CFString HTTPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesProxyAutoConfigEnable")
    public static native CFString ProxyAutoConfigEnable();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesProxyAutoConfigURLString")
    public static native CFString ProxyAutoConfigURLString();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFNetworkProxiesProxyAutoConfigJavaScript")
    public static native CFString ProxyAutoConfigJavaScript();
    
}
