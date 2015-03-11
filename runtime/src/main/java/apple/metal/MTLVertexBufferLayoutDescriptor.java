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

@Library("Metal") @Mapping("MTLVertexBufferLayoutDescriptor")
public class MTLVertexBufferLayoutDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLVertexBufferLayoutDescriptor() {}
    
    
    @Mapping("stride")
    public native @MachineSizedUInt long getStride();
    @Mapping("setStride:")
    public native void setStride(@MachineSizedUInt long v);
    @Mapping("stepFunction")
    public native @Representing("MTLVertexStepFunction") @MachineSizedUInt long getStepFunction();
    @Mapping("setStepFunction:")
    public native void setStepFunction(@Representing("MTLVertexStepFunction") @MachineSizedUInt long v);
    @Mapping("stepRate")
    public native @MachineSizedUInt long getStepRate();
    @Mapping("setStepRate:")
    public native void setStepRate(@MachineSizedUInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
