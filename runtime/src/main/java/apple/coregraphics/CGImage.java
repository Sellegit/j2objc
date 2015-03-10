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
@Library("CoreGraphics")
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
    protected static native CGImage create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bitsPerPixel, @MachineSizedUInt long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, CGDataProvider provider, @Pointer long decode, boolean shouldInterpolate, CGColorRenderingIntent intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageMaskCreate")
    protected static native CGImage createMask(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bitsPerPixel, @MachineSizedUInt long bytesPerRow, CGDataProvider provider, @Pointer long decode, boolean shouldInterpolate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateCopy")
    public static native CGImage copy(CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithJPEGDataProvider")
    protected static native CGImage createWithJPEGDataProvider(CGDataProvider source, @Pointer long decode, boolean shouldInterpolate, CGColorRenderingIntent intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateWithPNGDataProvider")
    protected static native CGImage createWithPNGDataProvider(CGDataProvider source, @Pointer long decode, boolean shouldInterpolate, CGColorRenderingIntent intent);
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
    protected static native CGImage createWithMaskingColors(CGImage image, @Pointer long components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageCreateCopyWithColorSpace")
    public static native CGImage copy(CGImage image, CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageIsMask")
    public native boolean isMask();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetWidth")
    public native @MachineSizedUInt long getWidth();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetHeight")
    public native @MachineSizedUInt long getHeight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitsPerComponent")
    public native @MachineSizedUInt long getBitsPerComponent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitsPerPixel")
    public native @MachineSizedUInt long getBitsPerPixel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBytesPerRow")
    public native @MachineSizedUInt long getBytesPerRow();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetColorSpace")
    public native CGColorSpace getColorSpace();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetAlphaInfo")
    public native CGImageAlphaInfo getAlphaInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetDataProvider")
    public native CGDataProvider getDataProvider();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetDecode")
    public native Todo getDecode();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetShouldInterpolate")
    public native boolean getShouldInterpolate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetRenderingIntent")
    public native CGColorRenderingIntent getRenderingIntent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGImageGetBitmapInfo")
    public native CGBitmapInfo getBitmapInfo();
    
}
