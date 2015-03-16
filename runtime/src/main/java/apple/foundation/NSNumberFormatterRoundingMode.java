package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h")
@Mapping("NSNumberFormatterRoundingMode")
public final class NSNumberFormatterRoundingMode extends ObjCEnum {
    
    @GlobalConstant("NSNumberFormatterRoundCeiling")
    public static final long Ceiling = 0L;
    @GlobalConstant("NSNumberFormatterRoundFloor")
    public static final long Floor = 1L;
    @GlobalConstant("NSNumberFormatterRoundDown")
    public static final long Down = 2L;
    @GlobalConstant("NSNumberFormatterRoundUp")
    public static final long Up = 3L;
    @GlobalConstant("NSNumberFormatterRoundHalfEven")
    public static final long HalfEven = 4L;
    @GlobalConstant("NSNumberFormatterRoundHalfDown")
    public static final long HalfDown = 5L;
    @GlobalConstant("NSNumberFormatterRoundHalfUp")
    public static final long HalfUp = 6L;
    

}
