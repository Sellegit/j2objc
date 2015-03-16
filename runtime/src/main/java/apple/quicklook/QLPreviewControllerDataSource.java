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





@Library("QuickLook/QuickLook.h") @Mapping("QLPreviewControllerDataSource")
public interface QLPreviewControllerDataSource 
     {

    
    
    
    
    
    @Mapping("numberOfPreviewItemsInPreviewController:")
    @MachineSizedSInt long getNumberOfPreviewItems(QLPreviewController controller);
    @Mapping("previewController:previewItemAtIndex:")
    QLPreviewItem getPreviewItem(QLPreviewController controller, @MachineSizedSInt long index);
    
    /*<adapter>*/
    /*</adapter>*/
}
