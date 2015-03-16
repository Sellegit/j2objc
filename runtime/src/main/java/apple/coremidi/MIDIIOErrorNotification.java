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
    
    public static native MIDIIOErrorNotification create(MIDINotificationMessageID messageID, int messageSize, MIDIDevice driverDevice, int errorCode) /*-[
        MIDIIOErrorNotification __new = { .messageID = messageID, .messageSize = messageSize, .driverDevice = driverDevice, .errorCode = errorCode };
        return __new;
    ]-*/;
    public static native MIDIIOErrorNotification copyWithmessageID(MIDIIOErrorNotification original, MIDINotificationMessageID messageID) /*-[
        original.messageID = messageID;
        return original;
    ]-*/;

    
    public static native MIDIIOErrorNotification copyWithmessageSize(MIDIIOErrorNotification original, int messageSize) /*-[
        original.messageSize = messageSize;
        return original;
    ]-*/;

    
    public static native MIDIIOErrorNotification copyWithdriverDevice(MIDIIOErrorNotification original, MIDIDevice driverDevice) /*-[
        original.driverDevice = driverDevice;
        return original;
    ]-*/;

    
    public static native MIDIIOErrorNotification copyWitherrorCode(MIDIIOErrorNotification original, int errorCode) /*-[
        original.errorCode = errorCode;
        return original;
    ]-*/;

    
}
