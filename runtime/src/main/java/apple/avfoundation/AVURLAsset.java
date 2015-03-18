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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVURLAsset")
public class AVURLAsset 
    extends AVAsset 
     {

    
    
    @Mapping("initWithURL:options:")
    public AVURLAsset(NSURL URL, NSDictionary<?, ?> options) { }
    @Mapping("init")
    public AVURLAsset() { }
    
    
    @Mapping("URL")
    public native NSURL getURL();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("resourceLoader")
    public native AVAssetResourceLoader getResourceLoader();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("audiovisualTypes")
    public static native List<String> getAudiovisualTypes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("audiovisualMIMETypes")
    public static native List<String> getAudiovisualMIMETypes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isPlayableExtendedMIMEType:")
    public static native boolean isPlayableExtendedMIMEType(String extendedMIMEType);
    @Mapping("URLAssetWithURL:options:")
    public static native AVURLAsset create(NSURL URL, NSDictionary<?, ?> options);
    @Mapping("compatibleTrackForCompositionTrack:")
    public native AVAssetTrack getCompatibleTrack(AVCompositionTrack compositionTrack);
    
}
