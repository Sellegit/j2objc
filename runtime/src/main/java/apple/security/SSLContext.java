package apple.security;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Mapping("SSLContextRef") @Library("Security/Security.h")
public class SSLContext 
    extends CFType 
     {

    
    
    protected SSLContext() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLContextGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLCreateContext")
    public static native SSLContext createContext(CFAllocator alloc, SSLProtocolSide protocolSide, SSLConnectionType connectionType);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetSessionState")
    public static native int getSessionState(SSLContext context, Todo state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetSessionOption")
    public static native int setSessionOption(SSLContext context, SSLSessionOption option, boolean value);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetSessionOption")
    public static native int getSessionOption(SSLContext context, SSLSessionOption option, Todo value);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetIOFuncs")
    public static native int setIOFuncs(SSLContext context, FunctionPtr readFunc, FunctionPtr writeFunc);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetProtocolVersionMin")
    public static native int setProtocolVersionMin(SSLContext context, SSLProtocol minVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetProtocolVersionMin")
    public static native int getProtocolVersionMin(SSLContext context, Todo minVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetProtocolVersionMax")
    public static native int setProtocolVersionMax(SSLContext context, SSLProtocol maxVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetProtocolVersionMax")
    public static native int getProtocolVersionMax(SSLContext context, Todo maxVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetCertificate")
    public static native int setCertificate(SSLContext context, CFArray certRefs);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetConnection")
    public static native int setConnection(SSLContext context, Todo connection);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetConnection")
    public static native int getConnection(SSLContext context, Todo connection);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetPeerDomainName")
    public static native int setPeerDomainName(SSLContext context, Todo peerName, @MachineSizedUInt long peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerDomainNameLength")
    public static native int getPeerDomainNameLength(SSLContext context, Todo peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerDomainName")
    public static native int getPeerDomainName(SSLContext context, Todo peerName, Todo peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetDatagramHelloCookie")
    public static native int setDatagramHelloCookie(SSLContext dtlsContext, Todo cookie, @MachineSizedUInt long cookieLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetMaxDatagramRecordSize")
    public static native int setMaxDatagramRecordSize(SSLContext dtlsContext, @MachineSizedUInt long maxSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetMaxDatagramRecordSize")
    public static native int getMaxDatagramRecordSize(SSLContext dtlsContext, Todo maxSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNegotiatedProtocolVersion")
    public static native int getNegotiatedProtocolVersion(SSLContext context, Todo protocol);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNumberSupportedCiphers")
    public static native int getNumberSupportedCiphers(SSLContext context, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetSupportedCiphers")
    public static native int getSupportedCiphers(SSLContext context, Todo ciphers, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetEnabledCiphers")
    public static native int setEnabledCiphers(SSLContext context, Todo ciphers, @MachineSizedUInt long numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNumberEnabledCiphers")
    public static native int getNumberEnabledCiphers(SSLContext context, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetEnabledCiphers")
    public static native int getEnabledCiphers(SSLContext context, Todo ciphers, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLCopyPeerTrust")
    public static native int copyPeerTrust(SSLContext context, Todo trust);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetPeerID")
    public static native int setPeerID(SSLContext context, Todo peerID, @MachineSizedUInt long peerIDLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerID")
    public static native int getPeerID(SSLContext context, Todo peerID, Todo peerIDLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNegotiatedCipher")
    public static native int getNegotiatedCipher(SSLContext context, Todo cipherSuite);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetEncryptionCertificate")
    public static native int setEncryptionCertificate(SSLContext context, CFArray certRefs);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetClientSideAuthenticate")
    public static native int setClientSideAuthenticate(SSLContext context, SSLAuthenticate auth);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLAddDistinguishedName")
    public static native int addDistinguishedName(SSLContext context, Todo derDN, @MachineSizedUInt long derDNLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLCopyDistinguishedNames")
    public static native int copyDistinguishedNames(SSLContext context, Todo names);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetClientCertificateState")
    public static native int getClientCertificateState(SSLContext context, Todo clientState);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLHandshake")
    public static native int handshake(SSLContext context);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLWrite")
    public static native int write(SSLContext context, Todo data, @MachineSizedUInt long dataLength, Todo processed);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLRead")
    public static native int read(SSLContext context, Todo data, @MachineSizedUInt long dataLength, Todo processed);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetBufferedReadSize")
    public static native int getBufferedReadSize(SSLContext context, Todo bufSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetDatagramWriteSize")
    public static native int getDatagramWriteSize(SSLContext dtlsContext, Todo bufSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLClose")
    public static native int closeContext(SSLContext context);
    
}
