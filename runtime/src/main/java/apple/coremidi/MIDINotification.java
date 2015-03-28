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


@Mapping("MIDINotification") @Library("CoreMIDI/CoreMIDI.h")
public class MIDINotification 
    extends Struct 
     {

    
    private MIDINotification() {}
    
    
    @DotMapping("messageID")
    public native MIDINotificationMessageID getMessageID();
    @DotMapping("messageSize")
    public native int getMessageSize();

    public static native MIDINotification create(MIDINotificationMessageID messageID, int messageSize) /*-[
        MIDINotification __new = { .messageID = messageID, .messageSize = messageSize };
        return __new;
    ]-*/;
    public static native MIDINotification copyWithmessageID(MIDINotification original, MIDINotificationMessageID messageID) /*-[
        MIDINotification __new = { .messageID = messageID, .messageSize = original.messageSize };
        return __new;
    ]-*/;


    public static native MIDINotification copyWithmessageSize(MIDINotification original, int messageSize) /*-[
        MIDINotification __new = { .messageID = original.messageID, .messageSize = messageSize };
        return __new;
    ]-*/;


    public static final class Adapter {

        public MIDINotificationMessageID messageID;
        public int messageSize;
        public Adapter(MIDINotificationMessageID messageID, int messageSize) {
            this.messageID = messageID;
            this.messageSize = messageSize;
        }
        public Adapter(MIDINotification original) {
            this.messageID = original.getMessageID();
            this.messageSize = original.getMessageSize();
        }
        public MIDINotification convert() {
            return create(messageID, messageSize);
        }
    }
}
