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





@Library("CoreMIDI")
@Mapping("MIDIObjectType")
public final class MIDIObjectType extends ObjCEnum {
    
    @GlobalConstant("kMIDIObjectType_Other")
    public static final long Other = -1L;
    @GlobalConstant("kMIDIObjectType_Device")
    public static final long Device = 0L;
    @GlobalConstant("kMIDIObjectType_Entity")
    public static final long Entity = 1L;
    @GlobalConstant("kMIDIObjectType_Source")
    public static final long Source = 2L;
    @GlobalConstant("kMIDIObjectType_Destination")
    public static final long Destination = 3L;
    @GlobalConstant("kMIDIObjectType_ExternalMask")
    public static final long ExternalMask = 16L;
    @GlobalConstant("kMIDIObjectType_ExternalDevice")
    public static final long ExternalDevice = 16L;
    @GlobalConstant("kMIDIObjectType_ExternalEntity")
    public static final long ExternalEntity = 17L;
    @GlobalConstant("kMIDIObjectType_ExternalSource")
    public static final long ExternalSource = 18L;
    @GlobalConstant("kMIDIObjectType_ExternalDestination")
    public static final long ExternalDestination = 19L;
    

}
