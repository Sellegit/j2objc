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





@Library("UIKit/UIKit.h") @Mapping("UIDocumentInteractionControllerDelegate")
public interface UIDocumentInteractionControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("documentInteractionControllerViewControllerForPreview:")
    UIViewController getViewControllerForPreview(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerRectForPreview:")
    CGRect getRectForPreview(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerViewForPreview:")
    UIView getViewForPreview(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerWillBeginPreview:")
    void willBeginPreview(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerDidEndPreview:")
    void didEndPreview(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerWillPresentOptionsMenu:")
    void willPresentOptionsMenu(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerDidDismissOptionsMenu:")
    void didDismissOptionsMenu(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerWillPresentOpenInMenu:")
    void willPresentOpenInMenu(UIDocumentInteractionController controller);
    @Mapping("documentInteractionControllerDidDismissOpenInMenu:")
    void didDismissOpenInMenu(UIDocumentInteractionController controller);
    @Mapping("documentInteractionController:willBeginSendingToApplication:")
    void willBeginSendingToApplication(UIDocumentInteractionController controller, String application);
    @Mapping("documentInteractionController:didEndSendingToApplication:")
    void didEndSendingToApplication(UIDocumentInteractionController controller, String application);
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("documentInteractionController:canPerformAction:")
    boolean canPerformAction(UIDocumentInteractionController controller, Selector action);
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("documentInteractionController:performAction:")
    boolean performAction(UIDocumentInteractionController controller, Selector action);
    
    /*<adapter>*/
    /*</adapter>*/
}
