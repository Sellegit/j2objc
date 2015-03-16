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

@Library("MapKit/MapKit.h") @Mapping("MKPolygonRenderer")
public class MKPolygonRenderer 
    extends MKOverlayPathRenderer 
     {

    
    
    public MKPolygonRenderer() {}
    @Mapping("initWithPolygon:")
    public MKPolygonRenderer(MKPolygon polygon) { }
    @Mapping("initWithOverlay:")
    public MKPolygonRenderer(MKOverlay overlay) { }
    
    
    @Mapping("polygon")
    public native MKPolygon getPolygon();
    
    
    
    
    
}
