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
public final class NSValueExtensions 
    extends NSExtensions 
     {

    
    
    private NSValueExtensions() {}
    
    
    
    
    
    
    @ExtensionMapping("CGPointValue")
    public static native CGPoint getPointValue(NSValue thiz);
    @ExtensionMapping("CGVectorValue")
    public static native CGVector getVectorValue(NSValue thiz);
    @ExtensionMapping("CGSizeValue")
    public static native CGSize getSizeValue(NSValue thiz);
    @ExtensionMapping("CGRectValue")
    public static native CGRect getRectValue(NSValue thiz);
    @ExtensionMapping("CGAffineTransformValue")
    public static native CGAffineTransform getAffineTransformValue(NSValue thiz);
    @ExtensionMapping("UIEdgeInsetsValue")
    public static native UIEdgeInsets getEdgeInsetsValue(NSValue thiz);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ExtensionMapping("UIOffsetValue")
    public static native UIOffset getOffsetValue(NSValue thiz);
    @Mapping("valueWithCGPoint:")
    public static native NSValue create(CGPoint point);
    @Mapping("valueWithCGVector:")
    public static native NSValue create(CGVector vector);
    @Mapping("valueWithCGSize:")
    public static native NSValue create(CGSize size);
    @Mapping("valueWithCGRect:")
    public static native NSValue create(CGRect rect);
    @Mapping("valueWithCGAffineTransform:")
    public static native NSValue create(CGAffineTransform transform);
    @Mapping("valueWithUIEdgeInsets:")
    public static native NSValue create(UIEdgeInsets insets);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("valueWithUIOffset:")
    public static native NSValue create(UIOffset insets);
    
}
