package apple.corevideo;


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
import apple.coremedia.*;





@Mapping("CVSMPTETime") @Library("CoreVideo/CoreVideo.h")
public class CVSMPTETime 
    extends Struct 
     {

    
    private CVSMPTETime() {}
    
    
    @DotMapping("subframes")
    public native short getSubframes();
    @DotMapping("subframeDivisor")
    public native short getSubframeDivisor();
    @DotMapping("counter")
    public native int getCounter();
    @DotMapping("type")
    public native int getType();
    @DotMapping("flags")
    public native int getFlags();
    @DotMapping("hours")
    public native short getHours();
    @DotMapping("minutes")
    public native short getMinutes();
    @DotMapping("seconds")
    public native short getSeconds();
    @DotMapping("frames")
    public native short getFrames();
    
    public static native CVSMPTETime create(short subframes, short subframeDivisor, int counter, int type, int flags, short hours, short minutes, short seconds, short frames) /*-[
        CVSMPTETime __new = { .subframes = subframes, .subframeDivisor = subframeDivisor, .counter = counter, .type = type, .flags = flags, .hours = hours, .minutes = minutes, .seconds = seconds, .frames = frames };
        return __new;
    ]-*/;
    public static native CVSMPTETime copyWithsubframes(CVSMPTETime original, short subframes) /*-[
        CVSMPTETime __new = { .subframes = subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithsubframeDivisor(CVSMPTETime original, short subframeDivisor) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithcounter(CVSMPTETime original, int counter) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithtype(CVSMPTETime original, int type) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithflags(CVSMPTETime original, int flags) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithhours(CVSMPTETime original, short hours) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = hours, .minutes = original.minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithminutes(CVSMPTETime original, short minutes) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = minutes, .seconds = original.seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithseconds(CVSMPTETime original, short seconds) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = seconds, .frames = original.frames };
        return __new;
    ]-*/;

    
    public static native CVSMPTETime copyWithframes(CVSMPTETime original, short frames) /*-[
        CVSMPTETime __new = { .subframes = original.subframes, .subframeDivisor = original.subframeDivisor, .counter = original.counter, .type = original.type, .flags = original.flags, .hours = original.hours, .minutes = original.minutes, .seconds = original.seconds, .frames = frames };
        return __new;
    ]-*/;

    
}
