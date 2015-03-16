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

@Library("MapKit/MapKit.h") @Mapping("MKPolylineView")
public class MKPolylineView 
    extends MKOverlayPathView 
     {

    
    
    public MKPolylineView() {}
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithPolyline:")
    public MKPolylineView(MKPolyline polyline) { }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithOverlay:")
    public MKPolylineView(MKOverlay overlay) { }
    @Mapping("initWithFrame:")
    public MKPolylineView(CGRect frame) { }
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("polyline")
    public native MKPolyline getPolyline();
    
    
    
    
    
}
