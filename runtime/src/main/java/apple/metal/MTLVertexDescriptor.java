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

@Library("Metal/Metal.h") @Mapping("MTLVertexDescriptor")
public class MTLVertexDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLVertexDescriptor() {}
    
    
    @Mapping("layouts")
    public native MTLVertexBufferLayoutDescriptorArray getLayouts();
    @Mapping("attributes")
    public native MTLVertexAttributeDescriptorArray getAttributes();
    
    
    
    @Mapping("reset")
    public native void reset();
    @Mapping("vertexDescriptor")
    public static native MTLVertexDescriptor create();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
