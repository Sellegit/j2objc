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

@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEVPNProtocolIKEv2")
public class NEVPNProtocolIKEv2 
    extends NEVPNProtocolIPSec 
     {

    
    
    @Mapping("init")
    public NEVPNProtocolIKEv2() { }
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("deadPeerDetectionRate")
    public native @Representing("NEVPNIKEv2DeadPeerDetectionRate") @MachineSizedSInt long getDeadPeerDetectionRate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDeadPeerDetectionRate:")
    public native void setDeadPeerDetectionRate(@Representing("NEVPNIKEv2DeadPeerDetectionRate") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("serverCertificateIssuerCommonName")
    public native String getServerCertificateIssuerCommonName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setServerCertificateIssuerCommonName:")
    public native void setServerCertificateIssuerCommonName(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("serverCertificateCommonName")
    public native String getServerCertificateCommonName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setServerCertificateCommonName:")
    public native void setServerCertificateCommonName(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("IKESecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters getIKESecurityAssociationParameters();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("childSecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters getChildSecurityAssociationParameters();
    
    
    
    
    
}
