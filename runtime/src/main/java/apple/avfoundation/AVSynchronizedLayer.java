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


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVSynchronizedLayer")
public class AVSynchronizedLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public AVSynchronizedLayer() { }
    @Mapping("initWithLayer:")
    public AVSynchronizedLayer(Object layer) { }

    
    @Mapping("playerItem")
    public native AVPlayerItem getPlayerItem();
    @Mapping("setPlayerItem:")
    public native void setPlayerItem(AVPlayerItem v);

    
    
    @Mapping("synchronizedLayerWithPlayerItem:")
    public static native AVSynchronizedLayer create(AVPlayerItem playerItem);

}
