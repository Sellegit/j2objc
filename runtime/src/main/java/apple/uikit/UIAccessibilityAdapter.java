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
@Adapter
public abstract class UIAccessibilityAdapter 
    extends Object 
    implements UIAccessibility {

    
    
    
    @NotImplemented("isAccessibilityElement")
    public boolean isAccessibilityElement() { throw new UnsupportedOperationException(); }
    @Mapping("setIsAccessibilityElement:")
    public void setAccessibilityElement(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityLabel")
    public String getAccessibilityLabel() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityLabel:")
    public void setAccessibilityLabel(String v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityHint")
    public String getAccessibilityHint() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityHint:")
    public void setAccessibilityHint(String v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityValue")
    public String getAccessibilityValue() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityValue:")
    public void setAccessibilityValue(String v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityTraits")
    public UIAccessibilityTraits getAccessibilityTraits() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityTraits:")
    public void setAccessibilityTraits(UIAccessibilityTraits v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityFrame")
    public CGRect getAccessibilityFrame() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityFrame:")
    public void setAccessibilityFrame(CGRect v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("accessibilityPath")
    public UIBezierPath getAccessibilityPath() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAccessibilityPath:")
    public void setAccessibilityPath(UIBezierPath v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("accessibilityActivationPoint")
    public CGPoint getAccessibilityActivationPoint() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityActivationPoint:")
    public void setAccessibilityActivationPoint(CGPoint v) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityLanguage")
    public String getAccessibilityLanguage() { throw new UnsupportedOperationException(); }
    @Mapping("setAccessibilityLanguage:")
    public void setAccessibilityLanguage(String v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("accessibilityElementsHidden")
    public boolean isAccessibilityElementsHidden() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityElementsHidden:")
    public void setAccessibilityElementsHidden(boolean v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("accessibilityViewIsModal")
    public boolean isAccessibilityViewIsModal() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAccessibilityViewIsModal:")
    public void setAccessibilityViewIsModal(boolean v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("shouldGroupAccessibilityChildren")
    public boolean shouldGroupAccessibilityChildren() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setShouldGroupAccessibilityChildren:")
    public void setShouldGroupAccessibilityChildren(boolean v) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessibilityNavigationStyle")
    public @Representing("UIAccessibilityNavigationStyle") long getAccessibilityNavigationStyle() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityNavigationStyle:")
    public void setAccessibilityNavigationStyle(@Representing("UIAccessibilityNavigationStyle") long v) { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
