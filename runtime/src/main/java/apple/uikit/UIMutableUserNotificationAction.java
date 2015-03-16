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

@Library("UIKit/UIKit.h") @Mapping("UIMutableUserNotificationAction")
public class UIMutableUserNotificationAction 
    extends UIUserNotificationAction 
     {

    
    
    public UIMutableUserNotificationAction() {}
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("activationMode")
    public native @Representing("UIUserNotificationActivationMode") @MachineSizedUInt long getActivationMode();
    @Mapping("setActivationMode:")
    public native void setActivationMode(@Representing("UIUserNotificationActivationMode") @MachineSizedUInt long v);
    @Mapping("isAuthenticationRequired")
    public native boolean isAuthenticationRequired();
    @Mapping("setAuthenticationRequired:")
    public native void setAuthenticationRequired(boolean v);
    @Mapping("isDestructive")
    public native boolean isDestructive();
    @Mapping("setDestructive:")
    public native void setDestructive(boolean v);
    
    
    
    
    
}
