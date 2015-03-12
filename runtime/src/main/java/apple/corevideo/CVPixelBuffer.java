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
import apple.metal.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreVideo")
public class CVPixelBuffer 
    extends CVImageBuffer 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateResolvedAttributesDictionary")
    protected static native CVReturn createResolvedAttributesDictionary(CFAllocator allocator, CFArray attributes, Todo resolvedDictionaryOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreate")
    protected static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateWithBytes")
    protected static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, Todo baseAddress, @MachineSizedUInt long bytesPerRow, FunctionPtr releaseCallback, Todo releaseRefCon, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferCreateWithPlanarBytes")
    protected static native CVReturn create(CFAllocator allocator, @MachineSizedUInt long width, @MachineSizedUInt long height, int pixelFormatType, Todo dataPtr, @MachineSizedUInt long dataSize, @MachineSizedUInt long numberOfPlanes, Todo planeBaseAddress, Todo planeWidth, Todo planeHeight, Todo planeBytesPerRow, FunctionPtr releaseCallback, Todo releaseRefCon, CFDictionary pixelBufferAttributes, Todo pixelBufferOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferLockBaseAddress")
    public native CVReturn lockBaseAddress(long lockFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferUnlockBaseAddress")
    public native CVReturn unlockBaseAddress(long unlockFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetWidth")
    public native @MachineSizedUInt long getWidth();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetHeight")
    public native @MachineSizedUInt long getHeight();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetPixelFormatType")
    public native CVPixelFormatType getPixelFormatType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBaseAddress")
    public native Todo getBaseAddress();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBytesPerRow")
    public native @MachineSizedUInt long getBytesPerRow();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetDataSize")
    public native @MachineSizedUInt long getDataSize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferIsPlanar")
    public native boolean isPlanar();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetPlaneCount")
    public native @MachineSizedUInt long getPlaneCount();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetWidthOfPlane")
    public native @MachineSizedUInt long getWidthOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetHeightOfPlane")
    public native @MachineSizedUInt long getHeightOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBaseAddressOfPlane")
    public native Todo getBaseAddressOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetBytesPerRowOfPlane")
    public native @MachineSizedUInt long getBytesPerRowOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferGetExtendedPixels")
    protected native void getExtendedPixels(Todo extraColumnsOnLeft, Todo extraColumnsOnRight, Todo extraRowsOnTop, Todo extraRowsOnBottom);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CVPixelBufferFillExtendedPixels")
    public native CVReturn fillExtendedPixels();
    
}
