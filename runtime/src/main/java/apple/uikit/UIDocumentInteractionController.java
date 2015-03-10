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
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit") @Mapping("UIDocumentInteractionController")
public class UIDocumentInteractionController 
    extends NSObject 
    implements UIActionSheetDelegate {

    
    
    public UIDocumentInteractionController() {}
    
    
    @Mapping("delegate")
    public native UIDocumentInteractionControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIDocumentInteractionControllerDelegate v);
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("setURL:")
    public native void setURL(NSURL v);
    @Mapping("UTI")
    public native String getUTI();
    @Mapping("setUTI:")
    public native void setUTI(String v);
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("icons")
    public native NSArray<UIImage> getIcons();
    @Mapping("annotation")
    public native Object getAnnotation();
    @Mapping("setAnnotation:")
    public native void setAnnotation(Object v);
    @Mapping("gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    
    
    
    @Mapping("presentOptionsMenuFromRect:inView:animated:")
    public native boolean presentOptionsMenu(CGRect rect, UIView view, boolean animated);
    @Mapping("presentOptionsMenuFromBarButtonItem:animated:")
    public native boolean presentOptionsMenu(UIBarButtonItem item, boolean animated);
    @Mapping("presentPreviewAnimated:")
    public native boolean presentPreview(boolean animated);
    @Mapping("presentOpenInMenuFromRect:inView:animated:")
    public native boolean presentOpenInMenu(CGRect rect, UIView view, boolean animated);
    @Mapping("presentOpenInMenuFromBarButtonItem:animated:")
    public native boolean presentOpenInMenu(UIBarButtonItem item, boolean animated);
    @Mapping("dismissPreviewAnimated:")
    public native void dismissPreview(boolean animated);
    @Mapping("dismissMenuAnimated:")
    public native void dismissMenu(boolean animated);
    @Mapping("interactionControllerWithURL:")
    public static native UIDocumentInteractionController create(NSURL url);
    @Mapping("actionSheet:clickedButtonAtIndex:")
    public native void clicked(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheetCancel:")
    public native void cancel(UIActionSheet actionSheet);
    @Mapping("willPresentActionSheet:")
    public native void willPresent(UIActionSheet actionSheet);
    @Mapping("didPresentActionSheet:")
    public native void didPresent(UIActionSheet actionSheet);
    @Mapping("actionSheet:willDismissWithButtonIndex:")
    public native void willDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheet:didDismissWithButtonIndex:")
    public native void didDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    
}
