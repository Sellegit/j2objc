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

@Library("Metal") @Mapping("MTLVertexAttributeDescriptor")
public class MTLVertexAttributeDescriptor 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLVertexAttributeDescriptor() {}
    
    
    @Mapping("format")
    public native @Representing("MTLVertexFormat") @MachineSizedUInt long getFormat();
    public native void setFormat(@Representing("MTLVertexFormat") @MachineSizedUInt long v);
    @Mapping("offset")
    public native @MachineSizedUInt long getOffset();
    public native void setOffset(@MachineSizedUInt long v);
    @Mapping("bufferIndex")
    public native @MachineSizedUInt long getBufferIndex();
    public native void setBufferIndex(@MachineSizedUInt long v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
