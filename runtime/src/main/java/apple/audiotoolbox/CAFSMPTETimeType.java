package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;


@Library("AudioToolbox/AudioToolbox.h")
@Mapping("CAFSMPTETimeType")
public final class CAFSMPTETimeType extends ObjCEnum {
    
    @GlobalConstant("kCAF_SMPTE_TimeTypeNone")
    public static final long None = 0L;
    @GlobalConstant("kCAF_SMPTE_TimeType24")
    public static final long _24 = 1L;
    @GlobalConstant("kCAF_SMPTE_TimeType25")
    public static final long _25 = 2L;
    @GlobalConstant("kCAF_SMPTE_TimeType30Drop")
    public static final long _30Drop = 3L;
    @GlobalConstant("kCAF_SMPTE_TimeType30")
    public static final long _30 = 4L;
    @GlobalConstant("kCAF_SMPTE_TimeType2997")
    public static final long _2997 = 5L;
    @GlobalConstant("kCAF_SMPTE_TimeType2997Drop")
    public static final long _2997Drop = 6L;
    @GlobalConstant("kCAF_SMPTE_TimeType60")
    public static final long _60 = 7L;
    @GlobalConstant("kCAF_SMPTE_TimeType5994")
    public static final long _5994 = 8L;
    @GlobalConstant("kCAF_SMPTE_TimeType60Drop")
    public static final long _60Drop = 9L;
    @GlobalConstant("kCAF_SMPTE_TimeType5994Drop")
    public static final long _5994Drop = 10L;
    @GlobalConstant("kCAF_SMPTE_TimeType50")
    public static final long _50 = 11L;
    @GlobalConstant("kCAF_SMPTE_TimeType2398")
    public static final long _2398 = 12L;


}
