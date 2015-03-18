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

@Library("UIKit/UIKit.h") @Mapping("UIPageControl")
public class UIPageControl 
    extends UIControl 
     {

    
    
    @Mapping("initWithFrame:")
    public UIPageControl(CGRect frame) { }
    @Mapping("init")
    public UIPageControl() { }
    
    
    @Mapping("numberOfPages")
    public native @MachineSizedSInt long getNumberOfPages();
    @Mapping("setNumberOfPages:")
    public native void setNumberOfPages(@MachineSizedSInt long v);
    @Mapping("currentPage")
    public native @MachineSizedSInt long getCurrentPage();
    @Mapping("setCurrentPage:")
    public native void setCurrentPage(@MachineSizedSInt long v);
    @Mapping("hidesForSinglePage")
    public native boolean hidesForSinglePage();
    @Mapping("setHidesForSinglePage:")
    public native void setHidesForSinglePage(boolean v);
    @Mapping("defersCurrentPageDisplay")
    public native boolean defersCurrentPageDisplay();
    @Mapping("setDefersCurrentPageDisplay:")
    public native void setDefersCurrentPageDisplay(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pageIndicatorTintColor")
    public native UIColor getPageIndicatorTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setPageIndicatorTintColor:")
    public native void setPageIndicatorTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("currentPageIndicatorTintColor")
    public native UIColor getCurrentPageIndicatorTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setCurrentPageIndicatorTintColor:")
    public native void setCurrentPageIndicatorTintColor(UIColor v);
    
    
    
    @Mapping("updateCurrentPageDisplay")
    public native void updateCurrentPageDisplay();
    @Mapping("sizeForNumberOfPages:")
    public native CGSize getSizeForNumberOfPages(@MachineSizedSInt long pageCount);
    
}
