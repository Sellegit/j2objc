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
public class MIDIEntity 
    extends MIDIObject 
     {

    
    
    protected MIDIEntity() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetNumberOfSources")
    public native @MachineSizedUInt long getNumberOfSources();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetSource")
    public native MIDIEndpoint getSource(@MachineSizedUInt long sourceIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetNumberOfDestinations")
    public native @MachineSizedUInt long getNumberOfDestinations();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetDestination")
    public native MIDIEndpoint getDestination(@MachineSizedUInt long destIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetDevice")
    protected native MIDIError getDevice(Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityAddOrRemoveEndpoints")
    public native MIDIError addOrRemoveEndpoints(@MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints);
    
}
