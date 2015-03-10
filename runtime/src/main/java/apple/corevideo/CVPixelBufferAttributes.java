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
public class CVPixelBufferAttributes 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPixelFormatTypeKey")
    protected static native CFString PixelFormatTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferMemoryAllocatorKey")
    protected static native CFString MemoryAllocatorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferWidthKey")
    protected static native CFString WidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferHeightKey")
    protected static native CFString HeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsLeftKey")
    protected static native CFString ExtendedPixelsLeftKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsTopKey")
    protected static native CFString ExtendedPixelsTopKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsRightKey")
    protected static native CFString ExtendedPixelsRightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsBottomKey")
    protected static native CFString ExtendedPixelsBottomKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferBytesPerRowAlignmentKey")
    protected static native CFString BytesPerRowAlignmentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferCGBitmapContextCompatibilityKey")
    protected static native CFString CGBitmapContextCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferCGImageCompatibilityKey")
    protected static native CFString CGImageCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferOpenGLCompatibilityKey")
    protected static native CFString OpenGLCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPlaneAlignmentKey")
    protected static native CFString PlaneAlignmentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferIOSurfacePropertiesKey")
    protected static native CFString IOSurfacePropertiesKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCVPixelBufferOpenGLESCompatibilityKey")
    protected static native CFString OpenGLESCompatibilityKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVPixelBufferMetalCompatibilityKey")
    protected static native CFString MetalCompatibilityKey();
    
}
