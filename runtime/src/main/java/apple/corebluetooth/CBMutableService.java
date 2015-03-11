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

@Library("CoreBluetooth") @Mapping("CBMutableService")
public class CBMutableService 
    extends CBService 
     {

    
    
    public CBMutableService() {}
    @Mapping("initWithType:primary:")
    public CBMutableService(CBUUID UUID, boolean isPrimary) { }
    
    
    @Mapping("UUID")
    public native CBUUID getUUID();
    public native void setUUID(CBUUID v);
    @Mapping("isPrimary")
    public native boolean isPrimary();
    public native void setPrimary(boolean v);
    @Mapping("includedServices")
    public native NSArray<CBService> getIncludedServices();
    public native void setIncludedServices(NSArray<CBService> v);
    @Mapping("characteristics")
    public native NSArray<CBCharacteristic> getCharacteristics();
    public native void setCharacteristics(NSArray<CBCharacteristic> v);
    
    
    
    
    
}
