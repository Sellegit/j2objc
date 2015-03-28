package apple.coreservices;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork/CFNetwork.h")
public class CoreServices 
    extends Object 
     {

    
    public static final int Constant__kCFStreamErrorSOCKS5BadResponseAddr = 1;
    public static final int Constant__kCFStreamErrorSOCKS5BadState = 2;
    public static final int Constant__kCFStreamErrorSOCKSUnknownClientVersion = 3;
    public static final int Constant__kCFStreamErrorSOCKS4RequestFailed = 91;
    public static final int Constant__kCFStreamErrorSOCKS4IdentdFailed = 92;
    public static final int Constant__kCFStreamErrorSOCKS4IdConflict = 93;
    public static final int Constant__kCFStreamErrorHTTPParseFailure = -1;
    public static final int Constant__kCFStreamErrorHTTPRedirectionLoop = -2;
    public static final int Constant__kCFStreamErrorHTTPBadURL = -3;
    public static final int Constant__kCFStreamErrorHTTPAuthenticationTypeUnsupported = -1000;
    public static final int Constant__kCFStreamErrorHTTPAuthenticationBadUserName = -1001;
    public static final int Constant__kCFStreamErrorHTTPAuthenticationBadPassword = -1002;

    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFErrorDomainCFNetwork")
    public static native CFString Value__kCFErrorDomainCFNetwork();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFErrorDomainWinSock")
    public static native CFString Value__kCFErrorDomainWinSock();
    /**
     * @since Available in iOS 2.2 and later.
     */
    @GlobalConstant("kCFURLErrorFailingURLErrorKey")
    public static native CFString Value__kCFURLErrorFailingURLErrorKey();
    /**
     * @since Available in iOS 2.2 and later.
     */
    @GlobalConstant("kCFURLErrorFailingURLStringErrorKey")
    public static native CFString Value__kCFURLErrorFailingURLStringErrorKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFGetAddrInfoFailureKey")
    public static native CFString Value__kCFGetAddrInfoFailureKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFSOCKSStatusCodeKey")
    public static native CFString Value__kCFSOCKSStatusCodeKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFSOCKSVersionKey")
    public static native CFString Value__kCFSOCKSVersionKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFSOCKSNegotiationMethodKey")
    public static native CFString Value__kCFSOCKSNegotiationMethodKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFDNSServiceFailureKey")
    public static native CFString Value__kCFDNSServiceFailureKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPStatusCodeKey")
    public static native CFString Value__kCFFTPStatusCodeKey();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainNetDB")
    public static native int Value__kCFStreamErrorDomainNetDB();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainSystemConfiguration")
    public static native int Value__kCFStreamErrorDomainSystemConfiguration();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainMach")
    public static native int Value__kCFStreamErrorDomainMach();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainNetServices")
    public static native int Value__kCFStreamErrorDomainNetServices();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySSLContext")
    public static native CFString Value__kCFStreamPropertySSLContext();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySSLPeerTrust")
    public static native CFString Value__kCFStreamPropertySSLPeerTrust();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSSLValidatesCertificateChain")
    public static native CFString Value__kCFStreamSSLValidatesCertificateChain();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySSLSettings")
    public static native CFString Value__kCFStreamPropertySSLSettings();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSSLLevel")
    public static native CFString Value__kCFStreamSSLLevel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSSLPeerName")
    public static native CFString Value__kCFStreamSSLPeerName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSSLCertificates")
    public static native CFString Value__kCFStreamSSLCertificates();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSSLIsServer")
    public static native CFString Value__kCFStreamSSLIsServer();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFStreamNetworkServiceType")
    public static native CFString Value__kCFStreamNetworkServiceType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFStreamNetworkServiceTypeVoIP")
    public static native CFString Value__kCFStreamNetworkServiceTypeVoIP();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFStreamNetworkServiceTypeVideo")
    public static native CFString Value__kCFStreamNetworkServiceTypeVideo();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFStreamNetworkServiceTypeVoice")
    public static native CFString Value__kCFStreamNetworkServiceTypeVoice();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFStreamNetworkServiceTypeBackground")
    public static native CFString Value__kCFStreamNetworkServiceTypeBackground();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyNoCellular")
    public static native CFString Value__kCFStreamPropertyNoCellular();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyConnectionIsCellular")
    public static native CFString Value__kCFStreamPropertyConnectionIsCellular();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainWinSock")
    public static native @MachineSizedSInt long Value__kCFStreamErrorDomainWinSock();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainSOCKS")
    public static native int Value__kCFStreamErrorDomainSOCKS();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSProxy")
    public static native CFString Value__kCFStreamPropertySOCKSProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSProxyHost")
    public static native CFString Value__kCFStreamPropertySOCKSProxyHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSProxyPort")
    public static native CFString Value__kCFStreamPropertySOCKSProxyPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSVersion")
    public static native CFString Value__kCFStreamPropertySOCKSVersion();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSOCKSVersion4")
    public static native CFString Value__kCFStreamSocketSOCKSVersion4();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSOCKSVersion5")
    public static native CFString Value__kCFStreamSocketSOCKSVersion5();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSUser")
    public static native CFString Value__kCFStreamPropertySOCKSUser();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySOCKSPassword")
    public static native CFString Value__kCFStreamPropertySOCKSPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyProxyLocalBypass")
    public static native CFString Value__kCFStreamPropertyProxyLocalBypass();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainSSL")
    public static native int Value__kCFStreamErrorDomainSSL();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySocketSecurityLevel")
    public static native CFString Value__kCFStreamPropertySocketSecurityLevel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSecurityLevelNone")
    public static native CFString Value__kCFStreamSocketSecurityLevelNone();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSecurityLevelSSLv2")
    public static native CFString Value__kCFStreamSocketSecurityLevelSSLv2();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSecurityLevelSSLv3")
    public static native CFString Value__kCFStreamSocketSecurityLevelSSLv3();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSecurityLevelTLSv1")
    public static native CFString Value__kCFStreamSocketSecurityLevelTLSv1();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamSocketSecurityLevelNegotiatedSSL")
    public static native CFString Value__kCFStreamSocketSecurityLevelNegotiatedSSL();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyShouldCloseNativeSocket")
    public static native CFString Value__kCFStreamPropertyShouldCloseNativeSocket();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySocketRemoteHost")
    public static native CFString Value__kCFStreamPropertySocketRemoteHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertySocketRemoteNetService")
    public static native CFString Value__kCFStreamPropertySocketRemoteNetService();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainFTP")
    public static native int Value__kCFStreamErrorDomainFTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPUserName")
    public static native CFString Value__kCFStreamPropertyFTPUserName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPPassword")
    public static native CFString Value__kCFStreamPropertyFTPPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPUsePassiveMode")
    public static native CFString Value__kCFStreamPropertyFTPUsePassiveMode();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPResourceSize")
    public static native CFString Value__kCFStreamPropertyFTPResourceSize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPFetchResourceInfo")
    public static native CFString Value__kCFStreamPropertyFTPFetchResourceInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPFileTransferOffset")
    public static native CFString Value__kCFStreamPropertyFTPFileTransferOffset();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPAttemptPersistentConnection")
    public static native CFString Value__kCFStreamPropertyFTPAttemptPersistentConnection();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPProxy")
    public static native CFString Value__kCFStreamPropertyFTPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPProxyHost")
    public static native CFString Value__kCFStreamPropertyFTPProxyHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPProxyPort")
    public static native CFString Value__kCFStreamPropertyFTPProxyPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPProxyUser")
    public static native CFString Value__kCFStreamPropertyFTPProxyUser();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyFTPProxyPassword")
    public static native CFString Value__kCFStreamPropertyFTPProxyPassword();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceMode")
    public static native CFString Value__kCFFTPResourceMode();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceName")
    public static native CFString Value__kCFFTPResourceName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceOwner")
    public static native CFString Value__kCFFTPResourceOwner();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceGroup")
    public static native CFString Value__kCFFTPResourceGroup();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceLink")
    public static native CFString Value__kCFFTPResourceLink();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceSize")
    public static native CFString Value__kCFFTPResourceSize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceType")
    public static native CFString Value__kCFFTPResourceType();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFFTPResourceModDate")
    public static native CFString Value__kCFFTPResourceModDate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamErrorDomainHTTP")
    public static native int Value__kCFStreamErrorDomainHTTP();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPResponseHeader")
    public static native CFString Value__kCFStreamPropertyHTTPResponseHeader();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPFinalURL")
    public static native CFString Value__kCFStreamPropertyHTTPFinalURL();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPFinalRequest")
    public static native CFString Value__kCFStreamPropertyHTTPFinalRequest();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPProxy")
    public static native CFString Value__kCFStreamPropertyHTTPProxy();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPProxyHost")
    public static native CFString Value__kCFStreamPropertyHTTPProxyHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPProxyPort")
    public static native CFString Value__kCFStreamPropertyHTTPProxyPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPSProxyHost")
    public static native CFString Value__kCFStreamPropertyHTTPSProxyHost();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPSProxyPort")
    public static native CFString Value__kCFStreamPropertyHTTPSProxyPort();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPShouldAutoredirect")
    public static native CFString Value__kCFStreamPropertyHTTPShouldAutoredirect();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPAttemptPersistentConnection")
    public static native CFString Value__kCFStreamPropertyHTTPAttemptPersistentConnection();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStreamPropertyHTTPRequestBytesWrittenCount")
    public static native CFString Value__kCFStreamPropertyHTTPRequestBytesWrittenCount();

}
