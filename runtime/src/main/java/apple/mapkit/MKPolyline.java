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

@Library("MapKit/MapKit.h") @Mapping("MKPolyline")
public class MKPolyline 
    extends MKMultiPoint 
    implements MKOverlay {

    
    
    public MKPolyline() {}
    
    
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("boundingMapRect")
    public native MKMapRect getBoundingMapRect();
    
    
    
    @Mapping("polylineWithPoints:count:")
    private static native MKPolyline create(MKMapPoint points, @MachineSizedUInt long count);
    @Mapping("polylineWithCoordinates:count:")
    private static native MKPolyline create(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Mapping("intersectsMapRect:")
    public native boolean intersects(MKMapRect mapRect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canReplaceMapContent")
    public native boolean canReplaceMapContent();
    
}
