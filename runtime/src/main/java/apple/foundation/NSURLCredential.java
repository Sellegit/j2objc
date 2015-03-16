package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSURLCredential")
public class NSURLCredential 
    extends NSObject 
    implements NSCopying {

    
    
    public NSURLCredential() {}
    @Mapping("initWithUser:password:persistence:")
    public NSURLCredential(String user, String password, @Representing("NSURLCredentialPersistence") @MachineSizedUInt long persistence) { }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithIdentity:certificates:persistence:")
    public NSURLCredential(SecIdentity identity, NSArray<?> certArray, @Representing("NSURLCredentialPersistence") @MachineSizedUInt long persistence) { }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithTrust:")
    public NSURLCredential(SecTrust trust) { }
    
    
    @Mapping("persistence")
    public native @Representing("NSURLCredentialPersistence") @MachineSizedUInt long getPersistence();
    @Mapping("user")
    public native String getUser();
    @Mapping("password")
    public native String getPassword();
    @Mapping("hasPassword")
    public native boolean hasPassword();
    @Mapping("identity")
    public native SecIdentity getIdentity();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("certificates")
    public native List<SecCertificate> getCertificates();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
