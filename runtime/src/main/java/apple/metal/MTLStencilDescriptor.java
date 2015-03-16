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

@Library("Metal/Metal.h") @Mapping("MTLStencilDescriptor")
public class MTLStencilDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLStencilDescriptor() {}
    
    
    @Mapping("stencilCompareFunction")
    public native @Representing("MTLCompareFunction") @MachineSizedUInt long getStencilCompareFunction();
    @Mapping("setStencilCompareFunction:")
    public native void setStencilCompareFunction(@Representing("MTLCompareFunction") @MachineSizedUInt long v);
    @Mapping("stencilFailureOperation")
    public native @Representing("MTLStencilOperation") @MachineSizedUInt long getStencilFailureOperation();
    @Mapping("setStencilFailureOperation:")
    public native void setStencilFailureOperation(@Representing("MTLStencilOperation") @MachineSizedUInt long v);
    @Mapping("depthFailureOperation")
    public native @Representing("MTLStencilOperation") @MachineSizedUInt long getDepthFailureOperation();
    @Mapping("setDepthFailureOperation:")
    public native void setDepthFailureOperation(@Representing("MTLStencilOperation") @MachineSizedUInt long v);
    @Mapping("depthStencilPassOperation")
    public native @Representing("MTLStencilOperation") @MachineSizedUInt long getDepthStencilPassOperation();
    @Mapping("setDepthStencilPassOperation:")
    public native void setDepthStencilPassOperation(@Representing("MTLStencilOperation") @MachineSizedUInt long v);
    @Mapping("readMask")
    public native int getReadMask();
    @Mapping("setReadMask:")
    public native void setReadMask(int v);
    @Mapping("writeMask")
    public native int getWriteMask();
    @Mapping("setWriteMask:")
    public native void setWriteMask(int v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
