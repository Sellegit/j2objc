package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("CoreLocation/CoreLocation.h") @Mapping("CLPlacemark")
public class CLPlacemark 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithPlacemark:")
    public CLPlacemark(CLPlacemark placemark) { }
    @Mapping("init")
    public CLPlacemark() { }
    
    
    @Mapping("location")
    public native CLLocation getLocation();
    @Mapping("region")
    public native CLRegion getRegion();
    @Mapping("addressDictionary")
    public native NSDictionary<?, ?> getAddress();
    @Mapping("name")
    public native String getName();
    @Mapping("thoroughfare")
    public native String getThoroughfare();
    @Mapping("subThoroughfare")
    public native String getSubThoroughfare();
    @Mapping("locality")
    public native String getLocality();
    @Mapping("subLocality")
    public native String getSubLocality();
    @Mapping("administrativeArea")
    public native String getAdministrativeArea();
    @Mapping("subAdministrativeArea")
    public native String getSubAdministrativeArea();
    @Mapping("postalCode")
    public native String getPostalCode();
    @Mapping("ISOcountryCode")
    public native String getISOcountryCode();
    @Mapping("country")
    public native String getCountry();
    @Mapping("inlandWater")
    public native String getInlandWater();
    @Mapping("ocean")
    public native String getOcean();
    @Mapping("areasOfInterest")
    public native List<String> getAreasOfInterest();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
