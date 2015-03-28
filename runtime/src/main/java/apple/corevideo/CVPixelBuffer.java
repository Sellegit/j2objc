package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CVPixelBufferRef") @Library("CoreVideo/CoreVideo.h")
public class CVPixelBuffer 
    extends CVImageBuffer 
     {

    
    
    protected CVPixelBuffer() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateResolvedAttributesDictionary")
    public static native CVReturn createResolvedAttributesDictionary(CFAllocator allocator, CFArray attributes, Todo resolvedDictionaryOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreate")
    public static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateWithBytes")
    public static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, Todo baseAddress, @MachineSizedUInt long bytesPerRow, FunctionPtr releaseCallback, Todo releaseRefCon, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateWithPlanarBytes")
    public static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, Todo dataPtr, @MachineSizedUInt long dataSize, @MachineSizedUInt long numberOfPlanes, Todo planeBaseAddress, Todo planeWidth, Todo planeHeight, Todo planeBytesPerRow, FunctionPtr releaseCallback, Todo releaseRefCon, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferLockBaseAddress")
    public static native CVReturn lockBaseAddress(CVPixelBuffer pixelBuffer, long lockFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferUnlockBaseAddress")
    public static native CVReturn unlockBaseAddress(CVPixelBuffer pixelBuffer, long unlockFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetWidth")
    public static native @MachineSizedUInt long getWidth(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetHeight")
    public static native @MachineSizedUInt long getHeight(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetPixelFormatType")
    public static native CVPixelFormatType getPixelFormatType(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBaseAddress")
    public static native Todo getBaseAddress(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBytesPerRow")
    public static native @MachineSizedUInt long getBytesPerRow(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetDataSize")
    public static native @MachineSizedUInt long getDataSize(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferIsPlanar")
    public static native boolean isPlanar(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetPlaneCount")
    public static native @MachineSizedUInt long getPlaneCount(CVPixelBuffer pixelBuffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetWidthOfPlane")
    public static native @MachineSizedUInt long getWidthOfPlane(CVPixelBuffer pixelBuffer, @MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetHeightOfPlane")
    public static native @MachineSizedUInt long getHeightOfPlane(CVPixelBuffer pixelBuffer, @MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBaseAddressOfPlane")
    public static native Todo getBaseAddressOfPlane(CVPixelBuffer pixelBuffer, @MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBytesPerRowOfPlane")
    public static native @MachineSizedUInt long getBytesPerRowOfPlane(CVPixelBuffer pixelBuffer, @MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetExtendedPixels")
    public static native void getExtendedPixels(CVPixelBuffer pixelBuffer, Todo extraColumnsOnLeft, Todo extraColumnsOnRight, Todo extraRowsOnTop, Todo extraRowsOnBottom);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferFillExtendedPixels")
    public static native CVReturn fillExtendedPixels(CVPixelBuffer pixelBuffer);

}
