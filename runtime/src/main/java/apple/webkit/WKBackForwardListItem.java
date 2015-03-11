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

@Library("WebKit") @Mapping("WKBackForwardListItem")
public class WKBackForwardListItem 
    extends NSObject 
     {

    
    
    public WKBackForwardListItem() {}
    
    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("title")
    public native String getTitle();
    @Mapping("initialURL")
    public native NSURL getInitialURL();
    
    
    
    
    
}
