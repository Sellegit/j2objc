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


/*<javadoc>*/
/*</javadoc>*/

public abstract class CBPeripheralDelegateAdapter 
    extends Object 
    implements CBPeripheralDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("peripheralDidUpdateName:")
    public void didUpdateName(CBPeripheral peripheral) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @NotImplemented("peripheralDidInvalidateServices:")
    public void didInvalidateServices(CBPeripheral peripheral) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("peripheral:didModifyServices:")
    public void didModifyServices(CBPeripheral peripheral, NSArray<CBService> invalidatedServices) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("peripheralDidUpdateRSSI:error:")
    public void didUpdateRSSI(CBPeripheral peripheral, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("peripheral:didReadRSSI:error:")
    public void didReadRSSI(CBPeripheral peripheral, NSNumber RSSI, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didDiscoverServices:")
    public void didDiscoverServices(CBPeripheral peripheral, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didDiscoverIncludedServicesForService:error:")
    public void didDiscoverIncludedServices(CBPeripheral peripheral, CBService service, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didDiscoverCharacteristicsForService:error:")
    public void didDiscoverCharacteristics(CBPeripheral peripheral, CBService service, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didUpdateValueForCharacteristic:error:")
    public void didUpdateValue(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didWriteValueForCharacteristic:error:")
    public void didWriteValue(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didUpdateNotificationStateForCharacteristic:error:")
    public void didUpdateNotificationState(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didDiscoverDescriptorsForCharacteristic:error:")
    public void didDiscoverDescriptors(CBPeripheral peripheral, CBCharacteristic characteristic, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didUpdateValueForDescriptor:error:")
    public void didUpdateValue(CBPeripheral peripheral, CBDescriptor descriptor, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheral:didWriteValueForDescriptor:error:")
    public void didWriteValue(CBPeripheral peripheral, CBDescriptor descriptor, NSError error) { throw new UnsupportedOperationException(); }
    
}
