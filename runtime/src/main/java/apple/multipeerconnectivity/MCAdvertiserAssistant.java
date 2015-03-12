package apple.multipeerconnectivity;


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
import apple.uikit.*;
import apple.security.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("MultipeerConnectivity") @Mapping("MCAdvertiserAssistant")
public class MCAdvertiserAssistant 
    extends NSObject 
     {

    
    
    public MCAdvertiserAssistant() {}
    @Mapping("initWithServiceType:discoveryInfo:session:")
    public MCAdvertiserAssistant(String serviceType, NSDictionary<?, ?> info, MCSession session) { }
    
    
    @Mapping("delegate")
    public native MCAdvertiserAssistantDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MCAdvertiserAssistantDelegate v);
    @Mapping("session")
    public native MCSession getSession();
    @Mapping("discoveryInfo")
    public native Map<String, String> getDiscoveryInfo();
    @Mapping("serviceType")
    public native String getServiceType();
    
    
    
    @Mapping("start")
    public native void start();
    @Mapping("stop")
    public native void stop();
    
}
