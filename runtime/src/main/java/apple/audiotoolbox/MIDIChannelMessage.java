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





@Mapping("MIDIChannelMessage") @Library("AudioToolbox/AudioToolbox.h")
public class MIDIChannelMessage 
    extends Struct 
     {

    
    protected MIDIChannelMessage() {}
    
    
    @DotMapping("status")
    public native byte getStatus();
    @DotMapping("data1")
    public native byte getData1();
    @DotMapping("data2")
    public native byte getData2();
    @DotMapping("reserved")
    public native byte getReserved();
    
    public static native MIDIChannelMessage create(byte status, byte data1, byte data2, byte reserved) /*-[
        MIDIChannelMessage __new = { .status = status, .data1 = data1, .data2 = data2, .reserved = reserved };
        return __new;
    ]-*/;
    public static native MIDIChannelMessage copyWithstatus(MIDIChannelMessage original, byte status) /*-[
        MIDIChannelMessage __new = { .status = status, .data1 = original.data1, .data2 = original.data2, .reserved = original.reserved };
        return __new;
    ]-*/;

    
    public static native MIDIChannelMessage copyWithdata1(MIDIChannelMessage original, byte data1) /*-[
        MIDIChannelMessage __new = { .status = original.status, .data1 = data1, .data2 = original.data2, .reserved = original.reserved };
        return __new;
    ]-*/;

    
    public static native MIDIChannelMessage copyWithdata2(MIDIChannelMessage original, byte data2) /*-[
        MIDIChannelMessage __new = { .status = original.status, .data1 = original.data1, .data2 = data2, .reserved = original.reserved };
        return __new;
    ]-*/;

    
    public static native MIDIChannelMessage copyWithreserved(MIDIChannelMessage original, byte reserved) /*-[
        MIDIChannelMessage __new = { .status = original.status, .data1 = original.data1, .data2 = original.data2, .reserved = reserved };
        return __new;
    ]-*/;

    
}
