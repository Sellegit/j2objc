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
@Library("Foundation")
public class NSLocaleComponent 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSLocaleIdentifier")
    protected static native NSString IdentifierValue();
    @GlobalConstant("NSLocaleLanguageCode")
    protected static native NSString LanguageCodeValue();
    @GlobalConstant("NSLocaleCountryCode")
    protected static native NSString CountryCodeValue();
    @GlobalConstant("NSLocaleScriptCode")
    protected static native NSString ScriptCodeValue();
    @GlobalConstant("NSLocaleVariantCode")
    protected static native NSString VariantCodeValue();
    @GlobalConstant("NSLocaleExemplarCharacterSet")
    protected static native NSString ExemplarCharacterSetValue();
    @GlobalConstant("NSLocaleCollationIdentifier")
    protected static native NSString CollationIdentifierValue();
    @GlobalConstant("NSLocaleUsesMetricSystem")
    protected static native NSString UsesMetricSystemValue();
    @GlobalConstant("NSLocaleMeasurementSystem")
    protected static native NSString MeasurementSystemValue();
    @GlobalConstant("NSLocaleDecimalSeparator")
    protected static native NSString DecimalSeparatorValue();
    @GlobalConstant("NSLocaleGroupingSeparator")
    protected static native NSString GroupingSeparatorValue();
    @GlobalConstant("NSLocaleCurrencySymbol")
    protected static native NSString CurrencySymbolValue();
    @GlobalConstant("NSLocaleCurrencyCode")
    protected static native NSString CurrencyCodeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleCollatorIdentifier")
    protected static native NSString CollatorIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleQuotationBeginDelimiterKey")
    protected static native NSString QuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleQuotationEndDelimiterKey")
    protected static native NSString QuotationEndDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleAlternateQuotationBeginDelimiterKey")
    protected static native NSString AlternateQuotationBeginDelimiterKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSLocaleAlternateQuotationEndDelimiterKey")
    protected static native NSString AlternateQuotationEndDelimiterKeyValue();
    
}
