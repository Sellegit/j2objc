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

@Library("HealthKit/HealthKit.h") @Mapping("HKStatistics")
public class HKStatistics 
    extends NSObject 
    implements NSCopying {

    
    
    public HKStatistics() {}
    
    
    @Mapping("quantityType")
    public native HKQuantityType getQuantityType();
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("sources")
    public native NSArray<HKSource> getSources();
    
    
    
    @Mapping("averageQuantityForSource:")
    public native HKQuantity getAverageQuantityForSource(HKSource source);
    @Mapping("averageQuantity")
    public native HKQuantity getAverageQuantity();
    @Mapping("minimumQuantityForSource:")
    public native HKQuantity getMinimumQuantityForSource(HKSource source);
    @Mapping("minimumQuantity")
    public native HKQuantity getMinimumQuantity();
    @Mapping("maximumQuantityForSource:")
    public native HKQuantity getMaximumQuantityForSource(HKSource source);
    @Mapping("maximumQuantity")
    public native HKQuantity getMaximumQuantity();
    @Mapping("sumQuantityForSource:")
    public native HKQuantity getSumQuantityForSource(HKSource source);
    @Mapping("sumQuantity")
    public native HKQuantity getSumQuantity();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
