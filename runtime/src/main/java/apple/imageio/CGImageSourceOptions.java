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
public class CGImageSourceOptions 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceTypeIdentifierHint")
    public static native CFString TypeIdentifierHintKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldCache")
    public static native CFString ShouldCacheKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldCacheImmediately")
    public static native CFString ShouldCacheImmediatelyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldAllowFloat")
    public static native CFString ShouldAllowFloatKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailFromImageIfAbsent")
    public static native CFString CreateThumbnailFromImageIfAbsentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailFromImageAlways")
    public static native CFString CreateThumbnailFromImageAlwaysKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceThumbnailMaxPixelSize")
    public static native CFString ThumbnailMaxPixelSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailWithTransform")
    public static native CFString CreateThumbnailWithTransformKey();

}
