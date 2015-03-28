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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class EKEventEditViewDelegateAdapter 
    extends Object 
    implements EKEventEditViewDelegate {

    
    
    


    
    
    @NotImplemented("eventEditViewController:didCompleteWithAction:")
    public void didComplete(EKEventEditViewController controller, EKEventEditViewAction action) { throw new UnsupportedOperationException(); }
    @NotImplemented("eventEditViewControllerDefaultCalendarForNewEvents:")
    public EKCalendar getDefaultCalendarForNewEvents(EKEventEditViewController controller) { throw new UnsupportedOperationException(); }

}
