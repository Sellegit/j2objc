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

@Library("Metal/Metal.h") @Mapping("MTLRenderPassStencilAttachmentDescriptor")
public class MTLRenderPassStencilAttachmentDescriptor 
    extends MTLRenderPassAttachmentDescriptor 
     {

    
    
    public MTLRenderPassStencilAttachmentDescriptor() {}
    
    
    @Mapping("clearStencil")
    public native int getClearStencil();
    @Mapping("setClearStencil:")
    public native void setClearStencil(int v);
    
    
    
    
    
}
