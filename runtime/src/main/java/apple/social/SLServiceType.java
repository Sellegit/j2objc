package apple.social;


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
import apple.uikit.*;
import apple.accounts.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("Social/Social.h")
public class SLServiceType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("SLServiceTypeTwitter")
    public static native NSString TwitterValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("SLServiceTypeFacebook")
    public static native NSString FacebookValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("SLServiceTypeSinaWeibo")
    public static native NSString SinaWeiboValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("SLServiceTypeTencentWeibo")
    public static native NSString TencentWeiboValue();
    
}
