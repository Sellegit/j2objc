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

@Library("HomeKit") @Mapping("HMHomeManager")
public class HMHomeManager 
    extends NSObject 
     {

    
    
    public HMHomeManager() {}
    
    
    @Mapping("delegate")
    public native HMHomeManagerDelegate getDelegate();
    public native void setDelegate(HMHomeManagerDelegate v);
    @Mapping("primaryHome")
    public native HMHome getPrimaryHome();
    @Mapping("homes")
    public native NSArray<HMHome> getHomes();
    
    
    
    @Mapping("updatePrimaryHome:completionHandler:")
    public native void updatePrimaryHome(HMHome home, @Block VoidBlock1<NSError> completion);
    @Mapping("addHomeWithName:completionHandler:")
    public native void addHome(String homeName, @Block VoidBlock2<HMHome, NSError> completion);
    @Mapping("removeHome:completionHandler:")
    public native void removeHome(HMHome home, @Block VoidBlock1<NSError> completion);
    
}
