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
import apple.metal.*;





@Mapping("CVSMPTETime")
public class CVSMPTETime 
    extends Struct 
     {

    
    protected CVSMPTETime() {}
    
    
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
        original.subframes = subframes;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithsubframeDivisor(CVSMPTETime original, short subframeDivisor) /*-[
        original.subframeDivisor = subframeDivisor;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithcounter(CVSMPTETime original, int counter) /*-[
        original.counter = counter;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithtype(CVSMPTETime original, int type) /*-[
        original.type = type;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithflags(CVSMPTETime original, int flags) /*-[
        original.flags = flags;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithhours(CVSMPTETime original, short hours) /*-[
        original.hours = hours;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithminutes(CVSMPTETime original, short minutes) /*-[
        original.minutes = minutes;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithseconds(CVSMPTETime original, short seconds) /*-[
        original.seconds = seconds;
        return original;
    ]-*/;

    
    public static native CVSMPTETime copyWithframes(CVSMPTETime original, short frames) /*-[
        original.frames = frames;
        return original;
    ]-*/;

    
}
