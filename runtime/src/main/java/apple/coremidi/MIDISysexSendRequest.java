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


@Mapping("MIDISysexSendRequest") @Library("CoreMIDI/CoreMIDI.h")
public class MIDISysexSendRequest 
    extends Struct 
     {

    
    private MIDISysexSendRequest() {}
    
    
    @DotMapping("destination")
    public native MIDIEndpoint getDestination();
    @DotMapping("data")
    public native Todo getData();
    @DotMapping("bytesToSend")
    public native int getBytesToSend();
    @DotMapping("complete")
    public native boolean getComplete();
    @DotMapping("completionRefCon")
    public native Todo getCompletionRefCon();

    
}
