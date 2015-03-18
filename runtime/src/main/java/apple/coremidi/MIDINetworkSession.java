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

@Library("CoreMIDI/CoreMIDI.h") @Mapping("MIDINetworkSession")
public class MIDINetworkSession 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MIDINetworkSession() { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("networkPort")
    public native @MachineSizedUInt long getNetworkPort();
    @Mapping("networkName")
    public native String getNetworkName();
    @Mapping("localName")
    public native String getLocalName();
    @Mapping("connectionPolicy")
    public native @Representing("MIDINetworkConnectionPolicy") int getConnectionPolicy();
    @Mapping("setConnectionPolicy:")
    public native void setConnectionPolicy(@Representing("MIDINetworkConnectionPolicy") int v);
    
    
    
    @Mapping("contacts")
    public native NSSet<MIDINetworkHost> getContacts();
    @Mapping("addContact:")
    public native boolean addContact(MIDINetworkHost contact);
    @Mapping("removeContact:")
    public native boolean removeContact(MIDINetworkHost contact);
    @Mapping("connections")
    public native NSSet<MIDINetworkConnection> getConnections();
    @Mapping("addConnection:")
    public native boolean addConnection(MIDINetworkConnection connection);
    @Mapping("removeConnection:")
    public native boolean removeConnection(MIDINetworkConnection connection);
    @Mapping("sourceEndpoint")
    public native MIDIEndpoint getSourceEndpoint();
    @Mapping("destinationEndpoint")
    public native MIDIEndpoint getDestinationEndpoint();
    @Mapping("defaultSession")
    public static native MIDINetworkSession defaultSession();
    
}
