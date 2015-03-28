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
@Library("UIKit/UIKit.h") @Mapping("UISwitch")
public class UISwitch 
    extends UIControl 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public UISwitch(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UISwitch(NSCoder aDecoder) { }
    @Mapping("init")
    public UISwitch() { }

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("onTintColor")
    public native UIColor getOnTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setOnTintColor:")
    public native void setOnTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("thumbTintColor")
    public native UIColor getThumbTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("onImage")
    public native UIImage getOnImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setOnImage:")
    public native void setOnImage(UIImage v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("offImage")
    public native UIImage getOffImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setOffImage:")
    public native void setOffImage(UIImage v);
    @Mapping("isOn")
    public native boolean isOn();
    @Mapping("setOn:")
    public native void setOn(boolean v);

    
    
    @Mapping("setOn:animated:")
    public native void setOn(boolean on, boolean animated);

}
