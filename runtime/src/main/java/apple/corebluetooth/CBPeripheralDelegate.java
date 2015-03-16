package apple.corebluetooth;


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
import apple.dispatch.*;





@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBPeripheralDelegate")
public interface CBPeripheralDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("peripheralDidUpdateName:")
    void didUpdateName(CBPeripheral peripheral);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("peripheralDidInvalidateServices:")
    void didInvalidateServices(CBPeripheral peripheral);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("peripheral:didModifyServices:")
    void didModifyServices(CBPeripheral peripheral, NSArray<?> invalidatedServices);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("peripheralDidUpdateRSSI:error:")
    void didUpdateRSSI(CBPeripheral peripheral, NSError error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("peripheral:didReadRSSI:error:")
    void didReadRSSI(CBPeripheral peripheral, NSNumber RSSI, NSError error);
    @Mapping("peripheral:didDiscoverServices:")
    void didDiscoverServices(CBPeripheral peripheral, NSError error);
    @Mapping("peripheral:didDiscoverIncludedServicesForService:error:")
    void didDiscoverIncludedServices(CBPeripheral peripheral, CBService service, NSError error);
    @Mapping("peripheral:didDiscoverCharacteristicsForService:error:")
    void didDiscoverCharacteristics(CBPeripheral peripheral, CBService service, NSError error);
    @Mapping("peripheral:didUpdateValueForCharacteristic:error:")
    void didUpdateValue(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error);
    @Mapping("peripheral:didWriteValueForCharacteristic:error:")
    void didWriteValue(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error);
    @Mapping("peripheral:didUpdateNotificationStateForCharacteristic:error:")
    void didUpdateNotificationState(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error);
    @Mapping("peripheral:didDiscoverDescriptorsForCharacteristic:error:")
    void didDiscoverDescriptors(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error);
    @Mapping("peripheral:didUpdateValueForDescriptor:error:")
    void didUpdateValue(CBPeripheral peripheral, CBDescriptor descriptor, NSError error);
    @Mapping("peripheral:didWriteValueForDescriptor:error:")
    void didWriteValue(CBPeripheral peripheral, CBDescriptor descriptor, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
