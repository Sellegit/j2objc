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


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public final class NSStringExtensions 
    extends NSExtensions 
     {

    
    
    private NSStringExtensions() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("sizeWithFont:")
    public static native CGSize getSize(NSString thiz, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("sizeWithFont:forWidth:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double width, @Representing("NSLineBreakMode") long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawAtPoint:withFont:")
    public static native CGSize draw(NSString thiz, CGPoint point, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawAtPoint:forWidth:withFont:lineBreakMode:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @Representing("NSLineBreakMode") long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("sizeWithFont:constrainedToSize:")
    public static native CGSize getSize(NSString thiz, UIFont font, CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("sizeWithFont:constrainedToSize:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, CGSize size, @Representing("NSLineBreakMode") long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawInRect:withFont:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawInRect:withFont:lineBreakMode:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font, @Representing("NSLineBreakMode") long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawInRect:withFont:lineBreakMode:alignment:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font, @Representing("NSLineBreakMode") long lineBreakMode, @Representing("NSTextAlignment") long alignment);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double minFontSize, Todo actualFontSize, @MachineSizedFloat double width, @Representing("NSLineBreakMode") long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double fontSize, @Representing("NSLineBreakMode") long lineBreakMode, @Representing("UIBaselineAdjustment") long baselineAdjustment);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ExtensionMapping("drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double minFontSize, Todo actualFontSize, @Representing("NSLineBreakMode") long lineBreakMode, @Representing("UIBaselineAdjustment") long baselineAdjustment);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("sizeWithAttributes:")
    public static native CGSize getSize(NSString thiz, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("drawAtPoint:withAttributes:")
    public static native void draw(NSString thiz, CGPoint point, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("drawInRect:withAttributes:")
    public static native void draw(NSString thiz, CGRect rect, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("drawWithRect:options:attributes:context:")
    public static native void draw(NSString thiz, CGRect rect, @Representing("NSStringDrawingOptions") long options, NSDictionary<?, ?> attributes, NSStringDrawingContext context);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("boundingRectWithSize:options:attributes:context:")
    public static native CGRect getBoundingRect(NSString thiz, CGSize size, @Representing("NSStringDrawingOptions") long options, NSDictionary<?, ?> attributes, NSStringDrawingContext context);
    
}
