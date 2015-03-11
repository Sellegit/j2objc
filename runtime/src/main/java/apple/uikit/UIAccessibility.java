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





@Library("UIKit") @Mapping("UIAccessibility")
public interface UIAccessibility 
     {

    
    
    @Mapping("isAccessibilityElement")
    boolean isAccessibilityElement();
    @Mapping("setIsAccessibilityElement:")
    void setAccessibilityElement(boolean v);
    @Mapping("accessibilityLabel")
    String getAccessibilityLabel();
    @Mapping("setAccessibilityLabel:")
    void setAccessibilityLabel(String v);
    @Mapping("accessibilityHint")
    String getAccessibilityHint();
    @Mapping("setAccessibilityHint:")
    void setAccessibilityHint(String v);
    @Mapping("accessibilityValue")
    String getAccessibilityValue();
    @Mapping("setAccessibilityValue:")
    void setAccessibilityValue(String v);
    @Mapping("accessibilityTraits")
    UIAccessibilityTraits getAccessibilityTraits();
    @Mapping("setAccessibilityTraits:")
    void setAccessibilityTraits(UIAccessibilityTraits v);
    @Mapping("accessibilityFrame")
    CGRect getAccessibilityFrame();
    @Mapping("setAccessibilityFrame:")
    void setAccessibilityFrame(CGRect v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("accessibilityPath")
    UIBezierPath getAccessibilityPath();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAccessibilityPath:")
    void setAccessibilityPath(UIBezierPath v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityActivationPoint")
    CGPoint getAccessibilityActivationPoint();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityActivationPoint:")
    void setAccessibilityActivationPoint(CGPoint v);
    @Mapping("accessibilityLanguage")
    String getAccessibilityLanguage();
    @Mapping("setAccessibilityLanguage:")
    void setAccessibilityLanguage(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityElementsHidden")
    boolean isAccessibilityElementsHidden();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityElementsHidden:")
    void setAccessibilityElementsHidden(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityViewIsModal")
    boolean isAccessibilityViewIsModal();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityViewIsModal:")
    void setAccessibilityViewIsModal(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldGroupAccessibilityChildren")
    boolean shouldGroupAccessibilityChildren();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setShouldGroupAccessibilityChildren:")
    void setShouldGroupAccessibilityChildren(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("accessibilityNavigationStyle")
    @Representing("UIAccessibilityNavigationStyle") @MachineSizedSInt long getAccessibilityNavigationStyle();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityNavigationStyle:")
    void setAccessibilityNavigationStyle(@Representing("UIAccessibilityNavigationStyle") @MachineSizedSInt long v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
