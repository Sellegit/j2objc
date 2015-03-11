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
@Adapter
public abstract class MFMessageComposeViewControllerDelegateAdapter 
    extends Object 
    implements MFMessageComposeViewControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("messageComposeViewController:didFinishWithResult:")
    public void didFinish(MFMessageComposeViewController controller, @Representing("MessageComposeResult") int result) { throw new UnsupportedOperationException(); }
    
}
