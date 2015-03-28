package apple.coreimage;


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
import apple.corevideo.*;
import apple.imageio.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreImage/CoreImage.h")
public class CIFormat 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCIFormatARGB8")
    public static native int ARGB8Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIFormatBGRA8")
    public static native int BGRA8Value();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCIFormatRGBA8")
    public static native int RGBA8Value();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCIFormatRGBAf")
    public static native int RGBAfValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCIFormatRGBAh")
    public static native int RGBAhValue();

}
