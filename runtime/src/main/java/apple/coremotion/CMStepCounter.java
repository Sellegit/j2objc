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
 * @since Available in iOS 7.0 and later.
 * @deprecated Deprecated in iOS 8.0.
 */
@Deprecated

@Library("CoreMotion/CoreMotion.h") @Mapping("CMStepCounter")
public class CMStepCounter 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CMStepCounter() { }
    
    
    
    
    
    
    @Mapping("stopStepCountingUpdates")
    public native void stopStepCountingUpdates();
    @Mapping("isStepCountingAvailable")
    public static native boolean isStepCountingAvailable();
    
}
