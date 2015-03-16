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
 * @since Available in iOS 6.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKMapItem")
public class MKMapItem 
    extends NSObject 
     {

    
    
    public MKMapItem() {}
    @Mapping("initWithPlacemark:")
    public MKMapItem(MKPlacemark placemark) { }
    
    
    @Mapping("placemark")
    public native MKPlacemark getPlacemark();
    @Mapping("isCurrentLocation")
    public native boolean isCurrentLocation();
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("phoneNumber")
    public native String getPhoneNumber();
    @Mapping("setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("setUrl:")
    public native void setUrl(NSURL v);
    
    
    
    @Mapping("openInMapsWithLaunchOptions:")
    public native boolean openInMaps(NSDictionary<?, ?> launchOptions);
    @Mapping("mapItemForCurrentLocation")
    public static native MKMapItem getMapItemForCurrentLocation();
    @Mapping("openMapsWithItems:launchOptions:")
    public static native boolean openMaps(NSArray<?> mapItems, NSDictionary<?, ?> launchOptions);
    
}
