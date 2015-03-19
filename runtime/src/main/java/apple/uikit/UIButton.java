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

@Library("UIKit/UIKit.h") @Mapping("UIButton")
public class UIButton 
    extends UIControl 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public UIButton(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIButton(NSCoder aDecoder) { }
    @Mapping("init")
    public UIButton() { }
    
    
    @Mapping("contentEdgeInsets")
    public native UIEdgeInsets getContentEdgeInsets();
    @Mapping("setContentEdgeInsets:")
    public native void setContentEdgeInsets(UIEdgeInsets v);
    @Mapping("titleEdgeInsets")
    public native UIEdgeInsets getTitleEdgeInsets();
    @Mapping("setTitleEdgeInsets:")
    public native void setTitleEdgeInsets(UIEdgeInsets v);
    @Mapping("reversesTitleShadowWhenHighlighted")
    public native boolean reversesTitleShadowWhenHighlighted();
    @Mapping("setReversesTitleShadowWhenHighlighted:")
    public native void setReversesTitleShadowWhenHighlighted(boolean v);
    @Mapping("imageEdgeInsets")
    public native UIEdgeInsets getImageEdgeInsets();
    @Mapping("setImageEdgeInsets:")
    public native void setImageEdgeInsets(UIEdgeInsets v);
    @Mapping("adjustsImageWhenHighlighted")
    public native boolean adjustsImageWhenHighlighted();
    @Mapping("setAdjustsImageWhenHighlighted:")
    public native void setAdjustsImageWhenHighlighted(boolean v);
    @Mapping("adjustsImageWhenDisabled")
    public native boolean adjustsImageWhenDisabled();
    @Mapping("setAdjustsImageWhenDisabled:")
    public native void setAdjustsImageWhenDisabled(boolean v);
    @Mapping("showsTouchWhenHighlighted")
    public native boolean showsTouchWhenHighlighted();
    @Mapping("setShowsTouchWhenHighlighted:")
    public native void setShowsTouchWhenHighlighted(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    @Mapping("buttonType")
    public native @Representing("UIButtonType") long getButtonType();
    @Mapping("currentTitle")
    public native String getCurrentTitle();
    @Mapping("currentTitleColor")
    public native UIColor getCurrentTitleColor();
    @Mapping("currentTitleShadowColor")
    public native UIColor getCurrentTitleShadowColor();
    @Mapping("currentImage")
    public native UIImage getCurrentImage();
    @Mapping("currentBackgroundImage")
    public native UIImage getCurrentBackgroundImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("currentAttributedTitle")
    public native NSAttributedString getCurrentAttributedTitle();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("titleLabel")
    public native UILabel getTitleLabel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("imageView")
    public native UIImageView getImageView();
    
    
    
    @Mapping("setTitle:forState:")
    public native void setTitle(String title, @Representing("UIControlState") long state);
    @Mapping("setTitleColor:forState:")
    public native void setTitleColor(UIColor color, @Representing("UIControlState") long state);
    @Mapping("setTitleShadowColor:forState:")
    public native void setTitleShadowColor(UIColor color, @Representing("UIControlState") long state);
    @Mapping("setImage:forState:")
    public native void setImage(UIImage image, @Representing("UIControlState") long state);
    @Mapping("setBackgroundImage:forState:")
    public native void setBackgroundImage(UIImage image, @Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAttributedTitle:forState:")
    public native void setAttributedTitle(NSAttributedString title, @Representing("UIControlState") long state);
    @Mapping("titleForState:")
    public native String getTitle(@Representing("UIControlState") long state);
    @Mapping("titleColorForState:")
    public native UIColor getTitleColor(@Representing("UIControlState") long state);
    @Mapping("titleShadowColorForState:")
    public native UIColor getTitleShadowColor(@Representing("UIControlState") long state);
    @Mapping("imageForState:")
    public native UIImage getImage(@Representing("UIControlState") long state);
    @Mapping("backgroundImageForState:")
    public native UIImage getBackgroundImage(@Representing("UIControlState") long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("attributedTitleForState:")
    public native NSAttributedString getAttributedTitle(@Representing("UIControlState") long state);
    @Mapping("backgroundRectForBounds:")
    public native CGRect getBackgroundRect(CGRect bounds);
    @Mapping("contentRectForBounds:")
    public native CGRect getContentRect(CGRect bounds);
    @Mapping("titleRectForContentRect:")
    public native CGRect getTitleRect(CGRect contentRect);
    @Mapping("imageRectForContentRect:")
    public native CGRect getImageRect(CGRect contentRect);
    @Mapping("buttonWithType:")
    public static native UIButton create(@Representing("UIButtonType") long buttonType);
    
}
