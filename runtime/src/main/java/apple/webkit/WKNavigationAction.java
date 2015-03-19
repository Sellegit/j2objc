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

@Library("WebKit/WebKit.h") @Mapping("WKNavigationAction")
public class WKNavigationAction 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKNavigationAction() { }
    
    
    @Mapping("sourceFrame")
    public native WKFrameInfo getSourceFrame();
    @Mapping("targetFrame")
    public native WKFrameInfo getTargetFrame();
    @Mapping("navigationType")
    public native @Representing("WKNavigationType") long getNavigationType();
    @Mapping("request")
    public native NSURLRequest getRequest();
    
    
    
    
    
}
