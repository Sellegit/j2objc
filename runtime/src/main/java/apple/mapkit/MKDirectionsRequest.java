package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKDirectionsRequest")
public class MKDirectionsRequest 
    extends NSObject 
     {

    
    
    public MKDirectionsRequest() {}
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("initWithContentsOfURL:")
    public MKDirectionsRequest(NSURL url) { }
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("transportType")
    public native @Representing("MKDirectionsTransportType") @MachineSizedUInt long getTransportType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTransportType:")
    public native void setTransportType(@Representing("MKDirectionsTransportType") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("requestsAlternateRoutes")
    public native boolean requestsAlternateRoutes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setRequestsAlternateRoutes:")
    public native void setRequestsAlternateRoutes(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("departureDate")
    public native NSDate getDepartureDate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDepartureDate:")
    public native void setDepartureDate(NSDate v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("arrivalDate")
    public native NSDate getArrivalDate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setArrivalDate:")
    public native void setArrivalDate(NSDate v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("source")
    public native MKMapItem getSource();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSource:")
    public native void setSource(MKMapItem source);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("destination")
    public native MKMapItem getDestination();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDestination:")
    public native void setDestination(MKMapItem destination);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isDirectionsRequestURL:")
    public static native boolean isDirectionsRequestURL(NSURL url);
    
}
