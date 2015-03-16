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





@Library("CoreLocation/CoreLocation.h")
@Mapping("CLErrorCode")
public final class CLErrorCode extends ObjCEnum {
    
    @GlobalConstant("kCLErrorLocationUnknown")
    public static final long LocationUnknown = 0L;
    @GlobalConstant("kCLErrorDenied")
    public static final long Denied = 1L;
    @GlobalConstant("kCLErrorNetwork")
    public static final long Network = 2L;
    @GlobalConstant("kCLErrorHeadingFailure")
    public static final long HeadingFailure = 3L;
    @GlobalConstant("kCLErrorRegionMonitoringDenied")
    public static final long RegionMonitoringDenied = 4L;
    @GlobalConstant("kCLErrorRegionMonitoringFailure")
    public static final long RegionMonitoringFailure = 5L;
    @GlobalConstant("kCLErrorRegionMonitoringSetupDelayed")
    public static final long RegionMonitoringSetupDelayed = 6L;
    @GlobalConstant("kCLErrorRegionMonitoringResponseDelayed")
    public static final long RegionMonitoringResponseDelayed = 7L;
    @GlobalConstant("kCLErrorGeocodeFoundNoResult")
    public static final long GeocodeFoundNoResult = 8L;
    @GlobalConstant("kCLErrorGeocodeFoundPartialResult")
    public static final long GeocodeFoundPartialResult = 9L;
    @GlobalConstant("kCLErrorGeocodeCanceled")
    public static final long GeocodeCanceled = 10L;
    @GlobalConstant("kCLErrorDeferredFailed")
    public static final long DeferredFailed = 11L;
    @GlobalConstant("kCLErrorDeferredNotUpdatingLocation")
    public static final long DeferredNotUpdatingLocation = 12L;
    @GlobalConstant("kCLErrorDeferredAccuracyTooLow")
    public static final long DeferredAccuracyTooLow = 13L;
    @GlobalConstant("kCLErrorDeferredDistanceFiltered")
    public static final long DeferredDistanceFiltered = 14L;
    @GlobalConstant("kCLErrorDeferredCanceled")
    public static final long DeferredCanceled = 15L;
    @GlobalConstant("kCLErrorRangingUnavailable")
    public static final long RangingUnavailable = 16L;
    @GlobalConstant("kCLErrorRangingFailure")
    public static final long RangingFailure = 17L;
    

}
