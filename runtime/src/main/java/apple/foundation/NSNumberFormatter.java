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





@Library("Foundation/Foundation.h") @Mapping("NSNumberFormatter")
public class NSNumberFormatter 
    extends NSFormatter 
     {

    
    
    @Mapping("init")
    public NSNumberFormatter() { }
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("formattingContext")
    public native @Representing("NSFormattingContext") @MachineSizedSInt long getFormattingContext();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setFormattingContext:")
    public native void setFormattingContext(@Representing("NSFormattingContext") @MachineSizedSInt long v);
    @Mapping("numberStyle")
    public native @Representing("NSNumberFormatterStyle") @MachineSizedUInt long getNumberStyle();
    @Mapping("setNumberStyle:")
    public native void setNumberStyle(@Representing("NSNumberFormatterStyle") @MachineSizedUInt long v);
    @Mapping("locale")
    public native NSLocale getLocale();
    @Mapping("setLocale:")
    public native void setLocale(NSLocale v);
    @Mapping("generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();
    @Mapping("setGeneratesDecimalNumbers:")
    public native void setGeneratesDecimalNumbers(boolean v);
    @Mapping("formatterBehavior")
    public native @Representing("NSNumberFormatterBehavior") @MachineSizedUInt long getFormatterBehavior();
    @Mapping("setFormatterBehavior:")
    public native void setFormatterBehavior(@Representing("NSNumberFormatterBehavior") @MachineSizedUInt long v);
    @Mapping("negativeFormat")
    public native String getNegativeFormat();
    @Mapping("setNegativeFormat:")
    public native void setNegativeFormat(String v);
    @Mapping("textAttributesForNegativeValues")
    public native NSDictionary<?, ?> getTextAttributesForNegativeValues();
    @Mapping("setTextAttributesForNegativeValues:")
    public native void setTextAttributesForNegativeValues(NSDictionary<?, ?> v);
    @Mapping("positiveFormat")
    public native String getPositiveFormat();
    @Mapping("setPositiveFormat:")
    public native void setPositiveFormat(String v);
    @Mapping("textAttributesForPositiveValues")
    public native NSDictionary<?, ?> getTextAttributesForPositiveValues();
    @Mapping("setTextAttributesForPositiveValues:")
    public native void setTextAttributesForPositiveValues(NSDictionary<?, ?> v);
    @Mapping("allowsFloats")
    public native boolean allowsFloats();
    @Mapping("setAllowsFloats:")
    public native void setAllowsFloats(boolean v);
    @Mapping("decimalSeparator")
    public native String getDecimalSeparator();
    @Mapping("setDecimalSeparator:")
    public native void setDecimalSeparator(String v);
    @Mapping("alwaysShowsDecimalSeparator")
    public native boolean alwaysShowsDecimalSeparator();
    @Mapping("setAlwaysShowsDecimalSeparator:")
    public native void setAlwaysShowsDecimalSeparator(boolean v);
    @Mapping("currencyDecimalSeparator")
    public native String getCurrencyDecimalSeparator();
    @Mapping("setCurrencyDecimalSeparator:")
    public native void setCurrencyDecimalSeparator(String v);
    @Mapping("usesGroupingSeparator")
    public native boolean usesGroupingSeparator();
    @Mapping("setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean v);
    @Mapping("groupingSeparator")
    public native String getGroupingSeparator();
    @Mapping("setGroupingSeparator:")
    public native void setGroupingSeparator(String v);
    @Mapping("zeroSymbol")
    public native String getZeroSymbol();
    @Mapping("setZeroSymbol:")
    public native void setZeroSymbol(String v);
    @Mapping("textAttributesForZero")
    public native NSDictionary<?, ?> getTextAttributesForZero();
    @Mapping("setTextAttributesForZero:")
    public native void setTextAttributesForZero(NSDictionary<?, ?> v);
    @Mapping("nilSymbol")
    public native String getNullSymbol();
    @Mapping("setNilSymbol:")
    public native void setNullSymbol(String v);
    @Mapping("textAttributesForNil")
    public native NSDictionary<?, ?> getTextAttributesForNull();
    @Mapping("setTextAttributesForNil:")
    public native void setTextAttributesForNull(NSDictionary<?, ?> v);
    @Mapping("notANumberSymbol")
    public native String getNaNSymbol();
    @Mapping("setNotANumberSymbol:")
    public native void setNaNSymbol(String v);
    @Mapping("textAttributesForNotANumber")
    public native NSDictionary<?, ?> getTextAttributesForNaN();
    @Mapping("setTextAttributesForNotANumber:")
    public native void setTextAttributesForNaN(NSDictionary<?, ?> v);
    @Mapping("positiveInfinitySymbol")
    public native String getPositiveInfinitySymbol();
    @Mapping("setPositiveInfinitySymbol:")
    public native void setPositiveInfinitySymbol(String v);
    @Mapping("textAttributesForPositiveInfinity")
    public native NSDictionary<?, ?> getTextAttributesForPositiveInfinity();
    @Mapping("setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesForPositiveInfinity(NSDictionary<?, ?> v);
    @Mapping("negativeInfinitySymbol")
    public native String getNegativeInfinitySymbol();
    @Mapping("setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(String v);
    @Mapping("textAttributesForNegativeInfinity")
    public native NSDictionary<?, ?> getTextAttributesForNegativeInfinity();
    @Mapping("setTextAttributesForNegativeInfinity:")
    public native void setTextAttributesForNegativeInfinity(NSDictionary<?, ?> v);
    @Mapping("positivePrefix")
    public native String getPositivePrefix();
    @Mapping("setPositivePrefix:")
    public native void setPositivePrefix(String v);
    @Mapping("positiveSuffix")
    public native String getPositiveSuffix();
    @Mapping("setPositiveSuffix:")
    public native void setPositiveSuffix(String v);
    @Mapping("negativePrefix")
    public native String getNegativePrefix();
    @Mapping("setNegativePrefix:")
    public native void setNegativePrefix(String v);
    @Mapping("negativeSuffix")
    public native String getNegativeSuffix();
    @Mapping("setNegativeSuffix:")
    public native void setNegativeSuffix(String v);
    @Mapping("currencyCode")
    public native String getCurrencyCode();
    @Mapping("setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Mapping("currencySymbol")
    public native String getCurrencySymbol();
    @Mapping("setCurrencySymbol:")
    public native void setCurrencySymbol(String v);
    @Mapping("internationalCurrencySymbol")
    public native String getInternationalCurrencySymbol();
    @Mapping("setInternationalCurrencySymbol:")
    public native void setInternationalCurrencySymbol(String v);
    @Mapping("percentSymbol")
    public native String getPercentSymbol();
    @Mapping("setPercentSymbol:")
    public native void setPercentSymbol(String v);
    @Mapping("perMillSymbol")
    public native String getPerMillSymbol();
    @Mapping("setPerMillSymbol:")
    public native void setPerMillSymbol(String v);
    @Mapping("minusSign")
    public native String getMinusSign();
    @Mapping("setMinusSign:")
    public native void setMinusSign(String v);
    @Mapping("plusSign")
    public native String getPlusSign();
    @Mapping("setPlusSign:")
    public native void setPlusSign(String v);
    @Mapping("exponentSymbol")
    public native String getExponentSymbol();
    @Mapping("setExponentSymbol:")
    public native void setExponentSymbol(String v);
    @Mapping("groupingSize")
    public native @MachineSizedUInt long getGroupingSize();
    @Mapping("setGroupingSize:")
    public native void setGroupingSize(@MachineSizedUInt long v);
    @Mapping("secondaryGroupingSize")
    public native @MachineSizedUInt long getSecondaryGroupingSize();
    @Mapping("setSecondaryGroupingSize:")
    public native void setSecondaryGroupingSize(@MachineSizedUInt long v);
    @Mapping("multiplier")
    public native NSNumber getMultiplier();
    @Mapping("setMultiplier:")
    public native void setMultiplier(NSNumber v);
    @Mapping("formatWidth")
    public native @MachineSizedUInt long getFormatWidth();
    @Mapping("setFormatWidth:")
    public native void setFormatWidth(@MachineSizedUInt long v);
    @Mapping("paddingCharacter")
    public native String getPaddingCharacter();
    @Mapping("setPaddingCharacter:")
    public native void setPaddingCharacter(String v);
    @Mapping("paddingPosition")
    public native @Representing("NSNumberFormatterPadPosition") @MachineSizedUInt long getPaddingPosition();
    @Mapping("setPaddingPosition:")
    public native void setPaddingPosition(@Representing("NSNumberFormatterPadPosition") @MachineSizedUInt long v);
    @Mapping("roundingMode")
    public native @Representing("NSNumberFormatterRoundingMode") @MachineSizedUInt long getRoundingMode();
    @Mapping("setRoundingMode:")
    public native void setRoundingMode(@Representing("NSNumberFormatterRoundingMode") @MachineSizedUInt long v);
    @Mapping("roundingIncrement")
    public native NSNumber getRoundingIncrement();
    @Mapping("setRoundingIncrement:")
    public native void setRoundingIncrement(NSNumber v);
    @Mapping("minimumIntegerDigits")
    public native @MachineSizedUInt long getMinimumIntegerDigits();
    @Mapping("setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@MachineSizedUInt long v);
    @Mapping("maximumIntegerDigits")
    public native @MachineSizedUInt long getMaximumIntegerDigits();
    @Mapping("setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@MachineSizedUInt long v);
    @Mapping("minimumFractionDigits")
    public native @MachineSizedUInt long getMinimumFractionDigits();
    @Mapping("setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@MachineSizedUInt long v);
    @Mapping("maximumFractionDigits")
    public native @MachineSizedUInt long getMaximumFractionDigits();
    @Mapping("setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@MachineSizedUInt long v);
    @Mapping("minimum")
    public native NSNumber getMinimum();
    @Mapping("setMinimum:")
    public native void setMinimum(NSNumber v);
    @Mapping("maximum")
    public native NSNumber getMaximum();
    @Mapping("setMaximum:")
    public native void setMaximum(NSNumber v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("currencyGroupingSeparator")
    public native String getCurrencyGroupingSeparator();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setCurrencyGroupingSeparator:")
    public native void setCurrencyGroupingSeparator(String v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isLenient")
    public native boolean isLenient();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setLenient:")
    public native void setLenient(boolean v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("usesSignificantDigits")
    public native boolean usesSignificantDigits();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("minimumSignificantDigits")
    public native @MachineSizedUInt long getMinimumSignificantDigits();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("maximumSignificantDigits")
    public native @MachineSizedUInt long getMaximumSignificantDigits();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean v);
    
    
    
    @Mapping("stringFromNumber:")
    public native String format(NSNumber number);
    @Mapping("numberFromString:")
    public native NSNumber parse(String string);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("localizedStringFromNumber:numberStyle:")
    public static native String formatLocalized(NSNumber num, @Representing("NSNumberFormatterStyle") @MachineSizedUInt long nstyle);
    @Mapping("defaultFormatterBehavior")
    public static native @Representing("NSNumberFormatterBehavior") @MachineSizedUInt long getDefaultFormatterBehavior();
    @Mapping("setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(@Representing("NSNumberFormatterBehavior") @MachineSizedUInt long behavior);
    
}
