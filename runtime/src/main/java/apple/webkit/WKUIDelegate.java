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





@Library("WebKit") @Mapping("WKUIDelegate")
public interface WKUIDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures);
    @Mapping("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler);
    @Mapping("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler);
    @Mapping("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<String> completionHandler);
    
    /*<adapter>*/
    /*</adapter>*/
}
