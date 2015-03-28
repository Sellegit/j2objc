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
public abstract class UIDocumentInteractionControllerDelegateAdapter 
    extends Object 
    implements UIDocumentInteractionControllerDelegate {

    
    
    


    
    
    @NotImplemented("documentInteractionControllerViewControllerForPreview:")
    public UIViewController getViewControllerForPreview(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerRectForPreview:")
    public CGRect getRectForPreview(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerViewForPreview:")
    public UIView getViewForPreview(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerWillBeginPreview:")
    public void willBeginPreview(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerDidEndPreview:")
    public void didEndPreview(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerWillPresentOptionsMenu:")
    public void willPresentOptionsMenu(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerDidDismissOptionsMenu:")
    public void didDismissOptionsMenu(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerWillPresentOpenInMenu:")
    public void willPresentOpenInMenu(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionControllerDidDismissOpenInMenu:")
    public void didDismissOpenInMenu(UIDocumentInteractionController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionController:willBeginSendingToApplication:")
    public void willBeginSendingToApplication(UIDocumentInteractionController controller, String application) { throw new UnsupportedOperationException(); }
    @NotImplemented("documentInteractionController:didEndSendingToApplication:")
    public void didEndSendingToApplication(UIDocumentInteractionController controller, String application) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("documentInteractionController:canPerformAction:")
    public boolean canPerformAction(UIDocumentInteractionController controller, Selector action) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("documentInteractionController:performAction:")
    public boolean performAction(UIDocumentInteractionController controller, Selector action) { throw new UnsupportedOperationException(); }

}
