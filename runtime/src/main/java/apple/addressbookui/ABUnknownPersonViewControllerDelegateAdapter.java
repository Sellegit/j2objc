package apple.addressbookui;


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
import apple.addressbook.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class ABUnknownPersonViewControllerDelegateAdapter 
    extends Object 
    implements ABUnknownPersonViewControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("unknownPersonViewController:didResolveToPerson:")
    public void didResolveToPerson(ABUnknownPersonViewController unknownCardViewController, ABPerson person) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("unknownPersonViewController:shouldPerformDefaultActionForPerson:property:identifier:")
    public boolean shouldPerformDefaultAction(ABUnknownPersonViewController personViewController, ABPerson person, ABProperty property, int identifier) { throw new UnsupportedOperationException(); }
    
}
