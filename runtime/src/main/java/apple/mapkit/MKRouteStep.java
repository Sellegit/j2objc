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
@Library("MapKit/MapKit.h") @Mapping("MKRouteStep")
public class MKRouteStep 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MKRouteStep() { }

    
    @Mapping("instructions")
    public native String getInstructions();
    @Mapping("notice")
    public native String getNotice();
    @Mapping("polyline")
    public native MKPolyline getPolyline();
    @Mapping("distance")
    public native double getDistance();
    @Mapping("transportType")
    public native @Representing("MKDirectionsTransportType") long getTransportType();

    
    


}
