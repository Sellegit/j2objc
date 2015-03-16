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
 * @since Available in iOS 3.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIAccessibilityElement")
public class UIAccessibilityElement 
    extends NSObject 
    implements UIAccessibilityIdentification {

    
    
    public UIAccessibilityElement() {}
    @Mapping("initWithAccessibilityContainer:")
    public UIAccessibilityElement(Object container) { }
    
    
    @Mapping("accessibilityContainer")
    public native UIAccessibilityContainer getAccessibilityContainer();
    @Mapping("setAccessibilityContainer:")
    public native void setAccessibilityContainer(UIAccessibilityContainer v);
    @Mapping("isAccessibilityElement")
    public native boolean isAccessibilityElement();
    @Mapping("setIsAccessibilityElement:")
    public native void setAccessibilityElement(boolean v);
    @Mapping("accessibilityLabel")
    public native String getAccessibilityLabel();
    @Mapping("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String v);
    @Mapping("accessibilityHint")
    public native String getAccessibilityHint();
    @Mapping("setAccessibilityHint:")
    public native void setAccessibilityHint(String v);
    @Mapping("accessibilityValue")
    public native String getAccessibilityValue();
    @Mapping("setAccessibilityValue:")
    public native void setAccessibilityValue(String v);
    @Mapping("accessibilityFrame")
    public native CGRect getAccessibilityFrame();
    @Mapping("setAccessibilityFrame:")
    public native void setAccessibilityFrame(CGRect v);
    @Mapping("accessibilityTraits")
    public native UIAccessibilityTraits getAccessibilityTraits();
    @Mapping("setAccessibilityTraits:")
    public native void setAccessibilityTraits(UIAccessibilityTraits v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    
    
    
    
    
}
