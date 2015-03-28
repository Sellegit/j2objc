package apple.coreaudio;


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


@Library("CoreAudio/CoreAudioTypes.h")
@Mapping("SMPTETimeType")
public final class SMPTETimeType extends ObjCEnum {
    
    @GlobalConstant("kSMPTETimeType24")
    public static final long _24 = 0L;
    @GlobalConstant("kSMPTETimeType25")
    public static final long _25 = 1L;
    @GlobalConstant("kSMPTETimeType30Drop")
    public static final long _30Drop = 2L;
    @GlobalConstant("kSMPTETimeType30")
    public static final long _30 = 3L;
    @GlobalConstant("kSMPTETimeType2997")
    public static final long _2997 = 4L;
    @GlobalConstant("kSMPTETimeType2997Drop")
    public static final long _2997Drop = 5L;
    @GlobalConstant("kSMPTETimeType60")
    public static final long _60 = 6L;
    @GlobalConstant("kSMPTETimeType5994")
    public static final long _5994 = 7L;
    @GlobalConstant("kSMPTETimeType60Drop")
    public static final long _60Drop = 8L;
    @GlobalConstant("kSMPTETimeType5994Drop")
    public static final long _5994Drop = 9L;
    @GlobalConstant("kSMPTETimeType50")
    public static final long _50 = 10L;
    @GlobalConstant("kSMPTETimeType2398")
    public static final long _2398 = 11L;


}
