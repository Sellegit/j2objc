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
public class MIDIEntity 
    extends MIDIObject 
     {

    
    
    protected MIDIEntity() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetNumberOfSources")
    public static native @MachineSizedUInt long getNumberOfSources(MIDIEntity entity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetSource")
    public static native MIDIEndpoint getSource(MIDIEntity entity, @MachineSizedUInt long sourceIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetNumberOfDestinations")
    public static native @MachineSizedUInt long getNumberOfDestinations(MIDIEntity entity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetDestination")
    public static native MIDIEndpoint getDestination(MIDIEntity entity, @MachineSizedUInt long destIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityGetDevice")
    public static native MIDIError getDevice(MIDIEntity inEntity, Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIEntityAddOrRemoveEndpoints")
    public static native MIDIError addOrRemoveEndpoints(MIDIEntity entity, @MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints);
    
}
