package apple.coregraphics;


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
import apple.uikit.*;

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CGImageRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGImage 
    extends CFType 
     {

    
    
    protected CGImage() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreate")
    public static native CGImage create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bitsPerPixel, @MachineSizedUInt long bytesPerRow, CGColorSpace space, @Representing("CGBitmapInfo") long bitmapInfo, CGDataProvider provider, Todo decode, boolean shouldInterpolate, @Representing("CGColorRenderingIntent") long intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageMaskCreate")
    public static native CGImage createMask(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bitsPerPixel, @MachineSizedUInt long bytesPerRow, CGDataProvider provider, Todo decode, boolean shouldInterpolate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateCopy")
    public static native CGImage copy(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithJPEGDataProvider")
    public static native CGImage createWithJPEGDataProvider(CGDataProvider source, Todo decode, boolean shouldInterpolate, @Representing("CGColorRenderingIntent") long intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithPNGDataProvider")
    public static native CGImage createWithPNGDataProvider(CGDataProvider source, Todo decode, boolean shouldInterpolate, @Representing("CGColorRenderingIntent") long intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithImageInRect")
    public static native CGImage createWithImageInRect(CGImage image, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithMask")
    public static native CGImage createWithMask(CGImage image, CGImage mask);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithMaskingColors")
    public static native CGImage createWithMaskingColors(CGImage image, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateCopyWithColorSpace")
    public static native CGImage copy(CGImage image, CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageIsMask")
    public static native boolean isMask(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetWidth")
    public static native @MachineSizedUInt long getWidth(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetHeight")
    public static native @MachineSizedUInt long getHeight(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitsPerComponent")
    public static native @MachineSizedUInt long getBitsPerComponent(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitsPerPixel")
    public static native @MachineSizedUInt long getBitsPerPixel(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBytesPerRow")
    public static native @MachineSizedUInt long getBytesPerRow(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetColorSpace")
    public static native CGColorSpace getColorSpace(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetAlphaInfo")
    public static native CGImageAlphaInfo getAlphaInfo(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetDataProvider")
    public static native CGDataProvider getDataProvider(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetDecode")
    public static native Todo getDecode(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetShouldInterpolate")
    public static native boolean getShouldInterpolate(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetRenderingIntent")
    public static native CGColorRenderingIntent getRenderingIntent(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitmapInfo")
    public static native CGBitmapInfo getBitmapInfo(CGImage image);

}
