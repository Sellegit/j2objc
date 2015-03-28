package apple.eventkitui;


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
import apple.eventkit.*;
import apple.uikit.*;


@Library("EventKitUI/EventKitUI.h") @Mapping("EKEventViewDelegate")
public interface EKEventViewDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("eventViewController:didCompleteWithAction:")
    void didComplete(EKEventViewController controller, EKEventViewAction action);

    /*<adapter>*/
    /*</adapter>*/
}
