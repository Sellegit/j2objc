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

@Library("Metal") @Mapping("MTLDepthStencilDescriptor")
public class MTLDepthStencilDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLDepthStencilDescriptor() {}
    
    
    @Mapping("depthCompareFunction")
    public native @Representing("MTLCompareFunction") @MachineSizedUInt long getDepthCompareFunction();
    @Mapping("setDepthCompareFunction:")
    public native void setDepthCompareFunction(@Representing("MTLCompareFunction") @MachineSizedUInt long v);
    @Mapping("isDepthWriteEnabled")
    public native boolean isDepthWriteEnabled();
    @Mapping("setDepthWriteEnabled:")
    public native void setDepthWriteEnabled(boolean v);
    @Mapping("frontFaceStencil")
    public native MTLStencilDescriptor getFrontFaceStencil();
    @Mapping("setFrontFaceStencil:")
    public native void setFrontFaceStencil(MTLStencilDescriptor v);
    @Mapping("backFaceStencil")
    public native MTLStencilDescriptor getBackFaceStencil();
    @Mapping("setBackFaceStencil:")
    public native void setBackFaceStencil(MTLStencilDescriptor v);
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
