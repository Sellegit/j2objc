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


@Library("UIKit/UIKit.h") @Mapping("UIPrintInteractionControllerDelegate")
public interface UIPrintInteractionControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("printInteractionControllerParentViewController:")
    UIViewController getParentViewController(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionController:choosePaper:")
    UIPrintPaper choosePaper(UIPrintInteractionController printInteractionController, NSArray<?> paperList);
    @Mapping("printInteractionControllerWillPresentPrinterOptions:")
    void willPresentPrinterOptions(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionControllerDidPresentPrinterOptions:")
    void didPresentPrinterOptions(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionControllerWillDismissPrinterOptions:")
    void willDismissPrinterOptions(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionControllerDidDismissPrinterOptions:")
    void didDismissPrinterOptions(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionControllerWillStartJob:")
    void willStartJob(UIPrintInteractionController printInteractionController);
    @Mapping("printInteractionControllerDidFinishJob:")
    void didFinishJob(UIPrintInteractionController printInteractionController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("printInteractionController:cutLengthForPaper:")
    @MachineSizedFloat double getCutLength(UIPrintInteractionController printInteractionController, UIPrintPaper paper);

    /*<adapter>*/
    /*</adapter>*/
}
