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

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSLocaleComponent 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSLocaleIdentifier")
    public static native NSString IdentifierValue();
    @GlobalConstant("NSLocaleLanguageCode")
    public static native NSString LanguageCodeValue();
    @GlobalConstant("NSLocaleCountryCode")
    public static native NSString CountryCodeValue();
    @GlobalConstant("NSLocaleScriptCode")
    public static native NSString ScriptCodeValue();
    @GlobalConstant("NSLocaleVariantCode")
    public static native NSString VariantCodeValue();
    @GlobalConstant("NSLocaleExemplarCharacterSet")
    public static native NSString ExemplarCharacterSetValue();
    @GlobalConstant("NSLocaleCollationIdentifier")
    public static native NSString CollationIdentifierValue();
    @GlobalConstant("NSLocaleUsesMetricSystem")
    public static native NSString UsesMetricSystemValue();
    @GlobalConstant("NSLocaleMeasurementSystem")
    public static native NSString MeasurementSystemValue();
    @GlobalConstant("NSLocaleDecimalSeparator")
    public static native NSString DecimalSeparatorValue();
    @GlobalConstant("NSLocaleGroupingSeparator")
    public static native NSString GroupingSeparatorValue();
    @GlobalConstant("NSLocaleCurrencySymbol")
    public static native NSString CurrencySymbolValue();
    @GlobalConstant("NSLocaleCurrencyCode")
    public static native NSString CurrencyCodeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleCollatorIdentifier")
    public static native NSString CollatorIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleQuotationBeginDelimiterKey")
    public static native NSString QuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleQuotationEndDelimiterKey")
    public static native NSString QuotationEndDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleAlternateQuotationBeginDelimiterKey")
    public static native NSString AlternateQuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleAlternateQuotationEndDelimiterKey")
    public static native NSString AlternateQuotationEndDelimiterKeyValue();

}
