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
@Adapter
public abstract class NSErrorRecoveryAttemptingAdapter 
    extends Object 
    implements NSErrorRecoveryAttempting {

    
    
    


    
    
    @NotImplemented("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    public void attemptRecoveryFromError(NSError error, @MachineSizedUInt long recoveryOptionIndex, Object delegate, Selector didRecoverSelector, Todo contextInfo) { throw new UnsupportedOperationException(); }
    @NotImplemented("attemptRecoveryFromError:optionIndex:")
    public boolean attemptRecoveryFromError(NSError error, @MachineSizedUInt long recoveryOptionIndex) { throw new UnsupportedOperationException(); }

}
