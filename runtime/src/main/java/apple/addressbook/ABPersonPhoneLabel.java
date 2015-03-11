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
@Library("AddressBook")
public class ABPersonPhoneLabel 
    extends ABPropertyLabel 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonPhoneMobileLabel")
    protected static native CFString MobileLabel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kABPersonPhoneIPhoneLabel")
    protected static native CFString IPhoneLabel();
    @GlobalConstant("kABPersonPhoneMainLabel")
    protected static native CFString MainLabel();
    @GlobalConstant("kABPersonPhoneHomeFAXLabel")
    protected static native CFString HomeFAXLabel();
    @GlobalConstant("kABPersonPhoneWorkFAXLabel")
    protected static native CFString WorkFAXLabel();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonPhoneOtherFAXLabel")
    protected static native CFString OtherFAXLabel();
    @GlobalConstant("kABPersonPhonePagerLabel")
    protected static native CFString PagerLabel();
    
}
