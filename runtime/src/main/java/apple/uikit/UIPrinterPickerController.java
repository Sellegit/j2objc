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

@Library("UIKit") @Mapping("UIPrinterPickerController")
public class UIPrinterPickerController 
    extends NSObject 
     {

    
    
    public UIPrinterPickerController() {}
    
    
    @Mapping("selectedPrinter")
    public native UIPrinter getSelectedPrinter();
    @Mapping("delegate")
    public native UIPrinterPickerControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPrinterPickerControllerDelegate v);
    
    
    
    @Mapping("presentAnimated:completionHandler:")
    public native boolean presentAnimated(boolean animated, @Block VoidBlock3<UIPrinterPickerController, Boolean, NSError> completion);
    @Mapping("presentFromRect:inView:animated:completionHandler:")
    public native boolean presentFromRectInView(CGRect rect, UIView view, boolean animated, @Block VoidBlock3<UIPrinterPickerController, Boolean, NSError> completion);
    @Mapping("presentFromBarButtonItem:animated:completionHandler:")
    public native boolean presentFromBarButtonItem(UIBarButtonItem item, boolean animated, @Block VoidBlock3<UIPrinterPickerController, Boolean, NSError> completion);
    @Mapping("dismissAnimated:")
    public native void dismissAnimated(boolean animated);
    @Mapping("printerPickerControllerWithInitiallySelectedPrinter:")
    public static native UIPrinterPickerController create(UIPrinter printer);
    
}
