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


@Library("UIKit/UIKit.h") @Mapping("UIAccessibilityContainer")
public interface UIAccessibilityContainer 
     {

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("accessibilityElements")
    NSArray<UIAccessibilityElement> getAccessibilityElements();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityElements:")
    void setAccessibilityElements(NSArray<UIAccessibilityElement> v);

    
    @Mapping("accessibilityElementCount")
    @MachineSizedSInt long getAccessibilityElementCount();
    @Mapping("accessibilityElementAtIndex:")
    UIAccessibilityElement getAccessibilityElement(@MachineSizedSInt long index);
    @Mapping("indexOfAccessibilityElement:")
    @MachineSizedSInt long indexOfAccessibilityElement(Object element);

    /*<adapter>*/
    /*</adapter>*/
}
