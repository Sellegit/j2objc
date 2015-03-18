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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMIDI/CoreMIDI.h")
public class MIDIEndpoint 
    extends MIDIObject 
     {

    
    
    protected MIDIEndpoint() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointGetEntity")
    public static native MIDIError getEntity(MIDIEndpoint inEndpoint, Todo outEntity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDestinationCreate")
    public static native MIDIError createDestination(MIDIClient client, String name, FunctionPtr readProc, Todo refCon, Todo outDest);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISourceCreate")
    public static native MIDIError createSource(MIDIClient client, String name, Todo outSrc);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointDispose")
    public static native MIDIError dispose(MIDIEndpoint endpt);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIReceived")
    public static native MIDIError received(MIDIEndpoint src, MIDIPacketList pktlist);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointSetRefCons")
    public static native MIDIError setRefCons(MIDIEndpoint endpt, Todo ref1, Todo ref2);
    
}
