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
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBAttribute")
public class CBAttribute 
    extends NSObject 
     {

    
    
    public CBAttribute() {}
    
    
    @Mapping("UUID")
    public native CBUUID getUUID();
    
    
    
    
    
}
