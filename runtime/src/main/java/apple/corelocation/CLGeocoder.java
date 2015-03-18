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

@Library("CoreLocation/CoreLocation.h") @Mapping("CLGeocoder")
public class CLGeocoder 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CLGeocoder() { }
    
    
    @Mapping("isGeocoding")
    public native boolean isGeocoding();
    
    
    
    @Mapping("reverseGeocodeLocation:completionHandler:")
    public native void reverseGeocodeLocation(CLLocation location, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Mapping("geocodeAddressDictionary:completionHandler:")
    public native void geocodeAddress(NSDictionary<?, ?> addressDictionary, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Mapping("geocodeAddressString:completionHandler:")
    public native void geocodeAddress(String addressString, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Mapping("geocodeAddressString:inRegion:completionHandler:")
    public native void geocodeAddress(String addressString, CLRegion region, @Block VoidBlock2<NSArray<CLPlacemark>, NSError> completionHandler);
    @Mapping("cancelGeocode")
    public native void cancelGeocode();
    
}
