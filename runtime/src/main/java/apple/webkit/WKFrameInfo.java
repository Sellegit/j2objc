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
@Library("WebKit/WebKit.h") @Mapping("WKFrameInfo")
public class WKFrameInfo 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public WKFrameInfo() { }

    
    @Mapping("isMainFrame")
    public native boolean isMainFrame();
    @Mapping("request")
    public native NSURLRequest getRequest();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
