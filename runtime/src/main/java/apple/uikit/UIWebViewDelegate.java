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


@Library("UIKit/UIKit.h") @Mapping("UIWebViewDelegate")
public interface UIWebViewDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("webView:shouldStartLoadWithRequest:navigationType:")
    boolean shouldStartLoad(UIWebView webView, NSURLRequest request, @Representing("UIWebViewNavigationType") long navigationType);
    @Mapping("webViewDidStartLoad:")
    void didStartLoad(UIWebView webView);
    @Mapping("webViewDidFinishLoad:")
    void didFinishLoad(UIWebView webView);
    @Mapping("webView:didFailLoadWithError:")
    void didFailLoad(UIWebView webView, NSError error);

    /*<adapter>*/
    /*</adapter>*/
}
