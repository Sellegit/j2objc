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



/**
 * @since Available in iOS 4.2 and later.
 */

@Library("CoreMIDI/CoreMIDI.h") @Mapping("MIDINetworkConnection")
public class MIDINetworkConnection 
    extends NSObject 
     {

    
    
    public MIDINetworkConnection() {}
    
    
    @Mapping("host")
    public native MIDINetworkHost getHost();
    
    
    
    @Mapping("connectionWithHost:")
    public static native MIDINetworkConnection create(MIDINetworkHost host);
    
}
