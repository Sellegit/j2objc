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
public class MIDIDeviceList 
    extends MIDIObject 
     {

    
    
    protected MIDIDeviceList() {}

    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListGetNumberOfDevices")
    public static native @MachineSizedUInt long getNumberOfDevices(MIDIDeviceList devList);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListGetDevice")
    public static native MIDIDevice getDevice(MIDIDeviceList devList, @MachineSizedUInt long index0);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListAddDevice")
    public static native MIDIError addDevice(MIDIDeviceList devList, MIDIDevice dev);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIDeviceListDispose")
    public static native MIDIError dispose(MIDIDeviceList devList);

}
