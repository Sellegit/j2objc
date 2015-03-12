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





@Mapping("MIDINotification")
public class MIDINotification 
    extends Struct 
     {

    
    protected MIDINotification() {}
    
    
    @DotMapping("messageID")
    public native MIDINotificationMessageID getMessageID();
    @DotMapping("messageSize")
    public native int getMessageSize();
    
    public static native MIDINotification create(MIDINotificationMessageID messageID, int messageSize) /*-[
        MIDINotification __new = { .messageID = messageID, .messageSize = messageSize };
        return __new;
    ]-*/;
    public static native MIDINotification copyWithmessageID(MIDINotification original, MIDINotificationMessageID messageID) /*-[
        original.messageID = messageID;
        return original;
    ]-*/;

    
    public static native MIDINotification copyWithmessageSize(MIDINotification original, int messageSize) /*-[
        original.messageSize = messageSize;
        return original;
    ]-*/;

    
}
