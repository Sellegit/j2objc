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
@Library("CoreFoundation")
public class CFNumberFormatterProperty 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kCFNumberFormatterCurrencyCode")
    protected static native CFString CurrencyCodeValue();
    @GlobalConstant("kCFNumberFormatterDecimalSeparator")
    protected static native CFString DecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterCurrencyDecimalSeparator")
    protected static native CFString CurrencyDecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterAlwaysShowDecimalSeparator")
    protected static native CFString AlwaysShowDecimalSeparatorValue();
    @GlobalConstant("kCFNumberFormatterGroupingSeparator")
    protected static native CFString GroupingSeparatorValue();
    @GlobalConstant("kCFNumberFormatterUseGroupingSeparator")
    protected static native CFString UseGroupingSeparatorValue();
    @GlobalConstant("kCFNumberFormatterPercentSymbol")
    protected static native CFString PercentSymbolValue();
    @GlobalConstant("kCFNumberFormatterZeroSymbol")
    protected static native CFString ZeroSymbolValue();
    @GlobalConstant("kCFNumberFormatterNaNSymbol")
    protected static native CFString NaNSymbolValue();
    @GlobalConstant("kCFNumberFormatterInfinitySymbol")
    protected static native CFString InfinitySymbolValue();
    @GlobalConstant("kCFNumberFormatterMinusSign")
    protected static native CFString MinusSignValue();
    @GlobalConstant("kCFNumberFormatterPlusSign")
    protected static native CFString PlusSignValue();
    @GlobalConstant("kCFNumberFormatterCurrencySymbol")
    protected static native CFString CurrencySymbolValue();
    @GlobalConstant("kCFNumberFormatterExponentSymbol")
    protected static native CFString ExponentSymbolValue();
    @GlobalConstant("kCFNumberFormatterMinIntegerDigits")
    protected static native CFString MinIntegerDigitsValue();
    @GlobalConstant("kCFNumberFormatterMaxIntegerDigits")
    protected static native CFString MaxIntegerDigitsValue();
    @GlobalConstant("kCFNumberFormatterMinFractionDigits")
    protected static native CFString MinFractionDigitsValue();
    @GlobalConstant("kCFNumberFormatterMaxFractionDigits")
    protected static native CFString MaxFractionDigitsValue();
    @GlobalConstant("kCFNumberFormatterGroupingSize")
    protected static native CFString GroupingSizeValue();
    @GlobalConstant("kCFNumberFormatterSecondaryGroupingSize")
    protected static native CFString SecondaryGroupingSizeValue();
    @GlobalConstant("kCFNumberFormatterRoundingMode")
    protected static native CFString RoundingModeValue();
    @GlobalConstant("kCFNumberFormatterRoundingIncrement")
    protected static native CFString RoundingIncrementValue();
    @GlobalConstant("kCFNumberFormatterFormatWidth")
    protected static native CFString FormatWidthValue();
    @GlobalConstant("kCFNumberFormatterPaddingPosition")
    protected static native CFString PaddingPositionValue();
    @GlobalConstant("kCFNumberFormatterPaddingCharacter")
    protected static native CFString PaddingCharacterValue();
    @GlobalConstant("kCFNumberFormatterDefaultFormat")
    protected static native CFString DefaultFormatValue();
    @GlobalConstant("kCFNumberFormatterMultiplier")
    protected static native CFString MultiplierValue();
    @GlobalConstant("kCFNumberFormatterPositivePrefix")
    protected static native CFString PositivePrefixValue();
    @GlobalConstant("kCFNumberFormatterPositiveSuffix")
    protected static native CFString PositiveSuffixValue();
    @GlobalConstant("kCFNumberFormatterNegativePrefix")
    protected static native CFString NegativePrefixValue();
    @GlobalConstant("kCFNumberFormatterNegativeSuffix")
    protected static native CFString NegativeSuffixValue();
    @GlobalConstant("kCFNumberFormatterPerMillSymbol")
    protected static native CFString PerMillSymbolValue();
    @GlobalConstant("kCFNumberFormatterInternationalCurrencySymbol")
    protected static native CFString InternationalCurrencySymbolValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterCurrencyGroupingSeparator")
    protected static native CFString CurrencyGroupingSeparatorValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterIsLenient")
    protected static native CFString IsLenientValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterUseSignificantDigits")
    protected static native CFString UseSignificantDigitsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterMinSignificantDigits")
    protected static native CFString MinSignificantDigitsValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberFormatterMaxSignificantDigits")
    protected static native CFString MaxSignificantDigitsValue();
    
}
