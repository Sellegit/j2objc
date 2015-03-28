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
@Library("UIKit/UIKit.h") @Mapping("UINavigationBar")
public class UINavigationBar 
    extends UIView 
    implements NSCoding, UIBarPositioning {

    
    
    @Mapping("initWithFrame:")
    public UINavigationBar(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UINavigationBar(NSCoder aDecoder) { }
    @Mapping("init")
    public UINavigationBar() { }

    
    @Mapping("barStyle")
    public native @Representing("UIBarStyle") long getBarStyle();
    @Mapping("setBarStyle:")
    public native void setBarStyle(@Representing("UIBarStyle") long v);
    @Mapping("delegate")
    public native UINavigationBarDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UINavigationBarDelegate v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setTranslucent:")
    public native void setTranslucent(boolean v);
    @Mapping("topItem")
    public native UINavigationItem getTopItem();
    @Mapping("backItem")
    public native UINavigationItem getBackItem();
    @Mapping("items")
    public native NSArray<UINavigationItem> getItems();
    @Mapping("setItems:")
    public native void setItems(NSArray<UINavigationItem> v);
    @Mapping("tintColor")
    public native UIColor getTintColor();
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("barTintColor")
    public native UIColor getBarTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shadowImage")
    public native UIImage getShadowImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setShadowImage:")
    public native void setShadowImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("titleTextAttributes")
    public native NSDictionary<?, ?> getTitleTextAttributes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTitleTextAttributes:")
    public native void setTitleTextAttributes(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backIndicatorImage")
    public native UIImage getBackIndicatorImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBackIndicatorImage:")
    public native void setBackIndicatorImage(UIImage v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backIndicatorTransitionMaskImage")
    public native UIImage getBackIndicatorTransitionMaskImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBackIndicatorTransitionMaskImage:")
    public native void setBackIndicatorTransitionMaskImage(UIImage v);
    @Mapping("barPosition")
    public native @Representing("UIBarPosition") long getBarPosition();

    
    
    @Mapping("pushNavigationItem:animated:")
    public native void pushNavigationItem(UINavigationItem item, boolean animated);
    @Mapping("popNavigationItemAnimated:")
    public native UINavigationItem popNavigationItem(boolean animated);
    @Mapping("setItems:animated:")
    public native void setItems(NSArray<?> items, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIBarPosition") long barPosition, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backgroundImageForBarPosition:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIBarPosition") long barPosition, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:forBarMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImageForBarMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTitleVerticalPositionAdjustment:forBarMetrics:")
    public native void setTitleVerticalPositionAdjustment(@MachineSizedFloat double adjustment, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("titleVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getTitleVerticalPositionAdjustment(@Representing("UIBarMetrics") long barMetrics);

}
