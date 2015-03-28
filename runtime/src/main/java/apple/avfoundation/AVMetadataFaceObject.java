package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVMetadataFaceObject")
public class AVMetadataFaceObject 
    extends AVMetadataObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVMetadataFaceObject() { }

    
    @Mapping("faceID")
    public native @MachineSizedSInt long getFaceID();
    @Mapping("hasRollAngle")
    public native boolean hasRollAngle();
    @Mapping("rollAngle")
    public native @MachineSizedFloat double getRollAngle();
    @Mapping("hasYawAngle")
    public native boolean hasYawAngle();
    @Mapping("yawAngle")
    public native @MachineSizedFloat double getYawAngle();

    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
