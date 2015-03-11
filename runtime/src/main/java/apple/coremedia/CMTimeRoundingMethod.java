package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;





@Library("CoreMedia")
@Mapping("CMTimeRoundingMethod")
public final class CMTimeRoundingMethod extends ObjCEnum {
    
    @GlobalConstant("kCMTimeRoundingMethod_RoundHalfAwayFromZero")
    public static final long RoundHalfAwayFromZero = 1L;
    @GlobalConstant("kCMTimeRoundingMethod_RoundTowardZero")
    public static final long RoundTowardZero = 2L;
    @GlobalConstant("kCMTimeRoundingMethod_RoundAwayFromZero")
    public static final long RoundAwayFromZero = 3L;
    @GlobalConstant("kCMTimeRoundingMethod_QuickTime")
    public static final long QuickTime = 4L;
    @GlobalConstant("kCMTimeRoundingMethod_RoundTowardPositiveInfinity")
    public static final long RoundTowardPositiveInfinity = 5L;
    @GlobalConstant("kCMTimeRoundingMethod_RoundTowardNegativeInfinity")
    public static final long RoundTowardNegativeInfinity = 6L;
    @GlobalConstant("kCMTimeRoundingMethod_Default")
    public static final long Default = 1L;
    

}
