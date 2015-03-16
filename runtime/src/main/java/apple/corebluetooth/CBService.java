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

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBService")
public class CBService 
    extends CBAttribute 
     {

    
    
    public CBService() {}
    
    
    @Mapping("peripheral")
    public native CBPeripheral getPeripheral();
    @Mapping("isPrimary")
    public native boolean isPrimary();
    @Mapping("includedServices")
    public native NSArray<CBService> getIncludedServices();
    @Mapping("characteristics")
    public native NSArray<CBCharacteristic> getCharacteristics();
    
    
    
    
    
}
