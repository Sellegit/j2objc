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
public final class MTLDevice 
    extends Object 
    implements NSObjectProtocol {

    
    
    
    
    
    @Mapping("name")
    public native String getName();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("MTLCreateSystemDefaultDevice")
    public static native MTLDevice createSystemDefaultDevice();
    
    @Mapping("newCommandQueue")
    public native MTLCommandQueue newCommandQueue();
    @Mapping("newCommandQueueWithMaxCommandBufferCount:")
    public native MTLCommandQueue newCommandQueue(@MachineSizedUInt long maxCommandBufferCount);
    @Mapping("newBufferWithLength:options:")
    public native MTLBuffer newBuffer(@MachineSizedUInt long length, @Representing("MTLResourceOptions") @MachineSizedUInt long options);
    @Mapping("newDepthStencilStateWithDescriptor:")
    public native MTLDepthStencilState newDepthStencilState(MTLDepthStencilDescriptor descriptor);
    @Mapping("newTextureWithDescriptor:")
    public native MTLTexture newTexture(MTLTextureDescriptor descriptor);
    @Mapping("newSamplerStateWithDescriptor:")
    public native MTLSamplerState newSamplerState(MTLSamplerDescriptor descriptor);
    @Mapping("newDefaultLibrary")
    public native MTLLibrary newDefaultLibrary();
    @Mapping("newLibraryWithFile:error:")
    protected native MTLLibrary newLibraryWithFile(String filepath, Todo error);
    @Mapping("newLibraryWithData:error:")
    protected native MTLLibrary newLibraryWithData(DispatchData data, Todo error);
    @Mapping("newLibraryWithSource:options:error:")
    protected native MTLLibrary newLibraryWithSource(String source, MTLCompileOptions options, Todo error);
    @Mapping("newLibraryWithSource:options:completionHandler:")
    public native void newLibraryWithSource(String source, MTLCompileOptions options, @Block VoidBlock2<MTLLibrary, NSError> completionHandler);
    @Mapping("newRenderPipelineStateWithDescriptor:error:")
    protected native MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, Todo error);
    @Mapping("newRenderPipelineStateWithDescriptor:options:reflection:error:")
    protected native MTLRenderPipelineState newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, @Representing("MTLPipelineOption") @MachineSizedUInt long options, Todo reflection, Todo error);
    @Mapping("newRenderPipelineStateWithDescriptor:completionHandler:")
    public native void newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler);
    @Mapping("newRenderPipelineStateWithDescriptor:options:completionHandler:")
    public native void newRenderPipelineState(MTLRenderPipelineDescriptor descriptor, @Representing("MTLPipelineOption") @MachineSizedUInt long options, @Block VoidBlock3<MTLRenderPipelineState, MTLRenderPipelineReflection, NSError> completionHandler);
    @Mapping("newComputePipelineStateWithFunction:error:")
    protected native MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, Todo error);
    @Mapping("newComputePipelineStateWithFunction:options:reflection:error:")
    protected native MTLComputePipelineState newComputePipelineState(MTLFunction computeFunction, @Representing("MTLPipelineOption") @MachineSizedUInt long options, Todo reflection, Todo error);
    @Mapping("newComputePipelineStateWithFunction:completionHandler:")
    public native void newComputePipelineState(MTLFunction computeFunction, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler);
    @Mapping("newComputePipelineStateWithFunction:options:completionHandler:")
    public native void newComputePipelineState(MTLFunction computeFunction, @Representing("MTLPipelineOption") @MachineSizedUInt long options, @Block VoidBlock3<MTLComputePipelineState, MTLComputePipelineReflection, NSError> completionHandler);
    @Mapping("supportsFeatureSet:")
    public native boolean supportsFeatureSet(@Representing("MTLFeatureSet") @MachineSizedUInt long featureSet);
    
}
