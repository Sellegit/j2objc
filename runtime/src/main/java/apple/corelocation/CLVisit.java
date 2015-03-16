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
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreLocation/CoreLocation.h") @Mapping("CLVisit")
public class CLVisit 
    extends NSObject 
    implements NSCopying {

    
    
    public CLVisit() {}
    
    
    @Mapping("arrivalDate")
    public native NSDate getArrivalDate();
    @Mapping("departureDate")
    public native NSDate getDepartureDate();
    @Mapping("coordinate")
    public native CLLocationCoordinate2D getCoordinate();
    @Mapping("horizontalAccuracy")
    public native double getHorizontalAccuracy();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
