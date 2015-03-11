package apple.networkextension;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("NetworkExtension") @Mapping("NEVPNManager")
public class NEVPNManager 
    extends NSObject 
     {

    
    
    public NEVPNManager() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("onDemandRules")
    public native NSArray<NEOnDemandRule> getOnDemandRules();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setOnDemandRules:")
    public native void setOnDemandRules(NSArray<NEOnDemandRule> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isOnDemandEnabled")
    public native boolean isOnDemandEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setOnDemandEnabled:")
    public native void setOnDemandEnabled(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("protocol")
    public native NEVPNProtocol getProtocol();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setProtocol:")
    public native void setProtocol(NEVPNProtocol v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("connection")
    public native NEVPNConnection getConnection();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NEVPNConfigurationChangeNotification")
    public static native NSString ConfigurationChangeNotification();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sharedManager")
    public static native NEVPNManager getSharedManager();
    
}
