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
 */

@Library("CoreMotion") @Mapping("CMMotionActivity")
public class CMMotionActivity 
    extends CMLogItem 
     {

    
    
    public CMMotionActivity() {}
    
    
    @Mapping("confidence")
    public native @Representing("CMMotionActivityConfidence") @MachineSizedSInt long getConfidence();
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("unknown")
    public native boolean isUnknown();
    @Mapping("stationary")
    public native boolean isStationary();
    @Mapping("walking")
    public native boolean isWalking();
    @Mapping("running")
    public native boolean isRunning();
    @Mapping("automotive")
    public native boolean isAutomotive();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("cycling")
    public native boolean isCycling();
    
    
    
    
    
}
