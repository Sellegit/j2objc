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
public class CFLocaleComponent 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFLocaleIdentifier")
    public static native NSString IdentifierValue();
    @GlobalConstant("kCFLocaleLanguageCode")
    public static native NSString LanguageCodeValue();
    @GlobalConstant("kCFLocaleCountryCode")
    public static native NSString CountryCodeValue();
    @GlobalConstant("kCFLocaleScriptCode")
    public static native NSString ScriptCodeValue();
    @GlobalConstant("kCFLocaleVariantCode")
    public static native NSString VariantCodeValue();
    @GlobalConstant("kCFLocaleExemplarCharacterSet")
    public static native NSString ExemplarCharacterSetValue();
    @GlobalConstant("kCFLocaleCalendarIdentifier")
    public static native NSString CalendarIdentifierValue();
    @GlobalConstant("kCFLocaleCalendar")
    public static native NSString CalendarValue();
    @GlobalConstant("kCFLocaleCollationIdentifier")
    public static native NSString CollationIdentifierValue();
    @GlobalConstant("kCFLocaleUsesMetricSystem")
    public static native NSString UsesMetricSystemValue();
    @GlobalConstant("kCFLocaleMeasurementSystem")
    public static native NSString MeasurementSystemValue();
    @GlobalConstant("kCFLocaleDecimalSeparator")
    public static native NSString DecimalSeparatorValue();
    @GlobalConstant("kCFLocaleGroupingSeparator")
    public static native NSString GroupingSeparatorValue();
    @GlobalConstant("kCFLocaleCurrencySymbol")
    public static native NSString CurrencySymbolValue();
    @GlobalConstant("kCFLocaleCurrencyCode")
    public static native NSString CurrencyCodeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFLocaleCollatorIdentifier")
    public static native NSString CollatorIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFLocaleQuotationBeginDelimiterKey")
    public static native NSString QuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFLocaleQuotationEndDelimiterKey")
    public static native NSString QuotationEndDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFLocaleAlternateQuotationBeginDelimiterKey")
    public static native NSString AlternateQuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFLocaleAlternateQuotationEndDelimiterKey")
    public static native NSString AlternateQuotationEndDelimiterKeyValue();

}
