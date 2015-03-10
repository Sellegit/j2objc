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
public class MIDIDeviceList 
    extends MIDIObject 
     {

    
    
    protected MIDIDeviceList() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListGetNumberOfDevices")
    public native @MachineSizedUInt long getNumberOfDevices();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListGetDevice")
    public native MIDIDevice getDevice(@MachineSizedUInt long index0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListAddDevice")
    public native MIDIError addDevice(MIDIDevice dev);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListDispose")
    public native MIDIError dispose();
    
}
