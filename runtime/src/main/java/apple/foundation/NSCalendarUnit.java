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





@Library("Foundation/Foundation.h")
@Mapping("NSCalendarUnit")
public final class NSCalendarUnit extends ObjCEnum {
    
    @GlobalConstant("NSCalendarUnitEra")
    public static final long Era = 2L;
    @GlobalConstant("NSCalendarUnitYear")
    public static final long Year = 4L;
    @GlobalConstant("NSCalendarUnitMonth")
    public static final long Month = 8L;
    @GlobalConstant("NSCalendarUnitDay")
    public static final long Day = 16L;
    @GlobalConstant("NSCalendarUnitHour")
    public static final long Hour = 32L;
    @GlobalConstant("NSCalendarUnitMinute")
    public static final long Minute = 64L;
    @GlobalConstant("NSCalendarUnitSecond")
    public static final long Second = 128L;
    @GlobalConstant("NSCalendarUnitWeekday")
    public static final long Weekday = 512L;
    @GlobalConstant("NSCalendarUnitWeekdayOrdinal")
    public static final long WeekdayOrdinal = 1024L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSCalendarUnitQuarter")
    public static final long Quarter = 2048L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSCalendarUnitWeekOfMonth")
    public static final long WeekOfMonth = 4096L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSCalendarUnitWeekOfYear")
    public static final long WeekOfYear = 8192L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSCalendarUnitYearForWeekOfYear")
    public static final long YearForWeekOfYear = 16384L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSCalendarUnitNanosecond")
    public static final long Nanosecond = 32768L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSCalendarUnitCalendar")
    public static final long Calendar = 1048576L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSCalendarUnitTimeZone")
    public static final long TimeZone = 2097152L;
    

}
