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

@Library("Metal") @Mapping("MTLRenderPassAttachmentDescriptor")
public class MTLRenderPassAttachmentDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLRenderPassAttachmentDescriptor() {}
    
    
    @Mapping("texture")
    public native MTLTexture getTexture();
    public native void setTexture(MTLTexture v);
    @Mapping("level")
    public native @MachineSizedUInt long getLevel();
    public native void setLevel(@MachineSizedUInt long v);
    @Mapping("slice")
    public native @MachineSizedUInt long getSlice();
    public native void setSlice(@MachineSizedUInt long v);
    @Mapping("depthPlane")
    public native @MachineSizedUInt long getDepthPlane();
    public native void setDepthPlane(@MachineSizedUInt long v);
    @Mapping("resolveTexture")
    public native MTLTexture getResolveTexture();
    public native void setResolveTexture(MTLTexture v);
    @Mapping("resolveLevel")
    public native @MachineSizedUInt long getResolveLevel();
    public native void setResolveLevel(@MachineSizedUInt long v);
    @Mapping("resolveSlice")
    public native @MachineSizedUInt long getResolveSlice();
    public native void setResolveSlice(@MachineSizedUInt long v);
    @Mapping("resolveDepthPlane")
    public native @MachineSizedUInt long getResolveDepthPlane();
    public native void setResolveDepthPlane(@MachineSizedUInt long v);
    @Mapping("loadAction")
    public native @Representing("MTLLoadAction") @MachineSizedUInt long getLoadAction();
    public native void setLoadAction(@Representing("MTLLoadAction") @MachineSizedUInt long v);
    @Mapping("storeAction")
    public native @Representing("MTLStoreAction") @MachineSizedUInt long getStoreAction();
    public native void setStoreAction(@Representing("MTLStoreAction") @MachineSizedUInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
