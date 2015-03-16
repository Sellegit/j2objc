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
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPageViewController")
public class UIPageViewController 
    extends UIViewController 
     {

    
    
    public UIPageViewController() {}
    @Mapping("initWithTransitionStyle:navigationOrientation:options:")
    public UIPageViewController(@Representing("UIPageViewControllerTransitionStyle") @MachineSizedSInt long style, @Representing("UIPageViewControllerNavigationOrientation") @MachineSizedSInt long navigationOrientation, NSDictionary<?, ?> options) { }
    @Mapping("initWithNibName:bundle:")
    public UIPageViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native UIPageViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPageViewControllerDelegate v);
    @Mapping("dataSource")
    public native UIPageViewControllerDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(UIPageViewControllerDataSource v);
    @Mapping("transitionStyle")
    public native @Representing("UIPageViewControllerTransitionStyle") @MachineSizedSInt long getTransitionStyle();
    @Mapping("navigationOrientation")
    public native @Representing("UIPageViewControllerNavigationOrientation") @MachineSizedSInt long getNavigationOrientation();
    @Mapping("spineLocation")
    public native @Representing("UIPageViewControllerSpineLocation") @MachineSizedSInt long getSpineLocation();
    @Mapping("isDoubleSided")
    public native boolean isDoubleSided();
    @Mapping("setDoubleSided:")
    public native void setDoubleSided(boolean v);
    @Mapping("gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    @Mapping("viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    
    
    
    @Mapping("setViewControllers:direction:animated:completion:")
    public native void setViewControllers(NSArray<?> viewControllers, @Representing("UIPageViewControllerNavigationDirection") @MachineSizedSInt long direction, boolean animated, @Block VoidBooleanBlock completion);
    
}
