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
 * @since Available in iOS 2.0 and later.
 */

@Library("CoreLocation") @Mapping("CLLocation")
public class CLLocation 
    extends NSObject 
    implements NSCopying {

    
    
    public CLLocation() {}
    @Mapping("initWithLatitude:longitude:")
    public CLLocation(double latitude, double longitude) { }
    @Mapping("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:")
    public CLLocation(CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy, NSDate timestamp) { }
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:")
    public CLLocation(CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy, double course, double speed, NSDate timestamp) { }
    
    
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("altitude")
    public native double getAltitude();
    @Mapping("horizontalAccuracy")
    public native double getHorizontalAccuracy();
    @Mapping("verticalAccuracy")
    public native double getVerticalAccuracy();
    /**
     * @since Available in iOS 2.2 and later.
     */
    @Mapping("course")
    public native double getCourse();
    /**
     * @since Available in iOS 2.2 and later.
     */
    @Mapping("speed")
    public native double getSpeed();
    @Mapping("timestamp")
    public native NSDate getTimestamp();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("floor")
    public native CLFloor getFloor();
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CLLocationDistanceMax")
    public static native double getLocationDistanceMax();
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("distanceFromLocation:")
    public native double getDistanceTo(CLLocation location);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
