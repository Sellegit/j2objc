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

@Library("Metal/Metal.h") @Mapping("MTLArgument")
public class MTLArgument 
    extends NSObject 
     {

    
    
    public MTLArgument() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("type")
    public native @Representing("MTLArgumentType") @MachineSizedUInt long getType();
    @Mapping("access")
    public native @Representing("MTLArgumentAccess") @MachineSizedUInt long getAccess();
    @Mapping("index")
    public native @MachineSizedUInt long getIndex();
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("bufferAlignment")
    public native @MachineSizedUInt long getBufferAlignment();
    @Mapping("bufferDataSize")
    public native @MachineSizedUInt long getBufferDataSize();
    @Mapping("bufferDataType")
    public native @Representing("MTLDataType") @MachineSizedUInt long getBufferDataType();
    @Mapping("bufferStructType")
    public native MTLStructType getBufferStructType();
    @Mapping("threadgroupMemoryAlignment")
    public native @MachineSizedUInt long getThreadgroupMemoryAlignment();
    @Mapping("threadgroupMemoryDataSize")
    public native @MachineSizedUInt long getThreadgroupMemoryDataSize();
    @Mapping("textureType")
    public native @Representing("MTLTextureType") @MachineSizedUInt long getTextureType();
    @Mapping("textureDataType")
    public native @Representing("MTLDataType") @MachineSizedUInt long getTextureDataType();
    
    
    
    
    
}
