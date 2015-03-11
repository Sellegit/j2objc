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

@Library("MapKit") @Mapping("MKMapSnapshotOptions")
public class MKMapSnapshotOptions 
    extends NSObject 
    implements NSCopying {

    
    
    public MKMapSnapshotOptions() {}
    
    
    @Mapping("camera")
    public native MKMapCamera getCamera();
    public native void setCamera(MKMapCamera v);
    @Mapping("mapRect")
    public native MKMapRect getMapRect();
    public native void setMapRect(MKMapRect v);
    @Mapping("region")
    public native MKCoordinateRegion getRegion();
    public native void setRegion(MKCoordinateRegion v);
    @Mapping("mapType")
    public native @Representing("MKMapType") @MachineSizedUInt long getMapType();
    public native void setMapType(@Representing("MKMapType") @MachineSizedUInt long v);
    @Mapping("showsPointsOfInterest")
    public native boolean showsPointsOfInterest();
    public native void setShowsPointsOfInterest(boolean v);
    @Mapping("showsBuildings")
    public native boolean showsBuildings();
    public native void setShowsBuildings(boolean v);
    @Mapping("size")
    public native CGSize getSize();
    public native void setSize(CGSize v);
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    public native void setScale(@MachineSizedFloat double v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
