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
public class CGImageMetadataPrefix 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExif")
    protected static native CFString ExifValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExifAux")
    protected static native CFString ExifAuxValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixExifEX")
    protected static native CFString ExifEXValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixDublinCore")
    protected static native CFString DublinCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixIPTCCore")
    protected static native CFString IPTCCoreValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixPhotoshop")
    protected static native CFString PhotoshopValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixTIFF")
    protected static native CFString TIFFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixXMPBasic")
    protected static native CFString XMPBasicValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageMetadataPrefixXMPRights")
    protected static native CFString XMPRightsValue();
    
}
