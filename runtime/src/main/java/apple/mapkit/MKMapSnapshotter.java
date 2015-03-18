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

@Library("MapKit/MapKit.h") @Mapping("MKMapSnapshotter")
public class MKMapSnapshotter 
    extends NSObject 
     {

    
    
    @Mapping("initWithOptions:")
    public MKMapSnapshotter(MKMapSnapshotOptions options) { }
    @Mapping("init")
    public MKMapSnapshotter() { }
    
    
    @Mapping("isLoading")
    public native boolean isLoading();
    
    
    
    @Mapping("cancel")
    public native void cancel();
    
}
