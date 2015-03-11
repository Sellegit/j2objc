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

@Library("MapKit") @Mapping("MKAnnotationView")
public class MKAnnotationView 
    extends UIView 
     {

    
    
    public MKAnnotationView() {}
    @Mapping("initWithAnnotation:reuseIdentifier:")
    public MKAnnotationView(MKAnnotation annotation, String reuseIdentifier) { }
    @Mapping("initWithFrame:")
    public MKAnnotationView(CGRect frame) { }
    
    
    @Mapping("reuseIdentifier")
    public native String getReuseIdentifier();
    @Mapping("annotation")
    public native MKAnnotation getAnnotation();
    public native void setAnnotation(MKAnnotation v);
    @Mapping("image")
    public native UIImage getImage();
    public native void setImage(UIImage v);
    @Mapping("centerOffset")
    public native CGPoint getCenterOffset();
    public native void setCenterOffset(CGPoint v);
    @Mapping("calloutOffset")
    public native CGPoint getCalloutOffset();
    public native void setCalloutOffset(CGPoint v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    public native void setEnabled(boolean v);
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    public native void setHighlighted(boolean v);
    @Mapping("isSelected")
    public native boolean isSelected();
    public native void setSelected(boolean v);
    @Mapping("canShowCallout")
    public native boolean canShowCallout();
    public native void setCanShowCallout(boolean v);
    @Mapping("leftCalloutAccessoryView")
    public native UIView getLeftCalloutAccessoryView();
    public native void setLeftCalloutAccessoryView(UIView v);
    @Mapping("rightCalloutAccessoryView")
    public native UIView getRightCalloutAccessoryView();
    public native void setRightCalloutAccessoryView(UIView v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isDraggable")
    public native boolean isDraggable();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setDraggable(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("dragState")
    public native @Representing("MKAnnotationViewDragState") @MachineSizedUInt long getDragState();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setDragState(@Representing("MKAnnotationViewDragState") @MachineSizedUInt long v);
    
    
    
    @Mapping("prepareForReuse")
    public native void prepareForReuse();
    @Mapping("setSelected:animated:")
    public native void setSelected(boolean selected, boolean animated);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("setDragState:animated:")
    public native void setDragState(@Representing("MKAnnotationViewDragState") @MachineSizedUInt long newDragState, boolean animated);
    
}
