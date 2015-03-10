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

@Library("MapKit") @Mapping("MKCircleView")
public class MKCircleView 
    extends MKOverlayPathView 
     {

    
    
    public MKCircleView() {}
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithCircle:")
    public MKCircleView(MKCircle circle) { }
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithOverlay:")
    public MKCircleView(MKOverlay overlay) { }
    @Mapping("initWithFrame:")
    public MKCircleView(CGRect frame) { }
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("circle")
    public native MKCircle getCircle();
    
    
    
    
    
}
