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
@Library("CoreGraphics/CoreGraphics.h")
public class CGBitmapContext 
    extends CGContext 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreateWithData")
    public static native CGBitmapContext create(Todo data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, @Representing("CGBitmapInfo") long bitmapInfo, FunctionPtr releaseCallback, Todo releaseInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreate")
    public static native CGBitmapContext create(Todo data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, @Representing("CGBitmapInfo") long bitmapInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetData")
    public static native Todo getData(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetWidth")
    public static native @MachineSizedUInt long getWidth(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetHeight")
    public static native @MachineSizedUInt long getHeight(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitsPerComponent")
    public static native @MachineSizedUInt long getBitsPerComponent(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitsPerPixel")
    public static native @MachineSizedUInt long getBitsPerPixel(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBytesPerRow")
    public static native @MachineSizedUInt long getBytesPerRow(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetColorSpace")
    public static native CGColorSpace getColorSpace(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetAlphaInfo")
    public static native CGImageAlphaInfo getAlphaInfo(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitmapInfo")
    public static native CGBitmapInfo getBitmapInfo(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreateImage")
    public static native CGImage toImage(CGContext context);
    
}
