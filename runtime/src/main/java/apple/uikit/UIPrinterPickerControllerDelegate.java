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


@Library("UIKit/UIKit.h") @Mapping("UIPrinterPickerControllerDelegate")
public interface UIPrinterPickerControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("printerPickerControllerParentViewController:")
    UIViewController getParentViewController(UIPrinterPickerController printerPickerController);
    @Mapping("printerPickerController:shouldShowPrinter:")
    boolean shouldShowPrinter(UIPrinterPickerController printerPickerController, UIPrinter printer);
    @Mapping("printerPickerControllerWillPresent:")
    void willPresent(UIPrinterPickerController printerPickerController);
    @Mapping("printerPickerControllerDidPresent:")
    void didPresent(UIPrinterPickerController printerPickerController);
    @Mapping("printerPickerControllerWillDismiss:")
    void willDismiss(UIPrinterPickerController printerPickerController);
    @Mapping("printerPickerControllerDidDismiss:")
    void didDismiss(UIPrinterPickerController printerPickerController);
    @Mapping("printerPickerControllerDidSelectPrinter:")
    void didSelectPrinter(UIPrinterPickerController printerPickerController);

    /*<adapter>*/
    /*</adapter>*/
}
