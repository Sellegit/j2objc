package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;






@Mapping("CFNumberFormatterRoundingMode")
public final class CFNumberFormatterRoundingMode extends ObjCEnum {
    
    @GlobalConstant("kCFNumberFormatterRoundCeiling")
    public static final long Ceiling = 0L;
    @GlobalConstant("kCFNumberFormatterRoundFloor")
    public static final long Floor = 1L;
    @GlobalConstant("kCFNumberFormatterRoundDown")
    public static final long Down = 2L;
    @GlobalConstant("kCFNumberFormatterRoundUp")
    public static final long Up = 3L;
    @GlobalConstant("kCFNumberFormatterRoundHalfEven")
    public static final long HalfEven = 4L;
    @GlobalConstant("kCFNumberFormatterRoundHalfDown")
    public static final long HalfDown = 5L;
    @GlobalConstant("kCFNumberFormatterRoundHalfUp")
    public static final long HalfUp = 6L;
    

}
