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
public abstract class WKUIDelegateAdapter 
    extends Object 
    implements WKUIDelegate {

    
    
    


    
    
    @NotImplemented("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    public WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    public void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<String> completionHandler) { throw new UnsupportedOperationException(); }

}
