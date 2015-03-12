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





@Mapping("CFGregorianDate") @Library("CoreFoundation")
public class CFGregorianDate 
    extends Struct 
     {

    
    protected CFGregorianDate() {}
    
    
    @DotMapping("year")
    public native int getYear();
    @DotMapping("month")
    public native byte getMonth();
    @DotMapping("day")
    public native byte getDay();
    @DotMapping("hour")
    public native byte getHour();
    @DotMapping("minute")
    public native byte getMinute();
    @DotMapping("second")
    public native double getSecond();
    
    public static native CFGregorianDate create(int year, byte month, byte day, byte hour, byte minute, double second) /*-[
        CFGregorianDate __new = { .year = year, .month = month, .day = day, .hour = hour, .minute = minute, .second = second };
        return __new;
    ]-*/;
    public static native CFGregorianDate copyWithyear(CFGregorianDate original, int year) /*-[
        original.year = year;
        return original;
    ]-*/;

    
    public static native CFGregorianDate copyWithmonth(CFGregorianDate original, byte month) /*-[
        original.month = month;
        return original;
    ]-*/;

    
    public static native CFGregorianDate copyWithday(CFGregorianDate original, byte day) /*-[
        original.day = day;
        return original;
    ]-*/;

    
    public static native CFGregorianDate copyWithhour(CFGregorianDate original, byte hour) /*-[
        original.hour = hour;
        return original;
    ]-*/;

    
    public static native CFGregorianDate copyWithminute(CFGregorianDate original, byte minute) /*-[
        original.minute = minute;
        return original;
    ]-*/;

    
    public static native CFGregorianDate copyWithsecond(CFGregorianDate original, double second) /*-[
        original.second = second;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFGregorianDateIsValid")
    public native boolean isValid(@MachineSizedUInt long unitFlags);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFGregorianDateGetAbsoluteTime")
    public native double getAbsoluteTime(CFTimeZone tz);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("CFAbsoluteTimeGetGregorianDate")
    public static native CFGregorianDate fromAbsoluteTime(double at, CFTimeZone tz);
    
}
