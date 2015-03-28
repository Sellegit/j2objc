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
public class MIDIThruConnection 
    extends MIDIObject 
     {

    
    
    protected MIDIThruConnection() {}

    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionCreate")
    public static native MIDIError create(CFString inPersistentOwnerID, CFData inConnectionParams, Todo outConnection);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionDispose")
    public static native MIDIError dispose(MIDIThruConnection connection);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionGetParams")
    public static native MIDIError getParams(MIDIThruConnection connection, Todo outConnectionParams);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionSetParams")
    public static native MIDIError setParams(MIDIThruConnection connection, CFData inConnectionParams);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIThruConnectionFind")
    public static native MIDIError find(CFString inPersistentOwnerID, Todo outConnectionList);

}
