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
@Library("MapKit/MapKit.h") @Mapping("MKMapSnapshotOptions")
public class MKMapSnapshotOptions 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MKMapSnapshotOptions() { }

    
    @Mapping("camera")
    public native MKMapCamera getCamera();
    @Mapping("setCamera:")
    public native void setCamera(MKMapCamera v);
    @Mapping("mapRect")
    public native MKMapRect getMapRect();
    @Mapping("setMapRect:")
    public native void setMapRect(MKMapRect v);
    @Mapping("region")
    public native MKCoordinateRegion getRegion();
    @Mapping("setRegion:")
    public native void setRegion(MKCoordinateRegion v);
    @Mapping("mapType")
    public native @Representing("MKMapType") long getMapType();
    @Mapping("setMapType:")
    public native void setMapType(@Representing("MKMapType") long v);
    @Mapping("showsPointsOfInterest")
    public native boolean showsPointsOfInterest();
    @Mapping("setShowsPointsOfInterest:")
    public native void setShowsPointsOfInterest(boolean v);
    @Mapping("showsBuildings")
    public native boolean showsBuildings();
    @Mapping("setShowsBuildings:")
    public native void setShowsBuildings(boolean v);
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    @Mapping("setScale:")
    public native void setScale(@MachineSizedFloat double v);

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
