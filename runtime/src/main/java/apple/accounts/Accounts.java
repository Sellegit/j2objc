package apple.accounts;


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
@Library("Accounts/Accounts.h")
public class Accounts 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ACFacebookAppIdKey")
    public static native NSString ACFacebookAppIdKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ACFacebookPermissionsKey")
    public static native NSString ACFacebookPermissionsKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ACFacebookAudienceKey")
    public static native NSString ACFacebookAudienceKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("ACTencentWeiboAppIdKey")
    public static native NSString ACTencentWeiboAppIdKey();
    
}
