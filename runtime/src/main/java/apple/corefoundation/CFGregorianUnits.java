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





@Mapping("CFGregorianUnits") @Library("CoreFoundation/CoreFoundation.h")
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
        CFGregorianUnits __new = { .years = years, .months = original.months, .days = original.days, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds };
        return __new;
    ]-*/;

    
    public static native CFGregorianUnits copyWithmonths(CFGregorianUnits original, int months) /*-[
        CFGregorianUnits __new = { .years = original.years, .months = months, .days = original.days, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds };
        return __new;
    ]-*/;

    
    public static native CFGregorianUnits copyWithdays(CFGregorianUnits original, int days) /*-[
        CFGregorianUnits __new = { .years = original.years, .months = original.months, .days = days, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds };
        return __new;
    ]-*/;

    
    public static native CFGregorianUnits copyWithhours(CFGregorianUnits original, int hours) /*-[
        CFGregorianUnits __new = { .years = original.years, .months = original.months, .days = original.days, .hours = hours, .minutes = original.minutes, .seconds = original.seconds };
        return __new;
    ]-*/;

    
    public static native CFGregorianUnits copyWithminutes(CFGregorianUnits original, int minutes) /*-[
        CFGregorianUnits __new = { .years = original.years, .months = original.months, .days = original.days, .hours = original.hours, .minutes = minutes, .seconds = original.seconds };
        return __new;
    ]-*/;

    
    public static native CFGregorianUnits copyWithseconds(CFGregorianUnits original, double seconds) /*-[
        CFGregorianUnits __new = { .years = original.years, .months = original.months, .days = original.days, .hours = original.hours, .minutes = original.minutes, .seconds = seconds };
        return __new;
    ]-*/;

    
}
