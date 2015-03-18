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
public class MIDIClient 
    extends MIDIObject 
     {

    
    
    protected MIDIClient() {}
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIClientCreate")
    public static native MIDIError create(String name, FunctionPtr notifyProc, Todo notifyRefCon, Todo outClient);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("MIDIClientDispose")
    public static native MIDIError dispose(MIDIClient client);
    
}
