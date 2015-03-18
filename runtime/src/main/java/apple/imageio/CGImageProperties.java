package apple.imageio;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO/ImageIO.h")
public class CGImageProperties 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFDictionary")
    public static native CFString TIFFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGIFDictionary")
    public static native CFString GIFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyJFIFDictionary")
    public static native CFString JFIFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDictionary")
    public static native CFString ExifDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGDictionary")
    public static native CFString PNGDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCDictionary")
    public static native CFString IPTCDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDictionary")
    public static native CFString GPSDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyRawDictionary")
    public static native CFString RawDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFDictionary")
    public static native CFString CIFFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerCanonDictionary")
    public static native CFString MakerCanonDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerNikonDictionary")
    public static native CFString MakerNikonDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerMinoltaDictionary")
    public static native CFString MakerMinoltaDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerFujiDictionary")
    public static native CFString MakerFujiDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerOlympusDictionary")
    public static native CFString MakerOlympusDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerPentaxDictionary")
    public static native CFString MakerPentaxDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageProperty8BIMDictionary")
    public static native CFString _8BIMDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDNGDictionary")
    public static native CFString DNGDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifAuxDictionary")
    public static native CFString ExifAuxDictionaryKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerAppleDictionary")
    public static native CFString MakerAppleDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyFileSize")
    public static native CFString FileSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPixelHeight")
    public static native CFString PixelHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPixelWidth")
    public static native CFString PixelWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDPIHeight")
    public static native CFString DPIHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDPIWidth")
    public static native CFString DPIWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDepth")
    public static native CFString DepthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyOrientation")
    public static native CFString OrientationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIsFloat")
    public static native CFString IsFloatKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIsIndexed")
    public static native CFString IsIndexedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyHasAlpha")
    public static native CFString HasAlphaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyColorModel")
    public static native CFString ColorModelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyProfileName")
    public static native CFString ProfileNameKey();
    
}
