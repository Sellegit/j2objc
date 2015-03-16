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





@Library("HealthKit/HealthKit.h")
@Mapping("HKBiologicalSex")
public final class HKBiologicalSex extends ObjCEnum {
    
    @GlobalConstant("HKBiologicalSexNotSet")
    public static final long NotSet = 0L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKBiologicalSexFemale")
    public static final long Female = 1L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKBiologicalSexMale")
    public static final long Male = 2L;
    /**
     * @since Available in iOS 8.2 and later.
     */
    @GlobalConstant("HKBiologicalSexOther")
    public static final long Other = 3L;
    

}
