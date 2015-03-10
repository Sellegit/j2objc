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

@Library("Metal") @Mapping("MTLVertexBufferLayoutDescriptorArray")
public class MTLVertexBufferLayoutDescriptorArray 
    extends NSObject 
     {

    
    
    public MTLVertexBufferLayoutDescriptorArray() {}
    
    
    
    
    
    
    @Mapping("objectAtIndexedSubscript:")
    public native MTLVertexBufferLayoutDescriptor get(@MachineSizedUInt long index);
    @Mapping("setObject:atIndexedSubscript:")
    public native void insert(MTLVertexBufferLayoutDescriptor bufferDesc, @MachineSizedUInt long index);
    
}
