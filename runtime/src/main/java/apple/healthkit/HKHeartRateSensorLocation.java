package apple.healthkit;


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
 * @since Available in iOS 8.0 and later.
 */
@Library("HealthKit/HealthKit.h")
@Mapping("HKHeartRateSensorLocation")
public final class HKHeartRateSensorLocation extends ObjCEnum {
    
    @GlobalConstant("HKHeartRateSensorLocationOther")
    public static final long Other = 0L;
    @GlobalConstant("HKHeartRateSensorLocationChest")
    public static final long Chest = 1L;
    @GlobalConstant("HKHeartRateSensorLocationWrist")
    public static final long Wrist = 2L;
    @GlobalConstant("HKHeartRateSensorLocationFinger")
    public static final long Finger = 3L;
    @GlobalConstant("HKHeartRateSensorLocationHand")
    public static final long Hand = 4L;
    @GlobalConstant("HKHeartRateSensorLocationEarLobe")
    public static final long EarLobe = 5L;
    @GlobalConstant("HKHeartRateSensorLocationFoot")
    public static final long Foot = 6L;


}
