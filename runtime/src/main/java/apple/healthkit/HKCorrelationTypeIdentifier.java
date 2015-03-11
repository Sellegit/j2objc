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
@Library("HealthKit")
public class HKCorrelationTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKCorrelationTypeIdentifierBloodPressure")
    protected static native NSString BloodPressureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKCorrelationTypeIdentifierFood")
    protected static native NSString FoodValue();
    
}
