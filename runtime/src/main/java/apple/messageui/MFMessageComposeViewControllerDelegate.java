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


@Library("MessageUI/MessageUI.h") @Mapping("MFMessageComposeViewControllerDelegate")
public interface MFMessageComposeViewControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("messageComposeViewController:didFinishWithResult:")
    void didFinish(MFMessageComposeViewController controller, @Representing("MessageComposeResult") long result);

    /*<adapter>*/
    /*</adapter>*/
}
