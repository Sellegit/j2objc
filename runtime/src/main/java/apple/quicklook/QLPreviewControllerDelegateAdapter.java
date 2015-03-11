package apple.quicklook;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class QLPreviewControllerDelegateAdapter 
    extends Object 
    implements QLPreviewControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("previewControllerWillDismiss:")
    public void willDismiss(QLPreviewController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("previewControllerDidDismiss:")
    public void didDismiss(QLPreviewController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("previewController:shouldOpenURL:forPreviewItem:")
    public boolean shouldOpenURL(QLPreviewController controller, NSURL url, QLPreviewItem item) { throw new UnsupportedOperationException(); }
    @NotImplemented("previewController:frameForPreviewItem:inSourceView:")
    public CGRect getFrame(QLPreviewController controller, QLPreviewItem item, Todo view) { throw new UnsupportedOperationException(); }
    @NotImplemented("previewController:transitionImageForPreviewItem:contentRect:")
    public UIImage getTransitionImage(QLPreviewController controller, QLPreviewItem item, CGRect contentRect) { throw new UnsupportedOperationException(); }
    
}
