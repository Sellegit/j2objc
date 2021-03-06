package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h") @Mapping("NSDateComponents")
public class NSDateComponents 
    extends NSObject 
    implements NSCopying {

    
    public static final int UndefinedComponent = 2147483647;

    
    @Mapping("init")
    public NSDateComponents() { }

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("calendar")
    public native NSCalendar getCalendar();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCalendar:")
    public native void setCalendar(NSCalendar v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Mapping("era")
    public native @MachineSizedSInt long getEra();
    @Mapping("setEra:")
    public native void setEra(@MachineSizedSInt long v);
    @Mapping("year")
    public native @MachineSizedSInt long getYear();
    @Mapping("setYear:")
    public native void setYear(@MachineSizedSInt long v);
    @Mapping("month")
    public native @MachineSizedSInt long getMonth();
    @Mapping("setMonth:")
    public native void setMonth(@MachineSizedSInt long v);
    @Mapping("day")
    public native @MachineSizedSInt long getDay();
    @Mapping("setDay:")
    public native void setDay(@MachineSizedSInt long v);
    @Mapping("hour")
    public native @MachineSizedSInt long getHour();
    @Mapping("setHour:")
    public native void setHour(@MachineSizedSInt long v);
    @Mapping("minute")
    public native @MachineSizedSInt long getMinute();
    @Mapping("setMinute:")
    public native void setMinute(@MachineSizedSInt long v);
    @Mapping("second")
    public native @MachineSizedSInt long getSecond();
    @Mapping("setSecond:")
    public native void setSecond(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("nanosecond")
    public native @MachineSizedSInt long getNanosecond();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setNanosecond:")
    public native void setNanosecond(@MachineSizedSInt long v);
    @Mapping("weekday")
    public native @MachineSizedSInt long getWeekday();
    @Mapping("setWeekday:")
    public native void setWeekday(@MachineSizedSInt long v);
    @Mapping("weekdayOrdinal")
    public native @MachineSizedSInt long getWeekdayOrdinal();
    @Mapping("setWeekdayOrdinal:")
    public native void setWeekdayOrdinal(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("quarter")
    public native @MachineSizedSInt long getQuarter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setQuarter:")
    public native void setQuarter(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("weekOfMonth")
    public native @MachineSizedSInt long getWeekOfMonth();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWeekOfMonth:")
    public native void setWeekOfMonth(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("weekOfYear")
    public native @MachineSizedSInt long getWeekOfYear();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWeekOfYear:")
    public native void setWeekOfYear(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("yearForWeekOfYear")
    public native @MachineSizedSInt long getYearForWeekOfYear();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setYearForWeekOfYear:")
    public native void setYearForWeekOfYear(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isLeapMonth")
    public native boolean isLeapMonth();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setLeapMonth:")
    public native void setLeapMonth(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("date")
    public native NSDate getDate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isValidDate")
    public native boolean isValidDate();

    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("week")
    public native @MachineSizedSInt long getWeek();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setWeek:")
    public native void setWeek(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setValue:forComponent:")
    public native void setValue(@MachineSizedSInt long value, @Representing("NSCalendarUnit") long unit);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("valueForComponent:")
    public native @MachineSizedSInt long getValue(@Representing("NSCalendarUnit") long unit);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isValidDateInCalendar:")
    public native boolean isValidDateInCalendar(NSCalendar calendar);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
