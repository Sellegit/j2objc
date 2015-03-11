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

@Library("CoreBluetooth") @Mapping("CBMutableCharacteristic")
public class CBMutableCharacteristic 
    extends CBCharacteristic 
     {

    
    
    public CBMutableCharacteristic() {}
    @Mapping("initWithType:properties:value:permissions:")
    public CBMutableCharacteristic(CBUUID UUID, @Representing("CBCharacteristicProperties") @MachineSizedUInt long properties, NSData value, @Representing("CBAttributePermissions") @MachineSizedUInt long permissions) { }
    
    
    @Mapping("permissions")
    public native @Representing("CBAttributePermissions") @MachineSizedUInt long getPermissions();
    @Mapping("setPermissions:")
    public native void setPermissions(@Representing("CBAttributePermissions") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("subscribedCentrals")
    public native NSArray<CBCentral> getSubscribedCentrals();
    @Mapping("UUID")
    public native CBUUID getUUID();
    @Mapping("setUUID:")
    public native void setUUID(CBUUID v);
    @Mapping("properties")
    public native @Representing("CBCharacteristicProperties") @MachineSizedUInt long getProperties();
    @Mapping("setProperties:")
    public native void setProperties(@Representing("CBCharacteristicProperties") @MachineSizedUInt long v);
    @Mapping("value")
    public native NSData getValue();
    @Mapping("setValue:")
    public native void setValue(NSData v);
    @Mapping("descriptors")
    public native NSArray<CBDescriptor> getDescriptors();
    @Mapping("setDescriptors:")
    public native void setDescriptors(NSArray<CBDescriptor> v);
    
    
    
    
    
}
