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
 * @since Available in iOS 6.1 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKLocalSearchResponse")
public class MKLocalSearchResponse 
    extends NSObject 
     {

    
    
    public MKLocalSearchResponse() {}
    
    
    @Mapping("mapItems")
    public native NSArray<MKMapItem> getMapItems();
    @Mapping("boundingRegion")
    public native MKCoordinateRegion getBoundingRegion();
    
    
    
    
    
}
