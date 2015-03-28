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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVVideoCompositionRenderContext")
public class AVVideoCompositionRenderContext 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVVideoCompositionRenderContext() { }

    
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("renderTransform")
    public native CGAffineTransform getRenderTransform();
    @Mapping("renderScale")
    public native float getRenderScale();
    @Mapping("pixelAspectRatio")
    public native AVPixelAspectRatio getPixelAspectRatio();
    @Mapping("edgeWidths")
    public native AVEdgeWidths getEdgeWidths();
    @Mapping("highQualityRendering")
    public native boolean isHighQualityRendering();
    @Mapping("videoComposition")
    public native AVVideoComposition getVideoComposition();

    
    


}
