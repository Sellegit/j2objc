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

@Library("NetworkExtension/NetworkExtension.h") @Mapping("NEVPNIKEv2SecurityAssociationParameters")
public class NEVPNIKEv2SecurityAssociationParameters 
    extends NSObject 
    implements NSCopying {

    
    
    public NEVPNIKEv2SecurityAssociationParameters() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("encryptionAlgorithm")
    public native @Representing("NEVPNIKEv2EncryptionAlgorithm") @MachineSizedSInt long getEncryptionAlgorithm();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setEncryptionAlgorithm:")
    public native void setEncryptionAlgorithm(@Representing("NEVPNIKEv2EncryptionAlgorithm") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("integrityAlgorithm")
    public native @Representing("NEVPNIKEv2IntegrityAlgorithm") @MachineSizedSInt long getIntegrityAlgorithm();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setIntegrityAlgorithm:")
    public native void setIntegrityAlgorithm(@Representing("NEVPNIKEv2IntegrityAlgorithm") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("diffieHellmanGroup")
    public native @Representing("NEVPNIKEv2DiffieHellmanGroup") @MachineSizedSInt long getDiffieHellmanGroup();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDiffieHellmanGroup:")
    public native void setDiffieHellmanGroup(@Representing("NEVPNIKEv2DiffieHellmanGroup") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lifetimeMinutes")
    public native int getLifetimeMinutes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setLifetimeMinutes:")
    public native void setLifetimeMinutes(int v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
