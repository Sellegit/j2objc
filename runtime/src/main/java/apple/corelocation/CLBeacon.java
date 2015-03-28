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
 * @since Available in iOS 7.0 and later.
 */
@Library("CoreLocation/CoreLocation.h") @Mapping("CLBeacon")
public class CLBeacon 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public CLBeacon() { }

    
    @Mapping("proximityUUID")
    public native NSUUID getProximityUUID();
    @Mapping("major")
    public native NSNumber getMajor();
    @Mapping("minor")
    public native NSNumber getMinor();
    @Mapping("proximity")
    public native @Representing("CLProximity") long getProximity();
    @Mapping("accuracy")
    public native double getAccuracy();
    @Mapping("rssi")
    public native @MachineSizedSInt long getRssi();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
