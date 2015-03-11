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
public class CFProxyType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeNone")
    protected static native CFString NoneValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeHTTP")
    protected static native CFString HTTPValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeHTTPS")
    protected static native CFString HTTPSValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeSOCKS")
    protected static native CFString SOCKSValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeFTP")
    protected static native CFString FTPValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeAutoConfigurationURL")
    protected static native CFString AutoConfigurationURLValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFProxyTypeAutoConfigurationJavaScript")
    protected static native CFString AutoConfigurationJavaScriptValue();
    
}
