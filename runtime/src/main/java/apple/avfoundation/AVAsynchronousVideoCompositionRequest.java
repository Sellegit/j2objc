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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAsynchronousVideoCompositionRequest")
public class AVAsynchronousVideoCompositionRequest 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVAsynchronousVideoCompositionRequest() { }
    
    
    @Mapping("renderContext")
    public native AVVideoCompositionRenderContext getRenderContext();
    @Mapping("compositionTime")
    public native CMTime getCompositionTime();
    @Mapping("sourceTrackIDs")
    public native List<String> getSourceTrackIDs();
    @Mapping("videoCompositionInstruction")
    public native AVVideoCompositionInstruction getVideoCompositionInstruction();
    
    
    
    @Mapping("finishWithError:")
    public native void finish(NSError error);
    @Mapping("finishCancelledRequest")
    public native void finishCancelledRequest();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
