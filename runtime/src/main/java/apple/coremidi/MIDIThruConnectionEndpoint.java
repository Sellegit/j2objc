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





@Mapping("MIDIThruConnectionEndpoint")
public class MIDIThruConnectionEndpoint 
    extends Struct 
     {

    
    protected MIDIThruConnectionEndpoint() {}
    
    
    @DotMapping("endpointRef")
    public native MIDIEndpoint getEndpointRef();
    @DotMapping("uniqueID")
    public native int getUniqueID();
    
    public static native MIDIThruConnectionEndpoint create(MIDIEndpoint endpointRef, int uniqueID) /*-[
        MIDIThruConnectionEndpoint __new = { .endpointRef = endpointRef, .uniqueID = uniqueID };
        return __new;
    ]-*/;
    public static native MIDIThruConnectionEndpoint copyWithendpointRef(MIDIThruConnectionEndpoint original, MIDIEndpoint endpointRef) /*-[
        original.endpointRef = endpointRef;
        return __new;
    ]-*/;

    
    public static native MIDIThruConnectionEndpoint copyWithuniqueID(MIDIThruConnectionEndpoint original, int uniqueID) /*-[
        original.uniqueID = uniqueID;
        return __new;
    ]-*/;

    
}
