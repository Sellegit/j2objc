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

@Library("MapKit") @Mapping("MKPolylineRenderer")
public class MKPolylineRenderer 
    extends MKOverlayPathRenderer 
     {

    
    
    public MKPolylineRenderer() {}
    @Mapping("initWithPolyline:")
    public MKPolylineRenderer(MKPolyline polyline) { }
    @Mapping("initWithOverlay:")
    public MKPolylineRenderer(MKOverlay overlay) { }
    
    
    @Mapping("polyline")
    public native MKPolyline getPolyline();
    
    
    
    
    
}
