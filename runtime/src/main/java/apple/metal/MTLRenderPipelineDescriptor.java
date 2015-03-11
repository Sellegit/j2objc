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

@Library("Metal") @Mapping("MTLRenderPipelineDescriptor")
public class MTLRenderPipelineDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPipelineDescriptor() {}
    
    
    @Mapping("label")
    public native String getLabel();
    public native void setLabel(String v);
    @Mapping("vertexFunction")
    public native MTLFunction getVertexFunction();
    public native void setVertexFunction(MTLFunction v);
    @Mapping("fragmentFunction")
    public native MTLFunction getFragmentFunction();
    public native void setFragmentFunction(MTLFunction v);
    @Mapping("vertexDescriptor")
    public native MTLVertexDescriptor getVertexDescriptor();
    public native void setVertexDescriptor(MTLVertexDescriptor v);
    @Mapping("sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    public native void setSampleCount(@MachineSizedUInt long v);
    @Mapping("isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();
    public native void setAlphaToCoverageEnabled(boolean v);
    @Mapping("isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();
    public native void setAlphaToOneEnabled(boolean v);
    @Mapping("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();
    public native void setRasterizationEnabled(boolean v);
    @Mapping("colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray getColorAttachments();
    @Mapping("depthAttachmentPixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getDepthAttachmentPixelFormat();
    public native void setDepthAttachmentPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    @Mapping("stencilAttachmentPixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getStencilAttachmentPixelFormat();
    public native void setStencilAttachmentPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    
    
    
    @Mapping("reset")
    public native void reset();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
