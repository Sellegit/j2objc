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





@Library("Foundation") @Mapping("NSNotificationQueue")
public class NSNotificationQueue 
    extends NSObject 
     {

    
    
    @Mapping("initWithNotificationCenter:")
    public NSNotificationQueue(NSNotificationCenter notificationCenter) { }
    
    
    
    
    
    
    @Mapping("enqueueNotification:postingStyle:")
    public native void enqueueNotification(NSNotification notification, @Representing("NSPostingStyle") @MachineSizedUInt long postingStyle);
    @Mapping("enqueueNotification:postingStyle:coalesceMask:forModes:")
    public native void enqueueNotification(NSNotification notification, @Representing("NSPostingStyle") @MachineSizedUInt long postingStyle, NSNotificationCoalescing coalesceMask, List<String> modes);
    @Mapping("dequeueNotificationsMatching:coalesceMask:")
    public native void dequeueNotificationsMatching(NSNotification notification, NSNotificationCoalescing coalesceMask);
    @Mapping("defaultQueue")
    public static native NSNotificationQueue getDefaultQueue();
    
}
