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
@Mapping("MIDIError")
public final class MIDIError extends ObjCEnum {
    
    @GlobalConstant("kMIDIInvalidClient")
    public static final long InvalidClient = -10830L;
    @GlobalConstant("kMIDIInvalidPort")
    public static final long InvalidPort = -10831L;
    @GlobalConstant("kMIDIWrongEndpointType")
    public static final long WrongEndpointType = -10832L;
    @GlobalConstant("kMIDINoConnection")
    public static final long NoConnection = -10833L;
    @GlobalConstant("kMIDIUnknownEndpoint")
    public static final long UnknownEndpoint = -10834L;
    @GlobalConstant("kMIDIUnknownProperty")
    public static final long UnknownProperty = -10835L;
    @GlobalConstant("kMIDIWrongPropertyType")
    public static final long WrongPropertyType = -10836L;
    @GlobalConstant("kMIDINoCurrentSetup")
    public static final long NoCurrentSetup = -10837L;
    @GlobalConstant("kMIDIMessageSendErr")
    public static final long MessageSendErr = -10838L;
    @GlobalConstant("kMIDIServerStartErr")
    public static final long ServerStartErr = -10839L;
    @GlobalConstant("kMIDISetupFormatErr")
    public static final long SetupFormatErr = -10840L;
    @GlobalConstant("kMIDIWrongThread")
    public static final long WrongThread = -10841L;
    @GlobalConstant("kMIDIObjectNotFound")
    public static final long ObjectNotFound = -10842L;
    @GlobalConstant("kMIDIIDNotUnique")
    public static final long IDNotUnique = -10843L;
    @GlobalConstant("kMIDINotPermitted")
    public static final long NotPermitted = -10844L;
    

}
