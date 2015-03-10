package apple.coremidi;


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





@Mapping("MIDIPacket")
public class MIDIPacket 
    extends Struct 
     {

    
    protected MIDIPacket() {}
    
    
    @DotMapping("timeStamp")
    public native long getTimeStamp();
    @DotMapping("length")
    public native short getLength();
    @DotMapping("data")
    public native ByteBuffer getData();
    
    public static native MIDIPacket create(long timeStamp, short length, ByteBuffer data) /*-[
        MIDIPacket __new = { .timeStamp = timeStamp, .length = length, .data = data };
        return __new;
    ]-*/;
    public static native MIDIPacket copyWithtimeStamp(MIDIPacket original, long timeStamp) /*-[
        original.timeStamp = timeStamp;
        return __new;
    ]-*/;

    
    public static native MIDIPacket copyWithlength(MIDIPacket original, short length) /*-[
        original.length = length;
        return __new;
    ]-*/;

    
    public static native MIDIPacket copyWithdata(MIDIPacket original, ByteBuffer data) /*-[
        original.data = data;
        return __new;
    ]-*/;

    
}
