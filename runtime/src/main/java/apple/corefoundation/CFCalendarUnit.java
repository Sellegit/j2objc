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





@Library("CoreFoundation")
@Mapping("CFCalendarUnit")
public final class CFCalendarUnit extends ObjCEnum {
    
    @GlobalConstant("kCFCalendarUnitEra")
    public static final long Era = 2L;
    @GlobalConstant("kCFCalendarUnitYear")
    public static final long Year = 4L;
    @GlobalConstant("kCFCalendarUnitMonth")
    public static final long Month = 8L;
    @GlobalConstant("kCFCalendarUnitDay")
    public static final long Day = 16L;
    @GlobalConstant("kCFCalendarUnitHour")
    public static final long Hour = 32L;
    @GlobalConstant("kCFCalendarUnitMinute")
    public static final long Minute = 64L;
    @GlobalConstant("kCFCalendarUnitSecond")
    public static final long Second = 128L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCFCalendarUnitWeek")
    public static final long Week = 256L;
    @GlobalConstant("kCFCalendarUnitWeekday")
    public static final long Weekday = 512L;
    @GlobalConstant("kCFCalendarUnitWeekdayOrdinal")
    public static final long WeekdayOrdinal = 1024L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFCalendarUnitQuarter")
    public static final long Quarter = 2048L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFCalendarUnitWeekOfMonth")
    public static final long WeekOfMonth = 4096L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFCalendarUnitWeekOfYear")
    public static final long WeekOfYear = 8192L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFCalendarUnitYearForWeekOfYear")
    public static final long YearForWeekOfYear = 16384L;
    

}
