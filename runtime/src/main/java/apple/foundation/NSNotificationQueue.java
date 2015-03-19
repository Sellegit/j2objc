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





@Library("Foundation/Foundation.h") @Mapping("NSNotificationQueue")
public class NSNotificationQueue 
    extends NSObject 
     {

    
    
    @Mapping("initWithNotificationCenter:")
    public NSNotificationQueue(NSNotificationCenter notificationCenter) { }
    @Mapping("init")
    public NSNotificationQueue() { }
    
    
    
    
    
    
    @Mapping("enqueueNotification:postingStyle:")
    public native void enqueueNotification(NSNotification notification, @Representing("NSPostingStyle") long postingStyle);
    @Mapping("enqueueNotification:postingStyle:coalesceMask:forModes:")
    public native void enqueueNotification(NSNotification notification, @Representing("NSPostingStyle") long postingStyle, @MachineSizedUInt long coalesceMask, NSArray<?> modes);
    @Mapping("dequeueNotificationsMatching:coalesceMask:")
    public native void dequeueNotificationsMatching(NSNotification notification, @MachineSizedUInt long coalesceMask);
    @Mapping("defaultQueue")
    public static native NSNotificationQueue getDefaultQueue();
    
}
