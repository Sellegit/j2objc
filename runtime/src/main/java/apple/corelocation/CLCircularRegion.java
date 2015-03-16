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
 * @since Available in iOS 7.0 and later.
 */

@Library("CoreLocation/CoreLocation.h") @Mapping("CLCircularRegion")
public class CLCircularRegion 
    extends CLRegion 
     {

    
    
    public CLCircularRegion() {}
    @Mapping("initWithCenter:radius:identifier:")
    public CLCircularRegion(CLLocationCoordinate2D center, double radius, String identifier) { }
    
    
    @Mapping("center")
    public native CLLocationCoordinate2D getCenter();
    @Mapping("radius")
    public native double getRadius();
    
    
    
    
    
}
