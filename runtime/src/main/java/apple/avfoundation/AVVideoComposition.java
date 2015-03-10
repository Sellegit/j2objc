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

@Library("AVFoundation") @Mapping("AVVideoComposition")
public class AVVideoComposition 
    extends NSObject 
    implements NSCopying {

    
    
    public AVVideoComposition() {}
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositorClass")
    public native Class<? extends AVVideoCompositing> getCustomVideoCompositorClass();
    @Mapping("frameDuration")
    public native CMTime getFrameDuration();
    @Mapping("renderSize")
    public native CGSize getRenderSize();
    @Mapping("renderScale")
    public native float getRenderScale();
    @Mapping("instructions")
    public native NSArray<AVVideoCompositionInstruction> getInstructions();
    @Mapping("animationTool")
    public native AVVideoCompositionCoreAnimationTool getAnimationTool();
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("videoCompositionWithPropertiesOfAsset:")
    public static native AVVideoComposition create(AVAsset asset);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isValidForAsset:timeRange:validationDelegate:")
    public native boolean isValid(AVAsset asset, CMTimeRange timeRange, AVVideoCompositionValidationHandling validationDelegate);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
