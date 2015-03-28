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
public abstract class UIActionSheetDelegateAdapter 
    extends Object 
    implements UIActionSheetDelegate {

    
    
    


    
    
    @NotImplemented("actionSheet:clickedButtonAtIndex:")
    public void clicked(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("actionSheetCancel:")
    public void cancel(UIActionSheet actionSheet) { throw new UnsupportedOperationException(); }
    @NotImplemented("willPresentActionSheet:")
    public void willPresent(UIActionSheet actionSheet) { throw new UnsupportedOperationException(); }
    @NotImplemented("didPresentActionSheet:")
    public void didPresent(UIActionSheet actionSheet) { throw new UnsupportedOperationException(); }
    @NotImplemented("actionSheet:willDismissWithButtonIndex:")
    public void willDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("actionSheet:didDismissWithButtonIndex:")
    public void didDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }

}
