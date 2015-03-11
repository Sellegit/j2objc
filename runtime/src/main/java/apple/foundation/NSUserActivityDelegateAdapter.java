package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSUserActivityDelegateAdapter 
    extends Object 
    implements NSUserActivityDelegate {

    
    
    
    
    
    
    
    @NotImplemented("userActivityWillSave:")
    public void willSave(NSUserActivity userActivity) { throw new UnsupportedOperationException(); }
    @NotImplemented("userActivityWasContinued:")
    public void wasContinued(NSUserActivity userActivity) { throw new UnsupportedOperationException(); }
    @NotImplemented("userActivity:didReceiveInputStream:outputStream:")
    public void didReceiveStreams(NSUserActivity userActivity, NSInputStream inputStream, NSOutputStream outputStream) { throw new UnsupportedOperationException(); }
    
}
