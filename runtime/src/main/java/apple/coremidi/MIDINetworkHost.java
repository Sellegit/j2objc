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
@Library("CoreMIDI/CoreMIDI.h") @Mapping("MIDINetworkHost")
public class MIDINetworkHost 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public MIDINetworkHost() { }

    
    @Mapping("name")
    public native String getName();
    @Mapping("address")
    public native String getAddress();
    @Mapping("port")
    public native @MachineSizedUInt long getPort();
    @Mapping("netServiceName")
    public native String getNetServiceName();
    @Mapping("netServiceDomain")
    public native String getNetServiceDomain();

    
    
    @Mapping("hasSameAddressAs:")
    public native boolean hasSameAddressAs(MIDINetworkHost other);
    @Mapping("hostWithName:address:port:")
    public static native MIDINetworkHost create(String name, String address, @MachineSizedUInt long port);
    @Mapping("hostWithName:netService:")
    public static native MIDINetworkHost create(String name, NSNetService netService);
    @Mapping("hostWithName:netServiceName:netServiceDomain:")
    public static native MIDINetworkHost create(String name, String netServiceName, String netServiceDomain);

}
