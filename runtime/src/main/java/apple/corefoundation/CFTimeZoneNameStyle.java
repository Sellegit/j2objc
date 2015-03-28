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


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFTimeZoneNameStyle")
public final class CFTimeZoneNameStyle extends ObjCEnum {
    
    @GlobalConstant("kCFTimeZoneNameStyleStandard")
    public static final long Standard = 0L;
    @GlobalConstant("kCFTimeZoneNameStyleShortStandard")
    public static final long ShortStandard = 1L;
    @GlobalConstant("kCFTimeZoneNameStyleDaylightSaving")
    public static final long DaylightSaving = 2L;
    @GlobalConstant("kCFTimeZoneNameStyleShortDaylightSaving")
    public static final long ShortDaylightSaving = 3L;
    @GlobalConstant("kCFTimeZoneNameStyleGeneric")
    public static final long Generic = 4L;
    @GlobalConstant("kCFTimeZoneNameStyleShortGeneric")
    public static final long ShortGeneric = 5L;


}
