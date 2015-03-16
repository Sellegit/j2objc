package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UILocalNotification")
public class UILocalNotification 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public UILocalNotification() {}
    
    
    @Mapping("fireDate")
    public native NSDate getFireDate();
    @Mapping("setFireDate:")
    public native void setFireDate(NSDate v);
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    @Mapping("setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Mapping("repeatInterval")
    public native @Representing("NSCalendarUnit") @MachineSizedUInt long getRepeatInterval();
    @Mapping("setRepeatInterval:")
    public native void setRepeatInterval(@Representing("NSCalendarUnit") @MachineSizedUInt long v);
    @Mapping("repeatCalendar")
    public native NSCalendar getRepeatCalendar();
    @Mapping("setRepeatCalendar:")
    public native void setRepeatCalendar(NSCalendar v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("region")
    public native CLRegion getRegion();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setRegion:")
    public native void setRegion(CLRegion v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("regionTriggersOnce")
    public native boolean regionTriggersOnce();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setRegionTriggersOnce:")
    public native void setRegionTriggersOnce(boolean v);
    @Mapping("alertBody")
    public native String getAlertBody();
    @Mapping("setAlertBody:")
    public native void setAlertBody(String v);
    @Mapping("hasAction")
    public native boolean hasAction();
    @Mapping("setHasAction:")
    public native void setHasAction(boolean v);
    @Mapping("alertAction")
    public native String getAlertAction();
    @Mapping("setAlertAction:")
    public native void setAlertAction(String v);
    @Mapping("alertLaunchImage")
    public native String getAlertLaunchImage();
    @Mapping("setAlertLaunchImage:")
    public native void setAlertLaunchImage(String v);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Mapping("alertTitle")
    public native String getAlertTitle();
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Mapping("setAlertTitle:")
    public native void setAlertTitle(String v);
    @Mapping("soundName")
    public native String getSoundName();
    @Mapping("setSoundName:")
    public native void setSoundName(String v);
    @Mapping("applicationIconBadgeNumber")
    public native @MachineSizedSInt long getApplicationIconBadgeNumber();
    @Mapping("setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@MachineSizedSInt long v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("category")
    public native String getCategory();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setCategory:")
    public native void setCategory(String v);
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UILocalNotificationDefaultSoundName")
    public static native String getDefaultSoundName();
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
