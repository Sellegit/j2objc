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
@Library("Accounts")
public class ACAccountTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("ACAccountTypeIdentifierTwitter")
    protected static native NSString TwitterValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ACAccountTypeIdentifierFacebook")
    protected static native NSString FacebookValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("ACAccountTypeIdentifierSinaWeibo")
    protected static native NSString SinaWeiboValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("ACAccountTypeIdentifierTencentWeibo")
    protected static native NSString TencentWeiboValue();
    
}
