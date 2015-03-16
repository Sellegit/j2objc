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

@Library("CoreMotion/CoreMotion.h") @Mapping("CMDeviceMotion")
public class CMDeviceMotion 
    extends CMLogItem 
     {

    
    
    public CMDeviceMotion() {}
    
    
    @Mapping("attitude")
    public native CMAttitude getAttitude();
    @Mapping("rotationRate")
    public native CMRotationRate getRotationRate();
    @Mapping("gravity")
    public native CMAcceleration getGravity();
    @Mapping("userAcceleration")
    public native CMAcceleration getUserAcceleration();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("magneticField")
    public native CMCalibratedMagneticField getMagneticField();
    
    
    
    
    
}
