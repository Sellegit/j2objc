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





@Mapping("MIDIIOErrorNotification") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIIOErrorNotification 
    extends Struct 
     {

    
    protected MIDIIOErrorNotification() {}
    
    
    @DotMapping("messageID")
    public native MIDINotificationMessageID getMessageID();
    @DotMapping("messageSize")
    public native int getMessageSize();
    @DotMapping("driverDevice")
    public native MIDIDevice getDriverDevice();
    @DotMapping("errorCode")
    public native int getErrorCode();
    
    
}
