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


@Mapping("MKMapPoint") @Library("MapKit/MapKit.h")
public class MKMapPoint 
    extends Struct 
     {

    
    private MKMapPoint() {}
    
    
    @DotMapping("x")
    public native double getX();
    @DotMapping("y")
    public native double getY();

    public static native MKMapPoint create(double x, double y) /*-[
        MKMapPoint __new = { .x = x, .y = y };
        return __new;
    ]-*/;
    public static native MKMapPoint copyWithx(MKMapPoint original, double x) /*-[
        MKMapPoint __new = { .x = x, .y = original.y };
        return __new;
    ]-*/;


    public static native MKMapPoint copyWithy(MKMapPoint original, double y) /*-[
        MKMapPoint __new = { .x = original.x, .y = y };
        return __new;
    ]-*/;


    public static final class Adapter {

        public double x;
        public double y;
        public Adapter(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Adapter(MKMapPoint original) {
            this.x = original.getX();
            this.y = original.getY();
        }
        public MKMapPoint convert() {
            return create(x, y);
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapPointForCoordinate")
    public static native MKMapPoint createPrime(CLLocationCoordinate2D coordinate);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKCoordinateForMapPoint")
    public static native CLLocationCoordinate2D toCoordinate(MKMapPoint mapPoint);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMetersPerMapPointAtLatitude")
    public static native double getMetersPerMapPoint(double latitude);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMapPointsPerMeterAtLatitude")
    public static native double getMapPointsPerMeter(double latitude);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKMetersBetweenMapPoints")
    public static native double getMetersBetween(MKMapPoint a, MKMapPoint b);

}
