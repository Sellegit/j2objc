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
public class CGImageMetadataPrefix 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExif")
    public static native CFString ExifValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExifAux")
    public static native CFString ExifAuxValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExifEX")
    public static native CFString ExifEXValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixDublinCore")
    public static native CFString DublinCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixIPTCCore")
    public static native CFString IPTCCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixPhotoshop")
    public static native CFString PhotoshopValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixTIFF")
    public static native CFString TIFFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixXMPBasic")
    public static native CFString XMPBasicValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixXMPRights")
    public static native CFString XMPRightsValue();
    
}
