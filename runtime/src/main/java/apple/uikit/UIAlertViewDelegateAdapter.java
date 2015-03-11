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
public abstract class UIAlertViewDelegateAdapter 
    extends Object 
    implements UIAlertViewDelegate {

    
    
    
    
    
    
    
    @NotImplemented("alertView:clickedButtonAtIndex:")
    public void clicked(UIAlertView alertView, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("alertViewCancel:")
    public void cancel(UIAlertView alertView) { throw new UnsupportedOperationException(); }
    @NotImplemented("willPresentAlertView:")
    public void willPresent(UIAlertView alertView) { throw new UnsupportedOperationException(); }
    @NotImplemented("didPresentAlertView:")
    public void didPresent(UIAlertView alertView) { throw new UnsupportedOperationException(); }
    @NotImplemented("alertView:willDismissWithButtonIndex:")
    public void willDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("alertView:didDismissWithButtonIndex:")
    public void didDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex) { throw new UnsupportedOperationException(); }
    @NotImplemented("alertViewShouldEnableFirstOtherButton:")
    public boolean shouldEnableFirstOtherButton(UIAlertView alertView) { throw new UnsupportedOperationException(); }
    
}
