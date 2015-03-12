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





@Mapping("CFGregorianUnits")
public class CFGregorianUnits 
    extends Struct 
     {

    
    protected CFGregorianUnits() {}
    
    
    @DotMapping("years")
    public native int getYears();
    @DotMapping("months")
    public native int getMonths();
    @DotMapping("days")
    public native int getDays();
    @DotMapping("hours")
    public native int getHours();
    @DotMapping("minutes")
    public native int getMinutes();
    @DotMapping("seconds")
    public native double getSeconds();
    
    public static native CFGregorianUnits create(int years, int months, int days, int hours, int minutes, double seconds) /*-[
        CFGregorianUnits __new = { .years = years, .months = months, .days = days, .hours = hours, .minutes = minutes, .seconds = seconds };
        return __new;
    ]-*/;
    public static native CFGregorianUnits copyWithyears(CFGregorianUnits original, int years) /*-[
        original.years = years;
        return original;
    ]-*/;

    
    public static native CFGregorianUnits copyWithmonths(CFGregorianUnits original, int months) /*-[
        original.months = months;
        return original;
    ]-*/;

    
    public static native CFGregorianUnits copyWithdays(CFGregorianUnits original, int days) /*-[
        original.days = days;
        return original;
    ]-*/;

    
    public static native CFGregorianUnits copyWithhours(CFGregorianUnits original, int hours) /*-[
        original.hours = hours;
        return original;
    ]-*/;

    
    public static native CFGregorianUnits copyWithminutes(CFGregorianUnits original, int minutes) /*-[
        original.minutes = minutes;
        return original;
    ]-*/;

    
    public static native CFGregorianUnits copyWithseconds(CFGregorianUnits original, double seconds) /*-[
        original.seconds = seconds;
        return original;
    ]-*/;

    
}
