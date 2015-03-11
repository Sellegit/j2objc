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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class WKNavigationDelegateAdapter 
    extends Object 
    implements WKNavigationDelegate {

    
    
    
    
    
    
    
    @NotImplemented("webView:decidePolicyForNavigationAction:decisionHandler:")
    public void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, @Block VoidBlock1<WKNavigationActionPolicy> decisionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:decidePolicyForNavigationResponse:decisionHandler:")
    public void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse, @Block VoidBlock1<WKNavigationResponsePolicy> decisionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didStartProvisionalNavigation:")
    public void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didReceiveServerRedirectForProvisionalNavigation:")
    public void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didFailProvisionalNavigation:withError:")
    public void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didCommitNavigation:")
    public void didCommitNavigation(WKWebView webView, WKNavigation navigation) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didFinishNavigation:")
    public void didFinishNavigation(WKWebView webView, WKNavigation navigation) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didFailNavigation:withError:")
    public void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didReceiveAuthenticationChallenge:completionHandler:")
    public void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler) { throw new UnsupportedOperationException(); }
    
}
