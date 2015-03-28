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


@Library("CoreMIDI/CoreMIDI.h")
@Mapping("MIDINotificationMessageID")
public final class MIDINotificationMessageID extends ObjCEnum {
    
    @GlobalConstant("kMIDIMsgSetupChanged")
    public static final long SetupChanged = 1L;
    @GlobalConstant("kMIDIMsgObjectAdded")
    public static final long ObjectAdded = 2L;
    @GlobalConstant("kMIDIMsgObjectRemoved")
    public static final long ObjectRemoved = 3L;
    @GlobalConstant("kMIDIMsgPropertyChanged")
    public static final long PropertyChanged = 4L;
    @GlobalConstant("kMIDIMsgThruConnectionsChanged")
    public static final long ThruConnectionsChanged = 5L;
    @GlobalConstant("kMIDIMsgSerialPortOwnerChanged")
    public static final long SerialPortOwnerChanged = 6L;
    @GlobalConstant("kMIDIMsgIOError")
    public static final long IOError = 7L;


}
