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
public class CGImagePropertyPNG 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGGamma")
    protected static native CFString GammaKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGInterlaceType")
    protected static native CFString InterlaceTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGXPixelsPerMeter")
    protected static native CFString XPixelsPerMeterKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGYPixelsPerMeter")
    protected static native CFString YPixelsPerMeterKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGsRGBIntent")
    protected static native CFString sRGBIntentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGChromaticities")
    protected static native CFString ChromaticitiesKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGAuthor")
    protected static native CFString AuthorKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGCopyright")
    protected static native CFString CopyrightKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGCreationTime")
    protected static native CFString CreationTimeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGDescription")
    protected static native CFString DescriptionKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGModificationTime")
    protected static native CFString ModificationTimeKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGSoftware")
    protected static native CFString SoftwareKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCGImagePropertyPNGTitle")
    protected static native CFString TitleKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGLoopCount")
    protected static native CFString LoopCountKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGDelayTime")
    protected static native CFString DelayTimeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCGImagePropertyAPNGUnclampedDelayTime")
    protected static native CFString UnclampedDelayTimeKey();
    
}
