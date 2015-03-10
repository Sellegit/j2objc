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
public class MIDIDevice 
    extends MIDIObject 
     {

    
    
    protected MIDIDevice() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceGetNumberOfEntities")
    public native @MachineSizedUInt long getNumberOfEntities();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceGetEntity")
    public native MIDIEntity getEntity(@MachineSizedUInt long entityIndex0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceAddEntity")
    protected native MIDIError addEntity(String name, boolean embedded, @MachineSizedUInt long numSourceEndpoints, @MachineSizedUInt long numDestinationEndpoints, Todo newEntity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceRemoveEntity")
    public native MIDIError removeEntity(MIDIEntity entity);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIExternalDeviceCreate")
    protected static native MIDIError createExternal(String name, String manufacturer, String model, Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceCreate")
    protected static native MIDIError create(MIDIDriver owner, String name, String manufacturer, String model, Todo outDevice);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceDispose")
    public native MIDIError dispose();
    
}
