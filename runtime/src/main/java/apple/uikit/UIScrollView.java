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

@Library("UIKit/UIKit.h") @Mapping("UIScrollView")
public class UIScrollView 
    extends UIView 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public UIScrollView(CGRect frame) { }
    @Mapping("init")
    public UIScrollView() { }
    
    
    @Mapping("contentOffset")
    public native CGPoint getContentOffset();
    @Mapping("setContentOffset:")
    public native void setContentOffset(CGPoint v);
    @Mapping("contentSize")
    public native CGSize getContentSize();
    @Mapping("setContentSize:")
    public native void setContentSize(CGSize v);
    @Mapping("contentInset")
    public native UIEdgeInsets getContentInset();
    @Mapping("setContentInset:")
    public native void setContentInset(UIEdgeInsets v);
    @Mapping("delegate")
    public native UIScrollViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIScrollViewDelegate v);
    @Mapping("isDirectionalLockEnabled")
    public native boolean isDirectionalLockEnabled();
    @Mapping("setDirectionalLockEnabled:")
    public native void setDirectionalLockEnabled(boolean v);
    @Mapping("bounces")
    public native boolean bounces();
    @Mapping("setBounces:")
    public native void setBounces(boolean v);
    @Mapping("alwaysBounceVertical")
    public native boolean alwaysBounceVertical();
    @Mapping("setAlwaysBounceVertical:")
    public native void setAlwaysBounceVertical(boolean v);
    @Mapping("alwaysBounceHorizontal")
    public native boolean alwaysBounceHorizontal();
    @Mapping("setAlwaysBounceHorizontal:")
    public native void setAlwaysBounceHorizontal(boolean v);
    @Mapping("isPagingEnabled")
    public native boolean isPagingEnabled();
    @Mapping("setPagingEnabled:")
    public native void setPagingEnabled(boolean v);
    @Mapping("isScrollEnabled")
    public native boolean isScrollEnabled();
    @Mapping("setScrollEnabled:")
    public native void setScrollEnabled(boolean v);
    @Mapping("showsHorizontalScrollIndicator")
    public native boolean showsHorizontalScrollIndicator();
    @Mapping("setShowsHorizontalScrollIndicator:")
    public native void setShowsHorizontalScrollIndicator(boolean v);
    @Mapping("showsVerticalScrollIndicator")
    public native boolean showsVerticalScrollIndicator();
    @Mapping("setShowsVerticalScrollIndicator:")
    public native void setShowsVerticalScrollIndicator(boolean v);
    @Mapping("scrollIndicatorInsets")
    public native UIEdgeInsets getScrollIndicatorInsets();
    @Mapping("setScrollIndicatorInsets:")
    public native void setScrollIndicatorInsets(UIEdgeInsets v);
    @Mapping("indicatorStyle")
    public native @Representing("UIScrollViewIndicatorStyle") @MachineSizedSInt long getIndicatorStyle();
    @Mapping("setIndicatorStyle:")
    public native void setIndicatorStyle(@Representing("UIScrollViewIndicatorStyle") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("decelerationRate")
    public native @MachineSizedFloat double getDecelerationRate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setDecelerationRate:")
    public native void setDecelerationRate(@MachineSizedFloat double v);
    @Mapping("isTracking")
    public native boolean isTracking();
    @Mapping("isDragging")
    public native boolean isDragging();
    @Mapping("isDecelerating")
    public native boolean isDecelerating();
    @Mapping("delaysContentTouches")
    public native boolean delaysContentTouches();
    @Mapping("setDelaysContentTouches:")
    public native void setDelaysContentTouches(boolean v);
    @Mapping("canCancelContentTouches")
    public native boolean canCancelContentTouches();
    @Mapping("setCanCancelContentTouches:")
    public native void setCanCancelContentTouches(boolean v);
    @Mapping("minimumZoomScale")
    public native @MachineSizedFloat double getMinimumZoomScale();
    @Mapping("setMinimumZoomScale:")
    public native void setMinimumZoomScale(@MachineSizedFloat double v);
    @Mapping("maximumZoomScale")
    public native @MachineSizedFloat double getMaximumZoomScale();
    @Mapping("setMaximumZoomScale:")
    public native void setMaximumZoomScale(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("zoomScale")
    public native @MachineSizedFloat double getZoomScale();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setZoomScale:")
    public native void setZoomScale(@MachineSizedFloat double v);
    @Mapping("bouncesZoom")
    public native boolean bouncesZoom();
    @Mapping("setBouncesZoom:")
    public native void setBouncesZoom(boolean v);
    @Mapping("isZooming")
    public native boolean isZooming();
    @Mapping("isZoomBouncing")
    public native boolean isZoomBouncing();
    @Mapping("scrollsToTop")
    public native boolean scrollsToTop();
    @Mapping("setScrollsToTop:")
    public native void setScrollsToTop(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("panGestureRecognizer")
    public native UIPanGestureRecognizer getPanGestureRecognizer();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("pinchGestureRecognizer")
    public native UIPinchGestureRecognizer getPinchGestureRecognizer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("keyboardDismissMode")
    public native @Representing("UIScrollViewKeyboardDismissMode") @MachineSizedSInt long getKeyboardDismissMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setKeyboardDismissMode:")
    public native void setKeyboardDismissMode(@Representing("UIScrollViewKeyboardDismissMode") @MachineSizedSInt long v);
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIScrollViewDecelerationRateNormal")
    public static native @MachineSizedFloat double getNormalDecelerationRate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIScrollViewDecelerationRateFast")
    public static native @MachineSizedFloat double getFastDecelerationRate();
    
    @Mapping("setContentOffset:animated:")
    public native void setContentOffset(CGPoint contentOffset, boolean animated);
    @Mapping("scrollRectToVisible:animated:")
    public native void scrollRectToVisible(CGRect rect, boolean animated);
    @Mapping("flashScrollIndicators")
    public native void flashScrollIndicators();
    @Mapping("touchesShouldBegin:withEvent:inContentView:")
    public native boolean touchesShouldBegin(NSSet<?> touches, UIEvent event, UIView view);
    @Mapping("touchesShouldCancelInContentView:")
    public native boolean touchesShouldCancelInContentView(UIView view);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setZoomScale:animated:")
    public native void setZoomScale(@MachineSizedFloat double scale, boolean animated);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("zoomToRect:animated:")
    public native void zoomToRect(CGRect rect, boolean animated);
    
}
