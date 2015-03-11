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





@Library("CoreBluetooth") @Mapping("CBCentralManagerDelegate")
public interface CBCentralManagerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("centralManagerDidUpdateState:")
    void didUpdateState(CBCentralManager central);
    @Mapping("centralManager:willRestoreState:")
    void willRestoreState(CBCentralManager central, CBCentralManagerRestoredState dict);
    @Mapping("centralManager:didRetrievePeripherals:")
    void didRetrievePeripherals(CBCentralManager central, NSArray<CBPeripheral> peripherals);
    @Mapping("centralManager:didRetrieveConnectedPeripherals:")
    void didRetrieveConnectedPeripherals(CBCentralManager central, NSArray<CBPeripheral> peripherals);
    @Mapping("centralManager:didDiscoverPeripheral:advertisementData:RSSI:")
    void didDiscoverPeripheral(CBCentralManager central, CBPeripheral peripheral, CBAdvertisementData advertisementData, NSNumber rssi);
    @Mapping("centralManager:didConnectPeripheral:")
    void didConnectPeripheral(CBCentralManager central, CBPeripheral peripheral);
    @Mapping("centralManager:didFailToConnectPeripheral:error:")
    void didFailToConnectPeripheral(CBCentralManager central, CBPeripheral peripheral, NSError error);
    @Mapping("centralManager:didDisconnectPeripheral:error:")
    void didDisconnectPeripheral(CBCentralManager central, CBPeripheral peripheral, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
