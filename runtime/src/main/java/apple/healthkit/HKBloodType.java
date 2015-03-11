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


@Mapping("HKBloodType")
public final class HKBloodType extends ObjCEnum {
    
    @GlobalConstant("HKBloodTypeNotSet")
    public static final long NotSet = 0L;
    @GlobalConstant("HKBloodTypeAPositive")
    public static final long APositive = 1L;
    @GlobalConstant("HKBloodTypeANegative")
    public static final long ANegative = 2L;
    @GlobalConstant("HKBloodTypeBPositive")
    public static final long BPositive = 3L;
    @GlobalConstant("HKBloodTypeBNegative")
    public static final long BNegative = 4L;
    @GlobalConstant("HKBloodTypeABPositive")
    public static final long ABPositive = 5L;
    @GlobalConstant("HKBloodTypeABNegative")
    public static final long ABNegative = 6L;
    @GlobalConstant("HKBloodTypeOPositive")
    public static final long OPositive = 7L;
    @GlobalConstant("HKBloodTypeONegative")
    public static final long ONegative = 8L;
    

}
