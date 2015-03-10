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

@Library("HomeKit") @Mapping("HMAccessory")
public class HMAccessory 
    extends NSObject 
     {

    
    
    public HMAccessory() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("identifier")
    public native NSUUID getIdentifier();
    @Mapping("delegate")
    public native HMAccessoryDelegate getDelegate();
    public native void setDelegate(HMAccessoryDelegate v);
    @Mapping("isReachable")
    public native boolean isReachable();
    @Mapping("isBridged")
    public native boolean isBridged();
    @Mapping("identifiersForBridgedAccessories")
    public native NSArray<NSUUID> getIdentifiersForBridgedAccessories();
    @Mapping("room")
    public native HMRoom getRoom();
    @Mapping("services")
    public native NSArray<HMService> getServices();
    @Mapping("isBlocked")
    public native boolean isBlocked();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("identifyWithCompletionHandler:")
    public native void identify(@Block VoidBlock1<NSError> completion);
    
}
