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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation") @Mapping("NSUserActivityDelegate")
public interface NSUserActivityDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("userActivityWillSave:")
    void willSave(NSUserActivity userActivity);
    @Mapping("userActivityWasContinued:")
    void wasContinued(NSUserActivity userActivity);
    @Mapping("userActivity:didReceiveInputStream:outputStream:")
    void didReceiveStreams(NSUserActivity userActivity, NSInputStream inputStream, NSOutputStream outputStream);
    
    /*<adapter>*/
    /*</adapter>*/
}
