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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableVideoCompositionInstruction")
public class AVMutableVideoCompositionInstruction 
    extends AVVideoCompositionInstruction 
     {

    
    
    @Mapping("init")
    public AVMutableVideoCompositionInstruction() { }

    
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    @Mapping("setTimeRange:")
    public native void setTimeRange(CMTimeRange v);
    @Mapping("backgroundColor")
    public native CGColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(CGColor v);
    @Mapping("layerInstructions")
    public native NSArray<AVVideoCompositionLayerInstruction> getLayerInstructions();
    @Mapping("setLayerInstructions:")
    public native void setLayerInstructions(NSArray<AVVideoCompositionLayerInstruction> v);
    @Mapping("enablePostProcessing")
    public native boolean isPostProcessingEnabled();
    @Mapping("setEnablePostProcessing:")
    public native void setPostProcessingEnabled(boolean v);

    
    
    @Mapping("videoCompositionInstruction")
    public static native AVMutableVideoCompositionInstruction create();

}
