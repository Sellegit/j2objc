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
@Mapping("MIDINetworkConnectionPolicy")
public final class MIDINetworkConnectionPolicy extends ObjCEnum {
    
    @GlobalConstant("MIDINetworkConnectionPolicy_NoOne")
    public static final long NoOne = 0L;
    @GlobalConstant("MIDINetworkConnectionPolicy_HostsInContactList")
    public static final long HostsInContactList = 1L;
    @GlobalConstant("MIDINetworkConnectionPolicy_Anyone")
    public static final long Anyone = 2L;


}
