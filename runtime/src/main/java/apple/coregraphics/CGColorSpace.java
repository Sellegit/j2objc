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
    protected static native CGColorSpace createCalibratedGray(Todo whitePoint, Todo blackPoint, @MachineSizedFloat double gamma);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateCalibratedRGB")
    protected static native CGColorSpace createCalibratedRGB(Todo whitePoint, Todo blackPoint, Todo gamma, Todo matrix);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateLab")
    protected static native CGColorSpace createLab(Todo whitePoint, Todo blackPoint, Todo range);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateWithICCProfile")
    public static native CGColorSpace createWithICCProfile(NSData data);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateICCBased")
    protected static native CGColorSpace createICCBased(@MachineSizedUInt long nComponents, Todo range, CGDataProvider profile, CGColorSpace alternate);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceCreateIndexed")
    protected static native CGColorSpace createIndexed(CGColorSpace baseSpace, @MachineSizedUInt long lastIndex, Todo colorTable);
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
    public static native @MachineSizedUInt long getNumberOfComponents(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetModel")
    public static native CGColorSpaceModel getModel(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetBaseColorSpace")
    public static native CGColorSpace getBaseColorSpace(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetColorTableCount")
    public static native @MachineSizedUInt long getColorTableCount(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorSpaceGetColorTable")
    protected static native void getColorTable(CGColorSpace space, Todo table);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CGColorSpaceCopyICCProfile")
    public static native NSData copyICCProfile(CGColorSpace space);
    
}
