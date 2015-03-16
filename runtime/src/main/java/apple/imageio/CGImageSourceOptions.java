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
    protected static native CFString TypeIdentifierHintKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldCache")
    protected static native CFString ShouldCacheKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldCacheImmediately")
    protected static native CFString ShouldCacheImmediatelyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceShouldAllowFloat")
    protected static native CFString ShouldAllowFloatKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailFromImageIfAbsent")
    protected static native CFString CreateThumbnailFromImageIfAbsentKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailFromImageAlways")
    protected static native CFString CreateThumbnailFromImageAlwaysKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceThumbnailMaxPixelSize")
    protected static native CFString ThumbnailMaxPixelSizeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImageSourceCreateThumbnailWithTransform")
    protected static native CFString CreateThumbnailWithTransformKey();
    
}
