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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIUserNotificationSettings")
public class UIUserNotificationSettings 
    extends NSObject 
     {

    
    
    public UIUserNotificationSettings() {}
    
    
    @Mapping("types")
    public native @Representing("UIUserNotificationType") @MachineSizedUInt long getTypes();
    @Mapping("categories")
    public native NSSet<UIUserNotificationCategory> getCategories();
    
    
    
    @Mapping("settingsForTypes:categories:")
    public static native UIUserNotificationSettings create(@Representing("UIUserNotificationType") @MachineSizedUInt long types, NSSet<UIUserNotificationCategory> categories);
    
}
