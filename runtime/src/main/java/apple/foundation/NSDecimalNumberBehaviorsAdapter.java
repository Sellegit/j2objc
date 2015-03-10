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

public abstract class NSDecimalNumberBehaviorsAdapter 
    extends Object 
    implements NSDecimalNumberBehaviors {

    
    
    
    
    
    
    
    @NotImplemented("roundingMode")
    public @Representing("NSRoundingMode") @MachineSizedUInt long getRoundingMode() { throw new UnsupportedOperationException(); }
    @NotImplemented("scale")
    public short getScale() { throw new UnsupportedOperationException(); }
    @NotImplemented("exceptionDuringOperation:error:leftOperand:rightOperand:")
    public NSDecimalNumber exceptionDuringOperation(Selector operation, @Representing("NSCalculationError") @MachineSizedUInt long error, NSDecimalNumber leftOperand, NSDecimalNumber rightOperand) { throw new UnsupportedOperationException(); }
    
}
