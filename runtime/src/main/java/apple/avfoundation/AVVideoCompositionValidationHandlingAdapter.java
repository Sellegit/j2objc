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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVVideoCompositionValidationHandlingAdapter 
    extends Object 
    implements AVVideoCompositionValidationHandling {

    
    
    


    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:")
    public boolean shouldContinueValidatingAfterFindingInvalidValue(AVVideoComposition videoComposition, String key) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:")
    public boolean shouldContinueValidatingAfterFindingEmptyTimeRange(AVVideoComposition videoComposition, CMTimeRange timeRange) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:")
    public boolean shouldContinueValidatingAfterFindingInvalidTimeRange(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:")
    public boolean shouldContinueValidatingAfterFindingInvalidTrackID(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction, AVVideoCompositionLayerInstruction layerInstruction, AVAsset asset) { throw new UnsupportedOperationException(); }

}
