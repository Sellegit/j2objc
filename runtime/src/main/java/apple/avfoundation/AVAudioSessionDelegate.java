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





@Library("AVFoundation") @Mapping("AVAudioSessionDelegate")
public interface AVAudioSessionDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("beginInterruption")
    void beginInterruption();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("endInterruptionWithFlags:")
    void endInterruption(@MachineSizedUInt long flags);
    @Mapping("endInterruption")
    void endInterruption();
    @Mapping("inputIsAvailableChanged:")
    void inputAvailabilityChanged(boolean isInputAvailable);
    
    /*<adapter>*/
    /*</adapter>*/
}
