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
public class CFProxyType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeNone")
    public static native CFString NoneValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeHTTP")
    public static native CFString HTTPValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeHTTPS")
    public static native CFString HTTPSValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeSOCKS")
    public static native CFString SOCKSValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeFTP")
    public static native CFString FTPValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFProxyTypeAutoConfigurationURL")
    public static native CFString AutoConfigurationURLValue();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kCFProxyTypeAutoConfigurationJavaScript")
    public static native CFString AutoConfigurationJavaScriptValue();

}
