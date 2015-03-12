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





@Mapping("CLLocationCoordinate2D") @Library("CoreLocation")
public class CLLocationCoordinate2D 
    extends Struct 
     {

    
    protected CLLocationCoordinate2D() {}
    
    
    @DotMapping("latitude")
    public native double getLatitude();
    @DotMapping("longitude")
    public native double getLongitude();
    
    public static native CLLocationCoordinate2D create(double latitude, double longitude) /*-[
        CLLocationCoordinate2D __new = { .latitude = latitude, .longitude = longitude };
        return __new;
    ]-*/;
    public static native CLLocationCoordinate2D copyWithlatitude(CLLocationCoordinate2D original, double latitude) /*-[
        original.latitude = latitude;
        return original;
    ]-*/;

    
    public static native CLLocationCoordinate2D copyWithlongitude(CLLocationCoordinate2D original, double longitude) /*-[
        original.longitude = longitude;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCLLocationCoordinate2DInvalid")
    public static native CLLocationCoordinate2D Invalid();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CLLocationCoordinate2DIsValid")
    private static native boolean isValid(CLLocationCoordinate2D coord);
    
}
