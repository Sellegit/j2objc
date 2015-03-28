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


@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioRecorderDelegate")
public interface AVAudioRecorderDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("audioRecorderDidFinishRecording:successfully:")
    void didFinishRecording(AVAudioRecorder recorder, boolean flag);
    @Mapping("audioRecorderEncodeErrorDidOccur:error:")
    void encodeErrorDidOccur(AVAudioRecorder recorder, NSError error);
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("audioRecorderBeginInterruption:")
    void beginInterruption(AVAudioRecorder recorder);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("audioRecorderEndInterruption:withOptions:")
    void endInterruptionWithOptions(AVAudioRecorder recorder, @MachineSizedUInt long flags);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("audioRecorderEndInterruption:withFlags:")
    void endInterruptionWithFlags(AVAudioRecorder recorder, @MachineSizedUInt long flags);
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("audioRecorderEndInterruption:")
    void endInterruption(AVAudioRecorder recorder);

    /*<adapter>*/
    /*</adapter>*/
}
