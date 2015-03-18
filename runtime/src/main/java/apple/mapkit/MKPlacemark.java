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
 * @since Available in iOS 3.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKPlacemark")
public class MKPlacemark 
    extends CLPlacemark 
    implements MKAnnotation {

    
    
    @Mapping("initWithCoordinate:addressDictionary:")
    public MKPlacemark(CLLocationCoordinate2D coordinate, NSDictionary<?, ?> addressDictionary) { }
    @Mapping("initWithPlacemark:")
    public MKPlacemark(CLPlacemark placemark) { }
    @Mapping("init")
    public MKPlacemark() { }
    
    
    @Mapping("countryCode")
    public native String getCountryCode();
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("setCoordinate:")
    public native void setCoordinate(CLLocationCoordinate2D v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("subtitle")
    public native String getSubtitle();
    
    
    
    
    
}
