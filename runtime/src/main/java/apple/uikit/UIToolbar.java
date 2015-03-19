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

@Library("UIKit/UIKit.h") @Mapping("UIToolbar")
public class UIToolbar 
    extends UIView 
    implements UIBarPositioning {

    
    
    @Mapping("initWithFrame:")
    public UIToolbar(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIToolbar(NSCoder aDecoder) { }
    @Mapping("init")
    public UIToolbar() { }
    
    
    @Mapping("barStyle")
    public native @Representing("UIBarStyle") long getBarStyle();
    @Mapping("setBarStyle:")
    public native void setBarStyle(@Representing("UIBarStyle") long v);
    @Mapping("items")
    public native NSArray<UIBarButtonItem> getItems();
    @Mapping("setItems:")
    public native void setItems(NSArray<UIBarButtonItem> v);
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
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("delegate")
    public native UIToolbarDelegate getDelegate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDelegate:")
    public native void setDelegate(UIToolbarDelegate v);
    @Mapping("barPosition")
    public native @Representing("UIBarPosition") long getBarPosition();
    
    
    
    @Mapping("setItems:animated:")
    public native void setItems(NSArray<?> items, boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:forToolbarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIBarPosition") long topOrBottom, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImageForToolbarPosition:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIBarPosition") long topOrBottom, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setShadowImage:forToolbarPosition:")
    public native void setShadowImage(UIImage shadowImage, @Representing("UIBarPosition") long topOrBottom);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shadowImageForToolbarPosition:")
    public native UIImage getShadowImage(@Representing("UIBarPosition") long topOrBottom);
    
}
