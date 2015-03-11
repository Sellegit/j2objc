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

@Library("NetworkExtension") @Mapping("NEVPNProtocol")
public class NEVPNProtocol 
    extends NSObject 
    implements NSCopying {

    
    
    public NEVPNProtocol() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("serverAddress")
    public native String getServerAddress();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setServerAddress:")
    public native void setServerAddress(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("username")
    public native String getUsername();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("passwordReference")
    public native NSData getPasswordReference();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPasswordReference:")
    public native void setPasswordReference(NSData v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("identityData")
    public native NSData getIdentityData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setIdentityData:")
    public native void setIdentityData(NSData v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("identityDataPassword")
    public native String getIdentityDataPassword();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setIdentityDataPassword:")
    public native void setIdentityDataPassword(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("disconnectOnSleep")
    public native boolean disconnectsOnSleep();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDisconnectOnSleep:")
    public native void setDisconnectsOnSleep(boolean v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
