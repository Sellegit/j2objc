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





@Library("MapKit") @Mapping("MKMapViewDelegate")
public interface MKMapViewDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("mapView:regionWillChangeAnimated:")
    void willChangeRegion(MKMapView mapView, boolean animated);
    @Mapping("mapView:regionDidChangeAnimated:")
    void didChangeRegion(MKMapView mapView, boolean animated);
    @Mapping("mapViewWillStartLoadingMap:")
    void willStartLoadingMap(MKMapView mapView);
    @Mapping("mapViewDidFinishLoadingMap:")
    void didFinishLoadingMap(MKMapView mapView);
    @Mapping("mapViewDidFailLoadingMap:withError:")
    void didFailLoadingMap(MKMapView mapView, NSError error);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mapViewWillStartRenderingMap:")
    void willStartRenderingMap(MKMapView mapView);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mapViewDidFinishRenderingMap:fullyRendered:")
    void didFinishRenderingMap(MKMapView mapView, boolean fullyRendered);
    @Mapping("mapView:viewForAnnotation:")
    MKAnnotationView getAnnotationView(MKMapView mapView, MKAnnotation annotation);
    @Mapping("mapView:didAddAnnotationViews:")
    void didAddAnnotationViews(MKMapView mapView, NSArray<?> views);
    @Mapping("mapView:annotationView:calloutAccessoryControlTapped:")
    void calloutAccessoryControlTapped(MKMapView mapView, MKAnnotationView view, UIControl control);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapView:didSelectAnnotationView:")
    void didSelectAnnotationView(MKMapView mapView, MKAnnotationView view);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapView:didDeselectAnnotationView:")
    void didDeselectAnnotationView(MKMapView mapView, MKAnnotationView view);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapViewWillStartLocatingUser:")
    void willStartLocatingUser(MKMapView mapView);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapViewDidStopLocatingUser:")
    void didStopLocatingUser(MKMapView mapView);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapView:didUpdateUserLocation:")
    void didUpdateUserLocation(MKMapView mapView, MKUserLocation userLocation);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapView:didFailToLocateUserWithError:")
    void didFailToLocateUser(MKMapView mapView, NSError error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mapView:annotationView:didChangeDragState:fromOldState:")
    void didChangeDragState(MKMapView mapView, MKAnnotationView view, @Representing("MKAnnotationViewDragState") @MachineSizedUInt long newState, @Representing("MKAnnotationViewDragState") @MachineSizedUInt long oldState);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("mapView:didChangeUserTrackingMode:animated:")
    void didChangeUserTrackingMode(MKMapView mapView, @Representing("MKUserTrackingMode") @MachineSizedSInt long mode, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mapView:rendererForOverlay:")
    MKOverlayRenderer getOverlayRenderer(MKMapView mapView, MKOverlay overlay);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mapView:didAddOverlayRenderers:")
    void didAddOverlayRenderers(MKMapView mapView, NSArray<?> renderers);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("mapView:viewForOverlay:")
    MKOverlayView getOverlayView(MKMapView mapView, MKOverlay overlay);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("mapView:didAddOverlayViews:")
    void didAddOverlayViews(MKMapView mapView, NSArray<?> overlayViews);
    
    /*<adapter>*/
    /*</adapter>*/
}
