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





@Mapping("MIDIPacketList") @Library("CoreMIDI")
public class MIDIPacketList 
    extends Struct 
     {

    
    protected MIDIPacketList() {}
    
    
    @DotMapping("numPackets")
    public native int getNumPackets();
    @DotMapping("packet")
    public native MIDIPacket getPacket();
    
    public static native MIDIPacketList create(int numPackets, MIDIPacket packet) /*-[
        MIDIPacketList __new = { .numPackets = numPackets, .packet = packet };
        return __new;
    ]-*/;
    public static native MIDIPacketList copyWithnumPackets(MIDIPacketList original, int numPackets) /*-[
        original.numPackets = numPackets;
        return original;
    ]-*/;

    
    public static native MIDIPacketList copyWithpacket(MIDIPacketList original, MIDIPacket packet) /*-[
        original.packet = packet;
        return original;
    ]-*/;

    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPacketListInit")
    public native MIDIPacket init();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPacketListAdd")
    protected native MIDIPacket add(@MachineSizedUInt long listSize, MIDIPacket curPacket, long time, @MachineSizedUInt long nData, Todo data);
    
}
