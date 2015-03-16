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
 * @since Available in iOS 4.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKMultiPoint")
public class MKMultiPoint 
    extends MKShape 
     {

    
    
    public MKMultiPoint() {}
    
    
    @Mapping("pointCount")
    public native @MachineSizedUInt long getPointCount();
    
    
    
    @Mapping("points")
    protected native MKMapPoint getPoints0();
    @Mapping("getCoordinates:range:")
    protected native void getCoordinates0(CLLocationCoordinate2D coords, NSRange range);
    
}
