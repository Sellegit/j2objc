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

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBDescriptor")
public class CBDescriptor 
    extends CBAttribute 
     {

    
    
    public CBDescriptor() {}
    
    
    @Mapping("characteristic")
    public native CBCharacteristic getCharacteristic();
    @Mapping("value")
    public native Object getValue();
    
    
    
    
    
}
