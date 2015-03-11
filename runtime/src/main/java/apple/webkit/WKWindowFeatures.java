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

@Library("WebKit") @Mapping("WKWindowFeatures")
public class WKWindowFeatures 
    extends NSObject 
     {

    
    
    public WKWindowFeatures() {}
    
    
    @Mapping("menuBarVisibility")
    protected native NSNumber menuBarVisibility();
    @Mapping("statusBarVisibility")
    protected native NSNumber statusBarVisibility();
    @Mapping("toolbarsVisibility")
    protected native NSNumber toolbarsVisibility();
    @Mapping("allowsResizing")
    protected native NSNumber getAllowsResizing();
    @Mapping("x")
    protected native NSNumber x();
    @Mapping("y")
    protected native NSNumber y();
    @Mapping("width")
    protected native NSNumber width();
    @Mapping("height")
    protected native NSNumber height();
    
    
    
    
    
}
