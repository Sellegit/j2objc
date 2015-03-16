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

@Library("HealthKit/HealthKit.h") @Mapping("HKQuantity")
public class HKQuantity 
    extends NSObject 
    implements NSCopying {

    
    
    public HKQuantity() {}
    
    
    
    
    
    
    @Mapping("isCompatibleWithUnit:")
    public native boolean isCompatibleWithUnit(HKUnit unit);
    @Mapping("doubleValueForUnit:")
    public native double getDoubleValueForUnit(HKUnit unit);
    @Mapping("compare:")
    public native @Representing("NSComparisonResult") @MachineSizedSInt long compare(HKQuantity quantity);
    @Mapping("quantityWithUnit:doubleValue:")
    public static native HKQuantity create(HKUnit unit, double value);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
