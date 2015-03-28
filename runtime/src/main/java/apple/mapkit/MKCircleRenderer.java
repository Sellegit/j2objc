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
@Library("MapKit/MapKit.h") @Mapping("MKCircleRenderer")
public class MKCircleRenderer 
    extends MKOverlayPathRenderer 
     {

    
    
    @Mapping("initWithCircle:")
    public MKCircleRenderer(MKCircle circle) { }
    @Mapping("initWithOverlay:")
    public MKCircleRenderer(MKOverlay overlay) { }
    @Mapping("init")
    public MKCircleRenderer() { }

    
    @Mapping("circle")
    public native MKCircle getCircle();

    
    


}
