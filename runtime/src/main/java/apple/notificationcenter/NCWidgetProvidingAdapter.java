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


/*<javadoc>*/
/*</javadoc>*/

public abstract class NCWidgetProvidingAdapter 
    extends Object 
    implements NCWidgetProviding {

    
    
    
    
    
    
    
    @NotImplemented("widgetPerformUpdateWithCompletionHandler:")
    public void performUpdate(@Block VoidBlock1<NCUpdateResult> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("widgetMarginInsetsForProposedMarginInsets:")
    public UIEdgeInsets getMarginInsetsForProposedInsets(UIEdgeInsets defaultMarginInsets) { throw new UnsupportedOperationException(); }
    
}
