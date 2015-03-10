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


/*<javadoc>*/
/*</javadoc>*/

public abstract class MFMailComposeViewControllerDelegateAdapter 
    extends Object 
    implements MFMailComposeViewControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("mailComposeController:didFinishWithResult:error:")
    public void didFinish(MFMailComposeViewController controller, @Representing("MFMailComposeResult") int result, NSError error) { throw new UnsupportedOperationException(); }
    
}
