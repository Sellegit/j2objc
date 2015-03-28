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


@Library("UIKit/UIKit.h") @Mapping("UIAlertViewDelegate")
public interface UIAlertViewDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("alertView:clickedButtonAtIndex:")
    void clicked(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    @Mapping("alertViewCancel:")
    void cancel(UIAlertView alertView);
    @Mapping("willPresentAlertView:")
    void willPresent(UIAlertView alertView);
    @Mapping("didPresentAlertView:")
    void didPresent(UIAlertView alertView);
    @Mapping("alertView:willDismissWithButtonIndex:")
    void willDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    @Mapping("alertView:didDismissWithButtonIndex:")
    void didDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    @Mapping("alertViewShouldEnableFirstOtherButton:")
    boolean shouldEnableFirstOtherButton(UIAlertView alertView);

    /*<adapter>*/
    /*</adapter>*/
}
