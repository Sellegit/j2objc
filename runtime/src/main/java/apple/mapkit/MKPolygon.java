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

@Library("MapKit") @Mapping("MKPolygon")
public class MKPolygon 
    extends MKMultiPoint 
    implements MKOverlay {

    
    
    public MKPolygon() {}
    
    
    @Mapping("interiorPolygons")
    public native NSArray<MKPolygon> getInteriorPolygons();
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("boundingMapRect")
    public native MKMapRect getBoundingMapRect();
    
    
    
    @Mapping("polygonWithPoints:count:")
    private static native MKPolygon create(MKMapPoint points, @MachineSizedUInt long count);
    @Mapping("polygonWithPoints:count:interiorPolygons:")
    private static native MKPolygon create(MKMapPoint points, @MachineSizedUInt long count, NSArray<MKPolygon> interiorPolygons);
    @Mapping("polygonWithCoordinates:count:")
    private static native MKPolygon create(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Mapping("polygonWithCoordinates:count:interiorPolygons:")
    private static native MKPolygon create(CLLocationCoordinate2D coords, @MachineSizedUInt long count, NSArray<MKPolygon> interiorPolygons);
    @Mapping("intersectsMapRect:")
    public native boolean intersects(MKMapRect mapRect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canReplaceMapContent")
    public native boolean canReplaceMapContent();
    
}
