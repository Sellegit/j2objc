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

@Library("Metal")
public final class MTLRenderCommandEncoder 
    extends Object 
    implements MTLCommandEncoder {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("setRenderPipelineState:")
    public native void setRenderPipelineState(MTLRenderPipelineState pipelineState);
    @Mapping("setVertexBuffer:offset:atIndex:")
    public native void setVertexBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Mapping("setVertexBuffers:offsets:withRange:")
    protected native void setVertexBuffers(Todo buffers, Todo offsets, NSRange range);
    @Mapping("setVertexTexture:atIndex:")
    public native void setVertexTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Mapping("setVertexTextures:withRange:")
    protected native void setVertexTextures(Todo textures, NSRange range);
    @Mapping("setVertexSamplerState:atIndex:")
    public native void setVertexSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Mapping("setVertexSamplerStates:withRange:")
    protected native void setVertexSamplerStates(Todo samplers, NSRange range);
    @Mapping("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    public native void setVertexSamplerState(MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp, @MachineSizedUInt long index);
    @Mapping("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    protected native void setVertexSamplerStates(Todo samplers, Todo lodMinClamps, Todo lodMaxClamps, NSRange range);
    @Mapping("setViewport:")
    public native void setViewport(MTLViewport viewport);
    @Mapping("setFrontFacingWinding:")
    public native void setFrontFacingWinding(@Representing("MTLWinding") @MachineSizedUInt long frontFacingWinding);
    @Mapping("setCullMode:")
    public native void setCullMode(@Representing("MTLCullMode") @MachineSizedUInt long cullMode);
    @Mapping("setDepthBias:slopeScale:clamp:")
    public native void setDepthBias(float depthBias, float slopeScale, float clamp);
    @Mapping("setScissorRect:")
    public native void setScissorRect(MTLScissorRect rect);
    @Mapping("setTriangleFillMode:")
    public native void setTriangleFillMode(@Representing("MTLTriangleFillMode") @MachineSizedUInt long fillMode);
    @Mapping("setFragmentBuffer:offset:atIndex:")
    public native void setFragmentBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Mapping("setFragmentBuffers:offsets:withRange:")
    protected native void setFragmentBuffers(Todo buffers, Todo offset, NSRange range);
    @Mapping("setFragmentTexture:atIndex:")
    public native void setFragmentTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Mapping("setFragmentTextures:withRange:")
    protected native void setFragmentTextures(Todo textures, NSRange range);
    @Mapping("setFragmentSamplerState:atIndex:")
    public native void setFragmentSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Mapping("setFragmentSamplerStates:withRange:")
    protected native void setFragmentSamplerStates(Todo samplers, NSRange range);
    @Mapping("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    public native void setFragmentSamplerState(MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp, @MachineSizedUInt long index);
    @Mapping("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    protected native void setFragmentSamplerStates(Todo samplers, Todo lodMinClamps, Todo lodMaxClamps, NSRange range);
    @Mapping("setBlendColorRed:green:blue:alpha:")
    public native void setBlendColor(float red, float green, float blue, float alpha);
    @Mapping("setDepthStencilState:")
    public native void setDepthStencilState(MTLDepthStencilState depthStencilState);
    @Mapping("setStencilReferenceValue:")
    public native void setStencilReferenceValue(int referenceValue);
    @Mapping("setVisibilityResultMode:offset:")
    public native void setVisibilityResultMode(@Representing("MTLVisibilityResultMode") @MachineSizedUInt long mode, @MachineSizedUInt long offset);
    @Mapping("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    public native void drawPrimitives(@Representing("MTLPrimitiveType") @MachineSizedUInt long primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount);
    @Mapping("drawPrimitives:vertexStart:vertexCount:")
    public native void drawPrimitives(@Representing("MTLPrimitiveType") @MachineSizedUInt long primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount);
    @Mapping("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
    public native void drawIndexedPrimitives(@Representing("MTLPrimitiveType") @MachineSizedUInt long primitiveType, @MachineSizedUInt long indexCount, @Representing("MTLIndexType") @MachineSizedUInt long indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, @MachineSizedUInt long instanceCount);
    @Mapping("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
    public native void drawIndexedPrimitives(@Representing("MTLPrimitiveType") @MachineSizedUInt long primitiveType, @MachineSizedUInt long indexCount, @Representing("MTLIndexType") @MachineSizedUInt long indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset);
    @Mapping("endEncoding")
    public native void endEncoding();
    @Mapping("insertDebugSignpost:")
    public native void insertDebugSignpost(String string);
    @Mapping("pushDebugGroup:")
    public native void pushDebugGroup(String string);
    @Mapping("popDebugGroup")
    public native void popDebugGroup();
    
}
