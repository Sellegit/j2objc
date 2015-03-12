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
@Library("CoreMIDI")
public class MIDIObject 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetIntegerProperty")
    protected native MIDIError getIntegerProperty(String propertyID, Todo outValue);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetIntegerProperty")
    public native MIDIError setIntegerProperty(String propertyID, int value);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetStringProperty")
    protected native MIDIError getStringProperty(String propertyID, Todo str);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetStringProperty")
    public native MIDIError setStringProperty(String propertyID, String str);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetDataProperty")
    protected native MIDIError getDataProperty(String propertyID, NSData outData);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetDataProperty")
    public native MIDIError setDataProperty(String propertyID, NSData data);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetDictionaryProperty")
    protected native MIDIError getDictionaryProperty(String propertyID, Todo outDict);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectSetDictionaryProperty")
    public native MIDIError setDictionaryProperty(String propertyID, NSDictionary<?, ?> data);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectGetProperties")
    protected native MIDIError getProperties(Todo outProperties, boolean deep);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectRemoveProperty")
    public native MIDIError removeProperty(String propertyID);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIObjectFindByUniqueID")
    protected static native MIDIError findByUniqueID(int inUniqueID, Todo outObject, Todo outObjectType);
    
}
