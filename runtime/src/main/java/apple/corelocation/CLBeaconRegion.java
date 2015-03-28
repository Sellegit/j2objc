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
@Library("CoreLocation/CoreLocation.h") @Mapping("CLBeaconRegion")
public class CLBeaconRegion 
    extends CLRegion 
     {

    
    
    @Mapping("initWithProximityUUID:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, String identifier) { }
    @Mapping("initWithProximityUUID:major:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, short major, String identifier) { }
    @Mapping("initWithProximityUUID:major:minor:identifier:")
    public CLBeaconRegion(NSUUID proximityUUID, short major, short minor, String identifier) { }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initCircularRegionWithCenter:radius:identifier:")
    public CLBeaconRegion(CLLocationCoordinate2D center, double radius, String identifier) { }
    @Mapping("init")
    public CLBeaconRegion() { }

    
    @Mapping("proximityUUID")
    public native NSUUID getProximityUUID();
    @Mapping("major")
    public native NSNumber getMajor();
    @Mapping("minor")
    public native NSNumber getMinor();
    @Mapping("notifyEntryStateOnDisplay")
    public native boolean notifiesEntryStateOnDisplay();
    @Mapping("setNotifyEntryStateOnDisplay:")
    public native void setNotifiesEntryStateOnDisplay(boolean v);

    
    
    @Mapping("peripheralDataWithMeasuredPower:")
    public native CBAdvertisementData getPeripheralData(NSNumber measuredPower);

}
