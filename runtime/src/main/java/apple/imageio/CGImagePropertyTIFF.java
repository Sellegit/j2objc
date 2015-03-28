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
public class CGImagePropertyTIFF 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFCompression")
    public static native CFString CompressionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFPhotometricInterpretation")
    public static native CFString PhotometricInterpretationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFDocumentName")
    public static native CFString DocumentNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFImageDescription")
    public static native CFString ImageDescriptionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFMake")
    public static native CFString MakeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFModel")
    public static native CFString ModelKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFOrientation")
    public static native CFString OrientationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFXResolution")
    public static native CFString XResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFYResolution")
    public static native CFString YResolutionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFResolutionUnit")
    public static native CFString ResolutionUnitKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFSoftware")
    public static native CFString SoftwareKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFTransferFunction")
    public static native CFString TransferFunctionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFDateTime")
    public static native CFString DateTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFArtist")
    public static native CFString ArtistKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFHostComputer")
    public static native CFString HostComputerKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFCopyright")
    public static native CFString CopyrightKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFWhitePoint")
    public static native CFString WhitePointKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyTIFFPrimaryChromaticities")
    public static native CFString PrimaryChromaticitiesKey();

}
