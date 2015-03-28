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


@Library("CoreLocation/CoreLocation.h") @Mapping("CLLocationManagerDelegate")
public interface CLLocationManagerDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("locationManager:didUpdateToLocation:fromLocation:")
    void didUpdateToLocation(CLLocationManager manager, CLLocation newLocation, CLLocation oldLocation);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("locationManager:didUpdateLocations:")
    void didUpdateLocations(CLLocationManager manager, NSArray<?> locations);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("locationManager:didUpdateHeading:")
    void didUpdateHeading(CLLocationManager manager, CLHeading newHeading);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("locationManagerShouldDisplayHeadingCalibration:")
    boolean shouldDisplayHeadingCalibration(CLLocationManager manager);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("locationManager:didDetermineState:forRegion:")
    void didDetermineState(CLLocationManager manager, @Representing("CLRegionState") long state, CLRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("locationManager:didRangeBeacons:inRegion:")
    void didRangeBeacons(CLLocationManager manager, NSArray<?> beacons, CLBeaconRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("locationManager:rangingBeaconsDidFailForRegion:withError:")
    void rangingBeaconsDidFail(CLLocationManager manager, CLBeaconRegion region, NSError error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("locationManager:didEnterRegion:")
    void didEnterRegion(CLLocationManager manager, CLRegion region);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("locationManager:didExitRegion:")
    void didExitRegion(CLLocationManager manager, CLRegion region);
    @Mapping("locationManager:didFailWithError:")
    void didFail(CLLocationManager manager, NSError error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("locationManager:monitoringDidFailForRegion:withError:")
    void monitoringDidFail(CLLocationManager manager, CLRegion region, NSError error);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("locationManager:didChangeAuthorizationStatus:")
    void didChangeAuthorizationStatus(CLLocationManager manager, @Representing("CLAuthorizationStatus") long status);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("locationManager:didStartMonitoringForRegion:")
    void didStartMonitoring(CLLocationManager manager, CLRegion region);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("locationManagerDidPauseLocationUpdates:")
    void didPauseLocationUpdates(CLLocationManager manager);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("locationManagerDidResumeLocationUpdates:")
    void didResumeLocationUpdates(CLLocationManager manager);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("locationManager:didFinishDeferredUpdatesWithError:")
    void didFinishDeferredUpdates(CLLocationManager manager, NSError error);
    @Mapping("locationManager:didVisit:")
    void didVisit(CLLocationManager manager, CLVisit visit);

    /*<adapter>*/
    /*</adapter>*/
}
