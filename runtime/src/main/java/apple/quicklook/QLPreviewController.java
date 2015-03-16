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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("QuickLook/QuickLook.h") @Mapping("QLPreviewController")
public class QLPreviewController 
    extends UIViewController 
     {

    
    
    public QLPreviewController() {}
    @Mapping("initWithNibName:bundle:")
    public QLPreviewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("dataSource")
    public native QLPreviewControllerDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(QLPreviewControllerDataSource v);
    @Mapping("currentPreviewItemIndex")
    public native @MachineSizedSInt long getCurrentPreviewItemIndex();
    @Mapping("setCurrentPreviewItemIndex:")
    public native void setCurrentPreviewItemIndex(@MachineSizedSInt long v);
    @Mapping("currentPreviewItem")
    public native QLPreviewItem getCurrentPreviewItem();
    @Mapping("delegate")
    public native QLPreviewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(QLPreviewControllerDelegate v);
    
    
    
    @Mapping("reloadData")
    public native void reloadData();
    @Mapping("refreshCurrentPreviewItem")
    public native void refreshCurrentPreviewItem();
    @Mapping("canPreviewItem:")
    public static native boolean canPreviewItem(QLPreviewItem item);
    
}
