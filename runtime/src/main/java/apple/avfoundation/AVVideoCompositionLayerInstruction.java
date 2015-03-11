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

@Library("AVFoundation") @Mapping("AVVideoCompositionLayerInstruction")
public class AVVideoCompositionLayerInstruction 
    extends NSObject 
    implements NSCopying {

    
    
    public AVVideoCompositionLayerInstruction() {}
    
    
    @Mapping("trackID")
    public native int getTrackID();
    
    
    
    @Mapping("getTransformRampForTime:startTransform:endTransform:timeRange:")
    public native boolean getTransformRamp(CMTime time, Todo startTransform, Todo endTransform, Todo timeRange);
    @Mapping("getOpacityRampForTime:startOpacity:endOpacity:timeRange:")
    public native boolean getOpacityRamp(CMTime time, Todo startOpacity, Todo endOpacity, Todo timeRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("getCropRectangleRampForTime:startCropRectangle:endCropRectangle:timeRange:")
    public native boolean getCropRectangleRamp(CMTime time, Todo startCropRectangle, Todo endCropRectangle, Todo timeRange);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
