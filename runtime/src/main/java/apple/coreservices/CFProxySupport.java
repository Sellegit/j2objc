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
@Library("CFNetwork")
public class CFProxySupport 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkCopySystemProxySettings")
    public static native CFSystemProxySettings getSystemProxySettings();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkCopyProxiesForAutoConfigurationScript")
    protected static native CFArray getProxies0(String proxyAutoConfigurationScript, NSURL targetURL, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkExecuteProxyAutoConfigurationScript")
    protected static native CFRunLoopSource executeProxyAutoConfigurationScript(String proxyAutoConfigurationScript, NSURL targetURL, FunctionPtr cb, CFStreamClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkExecuteProxyAutoConfigurationURL")
    protected static native CFRunLoopSource executeProxyAutoConfigurationURL(NSURL proxyAutoConfigURL, NSURL targetURL, FunctionPtr cb, CFStreamClientContext clientContext);
    
}
