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

@Library("Metal/Metal.h")
public final class MTLBlitCommandEncoder 
    extends Object 
    implements MTLCommandEncoder {

    
    
    
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    public native void copyFromTextureToTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, MTLOrigin sourceOrigin, MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, MTLOrigin destinationOrigin);
    @Mapping("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    public native void copyFromBufferToTexture(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, MTLOrigin destinationOrigin);
    @Mapping("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    public native void copyFromTextureToBuffer(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, MTLOrigin sourceOrigin, MTLSize sourceSize, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long destinationBytesPerRow, @MachineSizedUInt long destinationBytesPerImage);
    @Mapping("generateMipmapsForTexture:")
    public native void generateMipmapsForTexture(MTLTexture texture);
    @Mapping("fillBuffer:range:value:")
    public native void fillBuffer(MTLBuffer buffer, NSRange range, byte value);
    @Mapping("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    public native void copyFromBufferToBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long size);
    @Mapping("endEncoding")
    public native void endEncoding();
    @Mapping("insertDebugSignpost:")
    public native void insertDebugSignpost(String string);
    @Mapping("pushDebugGroup:")
    public native void pushDebugGroup(String string);
    @Mapping("popDebugGroup")
    public native void popDebugGroup();
    
}
