package apple.avfoundation;


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
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVAudioSessionDelegateAdapter 
    extends Object 
    implements AVAudioSessionDelegate {

    
    
    
    
    
    
    
    @NotImplemented("beginInterruption")
    public void beginInterruption() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("endInterruptionWithFlags:")
    public void endInterruption(@MachineSizedUInt long flags) { throw new UnsupportedOperationException(); }
    @NotImplemented("endInterruption")
    public void endInterruption() { throw new UnsupportedOperationException(); }
    @NotImplemented("inputIsAvailableChanged:")
    public void inputAvailabilityChanged(boolean isInputAvailable) { throw new UnsupportedOperationException(); }
    
}
