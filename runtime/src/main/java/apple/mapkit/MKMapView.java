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
 * @since Available in iOS 3.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKMapView")
public class MKMapView 
    extends UIView 
    implements NSCoding {

    
    
    @Mapping("initWithFrame:")
    public MKMapView(CGRect frame) { }
    @Mapping("init")
    public MKMapView() { }
    
    
    @Mapping("delegate")
    public native MKMapViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MKMapViewDelegate v);
    @Mapping("mapType")
    public native @Representing("MKMapType") long getMapType();
    @Mapping("setMapType:")
    public native void setMapType(@Representing("MKMapType") long v);
    @Mapping("region")
    public native MKCoordinateRegion getRegion();
    @Mapping("setRegion:")
    public native void setRegion(MKCoordinateRegion v);
    @Mapping("centerCoordinate")
    public native CLLocationCoordinate2D getCenterCoordinate();
    @Mapping("setCenterCoordinate:")
    public native void setCenterCoordinate(CLLocationCoordinate2D v);
    @Mapping("visibleMapRect")
    public native MKMapRect getVisibleMapRect();
    @Mapping("setVisibleMapRect:")
    public native void setVisibleMapRect(MKMapRect v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("camera")
    public native MKMapCamera getCamera();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCamera:")
    public native void setCamera(MKMapCamera v);
    @Mapping("isZoomEnabled")
    public native boolean isZoomEnabled();
    @Mapping("setZoomEnabled:")
    public native void setZoomEnabled(boolean v);
    @Mapping("isScrollEnabled")
    public native boolean isScrollEnabled();
    @Mapping("setScrollEnabled:")
    public native void setScrollEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isRotateEnabled")
    public native boolean isRotateEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setRotateEnabled:")
    public native void setRotateEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isPitchEnabled")
    public native boolean isPitchEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPitchEnabled:")
    public native void setPitchEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("showsPointsOfInterest")
    public native boolean showsPointsOfInterest();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setShowsPointsOfInterest:")
    public native void setShowsPointsOfInterest(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("showsBuildings")
    public native boolean showsBuildings();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setShowsBuildings:")
    public native void setShowsBuildings(boolean v);
    @Mapping("showsUserLocation")
    public native boolean showsUserLocation();
    @Mapping("setShowsUserLocation:")
    public native void setShowsUserLocation(boolean v);
    @Mapping("userLocation")
    public native MKUserLocation getUserLocation();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("userTrackingMode")
    public native @Representing("MKUserTrackingMode") long getUserTrackingMode();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setUserTrackingMode:")
    public native void setUserTrackingMode(@Representing("MKUserTrackingMode") long v);
    @Mapping("isUserLocationVisible")
    public native boolean isUserLocationVisible();
    @Mapping("annotations")
    public native List<? extends MKAnnotation> getAnnotations();
    @Mapping("selectedAnnotations")
    public native List<? extends MKAnnotation> getSelectedAnnotations();
    @Mapping("setSelectedAnnotations:")
    public native void setSelectedAnnotations(List<? extends MKAnnotation> v);
    @Mapping("annotationVisibleRect")
    public native CGRect getAnnotationVisibleRect();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("overlays")
    public native List<? extends MKOverlay> getOverlays();
    
    
    
    @Mapping("setRegion:animated:")
    public native void setRegion(MKCoordinateRegion region, boolean animated);
    @Mapping("setCenterCoordinate:animated:")
    public native void setCenterCoordinate(CLLocationCoordinate2D coordinate, boolean animated);
    @Mapping("regionThatFits:")
    public native MKCoordinateRegion getRegionThatFits(MKCoordinateRegion region);
    @Mapping("setVisibleMapRect:animated:")
    public native void setVisibleMapRect(MKMapRect mapRect, boolean animate);
    @Mapping("mapRectThatFits:")
    public native MKMapRect getMapRectThatFits(MKMapRect mapRect);
    @Mapping("setVisibleMapRect:edgePadding:animated:")
    public native void setVisibleMapRect(MKMapRect mapRect, UIEdgeInsets insets, boolean animate);
    @Mapping("mapRectThatFits:edgePadding:")
    public native MKMapRect getMapRectThatFits(MKMapRect mapRect, UIEdgeInsets insets);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCamera:animated:")
    public native void setCamera(MKMapCamera camera, boolean animated);
    @Mapping("convertCoordinate:toPointToView:")
    public native CGPoint convertCoordinateToPointToView(CLLocationCoordinate2D coordinate, UIView view);
    @Mapping("convertPoint:toCoordinateFromView:")
    public native CLLocationCoordinate2D convertPointToCoordinateFromView(CGPoint point, UIView view);
    @Mapping("convertRegion:toRectToView:")
    public native CGRect convertRegionToRectToView(MKCoordinateRegion region, UIView view);
    @Mapping("convertRect:toRegionFromView:")
    public native MKCoordinateRegion convertRectToRegionFromView(CGRect rect, UIView view);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setUserTrackingMode:animated:")
    public native void setUserTrackingMode(@Representing("MKUserTrackingMode") long mode, boolean animated);
    @Mapping("addAnnotation:")
    public native void addAnnotation(MKAnnotation annotation);
    @Mapping("addAnnotations:")
    public native void addAnnotations(NSArray<?> annotations);
    @Mapping("removeAnnotation:")
    public native void removeAnnotation(MKAnnotation annotation);
    @Mapping("removeAnnotations:")
    public native void removeAnnotations(NSArray<?> annotations);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("annotationsInMapRect:")
    public native Set<? extends MKAnnotation> getAnnotations(MKMapRect mapRect);
    @Mapping("viewForAnnotation:")
    public native MKAnnotationView getView(MKAnnotation annotation);
    @Mapping("dequeueReusableAnnotationViewWithIdentifier:")
    public native MKAnnotationView dequeueReusableAnnotationView(String identifier);
    @Mapping("selectAnnotation:animated:")
    public native void selectAnnotation(MKAnnotation annotation, boolean animated);
    @Mapping("deselectAnnotation:animated:")
    public native void deselectAnnotation(MKAnnotation annotation, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("showAnnotations:animated:")
    public native void showAnnotations(NSArray<?> annotations, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addOverlay:level:")
    public native void addOverlay(MKOverlay overlay, @Representing("MKOverlayLevel") long level);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addOverlays:level:")
    public native void addOverlays(NSArray<?> overlays, @Representing("MKOverlayLevel") long level);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("removeOverlay:")
    public native void removeOverlay(MKOverlay overlay);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("removeOverlays:")
    public native void removeOverlays(NSArray<?> overlays);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("insertOverlay:atIndex:level:")
    public native void insertOverlay(MKOverlay overlay, @MachineSizedUInt long index, @Representing("MKOverlayLevel") long level);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("insertOverlay:aboveOverlay:")
    public native void insertOverlayAbove(MKOverlay overlay, MKOverlay sibling);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("insertOverlay:belowOverlay:")
    public native void insertOverlayBelow(MKOverlay overlay, MKOverlay sibling);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("exchangeOverlay:withOverlay:")
    public native void exchangeOverlay(MKOverlay overlay1, MKOverlay overlay2);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("overlaysInLevel:")
    public native List<? extends MKOverlay> getOverlays(@Representing("MKOverlayLevel") long level);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rendererForOverlay:")
    public native MKOverlayRenderer getOverlayRenderer(MKOverlay overlay);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("viewForOverlay:")
    public native MKOverlayView getOverlayView(MKOverlay overlay);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addOverlay:")
    public native void addOverlay(MKOverlay overlay);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addOverlays:")
    public native void addOverlays(NSArray<?> overlays);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("insertOverlay:atIndex:")
    public native void insertOverlay(MKOverlay overlay, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("exchangeOverlayAtIndex:withOverlayAtIndex:")
    public native void exchangeOverlay(@MachineSizedUInt long index1, @MachineSizedUInt long index2);
    
}
