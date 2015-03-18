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
public class UIContentSizeCategory 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryExtraSmall")
    public static native NSString ExtraSmallValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategorySmall")
    public static native NSString SmallValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryMedium")
    public static native NSString MediumValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryLarge")
    public static native NSString LargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryExtraLarge")
    public static native NSString ExtraLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryExtraExtraLarge")
    public static native NSString ExtraExtraLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryExtraExtraExtraLarge")
    public static native NSString ExtraExtraExtraLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryAccessibilityMedium")
    public static native NSString AccessibilityMediumValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryAccessibilityLarge")
    public static native NSString AccessibilityLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryAccessibilityExtraLarge")
    public static native NSString AccessibilityExtraLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryAccessibilityExtraExtraLarge")
    public static native NSString AccessibilityExtraExtraLargeValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIContentSizeCategoryAccessibilityExtraExtraExtraLarge")
    public static native NSString AccessibilityExtraExtraExtraLargeValue();
    
}
