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

@Library("UIKit/UIKit.h") @Mapping("UITabBarItem")
public class UITabBarItem 
    extends UIBarItem 
     {

    
    
    @Mapping("initWithTitle:image:tag:")
    public UITabBarItem(String title, UIImage image, @MachineSizedSInt long tag) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithTitle:image:selectedImage:")
    public UITabBarItem(String title, UIImage image, UIImage selectedImage) { }
    @Mapping("initWithTabBarSystemItem:tag:")
    public UITabBarItem(@Representing("UITabBarSystemItem") @MachineSizedSInt long systemItem, @MachineSizedSInt long tag) { }
    @Mapping("init")
    public UITabBarItem() { }
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("selectedImage")
    public native UIImage getSelectedImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSelectedImage:")
    public native void setSelectedImage(UIImage v);
    @Mapping("badgeValue")
    public native String getBadgeValue();
    @Mapping("setBadgeValue:")
    public native void setBadgeValue(String v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedImages(UIImage selectedImage, UIImage unselectedImage);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("finishedSelectedImage")
    public native UIImage getFinishedSelectedImage();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("finishedUnselectedImage")
    public native UIImage getFinishedUnselectedImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(UIOffset adjustment);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("titlePositionAdjustment")
    public native UIOffset getTitlePositionAdjustment();
    
}
