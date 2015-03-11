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

@Library("CoreBluetooth") @Mapping("CBCentralManager")
public class CBCentralManager 
    extends NSObject 
     {

    
    
    public CBCentralManager() {}
    @Mapping("initWithDelegate:queue:")
    public CBCentralManager(CBCentralManagerDelegate delegate, DispatchQueue queue) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithDelegate:queue:options:")
    public CBCentralManager(CBCentralManagerDelegate delegate, DispatchQueue queue, CBCentralManagerOptions options) { }
    
    
    @Mapping("delegate")
    public native CBCentralManagerDelegate getDelegate();
    public native void setDelegate(CBCentralManagerDelegate v);
    @Mapping("state")
    public native @Representing("CBCentralManagerState") @MachineSizedSInt long getState();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("retrievePeripherals:")
    public native void retrievePeripherals(List<CFUUID> peripheralUUIDs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("retrievePeripheralsWithIdentifiers:")
    public native NSArray<CBPeripheral> retrievePeripheralsWithId(NSArray<NSUUID> identifiers);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("retrieveConnectedPeripherals")
    public native void retrieveConnectedPeripherals();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("retrieveConnectedPeripheralsWithServices:")
    public native NSArray<CBPeripheral> retrieveConnectedPeripherals(NSArray<CBUUID> serviceUUIDs);
    @Mapping("scanForPeripheralsWithServices:options:")
    public native void scanForPeripherals(NSArray<CBUUID> serviceUUIDs, CBCentralManagerScanOptions options);
    @Mapping("stopScan")
    public native void stopScan();
    @Mapping("connectPeripheral:options:")
    public native void connectPeripheral(CBPeripheral peripheral, CBConnectPeripheralOptions options);
    @Mapping("cancelPeripheralConnection:")
    public native void cancelPeripheralConnection(CBPeripheral peripheral);
    
}
