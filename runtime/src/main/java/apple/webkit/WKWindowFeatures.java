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

@Library("WebKit/WebKit.h") @Mapping("WKWindowFeatures")
public class WKWindowFeatures 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKWindowFeatures() { }
    
    
    @Mapping("menuBarVisibility")
    public native NSNumber menuBarVisibility();
    @Mapping("statusBarVisibility")
    public native NSNumber statusBarVisibility();
    @Mapping("toolbarsVisibility")
    public native NSNumber toolbarsVisibility();
    @Mapping("allowsResizing")
    public native NSNumber getAllowsResizing();
    @Mapping("x")
    public native NSNumber x();
    @Mapping("y")
    public native NSNumber y();
    @Mapping("width")
    public native NSNumber width();
    @Mapping("height")
    public native NSNumber height();
    
    
    
    
    
}
