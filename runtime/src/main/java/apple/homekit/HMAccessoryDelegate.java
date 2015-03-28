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
@Library("HomeKit/HomeKit.h") @Mapping("HMAccessoryDelegate")
public interface HMAccessoryDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("accessoryDidUpdateName:")
    void didUpdateName(HMAccessory accessory);
    @Mapping("accessory:didUpdateNameForService:")
    void didUpdateServiceName(HMAccessory accessory, HMService service);
    @Mapping("accessory:didUpdateAssociatedServiceTypeForService:")
    void didUpdateAssociatedServiceType(HMAccessory accessory, HMService service);
    @Mapping("accessoryDidUpdateServices:")
    void didUpdateServices(HMAccessory accessory);
    @Mapping("accessoryDidUpdateReachability:")
    void didUpdateReachability(HMAccessory accessory);
    @Mapping("accessory:service:didUpdateValueForCharacteristic:")
    void didUpdateCharacteristicValue(HMAccessory accessory, HMService service, HMCharacteristic characteristic);

    /*<adapter>*/
    /*</adapter>*/
}
