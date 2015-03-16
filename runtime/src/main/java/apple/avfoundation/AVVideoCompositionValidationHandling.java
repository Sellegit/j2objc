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





@Library("AVFoundation/AVFoundation.h") @Mapping("AVVideoCompositionValidationHandling")
public interface AVVideoCompositionValidationHandling 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:")
    boolean shouldContinueValidatingAfterFindingInvalidValue(AVVideoComposition videoComposition, String key);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:")
    boolean shouldContinueValidatingAfterFindingEmptyTimeRange(AVVideoComposition videoComposition, CMTimeRange timeRange);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:")
    boolean shouldContinueValidatingAfterFindingInvalidTimeRange(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:")
    boolean shouldContinueValidatingAfterFindingInvalidTrackID(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction, AVVideoCompositionLayerInstruction layerInstruction, AVAsset asset);
    
    /*<adapter>*/
    /*</adapter>*/
}
