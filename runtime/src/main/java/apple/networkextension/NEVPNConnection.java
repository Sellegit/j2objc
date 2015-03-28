package apple.networkextension;


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
 * @since Available in iOS 8.0 and later.
 */
@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEVPNConnection")
public class NEVPNConnection 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NEVPNConnection() { }

    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("status")
    public native @Representing("NEVPNStatus") long getStatus();

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NEVPNStatusDidChangeNotification")
    public static native NSString StatusDidChangeNotification();

    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("startVPNTunnelAndReturnError:")
    public native boolean startVPNTunnel(Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("stopVPNTunnel")
    public native void stopVPNTunnel();

}
