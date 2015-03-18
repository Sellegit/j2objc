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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableComposition")
public class AVMutableComposition 
    extends AVComposition 
     {

    
    
    @Mapping("init")
    public AVMutableComposition() { }
    
    
    @Mapping("tracks")
    public native NSArray<AVAssetTrack> getTracks();
    @Mapping("naturalSize")
    public native CGSize getNaturalSize();
    @Mapping("setNaturalSize:")
    public native void setNaturalSize(CGSize v);
    
    
    
    @Mapping("composition")
    public static native AVMutableComposition create();
    @Mapping("insertTimeRange:ofAsset:atTime:error:")
    public native boolean insertTimeRange(CMTimeRange timeRange, AVAsset asset, CMTime startTime, Todo outError);
    @Mapping("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(CMTimeRange timeRange);
    @Mapping("removeTimeRange:")
    public native void removeTimeRange(CMTimeRange timeRange);
    @Mapping("scaleTimeRange:toDuration:")
    public native void scaleTimeRange(CMTimeRange timeRange, CMTime duration);
    @Mapping("addMutableTrackWithMediaType:preferredTrackID:")
    public native AVMutableCompositionTrack addMutableTrack(String mediaType, int preferredTrackID);
    @Mapping("removeTrack:")
    public native void removeTrack(AVCompositionTrack track);
    @Mapping("mutableTrackCompatibleWithTrack:")
    public native AVMutableCompositionTrack getCompatibleMutableTrack(AVAssetTrack track);
    
}
