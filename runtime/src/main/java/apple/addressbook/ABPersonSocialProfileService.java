package apple.addressbook;


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
@Library("AddressBook/AddressBook.h")
public class ABPersonSocialProfileService 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceTwitter")
    protected static native CFString TwitterValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceSinaWeibo")
    protected static native CFString SinaWeiboValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceGameCenter")
    protected static native CFString GameCenterValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceFacebook")
    protected static native CFString FacebookValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceMyspace")
    protected static native CFString MyspaceValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceLinkedIn")
    protected static native CFString LinkedInValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceFlickr")
    protected static native CFString FlickrValue();
    
}
