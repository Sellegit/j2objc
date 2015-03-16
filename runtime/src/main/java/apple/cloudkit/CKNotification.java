package apple.cloudkit;


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
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit/CloudKit.h") @Mapping("CKNotification")
public class CKNotification 
    extends NSObject 
     {

    
    
    public CKNotification() {}
    
    
    @Mapping("notificationType")
    public native @Representing("CKNotificationType") @MachineSizedSInt long getNotificationType();
    @Mapping("notificationID")
    public native CKNotificationID getNotificationID();
    @Mapping("containerIdentifier")
    public native String getContainerIdentifier();
    @Mapping("isPruned")
    public native boolean isPruned();
    @Mapping("alertBody")
    public native String getAlertBody();
    @Mapping("alertLocalizationKey")
    public native String getAlertLocalizationKey();
    @Mapping("alertLocalizationArgs")
    public native List<String> getAlertLocalizationArgs();
    @Mapping("alertActionLocalizationKey")
    public native String getAlertActionLocalizationKey();
    @Mapping("alertLaunchImage")
    public native String getAlertLaunchImage();
    @Mapping("badge")
    public native NSNumber getBadge();
    @Mapping("soundName")
    public native String getSoundName();
    
    
    
    @Mapping("notificationFromRemoteNotificationDictionary:")
    public static native CKNotification create(NSDictionary<?, ?> notificationDictionary);
    
}
