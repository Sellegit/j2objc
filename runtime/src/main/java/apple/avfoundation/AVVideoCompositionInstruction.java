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

@Library("AVFoundation") @Mapping("AVVideoCompositionInstruction")
public class AVVideoCompositionInstruction 
    extends NSObject 
    implements NSCopying {

    
    
    public AVVideoCompositionInstruction() {}
    
    
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    @Mapping("backgroundColor")
    public native CGColor getBackgroundColor();
    public native void setBackgroundColor(CGColor v);
    @Mapping("layerInstructions")
    public native NSArray<AVVideoCompositionLayerInstruction> getLayerInstructions();
    @Mapping("enablePostProcessing")
    public native boolean isPostProcessingEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("requiredSourceTrackIDs")
    public native List<Integer> getRequiredSourceTrackIDs();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("passthroughTrackID")
    public native int getPassthroughTrackID();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
