package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;





@Library("CoreImage") @Mapping("CIImage")
public class CIImage 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public CIImage() {}
    @Mapping("initWithCGImage:")
    public CIImage(CGImage image) { }
    @Mapping("initWithCGImage:options:")
    public CIImage(CGImage image, CIImageOptions d) { }
    @Mapping("initWithData:")
    public CIImage(NSData data) { }
    @Mapping("initWithData:options:")
    public CIImage(NSData data, CIImageOptions d) { }
    @Mapping("initWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public CIImage(CIImageOptions d, @MachineSizedUInt long bpr, CGSize size, int f, CGColorSpace c) { }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("initWithTexture:size:flipped:colorSpace:")
    public CIImage(int name, CGSize size, boolean flag, CGColorSpace cs) { }
    @Mapping("initWithContentsOfURL:")
    public CIImage(NSURL url) { }
    @Mapping("initWithContentsOfURL:options:")
    public CIImage(NSURL url, CIImageOptions d) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCVPixelBuffer:")
    public CIImage(CVPixelBuffer buffer) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCVPixelBuffer:options:")
    public CIImage(CVPixelBuffer buffer, CIImageOptions dict) { }
    @Mapping("initWithColor:")
    public CIImage(CIColor color) { }
    
    
    
    
    
    
    @Mapping("imageByApplyingTransform:")
    public native CIImage newImageByApplyingTransform(CGAffineTransform matrix);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageByApplyingOrientation:")
    public native CIImage newImageByApplyingOrientation(CGImagePropertyOrientation orientation);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageTransformForOrientation:")
    public native CGAffineTransform getImageTransformForOrientation(CGImagePropertyOrientation orientation);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageByCompositingOverImage:")
    public native CIImage newImageByCompositingOverImage(CIImage dest);
    @Mapping("imageByCroppingToRect:")
    public native CIImage newImageByCroppingToRect(CGRect r);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageByClampingToExtent")
    public native CIImage newImageByClampingToExtent();
    @Mapping("extent")
    public native CGRect getExtent();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageByApplyingFilter:withInputParameters:")
    public native CIImage newImageByApplyingFilter(String filterName, CIFilterInputParameters params);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("properties")
    public native CGImageProperties getProperties();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("regionOfInterestForImage:inRect:")
    public native CGRect getRegionOfInterest(CIImage im, CGRect r);
    @Mapping("emptyImage")
    public static native CIImage getEmptyImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("autoAdjustmentFilters")
    public native NSArray<CIFilter> getAutoAdjustmentFilters();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("autoAdjustmentFiltersWithOptions:")
    public native NSArray<CIFilter> getAutoAdjustmentFilters(CIImageAutoAdjustOptions options);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
