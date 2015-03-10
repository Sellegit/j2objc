package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia")
public class CMBlockBuffer 
    extends CFType 
     {

    
    
    protected CMBlockBuffer() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateEmpty")
    private static native int create(CFAllocator structureAllocator, int subBlockCapacity, CMBlockBufferFlag flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateWithMemoryBlock")
    private static native int create(CFAllocator structureAllocator, Todo memoryBlock, @MachineSizedUInt long blockLength, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, CMBlockBufferFlag flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateWithBufferReference")
    private static native int create(CFAllocator structureAllocator, CMBlockBuffer targetBuffer, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, CMBlockBufferFlag flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateContiguous")
    private static native int create(CFAllocator structureAllocator, CMBlockBuffer sourceBuffer, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, CMBlockBufferFlag flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAppendMemoryBlock")
    public native int appendMemoryBlock(Todo memoryBlock, @MachineSizedUInt long blockLength, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, CMBlockBufferFlag flags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAppendBufferReference")
    public native CMBlockBufferError appendBufferReference(CMBlockBuffer targetBBuf, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAssureBlockMemory")
    public native CMBlockBufferError assureBlockMemory();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAccessDataBytes")
    private static native CMBlockBufferError accessDataBytes(CMBlockBuffer theBuffer, @MachineSizedUInt long offset, @MachineSizedUInt long length, Todo temporaryBlock, Todo returnedPointer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCopyDataBytes")
    public native CMBlockBufferError copyDataBytes(@MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, Todo destination);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferReplaceDataBytes")
    private static native CMBlockBufferError replaceDataBytes(Todo sourceBytes, CMBlockBuffer destinationBuffer, @MachineSizedUInt long offsetIntoDestination, @MachineSizedUInt long dataLength);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferFillDataBytes")
    private static native CMBlockBufferError fillDataBytes(byte fillByte, CMBlockBuffer destinationBuffer, @MachineSizedUInt long offsetIntoDestination, @MachineSizedUInt long dataLength);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferGetDataPointer")
    public native int getDataPointer(@MachineSizedUInt long offset, Todo lengthAtOffset, Todo totalLength, Todo dataPointer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferGetDataLength")
    public native @MachineSizedUInt long getDataLength();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferIsRangeContiguous")
    public native boolean isRangeContiguous(@MachineSizedUInt long offset, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferIsEmpty")
    public native boolean isEmpty();
    
}
