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
@Library("UIKit/UIKit.h") @Mapping("UIPrinterPickerController")
public class UIPrinterPickerController 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIPrinterPickerController() { }

    
    @Mapping("selectedPrinter")
    public native UIPrinter getSelectedPrinter();
    @Mapping("delegate")
    public native UIPrinterPickerControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPrinterPickerControllerDelegate v);

    
    
    @Mapping("dismissAnimated:")
    public native void dismissAnimated(boolean animated);
    @Mapping("printerPickerControllerWithInitiallySelectedPrinter:")
    public static native UIPrinterPickerController create(UIPrinter printer);

}
