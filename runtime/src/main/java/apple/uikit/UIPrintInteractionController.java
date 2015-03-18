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
 * @since Available in iOS 4.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPrintInteractionController")
public class UIPrintInteractionController 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIPrintInteractionController() { }
    
    
    @Mapping("printInfo")
    public native UIPrintInfo getPrintInfo();
    @Mapping("setPrintInfo:")
    public native void setPrintInfo(UIPrintInfo v);
    @Mapping("delegate")
    public native UIPrintInteractionControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPrintInteractionControllerDelegate v);
    @Mapping("showsPageRange")
    public native boolean showsPageRange();
    @Mapping("setShowsPageRange:")
    public native void setShowsPageRange(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("showsNumberOfCopies")
    public native boolean showsNumberOfCopies();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setShowsNumberOfCopies:")
    public native void setShowsNumberOfCopies(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showsPaperSelectionForLoadedPapers")
    public native boolean showsPaperSelectionForLoadedPapers();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setShowsPaperSelectionForLoadedPapers:")
    public native void setShowsPaperSelectionForLoadedPapers(boolean v);
    @Mapping("printPaper")
    public native UIPrintPaper getPrintPaper();
    @Mapping("printPageRenderer")
    public native UIPrintPageRenderer getPrintPageRenderer();
    @Mapping("setPrintPageRenderer:")
    public native void setPrintPageRenderer(UIPrintPageRenderer v);
    @Mapping("printFormatter")
    public native UIPrintFormatter getPrintFormatter();
    @Mapping("setPrintFormatter:")
    public native void setPrintFormatter(UIPrintFormatter v);
    @Mapping("printingItem")
    public native Object getPrintingItem();
    @Mapping("setPrintingItem:")
    public native void setPrintingItem(Object v);
    @Mapping("printingItems")
    public native NSArray<?> getPrintingItems();
    @Mapping("setPrintingItems:")
    public native void setPrintingItems(NSArray<?> v);
    
    
    
    @Mapping("dismissAnimated:")
    public native void dismiss(boolean animated);
    @Mapping("isPrintingAvailable")
    public static native boolean isPrintingAvailable();
    @Mapping("printableUTIs")
    public static native List<String> getPrintableUTIs();
    @Mapping("canPrintURL:")
    public static native boolean canPrint(NSURL url);
    @Mapping("canPrintData:")
    public static native boolean canPrint(NSData data);
    @Mapping("sharedPrintController")
    public static native UIPrintInteractionController getSharedPrintController();
    
}
