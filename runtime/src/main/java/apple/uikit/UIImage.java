package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIImage")
public class UIImage 
    extends NSObject 
    implements UIAccessibilityIdentification {

    
    
    public UIImage() {}
    @Mapping("initWithContentsOfFile:")
    public UIImage(String path) { }
    @Mapping("initWithData:")
    public UIImage(NSData data) { }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("initWithData:scale:")
    public UIImage(NSData data, @MachineSizedFloat double scale) { }
    @Mapping("initWithCGImage:")
    public UIImage(CGImage cgImage) { }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithCGImage:scale:orientation:")
    public UIImage(CGImage cgImage, @MachineSizedFloat double scale, @Representing("UIImageOrientation") @MachineSizedSInt long orientation) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCIImage:")
    public UIImage(CIImage ciImage) { }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("initWithCIImage:scale:orientation:")
    public UIImage(CIImage ciImage, @MachineSizedFloat double scale, @Representing("UIImageOrientation") @MachineSizedSInt long orientation) { }
    
    
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("CGImage")
    public native CGImage getCGImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("CIImage")
    public native CIImage getCIImage();
    @Mapping("imageOrientation")
    public native @Representing("UIImageOrientation") @MachineSizedSInt long getOrientation();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("images")
    public native NSArray<UIImage> getImages();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("duration")
    public native double getDuration();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("capInsets")
    public native UIEdgeInsets getCapInsets();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("resizingMode")
    public native @Representing("UIImageResizingMode") @MachineSizedSInt long getResizingMode();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("alignmentRectInsets")
    public native UIEdgeInsets getAlignmentRectInsets();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("renderingMode")
    public native @Representing("UIImageRenderingMode") @MachineSizedSInt long getRenderingMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("traitCollection")
    public native UITraitCollection getTraitCollection();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("imageAsset")
    public native UIImageAsset getImageAsset();
    @Mapping("leftCapWidth")
    public native @MachineSizedSInt long getLeftCapWidth();
    @Mapping("topCapHeight")
    public native @MachineSizedSInt long getTopCapHeight();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    
    
    
    @GlobalFunction("UIImagePNGRepresentation")
    public static native NSData toPNGData(UIImage image);
    @GlobalFunction("UIImageJPEGRepresentation")
    public static native NSData toJPEGData(UIImage image, @MachineSizedFloat double compressionQuality);
    @GlobalFunction("UIImageWriteToSavedPhotosAlbum")
    public static native void saveToPhotosAlbum(UIImage image, Object completionTarget, Selector completionSelector, Todo contextInfo);
    
    @Mapping("drawAtPoint:")
    public native void draw(CGPoint point);
    @Mapping("drawAtPoint:blendMode:alpha:")
    public native void draw(CGPoint point, @Representing("CGBlendMode") int blendMode, @MachineSizedFloat double alpha);
    @Mapping("drawInRect:")
    public native void draw(CGRect rect);
    @Mapping("drawInRect:blendMode:alpha:")
    public native void draw(CGRect rect, @Representing("CGBlendMode") int blendMode, @MachineSizedFloat double alpha);
    @Mapping("drawAsPatternInRect:")
    public native void drawAsPattern(CGRect rect);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("resizableImageWithCapInsets:")
    public native UIImage createResizable(UIEdgeInsets capInsets);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("resizableImageWithCapInsets:resizingMode:")
    public native UIImage createResizable(UIEdgeInsets capInsets, @Representing("UIImageResizingMode") @MachineSizedSInt long resizingMode);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("imageWithAlignmentRectInsets:")
    public native UIImage create(UIEdgeInsets alignmentInsets);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("imageWithRenderingMode:")
    public native UIImage create(@Representing("UIImageRenderingMode") @MachineSizedSInt long renderingMode);
    @Mapping("imageNamed:")
    public static native UIImage create(String name);
    @Mapping("imageNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIImage create(String name, NSBundle bundle, UITraitCollection traitCollection);
    @Mapping("imageWithContentsOfFile:")
    protected static native UIImage createFromFile(String path);
    @Mapping("imageWithData:")
    public static native UIImage create(NSData data);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("imageWithData:scale:")
    public static native UIImage create(NSData data, @MachineSizedFloat double scale);
    @Mapping("imageWithCGImage:")
    public static native UIImage create(CGImage cgImage);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("imageWithCGImage:scale:orientation:")
    public static native UIImage create(CGImage cgImage, @MachineSizedFloat double scale, @Representing("UIImageOrientation") @MachineSizedSInt long orientation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("imageWithCIImage:")
    public static native UIImage create(CIImage ciImage);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("imageWithCIImage:scale:orientation:")
    public static native UIImage create(CIImage ciImage, @MachineSizedFloat double scale, @Representing("UIImageOrientation") @MachineSizedSInt long orientation);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("animatedImageNamed:duration:")
    public static native UIImage createAnimated(String name, double duration);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("animatedResizableImageNamed:capInsets:duration:")
    public static native UIImage createAnimatedResizable(String name, UIEdgeInsets capInsets, double duration);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("animatedResizableImageNamed:capInsets:resizingMode:duration:")
    public static native UIImage createAnimatedResizable(String name, UIEdgeInsets capInsets, @Representing("UIImageResizingMode") @MachineSizedSInt long resizingMode, double duration);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("animatedImageWithImages:duration:")
    public static native UIImage createAnimated(NSArray<?> images, double duration);
    @Mapping("stretchableImageWithLeftCapWidth:topCapHeight:")
    public native UIImage createStretchable(@MachineSizedSInt long leftCapWidth, @MachineSizedSInt long topCapHeight);
    
}
