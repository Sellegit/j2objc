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
    public static native CFArray getProxies0(CFString proxyAutoConfigurationScript, CFURL targetURL, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkExecuteProxyAutoConfigurationScript")
    public static native CFRunLoopSource executeProxyAutoConfigurationScript(CFString proxyAutoConfigurationScript, CFURL targetURL, FunctionPtr cb, CFStreamClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetworkExecuteProxyAutoConfigurationURL")
    public static native CFRunLoopSource executeProxyAutoConfigurationURL(CFURL proxyAutoConfigURL, CFURL targetURL, FunctionPtr cb, CFStreamClientContext clientContext);
    
}
