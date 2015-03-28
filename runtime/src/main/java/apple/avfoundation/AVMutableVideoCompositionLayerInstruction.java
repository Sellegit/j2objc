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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableVideoCompositionLayerInstruction")
public class AVMutableVideoCompositionLayerInstruction 
    extends AVVideoCompositionLayerInstruction 
     {

    
    
    @Mapping("init")
    public AVMutableVideoCompositionLayerInstruction() { }

    
    @Mapping("trackID")
    public native int getTrackID();
    @Mapping("setTrackID:")
    public native void setTrackID(int v);

    
    
    @Mapping("setTransformRampFromStartTransform:toEndTransform:timeRange:")
    public native void setTransformRamp(CGAffineTransform startTransform, CGAffineTransform endTransform, CMTimeRange timeRange);
    @Mapping("setTransform:atTime:")
    public native void setTransform(CGAffineTransform transform, CMTime time);
    @Mapping("setOpacityRampFromStartOpacity:toEndOpacity:timeRange:")
    public native void setOpacityRamp(float startOpacity, float endOpacity, CMTimeRange timeRange);
    @Mapping("setOpacity:atTime:")
    public native void setOpacity(float opacity, CMTime time);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:")
    public native void setCropRectangleRamp(CGRect startCropRectangle, CGRect endCropRectangle, CMTimeRange timeRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCropRectangle:atTime:")
    public native void setCropRectangle(CGRect cropRectangle, CMTime time);
    @Mapping("videoCompositionLayerInstructionWithAssetTrack:")
    public static native AVMutableVideoCompositionLayerInstruction create(AVAssetTrack track);
    @Mapping("videoCompositionLayerInstruction")
    public static native AVMutableVideoCompositionLayerInstruction create();

}
