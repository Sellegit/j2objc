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
 * @since Available in iOS 3.0 and later.
 */
@Library("CoreLocation/CoreLocation.h") @Mapping("CLHeading")
public class CLHeading 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public CLHeading() { }

    
    @Mapping("magneticHeading")
    public native double getMagneticHeading();
    @Mapping("trueHeading")
    public native double getTrueHeading();
    @Mapping("headingAccuracy")
    public native double getHeadingAccuracy();
    @Mapping("x")
    public native double getX();
    @Mapping("y")
    public native double getY();
    @Mapping("z")
    public native double getZ();
    @Mapping("timestamp")
    public native NSDate getTimestamp();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
