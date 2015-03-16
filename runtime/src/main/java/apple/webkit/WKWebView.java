package apple.webkit;


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
import apple.uikit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("WebKit/WebKit.h") @Mapping("WKWebView")
public class WKWebView 
    extends UIView 
     {

    
    
    public WKWebView() {}
    @Mapping("initWithFrame:configuration:")
    public WKWebView(CGRect frame, WKWebViewConfiguration configuration) { }
    @Mapping("initWithCoder:")
    public WKWebView(NSCoder coder) { }
    @Mapping("initWithFrame:")
    public WKWebView(CGRect frame) { }
    
    
    @Mapping("configuration")
    public native WKWebViewConfiguration getConfiguration();
    @Mapping("navigationDelegate")
    public native WKNavigationDelegate getNavigationDelegate();
    @Mapping("setNavigationDelegate:")
    public native void setNavigationDelegate(WKNavigationDelegate v);
    @Mapping("UIDelegate")
    public native WKUIDelegate getUIDelegate();
    @Mapping("setUIDelegate:")
    public native void setUIDelegate(WKUIDelegate v);
    @Mapping("backForwardList")
    public native WKBackForwardList getBackForwardList();
    @Mapping("title")
    public native String getTitle();
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("isLoading")
    public native boolean isLoading();
    @Mapping("estimatedProgress")
    public native double getEstimatedProgress();
    @Mapping("hasOnlySecureContent")
    public native boolean hasOnlySecureContent();
    @Mapping("canGoBack")
    public native boolean canGoBack();
    @Mapping("canGoForward")
    public native boolean canGoForward();
    @Mapping("allowsBackForwardNavigationGestures")
    public native boolean allowsBackForwardNavigationGestures();
    @Mapping("setAllowsBackForwardNavigationGestures:")
    public native void setAllowsBackForwardNavigationGestures(boolean v);
    @Mapping("scrollView")
    public native UIScrollView getScrollView();
    
    
    
    @Mapping("loadRequest:")
    public native WKNavigation loadRequest(NSURLRequest request);
    @Mapping("loadHTMLString:baseURL:")
    public native WKNavigation loadHTMLString(String string, NSURL baseURL);
    @Mapping("goToBackForwardListItem:")
    public native WKNavigation goToBackForwardListItem(WKBackForwardListItem item);
    @Mapping("goBack")
    public native WKNavigation goBack();
    @Mapping("goForward")
    public native WKNavigation goForward();
    @Mapping("reload")
    public native WKNavigation reload();
    @Mapping("reloadFromOrigin")
    public native WKNavigation reloadFromOrigin();
    @Mapping("stopLoading")
    public native void stopLoading();
    @Mapping("evaluateJavaScript:completionHandler:")
    public native void evaluateJavaScript(String javaScriptString, Todo completionHandler);
    
}
