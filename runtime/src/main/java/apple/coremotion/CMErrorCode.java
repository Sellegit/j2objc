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






@Mapping("CMErrorCode")
public final class CMErrorCode extends ObjCEnum {
    
    @GlobalConstant("CMErrorNULL")
    public static final long NULL = 100L;
    @GlobalConstant("CMErrorDeviceRequiresMovement")
    public static final long DeviceRequiresMovement = 101L;
    @GlobalConstant("CMErrorTrueNorthNotAvailable")
    public static final long TrueNorthNotAvailable = 102L;
    @GlobalConstant("CMErrorUnknown")
    public static final long Unknown = 103L;
    @GlobalConstant("CMErrorMotionActivityNotAvailable")
    public static final long MotionActivityNotAvailable = 104L;
    @GlobalConstant("CMErrorMotionActivityNotAuthorized")
    public static final long MotionActivityNotAuthorized = 105L;
    @GlobalConstant("CMErrorMotionActivityNotEntitled")
    public static final long MotionActivityNotEntitled = 106L;
    @GlobalConstant("CMErrorInvalidParameter")
    public static final long InvalidParameter = 107L;
    

}
