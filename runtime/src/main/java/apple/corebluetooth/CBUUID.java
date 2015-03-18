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

@Library("CoreBluetooth/CoreBluetooth.h") @Mapping("CBUUID")
public class CBUUID 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public CBUUID() { }
    
    
    @Mapping("data")
    public native NSData getData();
    /**
     * @since Available in iOS 7.1 and later.
     */
    @Mapping("UUIDString")
    public native String getUUIDString();
    
    
    
    @Mapping("UUIDWithString:")
    public static native CBUUID create(String theString);
    @Mapping("UUIDWithData:")
    public static native CBUUID create(NSData theData);
    @Mapping("UUIDWithCFUUID:")
    public static native CBUUID create(CFUUID theUUID);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("UUIDWithNSUUID:")
    public static native CBUUID create(NSUUID theUUID);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
