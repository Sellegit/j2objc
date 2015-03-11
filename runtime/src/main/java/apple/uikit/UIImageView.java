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

@Library("UIKit") @Mapping("UIImageView")
public class UIImageView 
    extends UIView 
     {

    
    
    public UIImageView() {}
    @Mapping("initWithImage:")
    public UIImageView(UIImage image) { }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithImage:highlightedImage:")
    public UIImageView(UIImage image, UIImage highlightedImage) { }
    @Mapping("initWithFrame:")
    public UIImageView(CGRect frame) { }
    
    
    @Mapping("image")
    public native UIImage getImage();
    @Mapping("setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("highlightedImage")
    public native UIImage getHighlightedImage();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setHighlightedImage:")
    public native void setHighlightedImage(UIImage v);
    @Mapping("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Mapping("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setHighlighted:")
    public native void setHighlighted(boolean v);
    @Mapping("animationImages")
    public native NSArray<UIImage> getAnimationImages();
    @Mapping("setAnimationImages:")
    public native void setAnimationImages(NSArray<UIImage> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("highlightedAnimationImages")
    public native NSArray<UIImage> getHighlightedAnimationImages();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setHighlightedAnimationImages:")
    public native void setHighlightedAnimationImages(NSArray<UIImage> v);
    @Mapping("animationDuration")
    public native double getAnimationDuration();
    @Mapping("setAnimationDuration:")
    public native void setAnimationDuration(double v);
    @Mapping("animationRepeatCount")
    public native @MachineSizedSInt long getAnimationRepeatCount();
    @Mapping("setAnimationRepeatCount:")
    public native void setAnimationRepeatCount(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    
    
    
    @Mapping("startAnimating")
    public native void startAnimating();
    @Mapping("stopAnimating")
    public native void stopAnimating();
    @Mapping("isAnimating")
    public native boolean isAnimating();
    
}
