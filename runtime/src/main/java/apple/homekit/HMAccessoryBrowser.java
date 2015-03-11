package apple.homekit;


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

@Library("HomeKit") @Mapping("HMAccessoryBrowser")
public class HMAccessoryBrowser 
    extends NSObject 
     {

    
    
    public HMAccessoryBrowser() {}
    
    
    @Mapping("delegate")
    public native HMAccessoryBrowserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(HMAccessoryBrowserDelegate v);
    @Mapping("discoveredAccessories")
    public native NSArray<HMAccessory> getDiscoveredAccessories();
    
    
    
    @Mapping("startSearchingForNewAccessories")
    public native void startSearchingForNewAccessories();
    @Mapping("stopSearchingForNewAccessories")
    public native void stopSearchingForNewAccessories();
    
}
