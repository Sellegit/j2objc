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
public class MIDIDevice 
    extends MIDIObject 
     {

    
    
    protected MIDIDevice() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceGetNumberOfEntities")
    public static native @MachineSizedUInt long getNumberOfEntities(MIDIDevice device);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceGetEntity")
    public static native MIDIEntity getEntity(MIDIDevice device, @MachineSizedUInt long entityIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceAddEntity")
    public static native MIDIError addEntity(MIDIDevice device, String name, boolean embedded, @MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints, Todo newEntity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceRemoveEntity")
    public static native MIDIError removeEntity(MIDIDevice device, MIDIEntity entity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIExternalDeviceCreate")
    public static native MIDIError createExternal(String name, String manufacturer, String model, Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceCreate")
    public static native MIDIError create(MIDIDriver owner, String name, String manufacturer, String model, Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceDispose")
    public static native MIDIError dispose(MIDIDevice device);
    
}
