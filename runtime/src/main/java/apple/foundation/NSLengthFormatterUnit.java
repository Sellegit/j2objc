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


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("Foundation/Foundation.h")
@Mapping("NSLengthFormatterUnit")
public final class NSLengthFormatterUnit extends ObjCEnum {
    
    @GlobalConstant("NSLengthFormatterUnitMillimeter")
    public static final long Millimeter = 8L;
    @GlobalConstant("NSLengthFormatterUnitCentimeter")
    public static final long Centimeter = 9L;
    @GlobalConstant("NSLengthFormatterUnitMeter")
    public static final long Meter = 11L;
    @GlobalConstant("NSLengthFormatterUnitKilometer")
    public static final long Kilometer = 14L;
    @GlobalConstant("NSLengthFormatterUnitInch")
    public static final long Inch = 1281L;
    @GlobalConstant("NSLengthFormatterUnitFoot")
    public static final long Foot = 1282L;
    @GlobalConstant("NSLengthFormatterUnitYard")
    public static final long Yard = 1283L;
    @GlobalConstant("NSLengthFormatterUnitMile")
    public static final long Mile = 1284L;


}
