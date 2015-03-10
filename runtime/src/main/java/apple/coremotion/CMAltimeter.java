package apple.coremotion;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreMotion") @Mapping("CMAltimeter")
public class CMAltimeter 
    extends NSObject 
     {

    
    
    public CMAltimeter() {}
    
    
    
    
    
    
    @Mapping("startRelativeAltitudeUpdatesToQueue:withHandler:")
    public native void startRelativeAltitudeUpdates(NSOperationQueue queue, @Block VoidBlock2<CMAltitudeData, NSError> handler);
    @Mapping("stopRelativeAltitudeUpdates")
    public native void stopRelativeAltitudeUpdates();
    @Mapping("isRelativeAltitudeAvailable")
    public static native boolean isRelativeAltitudeAvailable();
    
}
