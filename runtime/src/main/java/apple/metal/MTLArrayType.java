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

@Library("Metal/Metal.h") @Mapping("MTLArrayType")
public class MTLArrayType 
    extends NSObject 
     {

    
    
    public MTLArrayType() {}
    
    
    @Mapping("arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    @Mapping("elementType")
    public native @Representing("MTLDataType") @MachineSizedUInt long getElementType();
    @Mapping("stride")
    public native @MachineSizedUInt long getStride();
    
    
    
    @Mapping("elementStructType")
    public native MTLStructType getElementStructType();
    @Mapping("elementArrayType")
    public native MTLArrayType getElementArrayType();
    
}
