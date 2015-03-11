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
public final class MTLLibrary 
    extends Object 
    implements NSObjectProtocol {

    
    
    
    
    
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("functionNames")
    public native List<String> getFunctionNames();
    
    
    
    @Mapping("newFunctionWithName:")
    public native MTLFunction newFunction(String functionName);
    
}
