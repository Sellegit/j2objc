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

@Library("UIKit") @Mapping("UIMutableUserNotificationCategory")
public class UIMutableUserNotificationCategory 
    extends UIUserNotificationCategory 
     {

    
    
    public UIMutableUserNotificationCategory() {}
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    
    
    
    @Mapping("setActions:forContext:")
    public native void setActions(NSArray<?> actions, @Representing("UIUserNotificationActionContext") @MachineSizedUInt long context);
    
}
