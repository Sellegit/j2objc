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

@Library("CoreMotion") @Mapping("CMAttitude")
public class CMAttitude 
    extends NSObject 
    implements NSCopying {

    
    
    public CMAttitude() {}
    
    
    @Mapping("roll")
    public native double getRoll();
    @Mapping("pitch")
    public native double getPitch();
    @Mapping("yaw")
    public native double getYaw();
    @Mapping("rotationMatrix")
    public native CMRotationMatrix getRotationMatrix();
    @Mapping("quaternion")
    public native CMQuaternion getQuaternion();
    
    
    
    @Mapping("multiplyByInverseOfAttitude:")
    public native void multiplyByInverseOfAttitude(CMAttitude attitude);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
