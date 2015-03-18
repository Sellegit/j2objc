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





@Library("Foundation/Foundation.h") @Mapping("NSURLProtectionSpace")
public class NSURLProtectionSpace 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithHost:port:protocol:realm:authenticationMethod:")
    public NSURLProtectionSpace(String host, @MachineSizedSInt long port, String protocol, String realm, String authenticationMethod) { }
    @Mapping("initWithProxyHost:port:type:realm:authenticationMethod:")
    public NSURLProtectionSpace(String host, @MachineSizedSInt long port, Todo type, String realm, Todo authenticationMethod) { }
    @Mapping("init")
    public NSURLProtectionSpace() { }
    
    
    @Mapping("realm")
    public native String getRealm();
    @Mapping("receivesCredentialSecurely")
    public native boolean receivesCredentialSecurely();
    @Mapping("isProxy")
    public native boolean isProxy();
    @Mapping("host")
    public native String getHost();
    @Mapping("port")
    public native @MachineSizedSInt long getPort();
    @Mapping("proxyType")
    public native NSURLProtectionSpaceProxyType getProxyType();
    @Mapping("protocol")
    public native NSURLProtectionSpaceProtocol getProtocol();
    @Mapping("authenticationMethod")
    public native NSURLAuthenticationMethod getAuthenticationMethod();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("distinguishedNames")
    public native List<String> getDistinguishedNames();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("serverTrust")
    public native SecTrust getServerTrust();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
