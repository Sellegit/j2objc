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
public abstract class UIAccessibilityContainerAdapter 
    extends Object 
    implements UIAccessibilityContainer {

    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessibilityElements")
    public NSArray<UIAccessibilityElement> getAccessibilityElements() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAccessibilityElements:")
    public void setAccessibilityElements(NSArray<UIAccessibilityElement> v) { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("accessibilityElementCount")
    public @MachineSizedSInt long getAccessibilityElementCount() { throw new UnsupportedOperationException(); }
    @NotImplemented("accessibilityElementAtIndex:")
    public UIAccessibilityElement getAccessibilityElement(@MachineSizedSInt long index) { throw new UnsupportedOperationException(); }
    @NotImplemented("indexOfAccessibilityElement:")
    public @MachineSizedSInt long indexOfAccessibilityElement(Object element) { throw new UnsupportedOperationException(); }
    
}
