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
 * @since Available in iOS 7.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKRoute")
public class MKRoute 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MKRoute() { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("advisoryNotices")
    public native List<String> getAdvisoryNotices();
    @Mapping("distance")
    public native double getDistance();
    @Mapping("expectedTravelTime")
    public native double getExpectedTravelTime();
    @Mapping("transportType")
    public native @Representing("MKDirectionsTransportType") long getTransportType();
    @Mapping("polyline")
    public native MKPolyline getPolyline();
    @Mapping("steps")
    public native NSArray<MKRouteStep> getSteps();
    
    
    
    
    
}
