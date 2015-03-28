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
@Library("WebKit/WebKit.h") @Mapping("WKNavigationResponse")
public class WKNavigationResponse 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKNavigationResponse() { }

    
    @Mapping("isForMainFrame")
    public native boolean isForMainFrame();
    @Mapping("response")
    public native NSURLResponse getResponse();
    @Mapping("canShowMIMEType")
    public native boolean canShowMIMEType();

    
    


}
