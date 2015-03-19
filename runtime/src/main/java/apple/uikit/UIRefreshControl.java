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



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIRefreshControl")
public class UIRefreshControl 
    extends UIControl 
     {

    
    
    public UIRefreshControl() {}
    @Mapping("initWithFrame:")
    public UIRefreshControl(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIRefreshControl(NSCoder aDecoder) { }
    
    
    @Mapping("isRefreshing")
    public native boolean isRefreshing();
    @Mapping("tintColor")
    public native UIColor getTintColor();
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    @Mapping("attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Mapping("setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("beginRefreshing")
    public native void beginRefreshing();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("endRefreshing")
    public native void endRefreshing();
    
}
