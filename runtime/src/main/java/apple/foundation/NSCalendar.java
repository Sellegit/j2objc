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


@Library("Foundation/Foundation.h") @Mapping("NSCalendar")
public class NSCalendar 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithCalendarIdentifier:")
    public NSCalendar(String ident) { }
    @Mapping("init")
    public NSCalendar() { }

    
    @Mapping("calendarIdentifier")
    public native NSCalendarIdentifier getCalendarIdentifier();
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("setLocale:")
    public native void setLocale(NSLocale v);
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    @Mapping("setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Mapping("firstWeekday")
    public native @MachineSizedUInt long getFirstWeekday();
    @Mapping("setFirstWeekday:")
    public native void setFirstWeekday(@MachineSizedUInt long v);
    @Mapping("minimumDaysInFirstWeek")
    public native @MachineSizedUInt long getMinimumDaysInFirstWeek();
    @Mapping("setMinimumDaysInFirstWeek:")
    public native void setMinimumDaysInFirstWeek(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("eraSymbols")
    public native List<String> getEraSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("longEraSymbols")
    public native List<String> getLongEraSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("monthSymbols")
    public native List<String> getMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortMonthSymbols")
    public native List<String> getShortMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("veryShortMonthSymbols")
    public native List<String> getVeryShortMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("standaloneMonthSymbols")
    public native List<String> getStandaloneMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortStandaloneMonthSymbols")
    public native List<String> getShortStandaloneMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("veryShortStandaloneMonthSymbols")
    public native List<String> getVeryShortStandaloneMonthSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("weekdaySymbols")
    public native List<String> getWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortWeekdaySymbols")
    public native List<String> getShortWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("veryShortWeekdaySymbols")
    public native List<String> getVeryShortWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("standaloneWeekdaySymbols")
    public native List<String> getStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortStandaloneWeekdaySymbols")
    public native List<String> getShortStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("veryShortStandaloneWeekdaySymbols")
    public native List<String> getVeryShortStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("quarterSymbols")
    public native List<String> getQuarterSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortQuarterSymbols")
    public native List<String> getShortQuarterSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("standaloneQuarterSymbols")
    public native List<String> getStandaloneQuarterSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shortStandaloneQuarterSymbols")
    public native List<String> getShortStandaloneQuarterSymbols();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("AMSymbol")
    public native String getAMSymbol();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("PMSymbol")
    public native String getPMSymbol();

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSCalendarDayChangedNotification")
    public static native NSString DayChangedNotification();

    @Mapping("minimumRangeOfUnit:")
    public native NSRange getMinimumRange(@Representing("NSCalendarUnit") long unit);
    @Mapping("maximumRangeOfUnit:")
    public native NSRange getMaximumRange(@Representing("NSCalendarUnit") long unit);
    @Mapping("rangeOfUnit:inUnit:forDate:")
    public native NSRange getRange(@Representing("NSCalendarUnit") long smaller, @Representing("NSCalendarUnit") long larger, NSDate date);
    @Mapping("ordinalityOfUnit:inUnit:forDate:")
    public native @MachineSizedUInt long getOrdinality(@Representing("NSCalendarUnit") long smaller, @Representing("NSCalendarUnit") long larger, NSDate date);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("rangeOfUnit:startDate:interval:forDate:")
    public native boolean getRange(@Representing("NSCalendarUnit") long unit, Todo datep, Todo tip, NSDate date);
    @Mapping("dateFromComponents:")
    public native NSDate newDateFromComponents(NSDateComponents comps);
    @Mapping("components:fromDate:")
    public native NSDateComponents getComponents(@Representing("NSCalendarUnit") long unitFlags, NSDate date);
    @Mapping("dateByAddingComponents:toDate:options:")
    public native NSDate newDateByAddingComponents(NSDateComponents comps, NSDate date, @Representing("NSCalendarOptions") long opts);
    @Mapping("components:fromDate:toDate:options:")
    public native NSDateComponents getComponents(@Representing("NSCalendarUnit") long unitFlags, NSDate startingDate, NSDate resultDate, @Representing("NSCalendarOptions") long opts);
    @Mapping("currentCalendar")
    public static native NSCalendar getCurrentCalendar();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("autoupdatingCurrentCalendar")
    public static native NSCalendar getAutoupdatingCurrentCalendar();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
