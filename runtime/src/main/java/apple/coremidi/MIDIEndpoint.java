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
@Library("CoreMIDI")
public class MIDIEndpoint 
    extends MIDIObject 
     {

    
    
    protected MIDIEndpoint() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointGetEntity")
    protected native MIDIError getEntity(Todo outEntity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDestinationCreate")
    protected static native MIDIError createDestination(MIDIClient client, String name, FunctionPtr readProc, Todo refCon, Todo outDest);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISourceCreate")
    protected static native MIDIError createSource(MIDIClient client, String name, Todo outSrc);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointDispose")
    public native MIDIError dispose();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIReceived")
    public native MIDIError received(MIDIPacketList pktlist);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEndpointSetRefCons")
    protected native MIDIError setRefCons(Todo ref1, Todo ref2);
    
}
