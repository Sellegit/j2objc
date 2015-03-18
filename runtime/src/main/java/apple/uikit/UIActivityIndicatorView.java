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
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIActivityIndicatorView")
public class UIActivityIndicatorView 
    extends UIView 
    implements NSCoding {

    
    
    @Mapping("initWithActivityIndicatorStyle:")
    public UIActivityIndicatorView(@Representing("UIActivityIndicatorViewStyle") @MachineSizedSInt long style) { }
    @Mapping("initWithFrame:")
    public UIActivityIndicatorView(CGRect frame) { }
    @Mapping("init")
    public UIActivityIndicatorView() { }
    
    
    @Mapping("activityIndicatorViewStyle")
    public native @Representing("UIActivityIndicatorViewStyle") @MachineSizedSInt long getActivityIndicatorViewStyle();
    @Mapping("setActivityIndicatorViewStyle:")
    public native void setActivityIndicatorViewStyle(@Representing("UIActivityIndicatorViewStyle") @MachineSizedSInt long v);
    @Mapping("hidesWhenStopped")
    public native boolean hidesWhenStopped();
    @Mapping("setHidesWhenStopped:")
    public native void setHidesWhenStopped(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("color")
    public native UIColor getColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setColor:")
    public native void setColor(UIColor v);
    
    
    
    @Mapping("startAnimating")
    public native void startAnimating();
    @Mapping("stopAnimating")
    public native void stopAnimating();
    @Mapping("isAnimating")
    public native boolean isAnimating();
    
}
