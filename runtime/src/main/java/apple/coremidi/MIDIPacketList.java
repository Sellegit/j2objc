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


@Mapping("MIDIPacketList") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIPacketList 
    extends Struct 
     {

    
    private MIDIPacketList() {}
    
    
    @DotMapping("numPackets")
    public native int getNumPackets();
    @DotMapping("packet")
    public native MIDIPacket getPacket();

    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPacketListInit")
    public static native MIDIPacket init(MIDIPacketList pktlist);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPacketListAdd")
    public static native MIDIPacket add(MIDIPacketList pktlist, @MachineSizedUInt long listSize, MIDIPacket curPacket, long time, @MachineSizedUInt long nData, Todo data);

}
