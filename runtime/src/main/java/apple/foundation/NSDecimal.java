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





@Mapping("NSDecimal") @Library("Foundation/Foundation.h")
public class NSDecimal 
    extends Struct 
     {

    
    private NSDecimal() {}
    
    
    @DotMapping("_exponent")
    public native int get_exponent();
    @DotMapping("_length")
    public native int get_length();
    @DotMapping("_isNegative")
    public native int get_isNegative();
    @DotMapping("_isCompact")
    public native int get_isCompact();
    @DotMapping("_reserved")
    public native int get_reserved();
    
    
    @GlobalFunction("NSDecimalCompact")
    public static native void compact(NSDecimal number);
    @GlobalFunction("NSDecimalCompare")
    public static native NSComparisonResult compare(NSDecimal leftOperand, NSDecimal rightOperand);
    @GlobalFunction("NSDecimalRound")
    public static native void round(NSDecimal result, NSDecimal number, @MachineSizedSInt long scale, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalNormalize")
    public static native NSCalculationError normalize(NSDecimal number1, NSDecimal number2, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalAdd")
    public static native NSCalculationError add(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalSubtract")
    public static native NSCalculationError subtract(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalMultiply")
    public static native NSCalculationError multiply(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalDivide")
    public static native NSCalculationError divide(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalPower")
    public static native NSCalculationError power(NSDecimal result, NSDecimal number, @MachineSizedUInt long power, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalMultiplyByPowerOf10")
    public static native NSCalculationError multiplyByPowerOf10(NSDecimal result, NSDecimal number, short power, @Representing("NSRoundingMode") long roundingMode);
    @GlobalFunction("NSDecimalString")
    public static native String toString(NSDecimal dcm, Object locale);
    
}
