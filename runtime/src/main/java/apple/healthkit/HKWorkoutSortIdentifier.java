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


/*<javadoc>*/
/*</javadoc>*/
@Library("HealthKit/HealthKit.h")
public class HKWorkoutSortIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKWorkoutSortIdentifierDuration")
    public static native String DurationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKWorkoutSortIdentifierTotalDistance")
    public static native String TotalDistanceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKWorkoutSortIdentifierTotalEnergyBurned")
    public static native String TotalEnergyBurnedValue();
    
}
