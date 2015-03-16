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





@Library("UIKit/UIKit.h") @Mapping("UIAccessibilityAction")
public interface UIAccessibilityAction 
     {

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("accessibilityCustomActions")
    NSArray<UIAccessibilityCustomAction> getAccessibilityCustomActions();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityCustomActions:")
    void setAccessibilityCustomActions(NSArray<UIAccessibilityCustomAction> v);
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("accessibilityActivate")
    boolean activate();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("accessibilityIncrement")
    void increment();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("accessibilityDecrement")
    void decrement();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("accessibilityScroll:")
    boolean scroll(@Representing("UIAccessibilityScrollDirection") @MachineSizedSInt long direction);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityPerformEscape")
    boolean performEscape();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("accessibilityPerformMagicTap")
    boolean performMagicTap();
    
    /*<adapter>*/
    /*</adapter>*/
}
