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





@Library("Foundation") @Mapping("NSDecimalNumberBehaviors")
public interface NSDecimalNumberBehaviors 
     {

    
    
    
    
    
    @Mapping("roundingMode")
    @Representing("NSRoundingMode") @MachineSizedUInt long getRoundingMode();
    @Mapping("scale")
    short getScale();
    @Mapping("exceptionDuringOperation:error:leftOperand:rightOperand:")
    NSDecimalNumber exceptionDuringOperation(Selector operation, @Representing("NSCalculationError") @MachineSizedUInt long error, NSDecimalNumber leftOperand, NSDecimalNumber rightOperand);
    
    /*<adapter>*/
    /*</adapter>*/
}
