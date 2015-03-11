package apple.externalaccessory;


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
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("ExternalAccessory") @Mapping("EAWiFiUnconfiguredAccessoryBrowser")
public class EAWiFiUnconfiguredAccessoryBrowser 
    extends NSObject 
     {

    
    
    public EAWiFiUnconfiguredAccessoryBrowser() {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithDelegate:queue:")
    public EAWiFiUnconfiguredAccessoryBrowser(EAWiFiUnconfiguredAccessoryBrowserDelegate delegate, DispatchQueue queue) { }
    
    
    @Mapping("delegate")
    public native EAWiFiUnconfiguredAccessoryBrowserDelegate getDelegate();
    public native void setDelegate(EAWiFiUnconfiguredAccessoryBrowserDelegate v);
    @Mapping("unconfiguredAccessories")
    public native NSSet<EAWiFiUnconfiguredAccessory> getUnconfiguredAccessories();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("startSearchingForUnconfiguredAccessoriesMatchingPredicate:")
    public native void startSearchingForUnconfiguredAccessories(NSPredicate predicate);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("stopSearchingForUnconfiguredAccessories")
    public native void stopSearchingForUnconfiguredAccessories();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("configureAccessory:withConfigurationUIOnViewController:")
    public native void configureAccessory(EAWiFiUnconfiguredAccessory accessory, UIViewController viewController);
    
}
