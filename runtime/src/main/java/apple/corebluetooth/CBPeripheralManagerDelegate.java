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





@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBPeripheralManagerDelegate")
public interface CBPeripheralManagerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("peripheralManagerDidUpdateState:")
    void didUpdateState(CBPeripheralManager peripheral);
    @Mapping("peripheralManager:willRestoreState:")
    void willRestoreState(CBPeripheralManager peripheral, NSDictionary<?, ?> dict);
    @Mapping("peripheralManagerDidStartAdvertising:error:")
    void didStartAdvertising(CBPeripheralManager peripheral, NSError error);
    @Mapping("peripheralManager:didAddService:error:")
    void didAddService(CBPeripheralManager peripheral, CBService service, NSError error);
    @Mapping("peripheralManager:central:didSubscribeToCharacteristic:")
    void didSubscribeToCharacteristic(CBPeripheralManager peripheral, CBCentral central, CBCharacteristic characteristic);
    @Mapping("peripheralManager:central:didUnsubscribeFromCharacteristic:")
    void didUnsubscribeFromCharacteristic(CBPeripheralManager peripheral, CBCentral central, CBCharacteristic characteristic);
    @Mapping("peripheralManager:didReceiveReadRequest:")
    void didReceiveReadRequest(CBPeripheralManager peripheral, CBATTRequest request);
    @Mapping("peripheralManager:didReceiveWriteRequests:")
    void didReceiveWriteRequests(CBPeripheralManager peripheral, NSArray<?> requests);
    @Mapping("peripheralManagerIsReadyToUpdateSubscribers:")
    void readyToUpdateSubscribers(CBPeripheralManager peripheral);
    
    /*<adapter>*/
    /*</adapter>*/
}
