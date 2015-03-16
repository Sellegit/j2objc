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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableCompositionTrack")
public class AVMutableCompositionTrack 
    extends AVCompositionTrack 
     {

    
    
    public AVMutableCompositionTrack() {}
    
    
    @Mapping("naturalTimeScale")
    public native int getNaturalTimeScale();
    @Mapping("setNaturalTimeScale:")
    public native void setNaturalTimeScale(int v);
    @Mapping("languageCode")
    public native String getLanguageCode();
    @Mapping("setLanguageCode:")
    public native void setLanguageCode(String v);
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Mapping("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    @Mapping("preferredTransform")
    public native CGAffineTransform getPreferredTransform();
    @Mapping("setPreferredTransform:")
    public native void setPreferredTransform(CGAffineTransform v);
    @Mapping("preferredVolume")
    public native float getPreferredVolume();
    @Mapping("setPreferredVolume:")
    public native void setPreferredVolume(float v);
    @Mapping("segments")
    public native NSArray<AVAssetTrackSegment> getSegments();
    @Mapping("setSegments:")
    public native void setSegments(NSArray<AVAssetTrackSegment> v);
    
    
    
    @Mapping("insertTimeRange:ofTrack:atTime:error:")
    public native boolean insertTimeRange(CMTimeRange timeRange, AVAssetTrack track, CMTime startTime, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("insertTimeRanges:ofTracks:atTime:error:")
    public native boolean insertTimeRanges(NSArray<?> timeRanges, NSArray<?> tracks, CMTime startTime, Todo error);
    @Mapping("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(CMTimeRange timeRange);
    @Mapping("removeTimeRange:")
    public native void removeTimeRange(CMTimeRange timeRange);
    @Mapping("scaleTimeRange:toDuration:")
    public native void scaleTimeRange(CMTimeRange timeRange, CMTime duration);
    @Mapping("validateTrackSegments:error:")
    public native boolean validateTrackSegments(NSArray<?> trackSegments, Todo error);
    
}
