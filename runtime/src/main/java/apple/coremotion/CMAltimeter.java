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

@Library("CoreMotion/CoreMotion.h") @Mapping("CMAltimeter")
public class CMAltimeter 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CMAltimeter() { }
    
    
    
    
    
    
    @Mapping("stopRelativeAltitudeUpdates")
    public native void stopRelativeAltitudeUpdates();
    @Mapping("isRelativeAltitudeAvailable")
    public static native boolean isRelativeAltitudeAvailable();
    
}
