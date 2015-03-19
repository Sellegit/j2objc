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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class MKMapViewDelegateAdapter 
    extends Object 
    implements MKMapViewDelegate {

    
    
    
    
    
    
    
    @NotImplemented("mapView:regionWillChangeAnimated:")
    public void willChangeRegion(MKMapView mapView, boolean animated) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapView:regionDidChangeAnimated:")
    public void didChangeRegion(MKMapView mapView, boolean animated) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapViewWillStartLoadingMap:")
    public void willStartLoadingMap(MKMapView mapView) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapViewDidFinishLoadingMap:")
    public void didFinishLoadingMap(MKMapView mapView) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapViewDidFailLoadingMap:withError:")
    public void didFailLoadingMap(MKMapView mapView, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("mapViewWillStartRenderingMap:")
    public void willStartRenderingMap(MKMapView mapView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("mapViewDidFinishRenderingMap:fullyRendered:")
    public void didFinishRenderingMap(MKMapView mapView, boolean fullyRendered) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapView:viewForAnnotation:")
    public MKAnnotationView getAnnotationView(MKMapView mapView, MKAnnotation annotation) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapView:didAddAnnotationViews:")
    public void didAddAnnotationViews(MKMapView mapView, NSArray<?> views) { throw new UnsupportedOperationException(); }
    @NotImplemented("mapView:annotationView:calloutAccessoryControlTapped:")
    public void calloutAccessoryControlTapped(MKMapView mapView, MKAnnotationView view, UIControl control) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapView:didSelectAnnotationView:")
    public void didSelectAnnotationView(MKMapView mapView, MKAnnotationView view) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapView:didDeselectAnnotationView:")
    public void didDeselectAnnotationView(MKMapView mapView, MKAnnotationView view) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapViewWillStartLocatingUser:")
    public void willStartLocatingUser(MKMapView mapView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapViewDidStopLocatingUser:")
    public void didStopLocatingUser(MKMapView mapView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapView:didUpdateUserLocation:")
    public void didUpdateUserLocation(MKMapView mapView, MKUserLocation userLocation) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapView:didFailToLocateUserWithError:")
    public void didFailToLocateUser(MKMapView mapView, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("mapView:annotationView:didChangeDragState:fromOldState:")
    public void didChangeDragState(MKMapView mapView, MKAnnotationView view, @Representing("MKAnnotationViewDragState") long newState, @Representing("MKAnnotationViewDragState") long oldState) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("mapView:didChangeUserTrackingMode:animated:")
    public void didChangeUserTrackingMode(MKMapView mapView, @Representing("MKUserTrackingMode") long mode, boolean animated) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("mapView:rendererForOverlay:")
    public MKOverlayRenderer getOverlayRenderer(MKMapView mapView, MKOverlay overlay) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("mapView:didAddOverlayRenderers:")
    public void didAddOverlayRenderers(MKMapView mapView, NSArray<?> renderers) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @NotImplemented("mapView:viewForOverlay:")
    public MKOverlayView getOverlayView(MKMapView mapView, MKOverlay overlay) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @NotImplemented("mapView:didAddOverlayViews:")
    public void didAddOverlayViews(MKMapView mapView, NSArray<?> overlayViews) { throw new UnsupportedOperationException(); }
    
}
