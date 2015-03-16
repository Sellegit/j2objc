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
    
    public static native MIDIObjectAddRemoveNotification create(MIDINotificationMessageID messageID, int messageSize, MIDIObject parent, MIDIObjectType parentType, MIDIObject child, MIDIObjectType childType) /*-[
        MIDIObjectAddRemoveNotification __new = { .messageID = messageID, .messageSize = messageSize, .parent = parent, .parentType = parentType, .child = child, .childType = childType };
        return __new;
    ]-*/;
    public static native MIDIObjectAddRemoveNotification copyWithmessageID(MIDIObjectAddRemoveNotification original, MIDINotificationMessageID messageID) /*-[
        original.messageID = messageID;
        return original;
    ]-*/;

    
    public static native MIDIObjectAddRemoveNotification copyWithmessageSize(MIDIObjectAddRemoveNotification original, int messageSize) /*-[
        original.messageSize = messageSize;
        return original;
    ]-*/;

    
    public static native MIDIObjectAddRemoveNotification copyWithparent(MIDIObjectAddRemoveNotification original, MIDIObject parent) /*-[
        original.parent = parent;
        return original;
    ]-*/;

    
    public static native MIDIObjectAddRemoveNotification copyWithparentType(MIDIObjectAddRemoveNotification original, MIDIObjectType parentType) /*-[
        original.parentType = parentType;
        return original;
    ]-*/;

    
    public static native MIDIObjectAddRemoveNotification copyWithchild(MIDIObjectAddRemoveNotification original, MIDIObject child) /*-[
        original.child = child;
        return original;
    ]-*/;

    
    public static native MIDIObjectAddRemoveNotification copyWithchildType(MIDIObjectAddRemoveNotification original, MIDIObjectType childType) /*-[
        original.childType = childType;
        return original;
    ]-*/;

    
}
