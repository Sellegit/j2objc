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


@Library("EventKitUI/EventKitUI.h") @Mapping("EKEventEditViewDelegate")
public interface EKEventEditViewDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("eventEditViewController:didCompleteWithAction:")
    void didComplete(EKEventEditViewController controller, EKEventEditViewAction action);
    @Mapping("eventEditViewControllerDefaultCalendarForNewEvents:")
    EKCalendar getDefaultCalendarForNewEvents(EKEventEditViewController controller);

    /*<adapter>*/
    /*</adapter>*/
}
