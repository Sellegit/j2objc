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
public class MIDI 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetNumberOfDevices")
    public static native @MachineSizedUInt long getNumberOfDevices();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetDevice")
    public static native MIDIDevice getDevice(@MachineSizedUInt long deviceIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetNumberOfSources")
    public static native @MachineSizedUInt long getNumberOfSources();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetSource")
    public static native MIDIEndpoint getSource(@MachineSizedUInt long sourceIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetNumberOfDestinations")
    public static native @MachineSizedUInt long getNumberOfDestinations();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetDestination")
    public static native MIDIEndpoint getDestination(@MachineSizedUInt long destIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetNumberOfExternalDevices")
    public static native @MachineSizedUInt long getNumberOfExternalDevices();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetExternalDevice")
    public static native MIDIDevice getExternalDevice(@MachineSizedUInt long deviceIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISend")
    public static native MIDIError send(MIDIPort port, MIDIEndpoint dest, MIDIPacketList pktlist);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISendSysex")
    public static native MIDIError sendSysex(MIDISysexSendRequest request);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIFlushOutput")
    public static native MIDIError flushOutput(MIDIEndpoint dest);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIRestart")
    public static native MIDIError restart();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISetupAddDevice")
    public static native MIDIError addDevice(MIDIDevice device);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISetupRemoveDevice")
    public static native MIDIError removeDevice(MIDIDevice device);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISetupAddExternalDevice")
    public static native MIDIError addExternalDevice(MIDIDevice device);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDISetupRemoveExternalDevice")
    public static native MIDIError removeExternalDevice(MIDIDevice device);

}
