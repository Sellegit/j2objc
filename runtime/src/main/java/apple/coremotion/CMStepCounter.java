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

@Library("CoreMotion") @Mapping("CMStepCounter")
public class CMStepCounter 
    extends NSObject 
     {

    
    
    public CMStepCounter() {}
    
    
    
    
    
    
    @Mapping("queryStepCountStartingFrom:to:toQueue:withHandler:")
    public native void queryStepCount(NSDate start, NSDate end, NSOperationQueue queue, @Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> handler);
    @Mapping("startStepCountingUpdatesToQueue:updateOn:withHandler:")
    public native void startStepCountingUpdates(NSOperationQueue queue, @MachineSizedSInt long stepCounts, @Block("(@MachineSizedSInt,,)") VoidBlock3<Long, NSDate, NSError> handler);
    @Mapping("stopStepCountingUpdates")
    public native void stopStepCountingUpdates();
    @Mapping("isStepCountingAvailable")
    public static native boolean isStepCountingAvailable();
    
}
