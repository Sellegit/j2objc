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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPopoverPresentationController")
public class UIPopoverPresentationController 
    extends UIPresentationController 
     {

    
    
    @Mapping("initWithPresentedViewController:presentingViewController:")
    public UIPopoverPresentationController(UIViewController presentedViewController, UIViewController presentingViewController) { }
    @Mapping("init")
    public UIPopoverPresentationController() { }
    
    
    @Mapping("delegate")
    public native UIPopoverPresentationControllerDelegate getPopoverPresentationDelegate();
    @Mapping("setDelegate:")
    public native void setPopoverPresentationDelegate(UIPopoverPresentationControllerDelegate v);
    @Mapping("permittedArrowDirections")
    public native @Representing("UIPopoverArrowDirection") @MachineSizedUInt long getPermittedArrowDirections();
    @Mapping("setPermittedArrowDirections:")
    public native void setPermittedArrowDirections(@Representing("UIPopoverArrowDirection") @MachineSizedUInt long v);
    @Mapping("sourceView")
    public native UIView getSourceView();
    @Mapping("setSourceView:")
    public native void setSourceView(UIView v);
    @Mapping("sourceRect")
    public native CGRect getSourceRect();
    @Mapping("setSourceRect:")
    public native void setSourceRect(CGRect v);
    @Mapping("barButtonItem")
    public native UIBarButtonItem getBarButtonItem();
    @Mapping("setBarButtonItem:")
    public native void setBarButtonItem(UIBarButtonItem v);
    @Mapping("arrowDirection")
    public native @Representing("UIPopoverArrowDirection") @MachineSizedUInt long getArrowDirection();
    @Mapping("passthroughViews")
    public native NSArray<UIView> getPassthroughViews();
    @Mapping("setPassthroughViews:")
    public native void setPassthroughViews(NSArray<UIView> v);
    @Mapping("backgroundColor")
    public native UIColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Mapping("popoverLayoutMargins")
    public native UIEdgeInsets getPopoverLayoutMargins();
    @Mapping("setPopoverLayoutMargins:")
    public native void setPopoverLayoutMargins(UIEdgeInsets v);
    
    
    
    
    
}
