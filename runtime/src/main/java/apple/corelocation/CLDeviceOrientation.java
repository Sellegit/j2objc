package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;






@Mapping("CLDeviceOrientation")
public final class CLDeviceOrientation extends ObjCEnum {
    
    @GlobalConstant("CLDeviceOrientationUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("CLDeviceOrientationPortrait")
    public static final long Portrait = 1L;
    @GlobalConstant("CLDeviceOrientationPortraitUpsideDown")
    public static final long PortraitUpsideDown = 2L;
    @GlobalConstant("CLDeviceOrientationLandscapeLeft")
    public static final long LandscapeLeft = 3L;
    @GlobalConstant("CLDeviceOrientationLandscapeRight")
    public static final long LandscapeRight = 4L;
    @GlobalConstant("CLDeviceOrientationFaceUp")
    public static final long FaceUp = 5L;
    @GlobalConstant("CLDeviceOrientationFaceDown")
    public static final long FaceDown = 6L;
    

}
