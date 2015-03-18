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

@Library("CoreMotion/CoreMotion.h") @Mapping("CMPedometer")
public class CMPedometer 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CMPedometer() { }
    
    
    
    
    
    
    @Mapping("stopPedometerUpdates")
    public native void stopPedometerUpdates();
    @Mapping("isStepCountingAvailable")
    public static native boolean isStepCountingAvailable();
    @Mapping("isDistanceAvailable")
    public static native boolean isDistanceAvailable();
    @Mapping("isFloorCountingAvailable")
    public static native boolean isFloorCountingAvailable();
    
}
