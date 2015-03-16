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





@Mapping("MIDIMetaEvent") @Library("AudioToolbox/AudioToolbox.h")
public class MIDIMetaEvent 
    extends Struct 
     {

    
    protected MIDIMetaEvent() {}
    
    
    @DotMapping("metaEventType")
    public native byte getMetaEventType();
    @DotMapping("unused1")
    public native byte getUnused1();
    @DotMapping("unused2")
    public native byte getUnused2();
    @DotMapping("unused3")
    public native byte getUnused3();
    @DotMapping("dataLength")
    public native int getDataLength();
    @DotMapping("data")
    public native ByteBuffer getData();
    
    public static native MIDIMetaEvent create(byte metaEventType, byte unused1, byte unused2, byte unused3, int dataLength, ByteBuffer data) /*-[
        MIDIMetaEvent __new = { .metaEventType = metaEventType, .unused1 = unused1, .unused2 = unused2, .unused3 = unused3, .dataLength = dataLength, .data = data };
        return __new;
    ]-*/;
    public static native MIDIMetaEvent copyWithmetaEventType(MIDIMetaEvent original, byte metaEventType) /*-[
        MIDIMetaEvent __new = { .metaEventType = metaEventType, .unused1 = original.unused1, .unused2 = original.unused2, .unused3 = original.unused3, .dataLength = original.dataLength, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIMetaEvent copyWithunused1(MIDIMetaEvent original, byte unused1) /*-[
        MIDIMetaEvent __new = { .metaEventType = original.metaEventType, .unused1 = unused1, .unused2 = original.unused2, .unused3 = original.unused3, .dataLength = original.dataLength, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIMetaEvent copyWithunused2(MIDIMetaEvent original, byte unused2) /*-[
        MIDIMetaEvent __new = { .metaEventType = original.metaEventType, .unused1 = original.unused1, .unused2 = unused2, .unused3 = original.unused3, .dataLength = original.dataLength, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIMetaEvent copyWithunused3(MIDIMetaEvent original, byte unused3) /*-[
        MIDIMetaEvent __new = { .metaEventType = original.metaEventType, .unused1 = original.unused1, .unused2 = original.unused2, .unused3 = unused3, .dataLength = original.dataLength, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIMetaEvent copyWithdataLength(MIDIMetaEvent original, int dataLength) /*-[
        MIDIMetaEvent __new = { .metaEventType = original.metaEventType, .unused1 = original.unused1, .unused2 = original.unused2, .unused3 = original.unused3, .dataLength = dataLength, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MIDIMetaEvent copyWithdata(MIDIMetaEvent original, ByteBuffer data) /*-[
        MIDIMetaEvent __new = { .metaEventType = original.metaEventType, .unused1 = original.unused1, .unused2 = original.unused2, .unused3 = original.unused3, .dataLength = original.dataLength, .data = data };
        return __new;
    ]-*/;

    
}
