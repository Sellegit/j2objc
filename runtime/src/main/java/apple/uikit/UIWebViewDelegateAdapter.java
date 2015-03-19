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
public abstract class UIWebViewDelegateAdapter 
    extends Object 
    implements UIWebViewDelegate {

    
    
    
    
    
    
    
    @NotImplemented("webView:shouldStartLoadWithRequest:navigationType:")
    public boolean shouldStartLoad(UIWebView webView, NSURLRequest request, @Representing("UIWebViewNavigationType") long navigationType) { throw new UnsupportedOperationException(); }
    @NotImplemented("webViewDidStartLoad:")
    public void didStartLoad(UIWebView webView) { throw new UnsupportedOperationException(); }
    @NotImplemented("webViewDidFinishLoad:")
    public void didFinishLoad(UIWebView webView) { throw new UnsupportedOperationException(); }
    @NotImplemented("webView:didFailLoadWithError:")
    public void didFailLoad(UIWebView webView, NSError error) { throw new UnsupportedOperationException(); }
    
}
