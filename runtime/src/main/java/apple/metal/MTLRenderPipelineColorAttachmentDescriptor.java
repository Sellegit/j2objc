package apple.metal;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal") @Mapping("MTLRenderPipelineColorAttachmentDescriptor")
public class MTLRenderPipelineColorAttachmentDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPipelineColorAttachmentDescriptor() {}
    
    
    @Mapping("pixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getPixelFormat();
    public native void setPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    @Mapping("isBlendingEnabled")
    public native boolean isBlendingEnabled();
    public native void setBlendingEnabled(boolean v);
    @Mapping("sourceRGBBlendFactor")
    public native @Representing("MTLBlendFactor") @MachineSizedUInt long getSourceRGBBlendFactor();
    public native void setSourceRGBBlendFactor(@Representing("MTLBlendFactor") @MachineSizedUInt long v);
    @Mapping("destinationRGBBlendFactor")
    public native @Representing("MTLBlendFactor") @MachineSizedUInt long getDestinationRGBBlendFactor();
    public native void setDestinationRGBBlendFactor(@Representing("MTLBlendFactor") @MachineSizedUInt long v);
    @Mapping("rgbBlendOperation")
    public native @Representing("MTLBlendOperation") @MachineSizedUInt long getRgbBlendOperation();
    public native void setRgbBlendOperation(@Representing("MTLBlendOperation") @MachineSizedUInt long v);
    @Mapping("sourceAlphaBlendFactor")
    public native @Representing("MTLBlendFactor") @MachineSizedUInt long getSourceAlphaBlendFactor();
    public native void setSourceAlphaBlendFactor(@Representing("MTLBlendFactor") @MachineSizedUInt long v);
    @Mapping("destinationAlphaBlendFactor")
    public native @Representing("MTLBlendFactor") @MachineSizedUInt long getDestinationAlphaBlendFactor();
    public native void setDestinationAlphaBlendFactor(@Representing("MTLBlendFactor") @MachineSizedUInt long v);
    @Mapping("alphaBlendOperation")
    public native @Representing("MTLBlendOperation") @MachineSizedUInt long getAlphaBlendOperation();
    public native void setAlphaBlendOperation(@Representing("MTLBlendOperation") @MachineSizedUInt long v);
    @Mapping("writeMask")
    public native @Representing("MTLColorWriteMask") @MachineSizedUInt long getWriteMask();
    public native void setWriteMask(@Representing("MTLColorWriteMask") @MachineSizedUInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
