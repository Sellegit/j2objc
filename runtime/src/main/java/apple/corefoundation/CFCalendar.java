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
public class CFCalendar 
    extends CFType 
     {

    
    
    protected CFCalendar() {}
    
    
    
    
    @GlobalFunction("CFCalendarGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFCalendarCopyCurrent")
    public static native CFCalendar getCurrent();
    @GlobalFunction("CFCalendarCreateWithIdentifier")
    protected static native CFCalendar create(CFAllocator allocator, String identifier);
    @GlobalFunction("CFCalendarGetIdentifier")
    public native CFCalendarIdentifier getIdentifier();
    @GlobalFunction("CFCalendarCopyLocale")
    public native CFLocale getLocale();
    @GlobalFunction("CFCalendarSetLocale")
    public native void setLocale(CFLocale locale);
    @GlobalFunction("CFCalendarCopyTimeZone")
    public native CFTimeZone getTimeZone();
    @GlobalFunction("CFCalendarSetTimeZone")
    public native void setTimeZone(CFTimeZone tz);
    @GlobalFunction("CFCalendarGetFirstWeekday")
    public native @MachineSizedSInt long getFirstWeekday();
    @GlobalFunction("CFCalendarSetFirstWeekday")
    public native void setFirstWeekday(@MachineSizedSInt long wkdy);
    @GlobalFunction("CFCalendarGetMinimumDaysInFirstWeek")
    public native @MachineSizedSInt long getMinimumDaysInFirstWeek();
    @GlobalFunction("CFCalendarSetMinimumDaysInFirstWeek")
    public native void setMinimumDaysInFirstWeek(@MachineSizedSInt long mwd);
    @GlobalFunction("CFCalendarGetMinimumRangeOfUnit")
    public native CFRange getMinimumRangeOfUnit(CFCalendarUnit unit);
    @GlobalFunction("CFCalendarGetMaximumRangeOfUnit")
    public native CFRange getMaximumRangeOfUnit(CFCalendarUnit unit);
    @GlobalFunction("CFCalendarGetRangeOfUnit")
    public native CFRange getRangeOfUnit(CFCalendarUnit smallerUnit, CFCalendarUnit biggerUnit, double at);
    @GlobalFunction("CFCalendarGetOrdinalityOfUnit")
    public native @MachineSizedSInt long getOrdinalityOfUnit(CFCalendarUnit smallerUnit, CFCalendarUnit biggerUnit, double at);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFCalendarGetTimeRangeOfUnit")
    private native boolean getTimeRangeOfUnit(CFCalendarUnit unit, double at, Todo startp, Todo tip);
    
}
