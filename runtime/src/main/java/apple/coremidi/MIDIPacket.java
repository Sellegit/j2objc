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


@Mapping("MIDIPacket") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIPacket 
    extends Struct 
     {

    
    private MIDIPacket() {}
    
    
    @DotMapping("timeStamp")
    public native long getTimeStamp();
    @DotMapping("length")
    public native short getLength();

    
}
