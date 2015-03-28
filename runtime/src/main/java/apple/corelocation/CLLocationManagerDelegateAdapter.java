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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class CLLocationManagerDelegateAdapter 
    extends Object 
    implements CLLocationManagerDelegate {

    
    
    


    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("locationManager:didUpdateToLocation:fromLocation:")
    public void didUpdateToLocation(CLLocationManager manager, CLLocation newLocation, CLLocation oldLocation) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("locationManager:didUpdateLocations:")
    public void didUpdateLocations(CLLocationManager manager, NSArray<?> locations) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("locationManager:didUpdateHeading:")
    public void didUpdateHeading(CLLocationManager manager, CLHeading newHeading) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("locationManagerShouldDisplayHeadingCalibration:")
    public boolean shouldDisplayHeadingCalibration(CLLocationManager manager) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("locationManager:didDetermineState:forRegion:")
    public void didDetermineState(CLLocationManager manager, @Representing("CLRegionState") long state, CLRegion region) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("locationManager:didRangeBeacons:inRegion:")
    public void didRangeBeacons(CLLocationManager manager, NSArray<?> beacons, CLBeaconRegion region) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("locationManager:rangingBeaconsDidFailForRegion:withError:")
    public void rangingBeaconsDidFail(CLLocationManager manager, CLBeaconRegion region, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("locationManager:didEnterRegion:")
    public void didEnterRegion(CLLocationManager manager, CLRegion region) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("locationManager:didExitRegion:")
    public void didExitRegion(CLLocationManager manager, CLRegion region) { throw new UnsupportedOperationException(); }
    @NotImplemented("locationManager:didFailWithError:")
    public void didFail(CLLocationManager manager, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("locationManager:monitoringDidFailForRegion:withError:")
    public void monitoringDidFail(CLLocationManager manager, CLRegion region, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.2 and later.
     */
    @NotImplemented("locationManager:didChangeAuthorizationStatus:")
    public void didChangeAuthorizationStatus(CLLocationManager manager, @Representing("CLAuthorizationStatus") long status) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("locationManager:didStartMonitoringForRegion:")
    public void didStartMonitoring(CLLocationManager manager, CLRegion region) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("locationManagerDidPauseLocationUpdates:")
    public void didPauseLocationUpdates(CLLocationManager manager) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("locationManagerDidResumeLocationUpdates:")
    public void didResumeLocationUpdates(CLLocationManager manager) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("locationManager:didFinishDeferredUpdatesWithError:")
    public void didFinishDeferredUpdates(CLLocationManager manager, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("locationManager:didVisit:")
    public void didVisit(CLLocationManager manager, CLVisit visit) { throw new UnsupportedOperationException(); }

}
