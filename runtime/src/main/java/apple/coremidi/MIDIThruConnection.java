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
public class MIDIThruConnection 
    extends MIDIObject 
     {

    
    
    protected MIDIThruConnection() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionCreate")
    protected static native MIDIError create(String inPersistentOwnerID, NSData inConnectionParams, Todo outConnection);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionDispose")
    public native MIDIError dispose();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionGetParams")
    protected native MIDIError getParams(Todo outConnectionParams);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionSetParams")
    public native MIDIError setParams(NSData inConnectionParams);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionFind")
    protected static native MIDIError find(String inPersistentOwnerID, Todo outConnectionList);
    
}
