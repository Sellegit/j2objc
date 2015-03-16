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

@Library("Metal/Metal.h") @Mapping("MTLTextureDescriptor")
public class MTLTextureDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLTextureDescriptor() {}
    
    
    @Mapping("textureType")
    public native @Representing("MTLTextureType") @MachineSizedUInt long getTextureType();
    @Mapping("setTextureType:")
    public native void setTextureType(@Representing("MTLTextureType") @MachineSizedUInt long v);
    @Mapping("pixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getPixelFormat();
    @Mapping("setPixelFormat:")
    public native void setPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    @Mapping("width")
    public native @MachineSizedUInt long getWidth();
    @Mapping("setWidth:")
    public native void setWidth(@MachineSizedUInt long v);
    @Mapping("height")
    public native @MachineSizedUInt long getHeight();
    @Mapping("setHeight:")
    public native void setHeight(@MachineSizedUInt long v);
    @Mapping("depth")
    public native @MachineSizedUInt long getDepth();
    @Mapping("setDepth:")
    public native void setDepth(@MachineSizedUInt long v);
    @Mapping("mipmapLevelCount")
    public native @MachineSizedUInt long getMipmapLevelCount();
    @Mapping("setMipmapLevelCount:")
    public native void setMipmapLevelCount(@MachineSizedUInt long v);
    @Mapping("sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Mapping("setSampleCount:")
    public native void setSampleCount(@MachineSizedUInt long v);
    @Mapping("arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    @Mapping("setArrayLength:")
    public native void setArrayLength(@MachineSizedUInt long v);
    @Mapping("resourceOptions")
    public native @Representing("MTLResourceOptions") @MachineSizedUInt long getResourceOptions();
    @Mapping("setResourceOptions:")
    public native void setResourceOptions(@Representing("MTLResourceOptions") @MachineSizedUInt long v);
    
    
    
    @Mapping("texture2DDescriptorWithPixelFormat:width:height:mipmapped:")
    public static native MTLTextureDescriptor create2DDescriptor(@Representing("MTLPixelFormat") @MachineSizedUInt long pixelFormat, @MachineSizedUInt long width, @MachineSizedUInt long height, boolean mipmapped);
    @Mapping("textureCubeDescriptorWithPixelFormat:size:mipmapped:")
    public static native MTLTextureDescriptor createCubeDescriptor(@Representing("MTLPixelFormat") @MachineSizedUInt long pixelFormat, @MachineSizedUInt long size, boolean mipmapped);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
