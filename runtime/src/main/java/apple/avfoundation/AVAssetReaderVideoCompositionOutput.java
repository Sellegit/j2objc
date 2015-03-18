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
 * @since Available in iOS 4.1 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetReaderVideoCompositionOutput")
public class AVAssetReaderVideoCompositionOutput 
    extends AVAssetReaderOutput 
     {

    
    
    @Mapping("init")
    public AVAssetReaderVideoCompositionOutput() { }
    
    
    @Mapping("videoTracks")
    public native NSArray<AVAssetTrack> getVideoTracks();
    @Mapping("videoSettings")
    public native NSDictionary<NSString, NSObject> getVideoSettings0();
    @Mapping("videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Mapping("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    
    
    
    @Mapping("assetReaderVideoCompositionOutputWithVideoTracks:videoSettings:")
    public static native AVAssetReaderVideoCompositionOutput create(NSArray<?> videoTracks, NSDictionary<?, ?> videoSettings);
    
}
