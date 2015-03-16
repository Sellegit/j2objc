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





@Library("UIKit/UIKit.h") @Mapping("UIPageViewControllerDataSource")
public interface UIPageViewControllerDataSource 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("pageViewController:viewControllerBeforeViewController:")
    UIViewController getViewControllerBefore(UIPageViewController pageViewController, UIViewController viewController);
    @Mapping("pageViewController:viewControllerAfterViewController:")
    UIViewController getViewControllerAfter(UIPageViewController pageViewController, UIViewController viewController);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("presentationCountForPageViewController:")
    @MachineSizedSInt long getPresentationCount(UIPageViewController pageViewController);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("presentationIndexForPageViewController:")
    @MachineSizedSInt long getPresentationIndex(UIPageViewController pageViewController);
    
    /*<adapter>*/
    /*</adapter>*/
}
