package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreLocation/CoreLocation.h") @Mapping("CLFloor")
public class CLFloor 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public CLFloor() { }
    
    
    @Mapping("level")
    public native @MachineSizedSInt long getLevel();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
