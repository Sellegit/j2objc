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
@Adapter
public abstract class CBPeripheralManagerDelegateAdapter 
    extends Object 
    implements CBPeripheralManagerDelegate {

    
    
    


    
    
    @NotImplemented("peripheralManagerDidUpdateState:")
    public void didUpdateState(CBPeripheralManager peripheral) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:willRestoreState:")
    public void willRestoreState(CBPeripheralManager peripheral, NSDictionary<?, ?> dict) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManagerDidStartAdvertising:error:")
    public void didStartAdvertising(CBPeripheralManager peripheral, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:didAddService:error:")
    public void didAddService(CBPeripheralManager peripheral, CBService service, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:central:didSubscribeToCharacteristic:")
    public void didSubscribeToCharacteristic(CBPeripheralManager peripheral, CBCentral central, CBCharacteristic characteristic) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:central:didUnsubscribeFromCharacteristic:")
    public void didUnsubscribeFromCharacteristic(CBPeripheralManager peripheral, CBCentral central, CBCharacteristic characteristic) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:didReceiveReadRequest:")
    public void didReceiveReadRequest(CBPeripheralManager peripheral, CBATTRequest request) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManager:didReceiveWriteRequests:")
    public void didReceiveWriteRequests(CBPeripheralManager peripheral, NSArray<?> requests) { throw new UnsupportedOperationException(); }
    @NotImplemented("peripheralManagerIsReadyToUpdateSubscribers:")
    public void readyToUpdateSubscribers(CBPeripheralManager peripheral) { throw new UnsupportedOperationException(); }

}
