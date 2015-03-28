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


@Library("UIKit/UIKit.h") @Mapping("UIPopoverControllerDelegate")
public interface UIPopoverControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("popoverControllerShouldDismissPopover:")
    boolean shouldDismiss(UIPopoverController popoverController);
    @Mapping("popoverControllerDidDismissPopover:")
    void didDismiss(UIPopoverController popoverController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("popoverController:willRepositionPopoverToRect:inView:")
    void willReposition(UIPopoverController popoverController, CGRect rect, Todo view);

    /*<adapter>*/
    /*</adapter>*/
}
