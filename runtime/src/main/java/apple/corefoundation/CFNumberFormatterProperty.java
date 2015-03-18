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
public class CFNumberFormatterProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFNumberFormatterCurrencyCode")
    public static native CFString CurrencyCodeValue();
    @GlobalConstant("kCFNumberFormatterDecimalSeparator")
    public static native CFString DecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterCurrencyDecimalSeparator")
    public static native CFString CurrencyDecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterAlwaysShowDecimalSeparator")
    public static native CFString AlwaysShowDecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterGroupingSeparator")
    public static native CFString GroupingSeparatorValue();
    @GlobalConstant("kCFNumberFormatterUseGroupingSeparator")
    public static native CFString UseGroupingSeparatorValue();
    @GlobalConstant("kCFNumberFormatterPercentSymbol")
    public static native CFString PercentSymbolValue();
    @GlobalConstant("kCFNumberFormatterZeroSymbol")
    public static native CFString ZeroSymbolValue();
    @GlobalConstant("kCFNumberFormatterNaNSymbol")
    public static native CFString NaNSymbolValue();
    @GlobalConstant("kCFNumberFormatterInfinitySymbol")
    public static native CFString InfinitySymbolValue();
    @GlobalConstant("kCFNumberFormatterMinusSign")
    public static native CFString MinusSignValue();
    @GlobalConstant("kCFNumberFormatterPlusSign")
    public static native CFString PlusSignValue();
    @GlobalConstant("kCFNumberFormatterCurrencySymbol")
    public static native CFString CurrencySymbolValue();
    @GlobalConstant("kCFNumberFormatterExponentSymbol")
    public static native CFString ExponentSymbolValue();
    @GlobalConstant("kCFNumberFormatterMinIntegerDigits")
    public static native CFString MinIntegerDigitsValue();
    @GlobalConstant("kCFNumberFormatterMaxIntegerDigits")
    public static native CFString MaxIntegerDigitsValue();
    @GlobalConstant("kCFNumberFormatterMinFractionDigits")
    public static native CFString MinFractionDigitsValue();
    @GlobalConstant("kCFNumberFormatterMaxFractionDigits")
    public static native CFString MaxFractionDigitsValue();
    @GlobalConstant("kCFNumberFormatterGroupingSize")
    public static native CFString GroupingSizeValue();
    @GlobalConstant("kCFNumberFormatterSecondaryGroupingSize")
    public static native CFString SecondaryGroupingSizeValue();
    @GlobalConstant("kCFNumberFormatterRoundingMode")
    public static native CFString RoundingModeValue();
    @GlobalConstant("kCFNumberFormatterRoundingIncrement")
    public static native CFString RoundingIncrementValue();
    @GlobalConstant("kCFNumberFormatterFormatWidth")
    public static native CFString FormatWidthValue();
    @GlobalConstant("kCFNumberFormatterPaddingPosition")
    public static native CFString PaddingPositionValue();
    @GlobalConstant("kCFNumberFormatterPaddingCharacter")
    public static native CFString PaddingCharacterValue();
    @GlobalConstant("kCFNumberFormatterDefaultFormat")
    public static native CFString DefaultFormatValue();
    @GlobalConstant("kCFNumberFormatterMultiplier")
    public static native CFString MultiplierValue();
    @GlobalConstant("kCFNumberFormatterPositivePrefix")
    public static native CFString PositivePrefixValue();
    @GlobalConstant("kCFNumberFormatterPositiveSuffix")
    public static native CFString PositiveSuffixValue();
    @GlobalConstant("kCFNumberFormatterNegativePrefix")
    public static native CFString NegativePrefixValue();
    @GlobalConstant("kCFNumberFormatterNegativeSuffix")
    public static native CFString NegativeSuffixValue();
    @GlobalConstant("kCFNumberFormatterPerMillSymbol")
    public static native CFString PerMillSymbolValue();
    @GlobalConstant("kCFNumberFormatterInternationalCurrencySymbol")
    public static native CFString InternationalCurrencySymbolValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterCurrencyGroupingSeparator")
    public static native CFString CurrencyGroupingSeparatorValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterIsLenient")
    public static native CFString IsLenientValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterUseSignificantDigits")
    public static native CFString UseSignificantDigitsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterMinSignificantDigits")
    public static native CFString MinSignificantDigitsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterMaxSignificantDigits")
    public static native CFString MaxSignificantDigitsValue();
    
}
