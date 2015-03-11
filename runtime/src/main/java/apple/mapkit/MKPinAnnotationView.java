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

@Library("MapKit") @Mapping("MKPinAnnotationView")
public class MKPinAnnotationView 
    extends MKAnnotationView 
     {

    
    
    public MKPinAnnotationView() {}
    @Mapping("initWithAnnotation:reuseIdentifier:")
    public MKPinAnnotationView(MKAnnotation annotation, String reuseIdentifier) { }
    @Mapping("initWithFrame:")
    public MKPinAnnotationView(CGRect frame) { }
    
    
    @Mapping("pinColor")
    public native @Representing("MKPinAnnotationColor") @MachineSizedUInt long getPinColor();
    @Mapping("setPinColor:")
    public native void setPinColor(@Representing("MKPinAnnotationColor") @MachineSizedUInt long v);
    @Mapping("animatesDrop")
    public native boolean animatesDrop();
    @Mapping("setAnimatesDrop:")
    public native void setAnimatesDrop(boolean v);
    
    
    
    
    
}
