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
public abstract class UIAccessibilityActionAdapter 
    extends Object 
    implements UIAccessibilityAction {

    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessibilityCustomActions")
    public NSArray<UIAccessibilityCustomAction> getAccessibilityCustomActions() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityCustomActions:")
    public void setAccessibilityCustomActions(NSArray<UIAccessibilityCustomAction> v) { throw new UnsupportedOperationException(); }

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("accessibilityActivate")
    public boolean activate() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityIncrement")
    public void increment() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityDecrement")
    public void decrement() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.2 and later.
     */
    @NotImplemented("accessibilityScroll:")
    public boolean scroll(@Representing("UIAccessibilityScrollDirection") long direction) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("accessibilityPerformEscape")
    public boolean performEscape() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("accessibilityPerformMagicTap")
    public boolean performMagicTap() { throw new UnsupportedOperationException(); }

}
