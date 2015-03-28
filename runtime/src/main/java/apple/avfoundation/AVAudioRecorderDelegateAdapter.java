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
public abstract class AVAudioRecorderDelegateAdapter 
    extends Object 
    implements AVAudioRecorderDelegate {

    
    
    


    
    
    @NotImplemented("audioRecorderDidFinishRecording:successfully:")
    public void didFinishRecording(AVAudioRecorder recorder, boolean flag) { throw new UnsupportedOperationException(); }
    @NotImplemented("audioRecorderEncodeErrorDidOccur:error:")
    public void encodeErrorDidOccur(AVAudioRecorder recorder, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderBeginInterruption:")
    public void beginInterruption(AVAudioRecorder recorder) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderEndInterruption:withOptions:")
    public void endInterruptionWithOptions(AVAudioRecorder recorder, @MachineSizedUInt long flags) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderEndInterruption:withFlags:")
    public void endInterruptionWithFlags(AVAudioRecorder recorder, @MachineSizedUInt long flags) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderEndInterruption:")
    public void endInterruption(AVAudioRecorder recorder) { throw new UnsupportedOperationException(); }

}
