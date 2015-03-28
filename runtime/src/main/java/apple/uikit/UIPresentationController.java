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
@Library("UIKit/UIKit.h") @Mapping("UIPresentationController")
public class UIPresentationController 
    extends NSObject 
    implements UIAppearanceContainer, UITraitEnvironment {

    
    
    @Mapping("initWithPresentedViewController:presentingViewController:")
    public UIPresentationController(UIViewController presentedViewController, UIViewController presentingViewController) { }
    @Mapping("init")
    public UIPresentationController() { }

    
    @Mapping("presentingViewController")
    public native UIViewController getPresentingViewController();
    @Mapping("presentedViewController")
    public native UIViewController getPresentedViewController();
    @Mapping("presentationStyle")
    public native @Representing("UIModalPresentationStyle") long getPresentationStyle();
    @Mapping("containerView")
    public native UIView getContainerView();
    @Mapping("delegate")
    public native UIAdaptivePresentationControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIAdaptivePresentationControllerDelegate v);
    @Mapping("overrideTraitCollection")
    public native UITraitCollection getOverrideTraitCollection();
    @Mapping("setOverrideTraitCollection:")
    public native void setOverrideTraitCollection(UITraitCollection v);
    @Mapping("traitCollection")
    public native UITraitCollection getTraitCollection();

    
    
    @Mapping("adaptivePresentationStyle")
    public native @Representing("UIModalPresentationStyle") long getAdaptivePresentationStyle();
    @Mapping("containerViewWillLayoutSubviews")
    public native void containerViewWillLayoutSubviews();
    @Mapping("containerViewDidLayoutSubviews")
    public native void containerViewDidLayoutSubviews();
    @Mapping("presentedView")
    public native UIView getPresentedView();
    @Mapping("frameOfPresentedViewInContainerView")
    public native CGRect getFrameOfPresentedViewInContainerView();
    @Mapping("shouldPresentInFullscreen")
    public native boolean shouldPresentInFullscreen();
    @Mapping("shouldRemovePresentersView")
    public native boolean shouldRemovePresentersView();
    @Mapping("presentationTransitionWillBegin")
    public native void presentationTransitionWillBegin();
    @Mapping("presentationTransitionDidEnd:")
    public native void presentationTransitionDidEnd(boolean completed);
    @Mapping("dismissalTransitionWillBegin")
    public native void dismissalTransitionWillBegin();
    @Mapping("dismissalTransitionDidEnd:")
    public native void dismissalTransitionDidEnd(boolean completed);
    @Mapping("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

}
