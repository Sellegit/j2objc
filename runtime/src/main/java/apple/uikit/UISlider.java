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

@Library("UIKit/UIKit.h") @Mapping("UISlider")
public class UISlider 
    extends UIControl 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public UISlider(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UISlider(NSCoder aDecoder) { }
    @Mapping("init")
    public UISlider() { }
    
    
    @Mapping("value")
    public native float getValue();
    @Mapping("setValue:")
    public native void setValue(float v);
    @Mapping("minimumValue")
    public native float getMinimumValue();
    @Mapping("setMinimumValue:")
    public native void setMinimumValue(float v);
    @Mapping("maximumValue")
    public native float getMaximumValue();
    @Mapping("setMaximumValue:")
    public native void setMaximumValue(float v);
    @Mapping("minimumValueImage")
    public native UIImage getMinimumValueImage();
    @Mapping("setMinimumValueImage:")
    public native void setMinimumValueImage(UIImage v);
    @Mapping("maximumValueImage")
    public native UIImage getMaximumValueImage();
    @Mapping("setMaximumValueImage:")
    public native void setMaximumValueImage(UIImage v);
    @Mapping("isContinuous")
    public native boolean isContinuous();
    @Mapping("setContinuous:")
    public native void setContinuous(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("minimumTrackTintColor")
    public native UIColor getMinimumTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setMinimumTrackTintColor:")
    public native void setMinimumTrackTintColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("maximumTrackTintColor")
    public native UIColor getMaximumTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setMaximumTrackTintColor:")
    public native void setMaximumTrackTintColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("thumbTintColor")
    public native UIColor getThumbTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    @Mapping("currentThumbImage")
    public native UIImage getCurrentThumbImage();
    @Mapping("currentMinimumTrackImage")
    public native UIImage getCurrentMinimumTrackImage();
    @Mapping("currentMaximumTrackImage")
    public native UIImage getCurrentMaximumTrackImage();
    
    
    
    @Mapping("setValue:animated:")
    public native void setValue(float value, boolean animated);
    @Mapping("setThumbImage:forState:")
    public native void setThumbImage(UIImage image, @Representing("UIControlState") long state);
    @Mapping("setMinimumTrackImage:forState:")
    public native void setMinimumTrackImage(UIImage image, @Representing("UIControlState") long state);
    @Mapping("setMaximumTrackImage:forState:")
    public native void setMaximumTrackImage(UIImage image, @Representing("UIControlState") long state);
    @Mapping("thumbImageForState:")
    public native UIImage getThumbImage(@Representing("UIControlState") long state);
    @Mapping("minimumTrackImageForState:")
    public native UIImage getMinimumTrackImage(@Representing("UIControlState") long state);
    @Mapping("maximumTrackImageForState:")
    public native UIImage getMaximumTrackImage(@Representing("UIControlState") long state);
    @Mapping("minimumValueImageRectForBounds:")
    public native CGRect getMinimumValueImageRect(CGRect bounds);
    @Mapping("maximumValueImageRectForBounds:")
    public native CGRect getMaximumValueImageRect(CGRect bounds);
    @Mapping("trackRectForBounds:")
    public native CGRect getTrackRect(CGRect bounds);
    @Mapping("thumbRectForBounds:trackRect:value:")
    public native CGRect getThumbRect(CGRect bounds, CGRect rect, float value);
    
}
