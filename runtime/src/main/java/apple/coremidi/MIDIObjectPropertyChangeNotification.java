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





@Mapping("MIDIObjectPropertyChangeNotification") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIObjectPropertyChangeNotification 
    extends Struct 
     {

    
    private MIDIObjectPropertyChangeNotification() {}
    
    
    @DotMapping("messageID")
    public native MIDINotificationMessageID getMessageID();
    @DotMapping("messageSize")
    public native int getMessageSize();
    @DotMapping("object")
    public native MIDIObject getObject();
    @DotMapping("objectType")
    public native MIDIObjectType getObjectType();
    @DotMapping("propertyName")
    public native String getPropertyName();
    
    
}
