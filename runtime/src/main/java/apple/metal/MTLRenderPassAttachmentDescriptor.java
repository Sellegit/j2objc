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

@Library("Metal/Metal.h") @Mapping("MTLRenderPassAttachmentDescriptor")
public class MTLRenderPassAttachmentDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPassAttachmentDescriptor() {}
    
    
    @Mapping("texture")
    public native MTLTexture getTexture();
    @Mapping("setTexture:")
    public native void setTexture(MTLTexture v);
    @Mapping("level")
    public native @MachineSizedUInt long getLevel();
    @Mapping("setLevel:")
    public native void setLevel(@MachineSizedUInt long v);
    @Mapping("slice")
    public native @MachineSizedUInt long getSlice();
    @Mapping("setSlice:")
    public native void setSlice(@MachineSizedUInt long v);
    @Mapping("depthPlane")
    public native @MachineSizedUInt long getDepthPlane();
    @Mapping("setDepthPlane:")
    public native void setDepthPlane(@MachineSizedUInt long v);
    @Mapping("resolveTexture")
    public native MTLTexture getResolveTexture();
    @Mapping("setResolveTexture:")
    public native void setResolveTexture(MTLTexture v);
    @Mapping("resolveLevel")
    public native @MachineSizedUInt long getResolveLevel();
    @Mapping("setResolveLevel:")
    public native void setResolveLevel(@MachineSizedUInt long v);
    @Mapping("resolveSlice")
    public native @MachineSizedUInt long getResolveSlice();
    @Mapping("setResolveSlice:")
    public native void setResolveSlice(@MachineSizedUInt long v);
    @Mapping("resolveDepthPlane")
    public native @MachineSizedUInt long getResolveDepthPlane();
    @Mapping("setResolveDepthPlane:")
    public native void setResolveDepthPlane(@MachineSizedUInt long v);
    @Mapping("loadAction")
    public native @Representing("MTLLoadAction") @MachineSizedUInt long getLoadAction();
    @Mapping("setLoadAction:")
    public native void setLoadAction(@Representing("MTLLoadAction") @MachineSizedUInt long v);
    @Mapping("storeAction")
    public native @Representing("MTLStoreAction") @MachineSizedUInt long getStoreAction();
    @Mapping("setStoreAction:")
    public native void setStoreAction(@Representing("MTLStoreAction") @MachineSizedUInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
