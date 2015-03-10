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
@Library("UIKit")
public final class NSStringExtensions 
    extends NSExtensions 
     {

    
    
    private NSStringExtensions() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sizeWithFont:")
    public static native CGSize getSize(NSString thiz, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sizeWithFont:forWidth:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double width, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawAtPoint:withFont:")
    public static native CGSize draw(NSString thiz, CGPoint point, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawAtPoint:forWidth:withFont:lineBreakMode:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sizeWithFont:constrainedToSize:")
    public static native CGSize getSize(NSString thiz, UIFont font, CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sizeWithFont:constrainedToSize:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, CGSize size, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawInRect:withFont:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawInRect:withFont:lineBreakMode:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawInRect:withFont:lineBreakMode:alignment:")
    public static native CGSize draw(NSString thiz, CGRect rect, UIFont font, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode, @Representing("NSTextAlignment") @MachineSizedSInt long alignment);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    public static native CGSize getSize(NSString thiz, UIFont font, @MachineSizedFloat double minFontSize, Todo actualFontSize, @MachineSizedFloat double width, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double fontSize, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode, @Representing("UIBaselineAdjustment") @MachineSizedSInt long baselineAdjustment);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    public static native CGSize draw(NSString thiz, CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double minFontSize, Todo actualFontSize, @Representing("NSLineBreakMode") @MachineSizedSInt long lineBreakMode, @Representing("UIBaselineAdjustment") @MachineSizedSInt long baselineAdjustment);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sizeWithAttributes:")
    public static native CGSize getSize(NSString thiz, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("drawAtPoint:withAttributes:")
    public static native void draw(NSString thiz, CGPoint point, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("drawInRect:withAttributes:")
    public static native void draw(NSString thiz, CGRect rect, NSDictionary<?, ?> attrs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("drawWithRect:options:attributes:context:")
    public static native void draw(NSString thiz, CGRect rect, @Representing("NSStringDrawingOptions") @MachineSizedSInt long options, NSDictionary<?, ?> attributes, NSStringDrawingContext context);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("boundingRectWithSize:options:attributes:context:")
    public static native CGRect getBoundingRect(NSString thiz, CGSize size, @Representing("NSStringDrawingOptions") @MachineSizedSInt long options, NSDictionary<?, ?> attributes, NSStringDrawingContext context);
    
}
