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
public final class MTLParallelRenderCommandEncoder 
    extends Object 
    implements MTLCommandEncoder {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("renderCommandEncoder")
    public native MTLRenderCommandEncoder newRenderCommandEncoder();
    @Mapping("endEncoding")
    public native void endEncoding();
    @Mapping("insertDebugSignpost:")
    public native void insertDebugSignpost(String string);
    @Mapping("pushDebugGroup:")
    public native void pushDebugGroup(String string);
    @Mapping("popDebugGroup")
    public native void popDebugGroup();
    
}
