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

@Library("Metal/Metal.h") @Mapping("MTLSamplerDescriptor")
public class MTLSamplerDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLSamplerDescriptor() {}
    
    
    @Mapping("minFilter")
    public native @Representing("MTLSamplerMinMagFilter") @MachineSizedUInt long getMinFilter();
    @Mapping("setMinFilter:")
    public native void setMinFilter(@Representing("MTLSamplerMinMagFilter") @MachineSizedUInt long v);
    @Mapping("magFilter")
    public native @Representing("MTLSamplerMinMagFilter") @MachineSizedUInt long getMagFilter();
    @Mapping("setMagFilter:")
    public native void setMagFilter(@Representing("MTLSamplerMinMagFilter") @MachineSizedUInt long v);
    @Mapping("mipFilter")
    public native @Representing("MTLSamplerMipFilter") @MachineSizedUInt long getMipFilter();
    @Mapping("setMipFilter:")
    public native void setMipFilter(@Representing("MTLSamplerMipFilter") @MachineSizedUInt long v);
    @Mapping("maxAnisotropy")
    public native @MachineSizedUInt long getMaxAnisotropy();
    @Mapping("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@MachineSizedUInt long v);
    @Mapping("sAddressMode")
    public native @Representing("MTLSamplerAddressMode") @MachineSizedUInt long getSAddressMode();
    @Mapping("setSAddressMode:")
    public native void setSAddressMode(@Representing("MTLSamplerAddressMode") @MachineSizedUInt long v);
    @Mapping("tAddressMode")
    public native @Representing("MTLSamplerAddressMode") @MachineSizedUInt long getTAddressMode();
    @Mapping("setTAddressMode:")
    public native void setTAddressMode(@Representing("MTLSamplerAddressMode") @MachineSizedUInt long v);
    @Mapping("rAddressMode")
    public native @Representing("MTLSamplerAddressMode") @MachineSizedUInt long getRAddressMode();
    @Mapping("setRAddressMode:")
    public native void setRAddressMode(@Representing("MTLSamplerAddressMode") @MachineSizedUInt long v);
    @Mapping("normalizedCoordinates")
    public native boolean normalizesCoordinates();
    @Mapping("setNormalizedCoordinates:")
    public native void setNormalizesCoordinates(boolean v);
    @Mapping("lodMinClamp")
    public native float getLodMinClamp();
    @Mapping("setLodMinClamp:")
    public native void setLodMinClamp(float v);
    @Mapping("lodMaxClamp")
    public native float getLodMaxClamp();
    @Mapping("setLodMaxClamp:")
    public native void setLodMaxClamp(float v);
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
