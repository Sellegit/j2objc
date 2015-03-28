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
@Library("CoreMotion/CoreMotion.h") @Mapping("CMMotionManager")
public class CMMotionManager 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public CMMotionManager() { }

    
    @Mapping("accelerometerUpdateInterval")
    public native double getAccelerometerUpdateInterval();
    @Mapping("setAccelerometerUpdateInterval:")
    public native void setAccelerometerUpdateInterval(double v);
    @Mapping("isAccelerometerAvailable")
    public native boolean isAccelerometerAvailable();
    @Mapping("isAccelerometerActive")
    public native boolean isAccelerometerActive();
    @Mapping("accelerometerData")
    public native CMAccelerometerData getAccelerometerData();
    @Mapping("gyroUpdateInterval")
    public native double getGyroUpdateInterval();
    @Mapping("setGyroUpdateInterval:")
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
    @Mapping("setMagnetometerUpdateInterval:")
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
    @Mapping("setDeviceMotionUpdateInterval:")
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
    @Mapping("setShowsDeviceMovementDisplay:")
    public native void setShowsDeviceMovementDisplay(boolean v);

    
    
    @Mapping("startAccelerometerUpdates")
    public native void startAccelerometerUpdates();
    @Mapping("stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();
    @Mapping("startGyroUpdates")
    public native void startGyroUpdates();
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
    @Mapping("stopMagnetometerUpdates")
    public native void stopMagnetometerUpdates();
    @Mapping("startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startDeviceMotionUpdatesUsingReferenceFrame:")
    public native void startDeviceMotionUpdates(CMAttitudeReferenceFrame referenceFrame);
    @Mapping("stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableAttitudeReferenceFrames")
    public static native @MachineSizedUInt long getAvailableAttitudeReferenceFrames();

}
