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

@Library("HealthKit") @Mapping("HKStatisticsCollection")
public class HKStatisticsCollection 
    extends NSObject 
     {

    
    
    public HKStatisticsCollection() {}
    
    
    
    
    
    
    @Mapping("statisticsForDate:")
    public native HKStatistics getStatisticsForDate(NSDate date);
    @Mapping("enumerateStatisticsFromDate:toDate:withBlock:")
    public native void enumerateStatistics(NSDate startDate, NSDate endDate, @Block VoidBlock2<HKStatistics, Boolean> block);
    @Mapping("statistics")
    public native NSArray<HKStatistics> getStatistics();
    @Mapping("sources")
    public native NSSet<HKSource> getSources();
    
}
