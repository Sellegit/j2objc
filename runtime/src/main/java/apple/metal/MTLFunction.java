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

@Library("Metal")
public final class MTLFunction 
    extends Object 
    implements NSObjectProtocol {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("functionType")
    public native @Representing("MTLFunctionType") @MachineSizedUInt long getFunctionType();
    @Mapping("vertexAttributes")
    public native NSArray<MTLVertexAttribute> getVertexAttributes();
    @Mapping("name")
    public native String getName();
    
    
    
    
    
}
