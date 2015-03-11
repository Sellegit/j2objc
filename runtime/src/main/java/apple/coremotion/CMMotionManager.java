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
 * @since Available in iOS 4.0 and later.
 */

@Library("CoreMotion") @Mapping("CMMotionManager")
public class CMMotionManager 
    extends NSObject 
     {

    
    
    public CMMotionManager() {}
    
    
    @Mapping("accelerometerUpdateInterval")
    public native double getAccelerometerUpdateInterval();
    public native void setAccelerometerUpdateInterval(double v);
    @Mapping("isAccelerometerAvailable")
    public native boolean isAccelerometerAvailable();
    @Mapping("isAccelerometerActive")
    public native boolean isAccelerometerActive();
    @Mapping("accelerometerData")
    public native CMAccelerometerData getAccelerometerData();
    @Mapping("gyroUpdateInterval")
    public native double getGyroUpdateInterval();
    public native void setGyroUpdateInterval(double v);
    @Mapping("isGyroAvailable")
    public native boolean isGyroAvailable();
    @Mapping("isGyroActive")
    public native boolean isGyroActive();
    @Mapping("gyroData")
    public native CMGyroData getGyroData();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("magnetometerUpdateInterval")
    public native double getMagnetometerUpdateInterval();
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setMagnetometerUpdateInterval(double v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isMagnetometerAvailable")
    public native boolean isMagnetometerAvailable();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isMagnetometerActive")
    public native boolean isMagnetometerActive();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("magnetometerData")
    public native CMMagnetometerData getMagnetometerData();
    @Mapping("deviceMotionUpdateInterval")
    public native double getDeviceMotionUpdateInterval();
    public native void setDeviceMotionUpdateInterval(double v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("attitudeReferenceFrame")
    public native CMAttitudeReferenceFrame getAttitudeReferenceFrame();
    @Mapping("isDeviceMotionAvailable")
    public native boolean isDeviceMotionAvailable();
    @Mapping("isDeviceMotionActive")
    public native boolean isDeviceMotionActive();
    @Mapping("deviceMotion")
    public native CMDeviceMotion getDeviceMotion();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("showsDeviceMovementDisplay")
    public native boolean showsDeviceMovementDisplay();
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setShowsDeviceMovementDisplay(boolean v);
    
    
    
    @Mapping("startAccelerometerUpdates")
    public native void startAccelerometerUpdates();
    @Mapping("startAccelerometerUpdatesToQueue:withHandler:")
    public native void startAccelerometerUpdates(NSOperationQueue queue, @Block VoidBlock2<CMAccelerometerData, NSError> handler);
    @Mapping("stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();
    @Mapping("startGyroUpdates")
    public native void startGyroUpdates();
    @Mapping("startGyroUpdatesToQueue:withHandler:")
    public native void startGyroUpdates(NSOperationQueue queue, @Block VoidBlock2<CMGyroData, NSError> handler);
    @Mapping("stopGyroUpdates")
    public native void stopGyroUpdates();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startMagnetometerUpdates")
    public native void startMagnetometerUpdates();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startMagnetometerUpdatesToQueue:withHandler:")
    public native void startMagnetometerUpdates(NSOperationQueue queue, @Block VoidBlock2<CMMagnetometerData, NSError> handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("stopMagnetometerUpdates")
    public native void stopMagnetometerUpdates();
    @Mapping("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();
    @Mapping("startDeviceMotionUpdatesToQueue:withHandler:")
    public native void startDeviceMotionUpdates(NSOperationQueue queue, @Block VoidBlock2<CMDeviceMotion, NSError> handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startDeviceMotionUpdatesUsingReferenceFrame:")
    public native void startDeviceMotionUpdates(CMAttitudeReferenceFrame referenceFrame);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startDeviceMotionUpdatesUsingReferenceFrame:toQueue:withHandler:")
    public native void startDeviceMotionUpdates(CMAttitudeReferenceFrame referenceFrame, NSOperationQueue queue, @Block VoidBlock2<CMDeviceMotion, NSError> handler);
    @Mapping("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableAttitudeReferenceFrames")
    public static native @MachineSizedUInt long getAvailableAttitudeReferenceFrames();
    
}
