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

@Library("MapKit/MapKit.h") @Mapping("MKOverlayView")
public class MKOverlayView 
    extends UIView 
     {

    
    
    public MKOverlayView() {}
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithOverlay:")
    public MKOverlayView(MKOverlay overlay) { }
    @Mapping("initWithFrame:")
    public MKOverlayView(CGRect frame) { }
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("overlay")
    public native MKOverlay getOverlay();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("pointForMapPoint:")
    public native CGPoint getPoint(MKMapPoint mapPoint);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("mapPointForPoint:")
    public native MKMapPoint getMapPoint(CGPoint point);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("rectForMapRect:")
    public native CGRect getRect(MKMapRect mapRect);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("mapRectForRect:")
    public native MKMapRect getMapRect(CGRect rect);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("canDrawMapRect:zoomScale:")
    public native boolean canDraw(MKMapRect mapRect, @MachineSizedFloat double zoomScale);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("drawMapRect:zoomScale:inContext:")
    public native void draw(MKMapRect mapRect, @MachineSizedFloat double zoomScale, CGContext context);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setNeedsDisplayInMapRect:")
    public native void setNeedsDisplay(MKMapRect mapRect);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setNeedsDisplayInMapRect:zoomScale:")
    public native void setNeedsDisplay(MKMapRect mapRect, @MachineSizedFloat double zoomScale);
    
}
