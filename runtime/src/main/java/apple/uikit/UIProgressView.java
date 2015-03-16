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

@Library("UIKit/UIKit.h") @Mapping("UIProgressView")
public class UIProgressView 
    extends UIView 
    implements NSCoding {

    
    
    public UIProgressView() {}
    @Mapping("initWithProgressViewStyle:")
    public UIProgressView(@Representing("UIProgressViewStyle") @MachineSizedSInt long style) { }
    @Mapping("initWithFrame:")
    public UIProgressView(CGRect frame) { }
    
    
    @Mapping("progressViewStyle")
    public native @Representing("UIProgressViewStyle") @MachineSizedSInt long getProgressViewStyle();
    @Mapping("setProgressViewStyle:")
    public native void setProgressViewStyle(@Representing("UIProgressViewStyle") @MachineSizedSInt long v);
    @Mapping("progress")
    public native float getProgress();
    @Mapping("setProgress:")
    public native void setProgress(float v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("progressTintColor")
    public native UIColor getProgressTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setProgressTintColor:")
    public native void setProgressTintColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("trackTintColor")
    public native UIColor getTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTrackTintColor:")
    public native void setTrackTintColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("progressImage")
    public native UIImage getProgressImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setProgressImage:")
    public native void setProgressImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("trackImage")
    public native UIImage getTrackImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTrackImage:")
    public native void setTrackImage(UIImage v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setProgress:animated:")
    public native void setProgress(float progress, boolean animated);
    
}
