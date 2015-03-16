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

@Library("HomeKit/HomeKit.h") @Mapping("HMHomeManagerDelegate")
public interface HMHomeManagerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("homeManagerDidUpdateHomes:")
    void didUpdateHomes(HMHomeManager manager);
    @Mapping("homeManagerDidUpdatePrimaryHome:")
    void didUpdatePrimaryHome(HMHomeManager manager);
    @Mapping("homeManager:didAddHome:")
    void didAddHome(HMHomeManager manager, HMHome home);
    @Mapping("homeManager:didRemoveHome:")
    void didRemoveHome(HMHomeManager manager, HMHome home);
    
    /*<adapter>*/
    /*</adapter>*/
}
