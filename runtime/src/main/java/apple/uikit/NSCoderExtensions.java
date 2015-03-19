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
public final class NSCoderExtensions 
    extends NSExtensions 
     {

    
    
    private NSCoderExtensions() {}
    
    
    
    
    
    
    @ExtensionMapping("encodeCGPoint:forKey:")
    public static native void encodeCGPoint(NSCoder thiz, CGPoint point, String key);
    @ExtensionMapping("encodeCGVector:forKey:")
    public static native void encodeCGVector(NSCoder thiz, CGVector vector, String key);
    @ExtensionMapping("encodeCGSize:forKey:")
    public static native void encodeCGSize(NSCoder thiz, CGSize size, String key);
    @ExtensionMapping("encodeCGRect:forKey:")
    public static native void encodeCGRect(NSCoder thiz, CGRect rect, String key);
    @ExtensionMapping("encodeCGAffineTransform:forKey:")
    public static native void encodeCGAffineTransform(NSCoder thiz, CGAffineTransform transform, String key);
    @ExtensionMapping("encodeUIEdgeInsets:forKey:")
    public static native void encodeUIEdgeInsets(NSCoder thiz, UIEdgeInsets insets, String key);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ExtensionMapping("encodeUIOffset:forKey:")
    public static native void encodeUIOffset(NSCoder thiz, UIOffset offset, String key);
    @ExtensionMapping("decodeCGPointForKey:")
    public static native CGPoint decodeCGPoint(NSCoder thiz, String key);
    @ExtensionMapping("decodeCGVectorForKey:")
    public static native CGVector decodeCGVector(NSCoder thiz, String key);
    @ExtensionMapping("decodeCGSizeForKey:")
    public static native CGSize decodeCGSize(NSCoder thiz, String key);
    @ExtensionMapping("decodeCGRectForKey:")
    public static native CGRect decodeCGRect(NSCoder thiz, String key);
    @ExtensionMapping("decodeCGAffineTransformForKey:")
    public static native CGAffineTransform decodeCGAffineTransform(NSCoder thiz, String key);
    @ExtensionMapping("decodeUIEdgeInsetsForKey:")
    public static native UIEdgeInsets decodeUIEdgeInsets(NSCoder thiz, String key);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ExtensionMapping("decodeUIOffsetForKey:")
    public static native UIOffset decodeUIOffset(NSCoder thiz, String key);
    
}
