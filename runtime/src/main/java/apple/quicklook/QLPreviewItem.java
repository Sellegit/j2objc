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





@Library("QuickLook") @Mapping("QLPreviewItem")
public interface QLPreviewItem 
    extends NSObjectProtocol {

    
    
    @Mapping("previewItemURL")
    NSURL getURL();
    @Mapping("previewItemTitle")
    String getTitle();
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
