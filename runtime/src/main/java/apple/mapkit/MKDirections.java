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

@Library("MapKit") @Mapping("MKDirections")
public class MKDirections 
    extends NSObject 
     {

    
    
    public MKDirections() {}
    @Mapping("initWithRequest:")
    public MKDirections(MKDirectionsRequest request) { }
    
    
    @Mapping("isCalculating")
    public native boolean isCalculating();
    
    
    
    @Mapping("calculateDirectionsWithCompletionHandler:")
    public native void calculateDirections(@Block VoidBlock2<MKDirectionsResponse, NSError> completionHandler);
    @Mapping("calculateETAWithCompletionHandler:")
    public native void calculateETA(@Block VoidBlock2<MKETAResponse, NSError> completionHandler);
    @Mapping("cancel")
    public native void cancel();
    
}
