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
 * @since Available in iOS 4.0 and later.
 */

@Library("MapKit") @Mapping("MKCircle")
public class MKCircle 
    extends MKShape 
    implements MKOverlay {

    
    
    public MKCircle() {}
    
    
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("radius")
    public native double getRadius();
    @Mapping("boundingMapRect")
    public native MKMapRect getBoundingMapRect();
    
    
    
    @Mapping("circleWithCenterCoordinate:radius:")
    public static native MKCircle create(CLLocationCoordinate2D coord, double radius);
    @Mapping("circleWithMapRect:")
    public static native MKCircle create(MKMapRect mapRect);
    @Mapping("intersectsMapRect:")
    public native boolean intersects(MKMapRect mapRect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canReplaceMapContent")
    public native boolean canReplaceMapContent();
    
}
