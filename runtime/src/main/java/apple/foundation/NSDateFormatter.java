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





@Library("Foundation") @Mapping("NSDateFormatter")
public class NSDateFormatter 
    extends NSFormatter 
     {

    
    
    public NSDateFormatter() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("formattingContext")
    public native @Representing("NSFormattingContext") @MachineSizedSInt long getFormattingContext();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setFormattingContext(@Representing("NSFormattingContext") @MachineSizedSInt long v);
    @Mapping("dateFormat")
    public native String getDateFormat();
    public native void setDateFormat(String v);
    @Mapping("dateStyle")
    public native @Representing("NSDateFormatterStyle") @MachineSizedUInt long getDateStyle();
    public native void setDateStyle(@Representing("NSDateFormatterStyle") @MachineSizedUInt long v);
    @Mapping("timeStyle")
    public native @Representing("NSDateFormatterStyle") @MachineSizedUInt long getTimeStyle();
    public native void setTimeStyle(@Representing("NSDateFormatterStyle") @MachineSizedUInt long v);
    @Mapping("locale")
    public native NSLocale getLocale();
    public native void setLocale(NSLocale v);
    @Mapping("generatesCalendarDates")
    public native boolean generatesCalendarDates();
    public native void setGeneratesCalendarDates(boolean v);
    @Mapping("formatterBehavior")
    public native @Representing("NSDateFormatterBehavior") @MachineSizedUInt long getFormatterBehavior();
    public native void setFormatterBehavior(@Representing("NSDateFormatterBehavior") @MachineSizedUInt long v);
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    public native void setTimeZone(NSTimeZone v);
    @Mapping("calendar")
    public native NSCalendar getCalendar();
    public native void setCalendar(NSCalendar v);
    @Mapping("isLenient")
    public native boolean isLenient();
    public native void setLenient(boolean v);
    @Mapping("twoDigitStartDate")
    public native NSDate getTwoDigitStartDate();
    public native void setTwoDigitStartDate(NSDate v);
    @Mapping("defaultDate")
    public native NSDate getDefaultDate();
    public native void setDefaultDate(NSDate v);
    @Mapping("eraSymbols")
    public native List<String> getEraSymbols();
    public native void setEraSymbols(List<String> v);
    @Mapping("monthSymbols")
    public native List<String> getMonthSymbols();
    public native void setMonthSymbols(List<String> v);
    @Mapping("shortMonthSymbols")
    public native List<String> getShortMonthSymbols();
    public native void setShortMonthSymbols(List<String> v);
    @Mapping("weekdaySymbols")
    public native List<String> getWeekdaySymbols();
    public native void setWeekdaySymbols(List<String> v);
    @Mapping("shortWeekdaySymbols")
    public native List<String> getShortWeekdaySymbols();
    public native void setShortWeekdaySymbols(List<String> v);
    @Mapping("AMSymbol")
    public native String getAMSymbol();
    public native void setAMSymbol(String v);
    @Mapping("PMSymbol")
    public native String getPMSymbol();
    public native void setPMSymbol(String v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("longEraSymbols")
    public native List<String> getLongEraSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setLongEraSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("veryShortMonthSymbols")
    public native List<String> getVeryShortMonthSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setVeryShortMonthSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("standaloneMonthSymbols")
    public native List<String> getStandaloneMonthSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setStandaloneMonthSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("shortStandaloneMonthSymbols")
    public native List<String> getShortStandaloneMonthSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setShortStandaloneMonthSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("veryShortStandaloneMonthSymbols")
    public native List<String> getVeryShortStandaloneMonthSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setVeryShortStandaloneMonthSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("veryShortWeekdaySymbols")
    public native List<String> getVeryShortWeekdaySymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setVeryShortWeekdaySymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("standaloneWeekdaySymbols")
    public native List<String> getStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setStandaloneWeekdaySymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("shortStandaloneWeekdaySymbols")
    public native List<String> getShortStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setShortStandaloneWeekdaySymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("veryShortStandaloneWeekdaySymbols")
    public native List<String> getVeryShortStandaloneWeekdaySymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setVeryShortStandaloneWeekdaySymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("quarterSymbols")
    public native List<String> getQuarterSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setQuarterSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("shortQuarterSymbols")
    public native List<String> getShortQuarterSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setShortQuarterSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("standaloneQuarterSymbols")
    public native List<String> getStandaloneQuarterSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setStandaloneQuarterSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("shortStandaloneQuarterSymbols")
    public native List<String> getShortStandaloneQuarterSymbols();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setShortStandaloneQuarterSymbols(List<String> v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("gregorianStartDate")
    public native NSDate getGregorianStartDate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    public native void setGregorianStartDate(NSDate v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("doesRelativeDateFormatting")
    public native boolean doesRelativeDateFormatting();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setDoesRelativeDateFormatting(boolean v);
    
    
    
    @Mapping("stringFromDate:")
    public native String format(NSDate date);
    @Mapping("dateFromString:")
    public native NSDate parse(String string);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLocalizedDateFormatFromTemplate:")
    public native void setLocalizedDateFormat(String dateFormatTemplate);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("localizedStringFromDate:dateStyle:timeStyle:")
    public static native String format(NSDate date, @Representing("NSDateFormatterStyle") @MachineSizedUInt long dstyle, @Representing("NSDateFormatterStyle") @MachineSizedUInt long tstyle);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("dateFormatFromTemplate:options:locale:")
    public static native String getDateFormatFromTemplate(String tmplate, @MachineSizedUInt long opts, NSLocale locale);
    @Mapping("defaultFormatterBehavior")
    public static native @Representing("NSDateFormatterBehavior") @MachineSizedUInt long getDefaultFormatterBehavior();
    @Mapping("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@Representing("NSDateFormatterBehavior") @MachineSizedUInt long behavior);
    
}
