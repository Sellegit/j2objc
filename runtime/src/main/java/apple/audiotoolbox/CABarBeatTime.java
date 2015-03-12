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





@Mapping("CABarBeatTime")
public class CABarBeatTime 
    extends Struct 
     {

    
    protected CABarBeatTime() {}
    
    
    @DotMapping("bar")
    public native int getBar();
    @DotMapping("beat")
    public native short getBeat();
    @DotMapping("subbeat")
    public native short getSubbeat();
    @DotMapping("subbeatDivisor")
    public native short getSubbeatDivisor();
    @DotMapping("reserved")
    public native short getReserved();
    
    public static native CABarBeatTime create(int bar, short beat, short subbeat, short subbeatDivisor, short reserved) /*-[
        CABarBeatTime __new = { .bar = bar, .beat = beat, .subbeat = subbeat, .subbeatDivisor = subbeatDivisor, .reserved = reserved };
        return __new;
    ]-*/;
    public static native CABarBeatTime copyWithbar(CABarBeatTime original, int bar) /*-[
        original.bar = bar;
        return original;
    ]-*/;

    
    public static native CABarBeatTime copyWithbeat(CABarBeatTime original, short beat) /*-[
        original.beat = beat;
        return original;
    ]-*/;

    
    public static native CABarBeatTime copyWithsubbeat(CABarBeatTime original, short subbeat) /*-[
        original.subbeat = subbeat;
        return original;
    ]-*/;

    
    public static native CABarBeatTime copyWithsubbeatDivisor(CABarBeatTime original, short subbeatDivisor) /*-[
        original.subbeatDivisor = subbeatDivisor;
        return original;
    ]-*/;

    
    public static native CABarBeatTime copyWithreserved(CABarBeatTime original, short reserved) /*-[
        original.reserved = reserved;
        return original;
    ]-*/;

    
}
