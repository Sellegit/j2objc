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
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIStepper")
public class UIStepper 
    extends UIControl 
     {

    
    
    public UIStepper() {}
    @Mapping("initWithFrame:")
    public UIStepper(CGRect frame) { }
    
    
    @Mapping("isContinuous")
    public native boolean isContinuous();
    @Mapping("setContinuous:")
    public native void setContinuous(boolean v);
    @Mapping("autorepeat")
    public native boolean isAutorepeat();
    @Mapping("setAutorepeat:")
    public native void setAutorepeat(boolean v);
    @Mapping("wraps")
    public native boolean isWraps();
    @Mapping("setWraps:")
    public native void setWraps(boolean v);
    @Mapping("value")
    public native double getValue();
    @Mapping("setValue:")
    public native void setValue(double v);
    @Mapping("minimumValue")
    public native double getMinimumValue();
    @Mapping("setMinimumValue:")
    public native void setMinimumValue(double v);
    @Mapping("maximumValue")
    public native double getMaximumValue();
    @Mapping("setMaximumValue:")
    public native void setMaximumValue(double v);
    @Mapping("stepValue")
    public native double getStepValue();
    @Mapping("setStepValue:")
    public native void setStepValue(double v);
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
    @Mapping("setBackgroundImage:forState:")
    public native void setBackgroundImage(UIImage image, @Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("backgroundImageForState:")
    public native UIImage getBackgroundImage(@Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setDividerImage(UIImage image, @Representing("UIControlState") @MachineSizedUInt long leftState, @Representing("UIControlState") @MachineSizedUInt long rightState);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("dividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage getDividerImage(@Representing("UIControlState") @MachineSizedUInt long leftState, @Representing("UIControlState") @MachineSizedUInt long rightState);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setIncrementImage:forState:")
    public native void setIncrementImage(UIImage image, @Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("incrementImageForState:")
    public native UIImage getIncrementImage(@Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setDecrementImage:forState:")
    public native void setDecrementImage(UIImage image, @Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("decrementImageForState:")
    public native UIImage getDecrementImage(@Representing("UIControlState") @MachineSizedUInt long state);
    
}
