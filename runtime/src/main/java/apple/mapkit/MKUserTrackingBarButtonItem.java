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
 * @since Available in iOS 5.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKUserTrackingBarButtonItem")
public class MKUserTrackingBarButtonItem 
    extends UIBarButtonItem 
     {

    
    
    @Mapping("initWithMapView:")
    public MKUserTrackingBarButtonItem(MKMapView mapView) { }
    @Mapping("initWithImage:style:target:action:")
    public MKUserTrackingBarButtonItem(UIImage image, @Representing("UIBarButtonItemStyle") @MachineSizedSInt long style, Object target, Selector action) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithImage:landscapeImagePhone:style:target:action:")
    public MKUserTrackingBarButtonItem(UIImage image, UIImage landscapeImagePhone, @Representing("UIBarButtonItemStyle") @MachineSizedSInt long style, Object target, Selector action) { }
    @Mapping("initWithTitle:style:target:action:")
    public MKUserTrackingBarButtonItem(String title, @Representing("UIBarButtonItemStyle") @MachineSizedSInt long style, Object target, Selector action) { }
    @Mapping("initWithBarButtonSystemItem:target:action:")
    public MKUserTrackingBarButtonItem(@Representing("UIBarButtonSystemItem") @MachineSizedSInt long systemItem, Object target, Selector action) { }
    @Mapping("initWithCustomView:")
    public MKUserTrackingBarButtonItem(UIView customView) { }
    @Mapping("init")
    public MKUserTrackingBarButtonItem() { }
    
    
    @Mapping("mapView")
    public native MKMapView getMapView();
    @Mapping("setMapView:")
    public native void setMapView(MKMapView v);
    
    
    
    
    
}
