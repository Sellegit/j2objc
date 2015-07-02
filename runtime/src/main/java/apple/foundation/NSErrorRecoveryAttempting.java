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


@Library("Foundation/Foundation.h") @Mapping("NSErrorRecoveryAttempting")
public interface NSErrorRecoveryAttempting 
     {

    
    


    
    @Mapping("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    void attemptRecoveryFromError(NSError error, @MachineSizedUInt long recoveryOptionIndex, Object delegate, Selector didRecoverSelector, VoidPtr contextInfo);
    @Mapping("attemptRecoveryFromError:optionIndex:")
    boolean attemptRecoveryFromError(NSError error, @MachineSizedUInt long recoveryOptionIndex);

    /*<adapter>*/
    /*</adapter>*/
}
