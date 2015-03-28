package apple.notificationcenter;


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


@Library("NotificationCenter/NotificationCenter.h") @Mapping("NCWidgetProviding")
public interface NCWidgetProviding 
    extends NSObjectProtocol {

    
    


    
    @Mapping("widgetPerformUpdateWithCompletionHandler:")
    void performUpdate(@Block VoidBlock1<NCUpdateResult> completionHandler);
    @Mapping("widgetMarginInsetsForProposedMarginInsets:")
    UIEdgeInsets getMarginInsetsForProposedInsets(UIEdgeInsets defaultMarginInsets);

    /*<adapter>*/
    /*</adapter>*/
}
