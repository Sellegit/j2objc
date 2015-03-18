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

@Library("HomeKit/HomeKit.h") @Mapping("HMService")
public class HMService 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public HMService() { }
    
    
    @Mapping("accessory")
    public native HMAccessory getAccessory();
    @Mapping("serviceType")
    public native HMServiceType getServiceType();
    @Mapping("name")
    public native String getName();
    @Mapping("associatedServiceType")
    public native HMServiceType getAssociatedServiceType();
    @Mapping("characteristics")
    public native NSArray<HMCharacteristic> getCharacteristics();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("updateAssociatedServiceType:completionHandler:")
    public native void updateAssociatedServiceType(String serviceType, @Block VoidBlock1<NSError> completion);
    
}
