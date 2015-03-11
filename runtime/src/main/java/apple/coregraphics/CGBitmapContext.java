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
public class CGBitmapContext 
    extends CGContext 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreateWithData")
    public static native CGBitmapContext create(Todo data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo, FunctionPtr releaseCallback, Todo releaseInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreate")
    public static native CGBitmapContext create(Todo data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bytesPerRow, CGColorSpace space, CGBitmapInfo bitmapInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetData")
    public native Todo getData();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetWidth")
    public native @MachineSizedUInt long getWidth();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetHeight")
    public native @MachineSizedUInt long getHeight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitsPerComponent")
    public native @MachineSizedUInt long getBitsPerComponent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitsPerPixel")
    public native @MachineSizedUInt long getBitsPerPixel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBytesPerRow")
    public native @MachineSizedUInt long getBytesPerRow();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetColorSpace")
    public native CGColorSpace getColorSpace();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetAlphaInfo")
    public native CGImageAlphaInfo getAlphaInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextGetBitmapInfo")
    public native CGBitmapInfo getBitmapInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGBitmapContextCreateImage")
    public native CGImage toImage();
    
}
