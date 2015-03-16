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

@Library("Metal/Metal.h") @Mapping("MTLRenderPipelineDescriptor")
public class MTLRenderPipelineDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPipelineDescriptor() {}
    
    
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("vertexFunction")
    public native MTLFunction getVertexFunction();
    @Mapping("setVertexFunction:")
    public native void setVertexFunction(MTLFunction v);
    @Mapping("fragmentFunction")
    public native MTLFunction getFragmentFunction();
    @Mapping("setFragmentFunction:")
    public native void setFragmentFunction(MTLFunction v);
    @Mapping("vertexDescriptor")
    public native MTLVertexDescriptor getVertexDescriptor();
    @Mapping("setVertexDescriptor:")
    public native void setVertexDescriptor(MTLVertexDescriptor v);
    @Mapping("sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Mapping("setSampleCount:")
    public native void setSampleCount(@MachineSizedUInt long v);
    @Mapping("isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();
    @Mapping("setAlphaToCoverageEnabled:")
    public native void setAlphaToCoverageEnabled(boolean v);
    @Mapping("isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();
    @Mapping("setAlphaToOneEnabled:")
    public native void setAlphaToOneEnabled(boolean v);
    @Mapping("isRasterizationEnabled")
    public native boolean isRasterizationEnabled();
    @Mapping("setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean v);
    @Mapping("colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray getColorAttachments();
    @Mapping("depthAttachmentPixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getDepthAttachmentPixelFormat();
    @Mapping("setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    @Mapping("stencilAttachmentPixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getStencilAttachmentPixelFormat();
    @Mapping("setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    
    
    
    @Mapping("reset")
    public native void reset();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
