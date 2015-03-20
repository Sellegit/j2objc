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
@Mapping("CFDateRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFDate 
    extends CFPropertyList 
     {

    
    
    protected CFDate() {}
    
    
    
    
    @GlobalConstant("kCFAbsoluteTimeIntervalSince1970")
    public static native double getAbsoluteTimeIntervalSince1970();
    @GlobalConstant("kCFAbsoluteTimeIntervalSince1904")
    public static native double getAbsoluteTimeIntervalSince1904();
    
    @GlobalFunction("CFAbsoluteTimeGetCurrent")
    public static native double getCurrentAbsoluteTime();
    @GlobalFunction("CFDateGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFDateCreate")
    public static native CFDate create(CFAllocator allocator, double at);
    @GlobalFunction("CFDateGetAbsoluteTime")
    public static native double getAbsoluteTime(CFDate theDate);
    @GlobalFunction("CFDateGetTimeIntervalSinceDate")
    public static native double getTimeIntervalSinceDate(CFDate theDate, CFDate otherDate);
    @GlobalFunction("CFDateCompare")
    public static native CFComparisonResult compareTo(CFDate theDate, CFDate otherDate, Todo context);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeAddGregorianUnits")
    public static native double addGregorianUnitsToAbsoluteTime(double at, CFTimeZone tz, CFGregorianUnits units);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeGetDifferenceAsGregorianUnits")
    public static native CFGregorianUnits getAbsoluteTimeDifferenceAsGregorianUnits(double at1, double at2, CFTimeZone tz, @MachineSizedUInt long unitFlags);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeGetDayOfWeek")
    public static native int getDayOfWeekFromAbsoluteTime(double at, CFTimeZone tz);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeGetDayOfYear")
    public static native int getDayOfYearFromAbsoluteTime(double at, CFTimeZone tz);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeGetWeekOfYear")
    public static native int getWeekOfYearFromAbsoluteTime(double at, CFTimeZone tz);
    
}
