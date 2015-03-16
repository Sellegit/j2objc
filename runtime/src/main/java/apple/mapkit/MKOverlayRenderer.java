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

@Library("MapKit/MapKit.h") @Mapping("MKOverlayRenderer")
public class MKOverlayRenderer 
    extends NSObject 
     {

    
    
    public MKOverlayRenderer() {}
    @Mapping("initWithOverlay:")
    public MKOverlayRenderer(MKOverlay overlay) { }
    
    
    @Mapping("overlay")
    public native MKOverlay getOverlay();
    @Mapping("alpha")
    public native @MachineSizedFloat double getAlpha();
    @Mapping("setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Mapping("contentScaleFactor")
    public native @MachineSizedFloat double getContentScaleFactor();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("MKRoadWidthAtZoomScale")
    public static native @MachineSizedFloat double getRoadWidth(@MachineSizedFloat double zoomScale);
    
    @Mapping("pointForMapPoint:")
    public native CGPoint getPoint(MKMapPoint mapPoint);
    @Mapping("mapPointForPoint:")
    public native MKMapPoint getMapPoint(CGPoint point);
    @Mapping("rectForMapRect:")
    public native CGRect getRect(MKMapRect mapRect);
    @Mapping("mapRectForRect:")
    public native MKMapRect getMapRect(CGRect rect);
    @Mapping("canDrawMapRect:zoomScale:")
    public native boolean canDraw(MKMapRect mapRect, @MachineSizedFloat double zoomScale);
    @Mapping("drawMapRect:zoomScale:inContext:")
    public native void draw(MKMapRect mapRect, @MachineSizedFloat double zoomScale, CGContext context);
    @Mapping("setNeedsDisplay")
    public native void setNeedsDisplay();
    @Mapping("setNeedsDisplayInMapRect:")
    public native void setNeedsDisplay(MKMapRect mapRect);
    @Mapping("setNeedsDisplayInMapRect:zoomScale:")
    public native void setNeedsDisplay(MKMapRect mapRect, @MachineSizedFloat double zoomScale);
    
}
