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





@Library("UIKit/UIKit.h") @Mapping("UIScrollViewDelegate")
public interface UIScrollViewDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("scrollViewDidScroll:")
    void didScroll(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewDidZoom:")
    void didZoom(UIScrollView scrollView);
    @Mapping("scrollViewWillBeginDragging:")
    void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset);
    @Mapping("scrollViewDidEndDragging:willDecelerate:")
    void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Mapping("scrollViewWillBeginDecelerating:")
    void willBeginDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndDecelerating:")
    void didEndDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndScrollingAnimation:")
    void didEndScrollingAnimation(UIScrollView scrollView);
    @Mapping("viewForZoomingInScrollView:")
    UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewWillBeginZooming:withView:")
    void willBeginZooming(UIScrollView scrollView, UIView view);
    @Mapping("scrollViewDidEndZooming:withView:atScale:")
    void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Mapping("scrollViewShouldScrollToTop:")
    boolean shouldScrollToTop(UIScrollView scrollView);
    @Mapping("scrollViewDidScrollToTop:")
    void didScrollToTop(UIScrollView scrollView);
    
    /*<adapter>*/
    /*</adapter>*/
}
