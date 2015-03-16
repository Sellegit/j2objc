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

@Library("Metal/Metal.h") @Mapping("MTLRenderPassDescriptor")
public class MTLRenderPassDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPassDescriptor() {}
    
    
    @Mapping("colorAttachments")
    public native MTLRenderPassColorAttachmentDescriptorArray getColorAttachments();
    @Mapping("depthAttachment")
    public native MTLRenderPassDepthAttachmentDescriptor getDepthAttachment();
    @Mapping("setDepthAttachment:")
    public native void setDepthAttachment(MTLRenderPassDepthAttachmentDescriptor v);
    @Mapping("stencilAttachment")
    public native MTLRenderPassStencilAttachmentDescriptor getStencilAttachment();
    @Mapping("setStencilAttachment:")
    public native void setStencilAttachment(MTLRenderPassStencilAttachmentDescriptor v);
    @Mapping("visibilityResultBuffer")
    public native MTLBuffer getVisibilityResultBuffer();
    @Mapping("setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(MTLBuffer v);
    
    
    
    @Mapping("renderPassDescriptor")
    public static native MTLRenderPassDescriptor create();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
