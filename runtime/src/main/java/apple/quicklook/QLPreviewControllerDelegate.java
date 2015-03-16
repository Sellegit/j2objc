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





@Library("QuickLook/QuickLook.h") @Mapping("QLPreviewControllerDelegate")
public interface QLPreviewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("previewControllerWillDismiss:")
    void willDismiss(QLPreviewController controller);
    @Mapping("previewControllerDidDismiss:")
    void didDismiss(QLPreviewController controller);
    @Mapping("previewController:shouldOpenURL:forPreviewItem:")
    boolean shouldOpenURL(QLPreviewController controller, NSURL url, QLPreviewItem item);
    @Mapping("previewController:frameForPreviewItem:inSourceView:")
    CGRect getFrame(QLPreviewController controller, QLPreviewItem item, Todo view);
    @Mapping("previewController:transitionImageForPreviewItem:contentRect:")
    UIImage getTransitionImage(QLPreviewController controller, QLPreviewItem item, CGRect contentRect);
    
    /*<adapter>*/
    /*</adapter>*/
}
