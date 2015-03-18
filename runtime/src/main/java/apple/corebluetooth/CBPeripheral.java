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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBPeripheral")
public class CBPeripheral 
    extends CBPeer 
     {

    
    
    @Mapping("init")
    public CBPeripheral() { }
    
    
    @Mapping("delegate")
    public native CBPeripheralDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(CBPeripheralDelegate v);
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("RSSI")
    public native NSNumber getRSSI();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("isConnected")
    public native boolean isConnected();
    @Mapping("state")
    public native @Representing("CBPeripheralState") @MachineSizedSInt long getState();
    @Mapping("services")
    public native NSArray<CBService> getServices();
    
    
    
    @Mapping("readRSSI")
    public native void readRSSI();
    @Mapping("discoverServices:")
    public native void discoverServices(NSArray<?> serviceUUIDs);
    @Mapping("discoverIncludedServices:forService:")
    public native void discoverIncludedServices(NSArray<?> includedServiceUUIDs, CBService service);
    @Mapping("discoverCharacteristics:forService:")
    public native void discoverCharacteristics(NSArray<?> characteristicUUIDs, CBService service);
    @Mapping("readValueForCharacteristic:")
    public native void readValue(CBCharacteristic characteristic);
    @Mapping("writeValue:forCharacteristic:type:")
    public native void writeValue(NSData data, CBCharacteristic characteristic, @Representing("CBCharacteristicWriteType") @MachineSizedSInt long type);
    @Mapping("setNotifyValue:forCharacteristic:")
    public native void setNotifyValue(boolean enabled, CBCharacteristic characteristic);
    @Mapping("discoverDescriptorsForCharacteristic:")
    public native void discoverDescriptors(CBCharacteristic characteristic);
    @Mapping("readValueForDescriptor:")
    public native void readValue(CBDescriptor descriptor);
    @Mapping("writeValue:forDescriptor:")
    public native void writeValue(NSData data, CBDescriptor descriptor);
    
}
