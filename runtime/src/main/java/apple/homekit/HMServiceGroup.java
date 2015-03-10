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

@Library("HomeKit") @Mapping("HMServiceGroup")
public class HMServiceGroup 
    extends NSObject 
     {

    
    
    public HMServiceGroup() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("services")
    public native NSArray<HMService> getServices();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("addService:completionHandler:")
    public native void addService(HMService service, @Block VoidBlock1<NSError> completion);
    @Mapping("removeService:completionHandler:")
    public native void removeService(HMService service, @Block VoidBlock1<NSError> completion);
    
}
