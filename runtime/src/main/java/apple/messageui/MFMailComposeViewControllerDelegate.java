package apple.messageui;


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





@Library("MessageUI/MessageUI.h") @Mapping("MFMailComposeViewControllerDelegate")
public interface MFMailComposeViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("mailComposeController:didFinishWithResult:error:")
    void didFinish(MFMailComposeViewController controller, @Representing("MFMailComposeResult") long result, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
