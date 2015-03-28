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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIScrollViewDelegateAdapter 
    extends Object 
    implements UIScrollViewDelegate {

    
    
    


    
    
    @NotImplemented("scrollViewDidScroll:")
    public void didScroll(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.2 and later.
     */
    @NotImplemented("scrollViewDidZoom:")
    public void didZoom(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewWillBeginDragging:")
    public void willBeginDragging(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewDidEndDragging:willDecelerate:")
    public void didEndDragging(UIScrollView scrollView, boolean decelerate) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewWillBeginDecelerating:")
    public void willBeginDecelerating(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewDidEndDecelerating:")
    public void didEndDecelerating(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewDidEndScrollingAnimation:")
    public void didEndScrollingAnimation(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    @NotImplemented("viewForZoomingInScrollView:")
    public UIView getViewForZooming(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.2 and later.
     */
    @NotImplemented("scrollViewWillBeginZooming:withView:")
    public void willBeginZooming(UIScrollView scrollView, UIView view) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewDidEndZooming:withView:atScale:")
    public void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewShouldScrollToTop:")
    public boolean shouldScrollToTop(UIScrollView scrollView) { throw new UnsupportedOperationException(); }
    @NotImplemented("scrollViewDidScrollToTop:")
    public void didScrollToTop(UIScrollView scrollView) { throw new UnsupportedOperationException(); }

}
