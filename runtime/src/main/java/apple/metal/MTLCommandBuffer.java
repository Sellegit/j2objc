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

@Library("Metal/Metal.h")
public final class MTLCommandBuffer 
    extends Object 
    implements NSObjectProtocol {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("commandQueue")
    public native MTLCommandQueue getCommandQueue();
    @Mapping("retainedReferences")
    public native boolean maintainsRetainedReferences();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("status")
    public native @Representing("MTLCommandBufferStatus") @MachineSizedUInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    
    
    
    @Mapping("enqueue")
    public native void enqueue();
    @Mapping("commit")
    public native void commit();
    @Mapping("presentDrawable:")
    public native void presentDrawable(MTLDrawable drawable);
    @Mapping("presentDrawable:atTime:")
    public native void presentDrawableAtTime(MTLDrawable drawable, double presentationTime);
    @Mapping("waitUntilScheduled")
    public native void waitUntilScheduled();
    @Mapping("waitUntilCompleted")
    public native void waitUntilCompleted();
    @Mapping("blitCommandEncoder")
    public native MTLBlitCommandEncoder newBlitCommandEncoder();
    @Mapping("renderCommandEncoderWithDescriptor:")
    public native MTLRenderCommandEncoder newRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    @Mapping("computeCommandEncoder")
    public native MTLComputeCommandEncoder newComputeCommandEncoder();
    @Mapping("parallelRenderCommandEncoderWithDescriptor:")
    public native MTLParallelRenderCommandEncoder newParallelRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    
}
