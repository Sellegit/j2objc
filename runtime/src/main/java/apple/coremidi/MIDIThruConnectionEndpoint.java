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





@Mapping("MIDIThruConnectionEndpoint") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIThruConnectionEndpoint 
    extends Struct 
     {

    
    private MIDIThruConnectionEndpoint() {}
    
    
    @DotMapping("endpointRef")
    public native MIDIEndpoint getEndpointRef();
    @DotMapping("uniqueID")
    public native int getUniqueID();
    
    
}
