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





@Mapping("MKCoordinateRegion") @Library("MapKit/MapKit.h")
public class MKCoordinateRegion 
    extends Struct 
     {

    
    private MKCoordinateRegion() {}
    
    
    @DotMapping("center")
    public native CLLocationCoordinate2D getCenter();
    @DotMapping("span")
    public native MKCoordinateSpan getSpan();
    
    public static native MKCoordinateRegion create(CLLocationCoordinate2D center, MKCoordinateSpan span) /*-[
        MKCoordinateRegion __new = { .center = center, .span = span };
        return __new;
    ]-*/;
    public static native MKCoordinateRegion copyWithcenter(MKCoordinateRegion original, CLLocationCoordinate2D center) /*-[
        MKCoordinateRegion __new = { .center = center, .span = original.span };
        return __new;
    ]-*/;

    
    public static native MKCoordinateRegion copyWithspan(MKCoordinateRegion original, MKCoordinateSpan span) /*-[
        MKCoordinateRegion __new = { .center = original.center, .span = span };
        return __new;
    ]-*/;

    
    @GlobalFunction("MKCoordinateRegionMakeWithDistance")
    public static native MKCoordinateRegion create(CLLocationCoordinate2D centerCoordinate, double latitudinalMeters, double longitudinalMeters);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKCoordinateRegionForMapRect")
    public static native MKCoordinateRegion create(MKMapRect rect);
    
}
