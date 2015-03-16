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

@Library("Metal/Metal.h") @Mapping("MTLRenderPipelineColorAttachmentDescriptorArray")
public class MTLRenderPipelineColorAttachmentDescriptorArray 
    extends NSObject 
     {

    
    
    public MTLRenderPipelineColorAttachmentDescriptorArray() {}
    
    
    
    
    
    
    @Mapping("objectAtIndexedSubscript:")
    public native MTLRenderPipelineColorAttachmentDescriptor get(@MachineSizedUInt long attachmentIndex);
    @Mapping("setObject:atIndexedSubscript:")
    public native void insert(MTLRenderPipelineColorAttachmentDescriptor attachment, @MachineSizedUInt long attachmentIndex);
    
}
