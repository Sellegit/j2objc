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
@Library("CoreMedia/CoreMedia.h")
public class CMBlockBuffer 
    extends CFType 
     {

    
    
    protected CMBlockBuffer() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateEmpty")
    private static native int create(CFAllocator structureAllocator, int subBlockCapacity, int flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateWithMemoryBlock")
    private static native int create(CFAllocator structureAllocator, Todo memoryBlock, @MachineSizedUInt long blockLength, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateWithBufferReference")
    private static native int create(CFAllocator structureAllocator, CMBlockBuffer targetBuffer, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCreateContiguous")
    private static native int create(CFAllocator structureAllocator, CMBlockBuffer sourceBuffer, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags, Todo newBBufOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAppendMemoryBlock")
    public static native int appendMemoryBlock(CMBlockBuffer theBuffer, Todo memoryBlock, @MachineSizedUInt long blockLength, CFAllocator blockAllocator, CMBlockBufferCustomBlockSource customBlockSource, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAppendBufferReference")
    public static native CMBlockBufferError appendBufferReference(CMBlockBuffer theBuffer, CMBlockBuffer targetBBuf, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, int flags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAssureBlockMemory")
    public static native CMBlockBufferError assureBlockMemory(CMBlockBuffer theBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferAccessDataBytes")
    private static native CMBlockBufferError accessDataBytes(CMBlockBuffer theBuffer, @MachineSizedUInt long offset, @MachineSizedUInt long length, Todo temporaryBlock, Todo returnedPointer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferCopyDataBytes")
    public static native CMBlockBufferError copyDataBytes(CMBlockBuffer theSourceBuffer, @MachineSizedUInt long offsetToData, @MachineSizedUInt long dataLength, Todo destination);
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
    public static native int getDataPointer(CMBlockBuffer theBuffer, @MachineSizedUInt long offset, Todo lengthAtOffset, Todo totalLength, Todo dataPointer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferGetDataLength")
    public static native @MachineSizedUInt long getDataLength(CMBlockBuffer theBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferIsRangeContiguous")
    public static native boolean isRangeContiguous(CMBlockBuffer theBuffer, @MachineSizedUInt long offset, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBlockBufferIsEmpty")
    public static native boolean isEmpty(CMBlockBuffer theBuffer);
    
}
