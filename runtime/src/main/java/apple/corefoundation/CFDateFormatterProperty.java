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
@Library("CoreFoundation/CoreFoundation.h")
public class CFDateFormatterProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFDateFormatterIsLenient")
    public static native CFString IsLenientValue();
    @GlobalConstant("kCFDateFormatterTimeZone")
    public static native CFString TimeZoneValue();
    @GlobalConstant("kCFDateFormatterCalendarName")
    public static native CFString CalendarNameValue();
    @GlobalConstant("kCFDateFormatterDefaultFormat")
    public static native CFString DefaultFormatValue();
    @GlobalConstant("kCFDateFormatterTwoDigitStartDate")
    public static native CFString TwoDigitStartDateValue();
    @GlobalConstant("kCFDateFormatterDefaultDate")
    public static native CFString DefaultDateValue();
    @GlobalConstant("kCFDateFormatterCalendar")
    public static native CFString CalendarValue();
    @GlobalConstant("kCFDateFormatterEraSymbols")
    public static native CFString EraSymbolsValue();
    @GlobalConstant("kCFDateFormatterMonthSymbols")
    public static native CFString MonthSymbolsValue();
    @GlobalConstant("kCFDateFormatterShortMonthSymbols")
    public static native CFString ShortMonthSymbolsValue();
    @GlobalConstant("kCFDateFormatterWeekdaySymbols")
    public static native CFString WeekdaySymbolsValue();
    @GlobalConstant("kCFDateFormatterShortWeekdaySymbols")
    public static native CFString ShortWeekdaySymbolsValue();
    @GlobalConstant("kCFDateFormatterAMSymbol")
    public static native CFString AMSymbolValue();
    @GlobalConstant("kCFDateFormatterPMSymbol")
    public static native CFString PMSymbolValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterLongEraSymbols")
    public static native CFString LongEraSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortMonthSymbols")
    public static native CFString VeryShortMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneMonthSymbols")
    public static native CFString StandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneMonthSymbols")
    public static native CFString ShortStandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortStandaloneMonthSymbols")
    public static native CFString VeryShortStandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortWeekdaySymbols")
    public static native CFString VeryShortWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneWeekdaySymbols")
    public static native CFString StandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneWeekdaySymbols")
    public static native CFString ShortStandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortStandaloneWeekdaySymbols")
    public static native CFString VeryShortStandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterQuarterSymbols")
    public static native CFString QuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortQuarterSymbols")
    public static native CFString ShortQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneQuarterSymbols")
    public static native CFString StandaloneQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneQuarterSymbols")
    public static native CFString ShortStandaloneQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterGregorianStartDate")
    public static native CFString GregorianStartDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFDateFormatterDoesRelativeDateFormattingKey")
    public static native CFString DoesRelativeDateFormattingKeyValue();
    
}
