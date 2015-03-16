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





@Library("Foundation/Foundation.h")
@Mapping("NSCalculationError")
public final class NSCalculationError extends ObjCEnum {
    
    @GlobalConstant("NSCalculationNoError")
    public static final long NoError = 0L;
    @GlobalConstant("NSCalculationLossOfPrecision")
    public static final long LossOfPrecision = 1L;
    @GlobalConstant("NSCalculationUnderflow")
    public static final long Underflow = 2L;
    @GlobalConstant("NSCalculationOverflow")
    public static final long Overflow = 3L;
    @GlobalConstant("NSCalculationDivideByZero")
    public static final long DivideByZero = 4L;
    

}
