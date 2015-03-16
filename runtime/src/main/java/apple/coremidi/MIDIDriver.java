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
public class MIDIDriver 
    extends MIDIDriverInterface 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetDriverIORunLoop")
    public static native CFRunLoop getIORunLoop();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIGetDriverDeviceList")
    public static native MIDIDeviceList getDeviceList(MIDIDriver driver);
    
}
