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
@Library("HealthKit/HealthKit.h") @Mapping("HKWorkoutEvent")
public class HKWorkoutEvent 
    extends NSObject 
     {

    
    
    public HKWorkoutEvent() {}

    
    @Mapping("type")
    public native @Representing("HKWorkoutEventType") long getType();
    @Mapping("date")
    public native NSDate getDate();

    
    
    @Mapping("workoutEventWithType:date:")
    public static native HKWorkoutEvent create(@Representing("HKWorkoutEventType") long type, NSDate date);

}
