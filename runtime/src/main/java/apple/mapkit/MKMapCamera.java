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

@Library("MapKit") @Mapping("MKMapCamera")
public class MKMapCamera 
    extends NSObject 
    implements NSCopying {

    
    
    public MKMapCamera() {}
    
    
    @Mapping("centerCoordinate")
    public native CLLocationCoordinate2D getCenterCoordinate();
    public native void setCenterCoordinate(CLLocationCoordinate2D v);
    @Mapping("heading")
    public native double getHeading();
    public native void setHeading(double v);
    @Mapping("pitch")
    public native @MachineSizedFloat double getPitch();
    public native void setPitch(@MachineSizedFloat double v);
    @Mapping("altitude")
    public native double getAltitude();
    public native void setAltitude(double v);
    
    
    
    @Mapping("camera")
    public static native MKMapCamera create();
    @Mapping("cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    public static native MKMapCamera create(CLLocationCoordinate2D centerCoordinate, CLLocationCoordinate2D eyeCoordinate, double eyeAltitude);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
