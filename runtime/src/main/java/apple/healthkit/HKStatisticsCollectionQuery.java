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

@Library("HealthKit") @Mapping("HKStatisticsCollectionQuery")
public class HKStatisticsCollectionQuery 
    extends HKQuery 
     {

    
    
    public HKStatisticsCollectionQuery() {}
    @Mapping("initWithQuantityType:quantitySamplePredicate:options:anchorDate:intervalComponents:")
    public HKStatisticsCollectionQuery(HKQuantityType quantityType, NSPredicate quantitySamplePredicate, @Representing("HKStatisticsOptions") @MachineSizedUInt long options, NSDate anchorDate, NSDateComponents intervalComponents) { }
    
    
    @Mapping("anchorDate")
    public native NSDate getAnchorDate();
    @Mapping("options")
    public native @Representing("HKStatisticsOptions") @MachineSizedUInt long getOptions();
    @Mapping("intervalComponents")
    public native NSDateComponents getIntervalComponents();
    @Mapping("initialResultsHandler")
    public native @Block VoidBlock3<HKStatisticsCollectionQuery, HKStatisticsCollection, NSError> getInitialResultsHandler();
    @Mapping("setInitialResultsHandler:")
    public native void setInitialResultsHandler(@Block VoidBlock3<HKStatisticsCollectionQuery, HKStatisticsCollection, NSError> v);
    @Mapping("statisticsUpdateHandler")
    public native @Block VoidBlock4<HKStatisticsCollectionQuery, HKStatistics, HKStatisticsCollection, NSError> getStatisticsUpdateHandler();
    @Mapping("setStatisticsUpdateHandler:")
    public native void setStatisticsUpdateHandler(@Block VoidBlock4<HKStatisticsCollectionQuery, HKStatistics, HKStatisticsCollection, NSError> v);
    
    
    
    
    
}
