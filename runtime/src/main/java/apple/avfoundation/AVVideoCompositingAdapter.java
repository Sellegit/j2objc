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

public abstract class AVVideoCompositingAdapter 
    extends Object 
    implements AVVideoCompositing {

    
    
    
    @NotImplemented("sourcePixelBufferAttributes")
    public CVPixelBufferAttributes getSourcePixelBufferAttributes() { throw new UnsupportedOperationException(); }
    @NotImplemented("requiredPixelBufferAttributesForRenderContext")
    public CVPixelBufferAttributes getRequiredPixelBufferAttributesForRenderContext() { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("renderContextChanged:")
    public void renderContextChanged(AVVideoCompositionRenderContext newRenderContext) { throw new UnsupportedOperationException(); }
    @NotImplemented("startVideoCompositionRequest:")
    public void startVideoCompositionRequest(AVAsynchronousVideoCompositionRequest asyncVideoCompositionRequest) { throw new UnsupportedOperationException(); }
    @NotImplemented("cancelAllPendingVideoCompositionRequests")
    public void cancelAllPendingVideoCompositionRequests() { throw new UnsupportedOperationException(); }
    
}
