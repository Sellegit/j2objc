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

public abstract class AVAudioPlayerDelegateAdapter 
    extends Object 
    implements AVAudioPlayerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("audioPlayerDidFinishPlaying:successfully:")
    public void didFinishPlaying(AVAudioPlayer player, boolean flag) { throw new UnsupportedOperationException(); }
    @NotImplemented("audioPlayerDecodeErrorDidOccur:error:")
    public void decodeErrorDidOccur(AVAudioPlayer player, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioPlayerBeginInterruption:")
    public void beginInterruption(AVAudioPlayer player) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioPlayerEndInterruption:withOptions:")
    public void endInterruptionWithOptions(AVAudioPlayer player, @MachineSizedUInt long flags) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("audioPlayerEndInterruption:withFlags:")
    public void endInterruptionWithFlags(AVAudioPlayer player, @MachineSizedUInt long flags) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("audioPlayerEndInterruption:")
    public void endInterruption(AVAudioPlayer player) { throw new UnsupportedOperationException(); }
    
}
