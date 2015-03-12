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
public final class MTLTexture 
    extends Object 
    implements MTLResource {

    
    
    
    
    
    @Mapping("rootResource")
    public native MTLResource getRootResource();
    @Mapping("textureType")
    public native @Representing("MTLTextureType") @MachineSizedUInt long getTextureType();
    @Mapping("pixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getPixelFormat();
    @Mapping("width")
    public native @MachineSizedUInt long getWidth();
    @Mapping("height")
    public native @MachineSizedUInt long getHeight();
    @Mapping("depth")
    public native @MachineSizedUInt long getDepth();
    @Mapping("mipmapLevelCount")
    public native @MachineSizedUInt long getMipmapLevelCount();
    @Mapping("sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Mapping("arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    @Mapping("isFramebufferOnly")
    public native boolean isFramebufferOnly();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("cpuCacheMode")
    public native @Representing("MTLCPUCacheMode") @MachineSizedUInt long getCpuCacheMode();
    
    
    
    @Mapping("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    protected native void getBytes(Todo pixelBytes, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage, MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice);
    @Mapping("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    protected native void replaceRegion(MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice, Todo pixelBytes, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage);
    @Mapping("getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    protected native void getBytes(Todo pixelBytes, @MachineSizedUInt long bytesPerRow, MTLRegion region, @MachineSizedUInt long level);
    @Mapping("replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    protected native void replaceRegion(MTLRegion region, @MachineSizedUInt long level, Todo pixelBytes, @MachineSizedUInt long bytesPerRow);
    @Mapping("newTextureViewWithPixelFormat:")
    public native MTLTexture newTextureView(@Representing("MTLPixelFormat") @MachineSizedUInt long pixelFormat);
    @Mapping("setPurgeableState:")
    public native @Representing("MTLPurgeableState") @MachineSizedUInt long setPurgeableState(@Representing("MTLPurgeableState") @MachineSizedUInt long state);
    
}
