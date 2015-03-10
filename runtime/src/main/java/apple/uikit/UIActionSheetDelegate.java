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





@Library("UIKit") @Mapping("UIActionSheetDelegate")
public interface UIActionSheetDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("actionSheet:clickedButtonAtIndex:")
    void clicked(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheetCancel:")
    void cancel(UIActionSheet actionSheet);
    @Mapping("willPresentActionSheet:")
    void willPresent(UIActionSheet actionSheet);
    @Mapping("didPresentActionSheet:")
    void didPresent(UIActionSheet actionSheet);
    @Mapping("actionSheet:willDismissWithButtonIndex:")
    void willDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    @Mapping("actionSheet:didDismissWithButtonIndex:")
    void didDismiss(UIActionSheet actionSheet, @MachineSizedSInt long buttonIndex);
    
    /*<adapter>*/
    /*</adapter>*/
}
