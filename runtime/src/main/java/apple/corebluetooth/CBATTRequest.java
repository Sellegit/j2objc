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

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBATTRequest")
public class CBATTRequest 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CBATTRequest() { }
    
    
    @Mapping("central")
    public native CBCentral getCentral();
    @Mapping("characteristic")
    public native CBCharacteristic getCharacteristic();
    @Mapping("offset")
    public native @MachineSizedUInt long getOffset();
    @Mapping("value")
    public native NSData getValue();
    @Mapping("setValue:")
    public native void setValue(NSData v);
    
    
    
    
    
}
