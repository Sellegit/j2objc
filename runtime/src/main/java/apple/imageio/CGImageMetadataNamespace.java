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
public class CGImageMetadataNamespace 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceExif")
    public static native CFString ExifValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceExifAux")
    public static native CFString ExifAuxValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceExifEX")
    public static native CFString ExifEXValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceDublinCore")
    public static native CFString DublinCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceIPTCCore")
    public static native CFString IPTCCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespacePhotoshop")
    public static native CFString PhotoshopValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceTIFF")
    public static native CFString TIFFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceXMPBasic")
    public static native CFString XMPBasicValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataNamespaceXMPRights")
    public static native CFString XMPRightsValue();

}
