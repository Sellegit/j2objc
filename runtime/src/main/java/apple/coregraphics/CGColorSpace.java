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
public class CGColorSpace 
    extends CFType 
     {

    
    
    protected CGColorSpace() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateDeviceGray")
    public static native CGColorSpace createDeviceGray();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateDeviceRGB")
    public static native CGColorSpace createDeviceRGB();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateDeviceCMYK")
    public static native CGColorSpace createDeviceCMYK();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateCalibratedGray")
    protected static native CGColorSpace createCalibratedGray(@Pointer long whitePoint, @Pointer long blackPoint, @MachineSizedFloat double gamma);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateCalibratedRGB")
    protected static native CGColorSpace createCalibratedRGB(@Pointer long whitePoint, @Pointer long blackPoint, @Pointer long gamma, @Pointer long matrix);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateLab")
    protected static native CGColorSpace createLab(@Pointer long whitePoint, @Pointer long blackPoint, @Pointer long range);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateWithICCProfile")
    public static native CGColorSpace createWithICCProfile(NSData data);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateICCBased")
    protected static native CGColorSpace createICCBased(@MachineSizedUInt long nComponents, @Pointer long range, CGDataProvider profile, CGColorSpace alternate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateIndexed")
    protected static native CGColorSpace createIndexed(CGColorSpace baseSpace, @MachineSizedUInt long lastIndex, @Pointer long colorTable);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreatePattern")
    public static native CGColorSpace createPattern(CGColorSpace baseSpace);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateWithName")
    public static native CGColorSpace createWithName(String name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetNumberOfComponents")
    public native @MachineSizedUInt long getNumberOfComponents();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetModel")
    public native CGColorSpaceModel getModel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetBaseColorSpace")
    public native CGColorSpace getBaseColorSpace();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetColorTableCount")
    public native @MachineSizedUInt long getColorTableCount();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetColorTable")
    protected native void getColorTable(@Pointer long table);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CGColorSpaceCopyICCProfile")
    public native NSData copyICCProfile();
    
}
