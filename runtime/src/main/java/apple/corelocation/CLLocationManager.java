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

@Library("CoreLocation/CoreLocation.h") @Mapping("CLLocationManager")
public class CLLocationManager 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CLLocationManager() { }
    
    
    @Mapping("delegate")
    public native CLLocationManagerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(CLLocationManagerDelegate v);
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("purpose")
    public native String getPurpose();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setPurpose:")
    public native void setPurpose(String v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("activityType")
    public native @Representing("CLActivityType") @MachineSizedSInt long getActivityType();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setActivityType:")
    public native void setActivityType(@Representing("CLActivityType") @MachineSizedSInt long v);
    @Mapping("distanceFilter")
    public native double getDistanceFilter();
    @Mapping("setDistanceFilter:")
    public native void setDistanceFilter(double v);
    @Mapping("desiredAccuracy")
    public native double getDesiredAccuracy();
    @Mapping("setDesiredAccuracy:")
    public native void setDesiredAccuracy(double v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pausesLocationUpdatesAutomatically")
    public native boolean pausesLocationUpdatesAutomatically();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setPausesLocationUpdatesAutomatically:")
    public native void setPausesLocationUpdatesAutomatically(boolean v);
    @Mapping("location")
    public native CLLocation getLocation();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("headingFilter")
    public native double getHeadingFilter();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setHeadingFilter:")
    public native void setHeadingFilter(double v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("headingOrientation")
    public native @Representing("CLDeviceOrientation") int getHeadingOrientation();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setHeadingOrientation:")
    public native void setHeadingOrientation(@Representing("CLDeviceOrientation") int v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("heading")
    public native CLHeading getHeading();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("maximumRegionMonitoringDistance")
    public native double getMaximumRegionMonitoringDistance();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("monitoredRegions")
    public native NSSet<CLRegion> getMonitoredRegions();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rangedRegions")
    public native NSSet<CLBeaconRegion> getRangedRegions();
    
    
    
    @GlobalConstant("kCLDistanceFilterNone")
    public static native double getDistanceFilterNone();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("CLTimeIntervalMax")
    public static native double getTimeIntervalMax();
    @GlobalConstant("kCLHeadingFilterNone")
    public static native double getHeadingFilterNone();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("requestWhenInUseAuthorization")
    public native void requestWhenInUseAuthorization();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("requestAlwaysAuthorization")
    public native void requestAlwaysAuthorization();
    @Mapping("startUpdatingLocation")
    public native void startUpdatingLocation();
    @Mapping("stopUpdatingLocation")
    public native void stopUpdatingLocation();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("startUpdatingHeading")
    public native void startUpdatingHeading();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("stopUpdatingHeading")
    public native void stopUpdatingHeading();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("dismissHeadingCalibrationDisplay")
    public native void dismissHeadingCalibrationDisplay();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("startMonitoringSignificantLocationChanges")
    public native void startMonitoringSignificantLocationChanges();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("stopMonitoringSignificantLocationChanges")
    public native void stopMonitoringSignificantLocationChanges();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("startMonitoringForRegion:desiredAccuracy:")
    public native void startMonitoring(CLRegion region, double accuracy);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("stopMonitoringForRegion:")
    public native void stopMonitoring(CLRegion region);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startMonitoringForRegion:")
    public native void startMonitoring(CLRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("requestStateForRegion:")
    public native void requestState(CLRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("startRangingBeaconsInRegion:")
    public native void startRangingBeacons(CLBeaconRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("stopRangingBeaconsInRegion:")
    public native void stopRangingBeacons(CLBeaconRegion region);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowDeferredLocationUpdatesUntilTraveled:timeout:")
    public native void allowDeferredLocationUpdatesUntil(double distance, double timeout);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("disallowDeferredLocationUpdates")
    public native void disallowDeferredLocationUpdates();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("locationServicesEnabled")
    public static native boolean isLocationServicesEnabled();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("headingAvailable")
    public static native boolean isHeadingAvailable();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("significantLocationChangeMonitoringAvailable")
    public static native boolean isSignificantLocationChangeMonitoringAvailable();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("regionMonitoringAvailable")
    public static native boolean isRegionMonitoringAvailable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isRangingAvailable")
    public static native boolean isRangingAvailable();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("authorizationStatus")
    public static native @Representing("CLAuthorizationStatus") int getAuthorizationStatus();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("deferredLocationUpdatesAvailable")
    public static native boolean isDeferredLocationUpdatesAvailable();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("startMonitoringVisits")
    public native void startMonitoringVisits();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("stopMonitoringVisits")
    public native void stopMonitoringVisits();
    
}
