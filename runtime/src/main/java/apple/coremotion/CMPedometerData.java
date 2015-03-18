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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreMotion/CoreMotion.h") @Mapping("CMPedometerData")
public class CMPedometerData 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public CMPedometerData() { }
    
    
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("numberOfSteps")
    public native NSNumber getNumberOfSteps();
    @Mapping("distance")
    public native NSNumber getDistance();
    @Mapping("floorsAscended")
    public native NSNumber getFloorsAscended();
    @Mapping("floorsDescended")
    public native NSNumber getFloorsDescended();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
