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


/*<javadoc>*/
/*</javadoc>*/

public abstract class HMAccessoryDelegateAdapter 
    extends Object 
    implements HMAccessoryDelegate {

    
    
    
    
    
    
    
    @NotImplemented("accessoryDidUpdateName:")
    public void didUpdateName(HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessory:didUpdateNameForService:")
    public void didUpdateServiceName(HMAccessory accessory, HMService service) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessory:didUpdateAssociatedServiceTypeForService:")
    public void didUpdateAssociatedServiceType(HMAccessory accessory, HMService service) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessoryDidUpdateServices:")
    public void didUpdateServices(HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessoryDidUpdateReachability:")
    public void didUpdateReachability(HMAccessory accessory) { throw new UnsupportedOperationException(); }
    @NotImplemented("accessory:service:didUpdateValueForCharacteristic:")
    public void didUpdateCharacteristicValue(HMAccessory accessory, HMService service, HMCharacteristic characteristic) { throw new UnsupportedOperationException(); }
    
}
