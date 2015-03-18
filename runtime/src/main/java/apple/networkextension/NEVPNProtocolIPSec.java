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

@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEVPNProtocolIPSec")
public class NEVPNProtocolIPSec 
    extends NEVPNProtocol 
     {

    
    
    @Mapping("init")
    public NEVPNProtocolIPSec() { }
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("authenticationMethod")
    public native @Representing("NEVPNIKEAuthenticationMethod") @MachineSizedSInt long getAuthenticationMethod();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAuthenticationMethod:")
    public native void setAuthenticationMethod(@Representing("NEVPNIKEAuthenticationMethod") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("useExtendedAuthentication")
    public native boolean usesExtendedAuthentication();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUseExtendedAuthentication:")
    public native void setUsesExtendedAuthentication(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sharedSecretReference")
    public native NSData getSharedSecretReference();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setSharedSecretReference:")
    public native void setSharedSecretReference(NSData v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("localIdentifier")
    public native String getLocalIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLocalIdentifier:")
    public native void setLocalIdentifier(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("remoteIdentifier")
    public native String getRemoteIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setRemoteIdentifier:")
    public native void setRemoteIdentifier(String v);
    
    
    
    
    
}
