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
@Library("CoreFoundation")
public class CFCalendarIdentifier 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFGregorianCalendar")
    protected static native CFString GregorianValue();
    @GlobalConstant("kCFBuddhistCalendar")
    protected static native CFString BuddhistValue();
    @GlobalConstant("kCFChineseCalendar")
    protected static native CFString ChineseValue();
    @GlobalConstant("kCFHebrewCalendar")
    protected static native CFString HebrewValue();
    @GlobalConstant("kCFIslamicCalendar")
    protected static native CFString IslamicValue();
    @GlobalConstant("kCFIslamicCivilCalendar")
    protected static native CFString IslamicCivilValue();
    @GlobalConstant("kCFJapaneseCalendar")
    protected static native CFString JapaneseValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFRepublicOfChinaCalendar")
    protected static native CFString RepublicOfChinaValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFPersianCalendar")
    protected static native CFString PersianValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFIndianCalendar")
    protected static native CFString IndianValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFISO8601Calendar")
    protected static native CFString ISO8601Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFIslamicTabularCalendar")
    protected static native CFString IslamicTabularValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCFIslamicUmmAlQuraCalendar")
    protected static native CFString IslamicUmmAlQuraValue();
    
}
