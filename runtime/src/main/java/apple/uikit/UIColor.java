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

@Library("UIKit/UIKit.h") @Mapping("UIColor")
public class UIColor 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithRed:green:blue:alpha:")
    public UIColor(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha) { }
    @Mapping("initWithCGColor:")
    public UIColor(CGColor cgColor) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithCIColor:")
    public UIColor(CIColor ciColor) { }
    @Mapping("init")
    public UIColor() { }
    
    
    @Mapping("CGColor")
    public native CGColor getCGColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("CIColor")
    public native CIColor getCIColor();
    
    
    
    @Mapping("set")
    public native void setFillAndStroke();
    @Mapping("setFill")
    public native void setFill();
    @Mapping("setStroke")
    public native void setStroke();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("getWhite:alpha:")
    public native boolean getWhiteAlpha(Todo white, Todo alpha);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("getHue:saturation:brightness:alpha:")
    public native boolean getHSBA(Todo hue, Todo saturation, Todo brightness, Todo alpha);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("getRed:green:blue:alpha:")
    public native boolean getRGBA(Todo red, Todo green, Todo blue, Todo alpha);
    @Mapping("colorWithAlphaComponent:")
    public native UIColor addAlpha(@MachineSizedFloat double alpha);
    @Mapping("colorWithWhite:alpha:")
    public static native UIColor fromWhiteAlpha(@MachineSizedFloat double white, @MachineSizedFloat double alpha);
    @Mapping("colorWithHue:saturation:brightness:alpha:")
    public static native UIColor fromHSBA(@MachineSizedFloat double hue, @MachineSizedFloat double saturation, @MachineSizedFloat double brightness, @MachineSizedFloat double alpha);
    @Mapping("colorWithRed:green:blue:alpha:")
    public static native UIColor fromRGBA(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    @Mapping("colorWithCGColor:")
    public static native UIColor fromCGColor(CGColor cgColor);
    @Mapping("colorWithPatternImage:")
    public static native UIColor fromPatternImage(UIImage image);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("colorWithCIColor:")
    public static native UIColor fromCIColor(CIColor ciColor);
    @Mapping("blackColor")
    public static native UIColor black();
    @Mapping("darkGrayColor")
    public static native UIColor darkGray();
    @Mapping("lightGrayColor")
    public static native UIColor lightGray();
    @Mapping("whiteColor")
    public static native UIColor white();
    @Mapping("grayColor")
    public static native UIColor gray();
    @Mapping("redColor")
    public static native UIColor red();
    @Mapping("greenColor")
    public static native UIColor green();
    @Mapping("blueColor")
    public static native UIColor blue();
    @Mapping("cyanColor")
    public static native UIColor cyan();
    @Mapping("yellowColor")
    public static native UIColor yellow();
    @Mapping("magentaColor")
    public static native UIColor magenta();
    @Mapping("orangeColor")
    public static native UIColor orange();
    @Mapping("purpleColor")
    public static native UIColor purple();
    @Mapping("brownColor")
    public static native UIColor brown();
    @Mapping("clearColor")
    public static native UIColor clear();
    @Mapping("lightTextColor")
    public static native UIColor lightText();
    @Mapping("darkTextColor")
    public static native UIColor darkText();
    @Mapping("groupTableViewBackgroundColor")
    public static native UIColor groupTableViewBackground();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackground();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("scrollViewTexturedBackgroundColor")
    public static native UIColor scrollViewTexturedBackground();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("underPageBackgroundColor")
    public static native UIColor underPageBackground();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
