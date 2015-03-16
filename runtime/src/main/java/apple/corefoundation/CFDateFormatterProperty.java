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
    protected static native CFString IsLenientValue();
    @GlobalConstant("kCFDateFormatterTimeZone")
    protected static native CFString TimeZoneValue();
    @GlobalConstant("kCFDateFormatterCalendarName")
    protected static native CFString CalendarNameValue();
    @GlobalConstant("kCFDateFormatterDefaultFormat")
    protected static native CFString DefaultFormatValue();
    @GlobalConstant("kCFDateFormatterTwoDigitStartDate")
    protected static native CFString TwoDigitStartDateValue();
    @GlobalConstant("kCFDateFormatterDefaultDate")
    protected static native CFString DefaultDateValue();
    @GlobalConstant("kCFDateFormatterCalendar")
    protected static native CFString CalendarValue();
    @GlobalConstant("kCFDateFormatterEraSymbols")
    protected static native CFString EraSymbolsValue();
    @GlobalConstant("kCFDateFormatterMonthSymbols")
    protected static native CFString MonthSymbolsValue();
    @GlobalConstant("kCFDateFormatterShortMonthSymbols")
    protected static native CFString ShortMonthSymbolsValue();
    @GlobalConstant("kCFDateFormatterWeekdaySymbols")
    protected static native CFString WeekdaySymbolsValue();
    @GlobalConstant("kCFDateFormatterShortWeekdaySymbols")
    protected static native CFString ShortWeekdaySymbolsValue();
    @GlobalConstant("kCFDateFormatterAMSymbol")
    protected static native CFString AMSymbolValue();
    @GlobalConstant("kCFDateFormatterPMSymbol")
    protected static native CFString PMSymbolValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterLongEraSymbols")
    protected static native CFString LongEraSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortMonthSymbols")
    protected static native CFString VeryShortMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneMonthSymbols")
    protected static native CFString StandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneMonthSymbols")
    protected static native CFString ShortStandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortStandaloneMonthSymbols")
    protected static native CFString VeryShortStandaloneMonthSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortWeekdaySymbols")
    protected static native CFString VeryShortWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneWeekdaySymbols")
    protected static native CFString StandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneWeekdaySymbols")
    protected static native CFString ShortStandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterVeryShortStandaloneWeekdaySymbols")
    protected static native CFString VeryShortStandaloneWeekdaySymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterQuarterSymbols")
    protected static native CFString QuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortQuarterSymbols")
    protected static native CFString ShortQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterStandaloneQuarterSymbols")
    protected static native CFString StandaloneQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterShortStandaloneQuarterSymbols")
    protected static native CFString ShortStandaloneQuarterSymbolsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDateFormatterGregorianStartDate")
    protected static native CFString GregorianStartDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFDateFormatterDoesRelativeDateFormattingKey")
    protected static native CFString DoesRelativeDateFormattingKeyValue();
    
}
