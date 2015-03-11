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





@Library("EventKitUI") @Mapping("EKCalendarChooserDelegate")
public interface EKCalendarChooserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("calendarChooserSelectionDidChange:")
    void didChangeSelection(EKCalendarChooser calendarChooser);
    @Mapping("calendarChooserDidFinish:")
    void didFinish(EKCalendarChooser calendarChooser);
    @Mapping("calendarChooserDidCancel:")
    void didCancel(EKCalendarChooser calendarChooser);
    
    /*<adapter>*/
    /*</adapter>*/
}
