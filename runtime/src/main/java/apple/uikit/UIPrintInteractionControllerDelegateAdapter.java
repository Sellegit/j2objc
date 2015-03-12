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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIPrintInteractionControllerDelegateAdapter 
    extends Object 
    implements UIPrintInteractionControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("printInteractionControllerParentViewController:")
    public UIViewController getParentViewController(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionController:choosePaper:")
    public UIPrintPaper choosePaper(UIPrintInteractionController printInteractionController, NSArray<?> paperList) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerWillPresentPrinterOptions:")
    public void willPresentPrinterOptions(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerDidPresentPrinterOptions:")
    public void didPresentPrinterOptions(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerWillDismissPrinterOptions:")
    public void willDismissPrinterOptions(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerDidDismissPrinterOptions:")
    public void didDismissPrinterOptions(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerWillStartJob:")
    public void willStartJob(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    @NotImplemented("printInteractionControllerDidFinishJob:")
    public void didFinishJob(UIPrintInteractionController printInteractionController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("printInteractionController:cutLengthForPaper:")
    public @MachineSizedFloat double getCutLength(UIPrintInteractionController printInteractionController, UIPrintPaper paper) { throw new UnsupportedOperationException(); }
    
}
