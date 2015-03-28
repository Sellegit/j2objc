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


@Library("Foundation/Foundation.h") @Mapping("NSDecimalNumberHandler")
public class NSDecimalNumberHandler 
    extends NSObject 
    implements NSDecimalNumberBehaviors, NSCoding {

    
    
    @Mapping("initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
    public NSDecimalNumberHandler(@Representing("NSRoundingMode") long roundingMode, short scale, boolean exact, boolean overflow, boolean underflow, boolean divideByZero) { }
    @Mapping("init")
    public NSDecimalNumberHandler() { }

    


    
    
    @Mapping("defaultDecimalNumberHandler")
    public static native NSDecimalNumberHandler getDefaultDecimalNumberHandler();
    @Mapping("roundingMode")
    public native @Representing("NSRoundingMode") long getRoundingMode();
    @Mapping("scale")
    public native short getScale();
    @Mapping("exceptionDuringOperation:error:leftOperand:rightOperand:")
    public native NSDecimalNumber exceptionDuringOperation(Selector operation, @Representing("NSCalculationError") long error, NSDecimalNumber leftOperand, NSDecimalNumber rightOperand);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
