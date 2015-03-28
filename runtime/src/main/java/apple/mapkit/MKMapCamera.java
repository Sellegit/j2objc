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
@Library("MapKit/MapKit.h") @Mapping("MKMapCamera")
public class MKMapCamera 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public MKMapCamera() { }

    
    @Mapping("centerCoordinate")
    public native CLLocationCoordinate2D getCenterCoordinate();
    @Mapping("setCenterCoordinate:")
    public native void setCenterCoordinate(CLLocationCoordinate2D v);
    @Mapping("heading")
    public native double getHeading();
    @Mapping("setHeading:")
    public native void setHeading(double v);
    @Mapping("pitch")
    public native @MachineSizedFloat double getPitch();
    @Mapping("setPitch:")
    public native void setPitch(@MachineSizedFloat double v);
    @Mapping("altitude")
    public native double getAltitude();
    @Mapping("setAltitude:")
    public native void setAltitude(double v);

    
    
    @Mapping("camera")
    public static native MKMapCamera createPrime();
    @Mapping("cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    public static native MKMapCamera createPrime(CLLocationCoordinate2D centerCoordinate, CLLocationCoordinate2D eyeCoordinate, double eyeAltitude);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
