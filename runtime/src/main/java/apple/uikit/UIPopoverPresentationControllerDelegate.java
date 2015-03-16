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





@Library("UIKit/UIKit.h") @Mapping("UIPopoverPresentationControllerDelegate")
public interface UIPopoverPresentationControllerDelegate 
    extends UIAdaptivePresentationControllerDelegate {

    
    
    
    
    
    @Mapping("prepareForPopoverPresentation:")
    void prepareForPopoverPresentation(UIPopoverPresentationController popoverPresentationController);
    @Mapping("popoverPresentationControllerShouldDismissPopover:")
    boolean shouldDismissPopover(UIPopoverPresentationController popoverPresentationController);
    @Mapping("popoverPresentationControllerDidDismissPopover:")
    void didDismissPopover(UIPopoverPresentationController popoverPresentationController);
    @Mapping("popoverPresentationController:willRepositionPopoverToRect:inView:")
    void willRepositionPopover(UIPopoverPresentationController popoverPresentationController, CGRect rect, Todo view);
    
    /*<adapter>*/
    /*</adapter>*/
}
