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

@Library("Metal/Metal.h") @Mapping("MTLRenderPassColorAttachmentDescriptor")
public class MTLRenderPassColorAttachmentDescriptor 
    extends MTLRenderPassAttachmentDescriptor 
     {

    
    
    public MTLRenderPassColorAttachmentDescriptor() {}
    
    
    @Mapping("clearColor")
    public native MTLClearColor getClearColor();
    @Mapping("setClearColor:")
    public native void setClearColor(MTLClearColor v);
    
    
    
    
    
}
