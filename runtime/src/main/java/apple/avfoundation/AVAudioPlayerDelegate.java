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





@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioPlayerDelegate")
public interface AVAudioPlayerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("audioPlayerDidFinishPlaying:successfully:")
    void didFinishPlaying(AVAudioPlayer player, boolean flag);
    @Mapping("audioPlayerDecodeErrorDidOccur:error:")
    void decodeErrorDidOccur(AVAudioPlayer player, NSError error);
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("audioPlayerBeginInterruption:")
    void beginInterruption(AVAudioPlayer player);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("audioPlayerEndInterruption:withOptions:")
    void endInterruptionWithOptions(AVAudioPlayer player, @MachineSizedUInt long flags);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("audioPlayerEndInterruption:withFlags:")
    void endInterruptionWithFlags(AVAudioPlayer player, @MachineSizedUInt long flags);
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("audioPlayerEndInterruption:")
    void endInterruption(AVAudioPlayer player);
    
    /*<adapter>*/
    /*</adapter>*/
}
