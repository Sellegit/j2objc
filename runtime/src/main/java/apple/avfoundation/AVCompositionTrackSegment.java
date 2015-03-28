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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVCompositionTrackSegment")
public class AVCompositionTrackSegment 
    extends AVAssetTrackSegment 
     {

    
    
    @Mapping("initWithURL:trackID:sourceTimeRange:targetTimeRange:")
    public AVCompositionTrackSegment(NSURL URL, int trackID, CMTimeRange sourceTimeRange, CMTimeRange targetTimeRange) { }
    @Mapping("initWithTimeRange:")
    public AVCompositionTrackSegment(CMTimeRange timeRange) { }
    @Mapping("init")
    public AVCompositionTrackSegment() { }

    
    @Mapping("isEmpty")
    public native boolean isEmpty();
    @Mapping("sourceURL")
    public native NSURL getSourceURL();
    @Mapping("sourceTrackID")
    public native int getSourceTrackID();

    
    
    @Mapping("compositionTrackSegmentWithURL:trackID:sourceTimeRange:targetTimeRange:")
    public static native AVCompositionTrackSegment create(NSURL URL, int trackID, CMTimeRange sourceTimeRange, CMTimeRange targetTimeRange);
    @Mapping("compositionTrackSegmentWithTimeRange:")
    public static native AVCompositionTrackSegment create(CMTimeRange timeRange);

}
