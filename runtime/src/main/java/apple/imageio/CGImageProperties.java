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
@Library("ImageIO")
public class CGImageProperties 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFDictionary")
    protected static native CFString TIFFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGIFDictionary")
    protected static native CFString GIFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyJFIFDictionary")
    protected static native CFString JFIFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifDictionary")
    protected static native CFString ExifDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGDictionary")
    protected static native CFString PNGDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCDictionary")
    protected static native CFString IPTCDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyGPSDictionary")
    protected static native CFString GPSDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyRawDictionary")
    protected static native CFString RawDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyCIFFDictionary")
    protected static native CFString CIFFDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerCanonDictionary")
    protected static native CFString MakerCanonDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerNikonDictionary")
    protected static native CFString MakerNikonDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerMinoltaDictionary")
    protected static native CFString MakerMinoltaDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerFujiDictionary")
    protected static native CFString MakerFujiDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerOlympusDictionary")
    protected static native CFString MakerOlympusDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerPentaxDictionary")
    protected static native CFString MakerPentaxDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageProperty8BIMDictionary")
    protected static native CFString _8BIMDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDNGDictionary")
    protected static native CFString DNGDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyExifAuxDictionary")
    protected static native CFString ExifAuxDictionaryKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImagePropertyMakerAppleDictionary")
    protected static native CFString MakerAppleDictionaryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyFileSize")
    protected static native CFString FileSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPixelHeight")
    protected static native CFString PixelHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPixelWidth")
    protected static native CFString PixelWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDPIHeight")
    protected static native CFString DPIHeightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDPIWidth")
    protected static native CFString DPIWidthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyDepth")
    protected static native CFString DepthKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyOrientation")
    protected static native CFString OrientationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIsFloat")
    protected static native CFString IsFloatKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIsIndexed")
    protected static native CFString IsIndexedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyHasAlpha")
    protected static native CFString HasAlphaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyColorModel")
    protected static native CFString ColorModelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyProfileName")
    protected static native CFString ProfileNameKey();
    
}
