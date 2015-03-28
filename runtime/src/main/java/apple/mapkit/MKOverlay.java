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


@Library("MapKit/MapKit.h") @Mapping("MKOverlay")
public interface MKOverlay 
    extends MKAnnotation {

    
    
    @Mapping("coordinate")
    CLLocationCoordinate2D getCoordinate();
    @Mapping("boundingMapRect")
    MKMapRect getBoundingMapRect();

    
    @Mapping("intersectsMapRect:")
    boolean intersects(MKMapRect mapRect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canReplaceMapContent")
    boolean canReplaceMapContent();

    /*<adapter>*/
    /*</adapter>*/
}
