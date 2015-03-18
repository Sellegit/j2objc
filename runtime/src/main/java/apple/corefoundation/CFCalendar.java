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
public class CFCalendar 
    extends CFType 
     {

    
    
    protected CFCalendar() {}
    
    
    
    
    @GlobalFunction("CFCalendarGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFCalendarCopyCurrent")
    public static native CFCalendar getCurrent();
    @GlobalFunction("CFCalendarCreateWithIdentifier")
    public static native CFCalendar create(CFAllocator allocator, String identifier);
    @GlobalFunction("CFCalendarGetIdentifier")
    public static native CFCalendarIdentifier getIdentifier(CFCalendar calendar);
    @GlobalFunction("CFCalendarCopyLocale")
    public static native CFLocale getLocale(CFCalendar calendar);
    @GlobalFunction("CFCalendarSetLocale")
    public static native void setLocale(CFCalendar calendar, CFLocale locale);
    @GlobalFunction("CFCalendarCopyTimeZone")
    public static native CFTimeZone getTimeZone(CFCalendar calendar);
    @GlobalFunction("CFCalendarSetTimeZone")
    public static native void setTimeZone(CFCalendar calendar, CFTimeZone tz);
    @GlobalFunction("CFCalendarGetFirstWeekday")
    public static native @MachineSizedSInt long getFirstWeekday(CFCalendar calendar);
    @GlobalFunction("CFCalendarSetFirstWeekday")
    public static native void setFirstWeekday(CFCalendar calendar, @MachineSizedSInt long wkdy);
    @GlobalFunction("CFCalendarGetMinimumDaysInFirstWeek")
    public static native @MachineSizedSInt long getMinimumDaysInFirstWeek(CFCalendar calendar);
    @GlobalFunction("CFCalendarSetMinimumDaysInFirstWeek")
    public static native void setMinimumDaysInFirstWeek(CFCalendar calendar, @MachineSizedSInt long mwd);
    @GlobalFunction("CFCalendarGetMinimumRangeOfUnit")
    public static native CFRange getMinimumRangeOfUnit(CFCalendar calendar, CFCalendarUnit unit);
    @GlobalFunction("CFCalendarGetMaximumRangeOfUnit")
    public static native CFRange getMaximumRangeOfUnit(CFCalendar calendar, CFCalendarUnit unit);
    @GlobalFunction("CFCalendarGetRangeOfUnit")
    public static native CFRange getRangeOfUnit(CFCalendar calendar, CFCalendarUnit smallerUnit, CFCalendarUnit biggerUnit, double at);
    @GlobalFunction("CFCalendarGetOrdinalityOfUnit")
    public static native @MachineSizedSInt long getOrdinalityOfUnit(CFCalendar calendar, CFCalendarUnit smallerUnit, CFCalendarUnit biggerUnit, double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFCalendarGetTimeRangeOfUnit")
    public static native boolean getTimeRangeOfUnit(CFCalendar calendar, CFCalendarUnit unit, double at, Todo startp, Todo tip);
    
}
