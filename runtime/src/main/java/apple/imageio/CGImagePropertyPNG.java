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
public class CGImagePropertyPNG 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGGamma")
    public static native CFString GammaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGInterlaceType")
    public static native CFString InterlaceTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGXPixelsPerMeter")
    public static native CFString XPixelsPerMeterKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGYPixelsPerMeter")
    public static native CFString YPixelsPerMeterKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGsRGBIntent")
    public static native CFString sRGBIntentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGChromaticities")
    public static native CFString ChromaticitiesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGAuthor")
    public static native CFString AuthorKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGCopyright")
    public static native CFString CopyrightKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGCreationTime")
    public static native CFString CreationTimeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGDescription")
    public static native CFString DescriptionKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGModificationTime")
    public static native CFString ModificationTimeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGSoftware")
    public static native CFString SoftwareKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGTitle")
    public static native CFString TitleKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGLoopCount")
    public static native CFString LoopCountKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGDelayTime")
    public static native CFString DelayTimeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGUnclampedDelayTime")
    public static native CFString UnclampedDelayTimeKey();
    
}
