package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFCalendarIdentifier 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFGregorianCalendar")
    public static native CFString GregorianValue();
    @GlobalConstant("kCFBuddhistCalendar")
    public static native CFString BuddhistValue();
    @GlobalConstant("kCFChineseCalendar")
    public static native CFString ChineseValue();
    @GlobalConstant("kCFHebrewCalendar")
    public static native CFString HebrewValue();
    @GlobalConstant("kCFIslamicCalendar")
    public static native CFString IslamicValue();
    @GlobalConstant("kCFIslamicCivilCalendar")
    public static native CFString IslamicCivilValue();
    @GlobalConstant("kCFJapaneseCalendar")
    public static native CFString JapaneseValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFRepublicOfChinaCalendar")
    public static native CFString RepublicOfChinaValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFPersianCalendar")
    public static native CFString PersianValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFIndianCalendar")
    public static native CFString IndianValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFISO8601Calendar")
    public static native CFString ISO8601Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFIslamicTabularCalendar")
    public static native CFString IslamicTabularValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFIslamicUmmAlQuraCalendar")
    public static native CFString IslamicUmmAlQuraValue();
    
}
