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
public final class MTLBuffer 
    extends Object 
    implements MTLResource {

    
    
    
    
    
    @Mapping("length")
    public native @MachineSizedUInt long getLength();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("cpuCacheMode")
    public native @Representing("MTLCPUCacheMode") @MachineSizedUInt long getCpuCacheMode();
    
    
    
    @Mapping("newTextureWithDescriptor:offset:bytesPerRow:")
    public native MTLTexture newTexture(MTLTextureDescriptor descriptor, @MachineSizedUInt long offset, @MachineSizedUInt long bytesPerRow);
    @Mapping("setPurgeableState:")
    public native @Representing("MTLPurgeableState") @MachineSizedUInt long setPurgeableState(@Representing("MTLPurgeableState") @MachineSizedUInt long state);
    
}
