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





@Mapping("MIDIObjectAddRemoveNotification") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIObjectAddRemoveNotification 
    extends Struct 
     {

    
    protected MIDIObjectAddRemoveNotification() {}
    
    
    @DotMapping("messageID")
    public native MIDINotificationMessageID getMessageID();
    @DotMapping("messageSize")
    public native int getMessageSize();
    @DotMapping("parent")
    public native MIDIObject getParent();
    @DotMapping("parentType")
    public native MIDIObjectType getParentType();
    @DotMapping("child")
    public native MIDIObject getChild();
    @DotMapping("childType")
    public native MIDIObjectType getChildType();
    
    
}
