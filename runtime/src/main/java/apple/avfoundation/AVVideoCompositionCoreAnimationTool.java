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

@Library("AVFoundation") @Mapping("AVVideoCompositionCoreAnimationTool")
public class AVVideoCompositionCoreAnimationTool 
    extends NSObject 
     {

    
    
    public AVVideoCompositionCoreAnimationTool() {}
    
    
    
    
    
    
    @Mapping("videoCompositionCoreAnimationToolWithAdditionalLayer:asTrackID:")
    public static native AVVideoCompositionCoreAnimationTool create(CALayer layer, int trackID);
    @Mapping("videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayer:inLayer:")
    public static native AVVideoCompositionCoreAnimationTool create(CALayer videoLayer, CALayer animationLayer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayers:inLayer:")
    public static native AVVideoCompositionCoreAnimationTool create(NSArray<CALayer> videoLayers, CALayer animationLayer);
    
}
