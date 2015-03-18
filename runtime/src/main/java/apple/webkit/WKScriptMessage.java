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

@Library("WebKit/WebKit.h") @Mapping("WKScriptMessage")
public class WKScriptMessage 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKScriptMessage() { }
    
    
    @Mapping("body")
    public native Object getBody();
    @Mapping("webView")
    public native WKWebView getWebView();
    @Mapping("frameInfo")
    public native WKFrameInfo getFrameInfo();
    @Mapping("name")
    public native String getName();
    
    
    
    
    
}
