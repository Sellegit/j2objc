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

@Library("UIKit/UIKit.h") @Mapping("UIWebView")
public class UIWebView 
    extends UIView 
    implements NSCoding, UIScrollViewDelegate {

    
    
    @Mapping("initWithFrame:")
    public UIWebView(CGRect frame) { }
    @Mapping("init")
    public UIWebView() { }
    
    
    @Mapping("delegate")
    public native UIWebViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIWebViewDelegate v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollView")
    public native UIScrollView getScrollView();
    @Mapping("request")
    public native NSURLRequest getRequest();
    @Mapping("canGoBack")
    public native boolean canGoBack();
    @Mapping("canGoForward")
    public native boolean canGoForward();
    @Mapping("isLoading")
    public native boolean isLoading();
    @Mapping("scalesPageToFit")
    public native boolean isScalesPageToFit();
    @Mapping("setScalesPageToFit:")
    public native void setScalesPageToFit(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("dataDetectorTypes")
    public native @Representing("UIDataDetectorTypes") @MachineSizedUInt long getDataDetectorTypes();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@Representing("UIDataDetectorTypes") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mediaPlaybackRequiresUserAction")
    public native boolean isMediaPlaybackRequiresUserAction();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("mediaPlaybackAllowsAirPlay")
    public native boolean isMediaPlaybackAllowsAirPlay();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("keyboardDisplayRequiresUserAction")
    public native boolean isKeyboardDisplayRequiresUserAction();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setKeyboardDisplayRequiresUserAction:")
    public native void setKeyboardDisplayRequiresUserAction(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("paginationMode")
    public native @Representing("UIWebPaginationMode") @MachineSizedSInt long getPaginationMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPaginationMode:")
    public native void setPaginationMode(@Representing("UIWebPaginationMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("paginationBreakingMode")
    public native @Representing("UIWebPaginationBreakingMode") @MachineSizedSInt long getPaginationBreakingMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPaginationBreakingMode:")
    public native void setPaginationBreakingMode(@Representing("UIWebPaginationBreakingMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("pageLength")
    public native @MachineSizedFloat double getPageLength();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPageLength:")
    public native void setPageLength(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("gapBetweenPages")
    public native @MachineSizedFloat double getGapBetweenPages();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setGapBetweenPages:")
    public native void setGapBetweenPages(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("pageCount")
    public native @MachineSizedUInt long getPageCount();
    
    
    
    @Mapping("loadRequest:")
    public native void loadRequest(NSURLRequest request);
    @Mapping("loadHTMLString:baseURL:")
    public native void loadHTML(String string, NSURL baseURL);
    @Mapping("loadData:MIMEType:textEncodingName:baseURL:")
    public native void loadData(NSData data, String MIMEType, String textEncodingName, NSURL baseURL);
    @Mapping("reload")
    public native void reload();
    @Mapping("stopLoading")
    public native void stopLoading();
    @Mapping("goBack")
    public native void goBack();
    @Mapping("goForward")
    public native void goForward();
    @Mapping("stringByEvaluatingJavaScriptFromString:")
    public native String evaluateJavaScript(String script);
    @Mapping("scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Mapping("scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset);
    @Mapping("scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Mapping("scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Mapping("viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Mapping("scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Mapping("scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Mapping("scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
    
}
