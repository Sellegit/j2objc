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

@Library("WebKit/WebKit.h") @Mapping("WKBackForwardList")
public class WKBackForwardList 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public WKBackForwardList() { }
    
    
    @Mapping("currentItem")
    public native WKBackForwardListItem getCurrentItem();
    @Mapping("backItem")
    public native WKBackForwardListItem getBackItem();
    @Mapping("forwardItem")
    public native WKBackForwardListItem getForwardItem();
    @Mapping("backList")
    public native NSArray<WKBackForwardListItem> getBackList();
    @Mapping("forwardList")
    public native NSArray<WKBackForwardListItem> getForwardList();
    
    
    
    @Mapping("itemAtIndex:")
    public native WKBackForwardListItem getItem(@MachineSizedSInt long index);
    
}
