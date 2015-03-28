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
@Library("CoreVideo/CoreVideo.h")
public class CVPixelBufferAttributes 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPixelFormatTypeKey")
    public static native CFString PixelFormatTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferMemoryAllocatorKey")
    public static native CFString MemoryAllocatorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferWidthKey")
    public static native CFString WidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferHeightKey")
    public static native CFString HeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsLeftKey")
    public static native CFString ExtendedPixelsLeftKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsTopKey")
    public static native CFString ExtendedPixelsTopKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsRightKey")
    public static native CFString ExtendedPixelsRightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferExtendedPixelsBottomKey")
    public static native CFString ExtendedPixelsBottomKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferBytesPerRowAlignmentKey")
    public static native CFString BytesPerRowAlignmentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferCGBitmapContextCompatibilityKey")
    public static native CFString CGBitmapContextCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferCGImageCompatibilityKey")
    public static native CFString CGImageCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferOpenGLCompatibilityKey")
    public static native CFString OpenGLCompatibilityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferPlaneAlignmentKey")
    public static native CFString PlaneAlignmentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCVPixelBufferIOSurfacePropertiesKey")
    public static native CFString IOSurfacePropertiesKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCVPixelBufferOpenGLESCompatibilityKey")
    public static native CFString OpenGLESCompatibilityKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCVPixelBufferMetalCompatibilityKey")
    public static native CFString MetalCompatibilityKey();

}
