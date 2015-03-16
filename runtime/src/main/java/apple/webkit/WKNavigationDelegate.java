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





@Library("WebKit/WebKit.h") @Mapping("WKNavigationDelegate")
public interface WKNavigationDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("webView:decidePolicyForNavigationAction:decisionHandler:")
    void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, @Block VoidBlock1<WKNavigationActionPolicy> decisionHandler);
    @Mapping("webView:decidePolicyForNavigationResponse:decisionHandler:")
    void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse, @Block VoidBlock1<WKNavigationResponsePolicy> decisionHandler);
    @Mapping("webView:didStartProvisionalNavigation:")
    void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Mapping("webView:didReceiveServerRedirectForProvisionalNavigation:")
    void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Mapping("webView:didFailProvisionalNavigation:withError:")
    void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Mapping("webView:didCommitNavigation:")
    void didCommitNavigation(WKWebView webView, WKNavigation navigation);
    @Mapping("webView:didFinishNavigation:")
    void didFinishNavigation(WKWebView webView, WKNavigation navigation);
    @Mapping("webView:didFailNavigation:withError:")
    void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Mapping("webView:didReceiveAuthenticationChallenge:completionHandler:")
    void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    
    /*<adapter>*/
    /*</adapter>*/
}
