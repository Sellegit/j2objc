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

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBCharacteristic")
public class CBCharacteristic 
    extends CBAttribute 
     {

    
    
    @Mapping("init")
    public CBCharacteristic() { }
    
    
    @Mapping("service")
    public native CBService getService();
    @Mapping("properties")
    public native @Representing("CBCharacteristicProperties") long getProperties();
    @Mapping("value")
    public native NSData getValue();
    @Mapping("descriptors")
    public native NSArray<CBDescriptor> getDescriptors();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("isBroadcasted")
    public native boolean isBroadcasted();
    @Mapping("isNotifying")
    public native boolean isNotifying();
    
    
    
    
    
}
