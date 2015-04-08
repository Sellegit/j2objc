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
@Library("UIKit/UIKit.h") @Mapping("NSAttributedString")
public final class NSAttributedStringExtensions 
    extends NSExtensions 
     {

    
    
    private NSAttributedStringExtensions() {}

    


    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("dataFromRange:documentAttributes:error:")
    public static native NSData getData(NSAttributedString thiz, NSRange range, NSDictionary<?, ?> dict, Todo error);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ExtensionMapping("fileWrapperFromRange:documentAttributes:error:")
    public static native NSFileWrapper getFileWrapper(NSAttributedString thiz, NSRange range, NSDictionary<?, ?> dict, Todo error);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ExtensionMapping("size")
    public static native CGSize getSize(NSAttributedString thiz);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ExtensionMapping("drawAtPoint:")
    public static native void draw(NSAttributedString thiz, CGPoint point);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ExtensionMapping("drawInRect:")
    public static native void draw(NSAttributedString thiz, CGRect rect);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ExtensionMapping("drawWithRect:options:context:")
    public static native void draw(NSAttributedString thiz, CGRect rect, @Representing("NSStringDrawingOptions") long options, NSStringDrawingContext context);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ExtensionMapping("boundingRectWithSize:options:context:")
    public static native CGRect getBoundingRect(NSAttributedString thiz, CGSize size, @Representing("NSStringDrawingOptions") long options, NSStringDrawingContext context);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("attributedStringWithAttachment:")
    public static native NSAttributedString create(NSTextAttachment attachment);

}
