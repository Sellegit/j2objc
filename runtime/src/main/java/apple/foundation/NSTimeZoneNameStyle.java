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
@Mapping("NSTimeZoneNameStyle")
public final class NSTimeZoneNameStyle extends ObjCEnum {
    
    @GlobalConstant("NSTimeZoneNameStyleStandard")
    public static final long Standard = 0L;
    @GlobalConstant("NSTimeZoneNameStyleShortStandard")
    public static final long ShortStandard = 1L;
    @GlobalConstant("NSTimeZoneNameStyleDaylightSaving")
    public static final long DaylightSaving = 2L;
    @GlobalConstant("NSTimeZoneNameStyleShortDaylightSaving")
    public static final long ShortDaylightSaving = 3L;
    @GlobalConstant("NSTimeZoneNameStyleGeneric")
    public static final long Generic = 4L;
    @GlobalConstant("NSTimeZoneNameStyleShortGeneric")
    public static final long ShortGeneric = 5L;


}
