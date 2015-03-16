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





@Mapping("MIDIValueMap") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIValueMap 
    extends Struct 
     {

    
    protected MIDIValueMap() {}
    
    
    @DotMapping("value")
    public native ByteBuffer getValue();
    
    public static native MIDIValueMap create(ByteBuffer value) /*-[
        MIDIValueMap __new = { .value = value };
        return __new;
    ]-*/;
    public static native MIDIValueMap copyWithvalue(MIDIValueMap original, ByteBuffer value) /*-[
        original.value = value;
        return original;
    ]-*/;

    
}
