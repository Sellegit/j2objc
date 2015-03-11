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

@Library("CloudKit") @Mapping("CKNotificationInfo")
public class CKNotificationInfo 
    extends NSObject 
    implements NSCopying {

    
    
    public CKNotificationInfo() {}
    
    
    @Mapping("alertBody")
    public native String getAlertBody();
    public native void setAlertBody(String v);
    @Mapping("alertLocalizationKey")
    public native String getAlertLocalizationKey();
    public native void setAlertLocalizationKey(String v);
    @Mapping("alertLocalizationArgs")
    public native List<String> getAlertLocalizationArgs();
    public native void setAlertLocalizationArgs(List<String> v);
    @Mapping("alertActionLocalizationKey")
    public native String getAlertActionLocalizationKey();
    public native void setAlertActionLocalizationKey(String v);
    @Mapping("alertLaunchImage")
    public native String getAlertLaunchImage();
    public native void setAlertLaunchImage(String v);
    @Mapping("soundName")
    public native String getSoundName();
    public native void setSoundName(String v);
    @Mapping("desiredKeys")
    public native List<String> getDesiredKeys();
    public native void setDesiredKeys(List<String> v);
    @Mapping("shouldBadge")
    public native boolean shouldBadge();
    public native void setShouldBadge(boolean v);
    @Mapping("shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();
    public native void setShouldSendContentAvailable(boolean v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
