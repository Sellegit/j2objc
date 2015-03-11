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
public abstract class UIAccessibilityFocusAdapter 
    extends Object 
    implements UIAccessibilityFocus {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityElementDidBecomeFocused")
    public void didBecomeFocused() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityElementDidLoseFocus")
    public void didLoseFocus() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityElementIsFocused")
    public boolean isFocused() { throw new UnsupportedOperationException(); }
    
}
