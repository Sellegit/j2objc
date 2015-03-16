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

@Library("Metal/Metal.h") @Mapping("MTLStructMember")
public class MTLStructMember 
    extends NSObject 
     {

    
    
    public MTLStructMember() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("offset")
    public native @MachineSizedUInt long getOffset();
    @Mapping("dataType")
    public native @Representing("MTLDataType") @MachineSizedUInt long getDataType();
    
    
    
    @Mapping("structType")
    public native MTLStructType getStructType();
    @Mapping("arrayType")
    public native MTLArrayType getArrayType();
    
}
