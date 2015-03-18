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
public class MIDIPort 
    extends MIDIObject 
     {

    
    
    protected MIDIPort() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIInputPortCreate")
    public static native MIDIError createInputPort(MIDIClient client, String portName, FunctionPtr readProc, Todo refCon, Todo outPort);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIOutputPortCreate")
    public static native MIDIError createOutputPort(MIDIClient client, String portName, Todo outPort);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPortDispose")
    public static native MIDIError dispose(MIDIPort port);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPortConnectSource")
    public static native MIDIError connectSource(MIDIPort port, MIDIEndpoint source, Todo connRefCon);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIPortDisconnectSource")
    public static native MIDIError disconnectSource(MIDIPort port, MIDIEndpoint source);
    
}
