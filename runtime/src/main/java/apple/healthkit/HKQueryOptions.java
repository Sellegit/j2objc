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
@Mapping("HKQueryOptions")
public final class HKQueryOptions extends ObjCEnum {
    
    @GlobalConstant("HKQueryOptionNone")
    public static final long None = 0L;
    @GlobalConstant("HKQueryOptionStrictStartDate")
    public static final long StrictStartDate = 1L;
    @GlobalConstant("HKQueryOptionStrictEndDate")
    public static final long StrictEndDate = 2L;
    

}
