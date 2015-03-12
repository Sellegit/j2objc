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

@Library("UIKit") @Mapping("UITabBar")
public class UITabBar 
    extends UIView 
     {

    
    
    public UITabBar() {}
    @Mapping("initWithFrame:")
    public UITabBar(CGRect frame) { }
    
    
    @Mapping("delegate")
    public native UITabBarDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UITabBarDelegate v);
    @Mapping("items")
    public native NSArray<UITabBarItem> getItems();
    @Mapping("setItems:")
    public native void setItems(NSArray<UITabBarItem> v);
    @Mapping("selectedItem")
    public native UITabBarItem getSelectedItem();
    @Mapping("setSelectedItem:")
    public native void setSelectedItem(UITabBarItem v);
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
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("selectedImageTintColor")
    public native UIColor getSelectedImageTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setSelectedImageTintColor:")
    public native void setSelectedImageTintColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImage")
    public native UIImage getBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("selectionIndicatorImage")
    public native UIImage getSelectionIndicatorImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage v);
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
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("itemPositioning")
    public native @Representing("UITabBarItemPositioning") @MachineSizedSInt long getItemPositioning();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setItemPositioning:")
    public native void setItemPositioning(@Representing("UITabBarItemPositioning") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("itemWidth")
    public native @MachineSizedFloat double getItemWidth();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setItemWidth:")
    public native void setItemWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("itemSpacing")
    public native @MachineSizedFloat double getItemSpacing();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setItemSpacing:")
    public native void setItemSpacing(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("barStyle")
    public native @Representing("UIBarStyle") @MachineSizedSInt long getBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBarStyle:")
    public native void setBarStyle(@Representing("UIBarStyle") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTranslucent:")
    public native void setTranslucent(boolean v);
    
    
    
    @Mapping("setItems:animated:")
    public native void setItems(NSArray<?> items, boolean animated);
    @Mapping("beginCustomizingItems:")
    public native void beginCustomizing(NSArray<?> items);
    @Mapping("endCustomizingAnimated:")
    public native boolean endCustomizing(boolean animated);
    @Mapping("isCustomizing")
    public native boolean isCustomizing();
    
}
