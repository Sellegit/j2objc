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

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMIDI/CoreMIDI.h")
public class MIDIObject 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetIntegerProperty")
    public static native MIDIError getIntegerProperty(MIDIObject obj, CFString propertyID, Todo outValue);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetIntegerProperty")
    public static native MIDIError setIntegerProperty(MIDIObject obj, CFString propertyID, int value);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetStringProperty")
    public static native MIDIError getStringProperty(MIDIObject obj, CFString propertyID, Todo str);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetStringProperty")
    public static native MIDIError setStringProperty(MIDIObject obj, CFString propertyID, CFString str);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetDataProperty")
    public static native MIDIError getDataProperty(MIDIObject obj, CFString propertyID, Todo outData);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetDataProperty")
    public static native MIDIError setDataProperty(MIDIObject obj, CFString propertyID, CFData data);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetDictionaryProperty")
    public static native MIDIError getDictionaryProperty(MIDIObject obj, CFString propertyID, Todo outDict);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetDictionaryProperty")
    public static native MIDIError setDictionaryProperty(MIDIObject obj, CFString propertyID, CFDictionary data);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetProperties")
    public static native MIDIError getProperties(MIDIObject obj, Todo outProperties, boolean deep);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectRemoveProperty")
    public static native MIDIError removeProperty(MIDIObject obj, CFString propertyID);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectFindByUniqueID")
    public static native MIDIError findByUniqueID(int inUniqueID, Todo outObject, Todo outObjectType);

}
