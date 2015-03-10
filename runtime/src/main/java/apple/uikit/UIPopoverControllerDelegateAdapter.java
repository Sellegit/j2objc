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
public abstract class UIPopoverControllerDelegateAdapter 
    extends Object 
    implements UIPopoverControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("popoverControllerShouldDismissPopover:")
    public boolean shouldDismiss(UIPopoverController popoverController) { throw new UnsupportedOperationException(); }
    @NotImplemented("popoverControllerDidDismissPopover:")
    public void didDismiss(UIPopoverController popoverController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("popoverController:willRepositionPopoverToRect:inView:")
    public void willReposition(UIPopoverController popoverController, CGRect rect, Todo view) { throw new UnsupportedOperationException(); }
    
}
