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





@Mapping("MIDIRawData") @Library("AudioToolbox/AudioToolbox.h")
public class MIDIRawData 
    extends Struct 
     {

    
    protected MIDIRawData() {}
    
    
    @DotMapping("length")
    public native int getLength();
    @DotMapping("data")
    public native ByteBuffer getData();
    
    public static native MIDIRawData create(int length, ByteBuffer data) /*-[
        MIDIRawData __new = { .length = length, .data = data };
        return __new;
    ]-*/;
    public static native MIDIRawData copyWithlength(MIDIRawData original, int length) /*-[
        MIDIRawData __new = { .length = length, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIRawData copyWithdata(MIDIRawData original, ByteBuffer data) /*-[
        MIDIRawData __new = { .length = original.length, .data = data };
        return __new;
    ]-*/;

    
}
