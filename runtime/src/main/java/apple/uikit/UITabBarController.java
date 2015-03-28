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
@Library("UIKit/UIKit.h") @Mapping("UITabBarController")
public class UITabBarController 
    extends UIViewController 
    implements UITabBarDelegate, NSCoding {

    
    
    @Mapping("initWithNibName:bundle:")
    public UITabBarController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UITabBarController(NSCoder aDecoder) { }
    @Mapping("init")
    public UITabBarController() { }

    
    @Mapping("viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Mapping("setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Mapping("selectedViewController")
    public native UIViewController getSelectedViewController();
    @Mapping("setSelectedViewController:")
    public native void setSelectedViewController(UIViewController v);
    @Mapping("selectedIndex")
    public native @MachineSizedUInt long getSelectedIndex();
    @Mapping("setSelectedIndex:")
    public native void setSelectedIndex(@MachineSizedUInt long v);
    @Mapping("moreNavigationController")
    public native UINavigationController getMoreNavigationController();
    @Mapping("customizableViewControllers")
    public native NSArray<UIViewController> getCustomizableViewControllers();
    @Mapping("setCustomizableViewControllers:")
    public native void setCustomizableViewControllers(NSArray<UIViewController> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tabBar")
    public native UITabBar getTabBar();
    @Mapping("delegate")
    public native UITabBarControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UITabBarControllerDelegate v);

    
    
    @Mapping("setViewControllers:animated:")
    public native void setViewControllers(NSArray<?> viewControllers, boolean animated);
    @Mapping("tabBar:didSelectItem:")
    public native void didSelectItem(UITabBar tabBar, UITabBarItem item);
    @Mapping("tabBar:willBeginCustomizingItems:")
    public native void willBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Mapping("tabBar:didBeginCustomizingItems:")
    public native void didBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Mapping("tabBar:willEndCustomizingItems:changed:")
    public native void willEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);
    @Mapping("tabBar:didEndCustomizingItems:changed:")
    public native void didEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);

}
