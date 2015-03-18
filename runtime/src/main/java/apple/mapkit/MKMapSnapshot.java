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
 * @since Available in iOS 7.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKMapSnapshot")
public class MKMapSnapshot 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MKMapSnapshot() { }
    
    
    @Mapping("image")
    public native UIImage getImage();
    
    
    
    @Mapping("pointForCoordinate:")
    public native CGPoint convertCoordinateToPoint(CLLocationCoordinate2D coordinate);
    
}
