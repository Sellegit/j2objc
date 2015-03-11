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
public final class MTLComputeCommandEncoder 
    extends Object 
    implements MTLCommandEncoder {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("label")
    public native String getLabel();
    public native void setLabel(String v);
    
    
    
    @Mapping("setComputePipelineState:")
    public native void setComputePipelineState(MTLComputePipelineState state);
    @Mapping("setBuffer:offset:atIndex:")
    public native void setBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Mapping("setBuffers:offsets:withRange:")
    protected native void setBuffers(Todo buffers, Todo offsets, NSRange range);
    @Mapping("setTexture:atIndex:")
    public native void setTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Mapping("setTextures:withRange:")
    protected native void setTextures(Todo textures, NSRange range);
    @Mapping("setSamplerState:atIndex:")
    public native void setSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Mapping("setSamplerStates:withRange:")
    protected native void setSamplerStates(Todo samplers, NSRange range);
    @Mapping("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    public native void setSamplerState(MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp, @MachineSizedUInt long index);
    @Mapping("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    protected native void setSamplerStates(Todo samplers, Todo lodMinClamps, Todo lodMaxClamps, NSRange range);
    @Mapping("setThreadgroupMemoryLength:atIndex:")
    public native void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index);
    @Mapping("dispatchThreadgroups:threadsPerThreadgroup:")
    public native void dispatchThreadgroups(MTLSize threadgroupsPerGrid, MTLSize threadsPerThreadgroup);
    @Mapping("endEncoding")
    public native void endEncoding();
    @Mapping("insertDebugSignpost:")
    public native void insertDebugSignpost(String string);
    @Mapping("pushDebugGroup:")
    public native void pushDebugGroup(String string);
    @Mapping("popDebugGroup")
    public native void popDebugGroup();
    
}
