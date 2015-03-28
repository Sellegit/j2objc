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
@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBMutableCharacteristic")
public class CBMutableCharacteristic 
    extends CBCharacteristic 
     {

    
    
    @Mapping("initWithType:properties:value:permissions:")
    public CBMutableCharacteristic(CBUUID UUID, @Representing("CBCharacteristicProperties") long properties, NSData value, @Representing("CBAttributePermissions") long permissions) { }
    @Mapping("init")
    public CBMutableCharacteristic() { }

    
    @Mapping("permissions")
    public native @Representing("CBAttributePermissions") long getPermissions();
    @Mapping("setPermissions:")
    public native void setPermissions(@Representing("CBAttributePermissions") long v);
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
    public native @Representing("CBCharacteristicProperties") long getProperties();
    @Mapping("setProperties:")
    public native void setProperties(@Representing("CBCharacteristicProperties") long v);
    @Mapping("value")
    public native NSData getValue();
    @Mapping("setValue:")
    public native void setValue(NSData v);
    @Mapping("descriptors")
    public native NSArray<CBDescriptor> getDescriptors();
    @Mapping("setDescriptors:")
    public native void setDescriptors(NSArray<CBDescriptor> v);

    
    


}
