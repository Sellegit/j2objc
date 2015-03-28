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
@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBCentralManager")
public class CBCentralManager 
    extends NSObject 
     {

    
    
    @Mapping("initWithDelegate:queue:")
    public CBCentralManager(CBCentralManagerDelegate delegate, DispatchQueue queue) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithDelegate:queue:options:")
    public CBCentralManager(CBCentralManagerDelegate delegate, DispatchQueue queue, NSDictionary<?, ?> options) { }
    @Mapping("init")
    public CBCentralManager() { }

    
    @Mapping("delegate")
    public native CBCentralManagerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(CBCentralManagerDelegate v);
    @Mapping("state")
    public native @Representing("CBCentralManagerState") long getState();

    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("retrievePeripherals:")
    public native void retrievePeripherals(NSArray<?> peripheralUUIDs);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("retrievePeripheralsWithIdentifiers:")
    public native NSArray<CBPeripheral> retrievePeripheralsWithId(NSArray<?> identifiers);
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
    public native NSArray<CBPeripheral> retrieveConnectedPeripherals(NSArray<?> serviceUUIDs);
    @Mapping("scanForPeripheralsWithServices:options:")
    public native void scanForPeripherals(NSArray<?> serviceUUIDs, NSDictionary<?, ?> options);
    @Mapping("stopScan")
    public native void stopScan();
    @Mapping("connectPeripheral:options:")
    public native void connectPeripheral(CBPeripheral peripheral, NSDictionary<?, ?> options);
    @Mapping("cancelPeripheralConnection:")
    public native void cancelPeripheralConnection(CBPeripheral peripheral);

}
