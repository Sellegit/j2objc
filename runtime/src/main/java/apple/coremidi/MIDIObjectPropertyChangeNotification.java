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





@Mapping("MIDIObjectPropertyChangeNotification")
public class MIDIObjectPropertyChangeNotification 
    extends Struct 
     {

    
    protected MIDIObjectPropertyChangeNotification() {}
    
    
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
    
    public static native MIDIObjectPropertyChangeNotification create(MIDINotificationMessageID messageID, int messageSize, MIDIObject object, MIDIObjectType objectType, String propertyName) /*-[
        MIDIObjectPropertyChangeNotification __new = { .messageID = messageID, .messageSize = messageSize, .object = object, .objectType = objectType, .propertyName = propertyName };
        return __new;
    ]-*/;
    public static native MIDIObjectPropertyChangeNotification copyWithmessageID(MIDIObjectPropertyChangeNotification original, MIDINotificationMessageID messageID) /*-[
        original.messageID = messageID;
        return original;
    ]-*/;

    
    public static native MIDIObjectPropertyChangeNotification copyWithmessageSize(MIDIObjectPropertyChangeNotification original, int messageSize) /*-[
        original.messageSize = messageSize;
        return original;
    ]-*/;

    
    public static native MIDIObjectPropertyChangeNotification copyWithobject(MIDIObjectPropertyChangeNotification original, MIDIObject object) /*-[
        original.object = object;
        return original;
    ]-*/;

    
    public static native MIDIObjectPropertyChangeNotification copyWithobjectType(MIDIObjectPropertyChangeNotification original, MIDIObjectType objectType) /*-[
        original.objectType = objectType;
        return original;
    ]-*/;

    
    public static native MIDIObjectPropertyChangeNotification copyWithpropertyName(MIDIObjectPropertyChangeNotification original, String propertyName) /*-[
        original.propertyName = propertyName;
        return original;
    ]-*/;

    
}
