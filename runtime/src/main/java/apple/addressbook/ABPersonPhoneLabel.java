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
public class ABPersonPhoneLabel 
    extends ABPropertyLabel 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonPhoneMobileLabel")
    public static native CFString MobileLabel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("kABPersonPhoneIPhoneLabel")
    public static native CFString IPhoneLabel();
    @GlobalConstant("kABPersonPhoneMainLabel")
    public static native CFString MainLabel();
    @GlobalConstant("kABPersonPhoneHomeFAXLabel")
    public static native CFString HomeFAXLabel();
    @GlobalConstant("kABPersonPhoneWorkFAXLabel")
    public static native CFString WorkFAXLabel();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonPhoneOtherFAXLabel")
    public static native CFString OtherFAXLabel();
    @GlobalConstant("kABPersonPhonePagerLabel")
    public static native CFString PagerLabel();
    
}
