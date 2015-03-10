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
 * @since Available in iOS 6.0 and later.
 */

@Library("CoreBluetooth") @Mapping("CBPeripheralManager")
public class CBPeripheralManager 
    extends NSObject 
     {

    
    
    public CBPeripheralManager() {}
    @Mapping("initWithDelegate:queue:")
    public CBPeripheralManager(CBPeripheralManagerDelegate delegate, DispatchQueue queue) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithDelegate:queue:options:")
    public CBPeripheralManager(CBPeripheralManagerDelegate delegate, DispatchQueue queue, CBPeripheralManagerOptions options) { }
    
    
    @Mapping("delegate")
    public native CBPeripheralManagerDelegate getDelegate();
    public native void setDelegate(CBPeripheralManagerDelegate v);
    @Mapping("state")
    public native @Representing("CBPeripheralManagerState") @MachineSizedSInt long getState();
    @Mapping("isAdvertising")
    public native boolean isAdvertising();
    
    
    
    @Mapping("startAdvertising:")
    public native void startAdvertising(CBAdvertisementData advertisementData);
    @Mapping("stopAdvertising")
    public native void stopAdvertising();
    @Mapping("setDesiredConnectionLatency:forCentral:")
    public native void setDesiredConnectionLatency(@Representing("CBPeripheralManagerConnectionLatency") @MachineSizedSInt long latency, CBCentral central);
    @Mapping("addService:")
    public native void addService(CBMutableService service);
    @Mapping("removeService:")
    public native void removeService(CBMutableService service);
    @Mapping("removeAllServices")
    public native void removeAllServices();
    @Mapping("respondToRequest:withResult:")
    public native void respondToRequest(CBATTRequest request, CBATTError result);
    @Mapping("updateValue:forCharacteristic:onSubscribedCentrals:")
    public native boolean updateValue(NSData value, CBMutableCharacteristic characteristic, NSArray<CBCentral> centrals);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("authorizationStatus")
    public static native @Representing("CBPeripheralManagerAuthorizationStatus") @MachineSizedSInt long authorizationStatus();
    
}
