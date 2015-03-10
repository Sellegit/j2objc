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
@Library("Security")
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
    public native int getSessionState(Todo state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetSessionOption")
    public native int setSessionOption(SSLSessionOption option, boolean value);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetSessionOption")
    public native int getSessionOption(SSLSessionOption option, Todo value);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetIOFuncs")
    public native int setIOFuncs(FunctionPtr readFunc, FunctionPtr writeFunc);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetProtocolVersionMin")
    public native int setProtocolVersionMin(SSLProtocol minVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetProtocolVersionMin")
    public native int getProtocolVersionMin(Todo minVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetProtocolVersionMax")
    public native int setProtocolVersionMax(SSLProtocol maxVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetProtocolVersionMax")
    public native int getProtocolVersionMax(Todo maxVersion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetCertificate")
    public native int setCertificate(CFArray certRefs);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetConnection")
    public native int setConnection(Todo connection);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetConnection")
    public native int getConnection(Todo connection);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetPeerDomainName")
    public native int setPeerDomainName(Todo peerName, @MachineSizedUInt long peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerDomainNameLength")
    public native int getPeerDomainNameLength(Todo peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerDomainName")
    public native int getPeerDomainName(Todo peerName, Todo peerNameLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetDatagramHelloCookie")
    public native int setDatagramHelloCookie(Todo cookie, @MachineSizedUInt long cookieLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetMaxDatagramRecordSize")
    public native int setMaxDatagramRecordSize(@MachineSizedUInt long maxSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetMaxDatagramRecordSize")
    public native int getMaxDatagramRecordSize(Todo maxSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNegotiatedProtocolVersion")
    public native int getNegotiatedProtocolVersion(Todo protocol);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNumberSupportedCiphers")
    public native int getNumberSupportedCiphers(Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetSupportedCiphers")
    public native int getSupportedCiphers(Todo ciphers, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetEnabledCiphers")
    public native int setEnabledCiphers(Todo ciphers, @MachineSizedUInt long numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNumberEnabledCiphers")
    public native int getNumberEnabledCiphers(Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetEnabledCiphers")
    public native int getEnabledCiphers(Todo ciphers, Todo numCiphers);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLCopyPeerTrust")
    public native int copyPeerTrust(Todo trust);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetPeerID")
    public native int setPeerID(Todo peerID, @MachineSizedUInt long peerIDLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetPeerID")
    public native int getPeerID(Todo peerID, Todo peerIDLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetNegotiatedCipher")
    public native int getNegotiatedCipher(Todo cipherSuite);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetEncryptionCertificate")
    public native int setEncryptionCertificate(CFArray certRefs);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLSetClientSideAuthenticate")
    public native int setClientSideAuthenticate(SSLAuthenticate auth);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLAddDistinguishedName")
    public native int addDistinguishedName(Todo derDN, @MachineSizedUInt long derDNLen);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLCopyDistinguishedNames")
    public native int copyDistinguishedNames(Todo names);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetClientCertificateState")
    public native int getClientCertificateState(Todo clientState);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLHandshake")
    public native int handshake();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLWrite")
    public native int write(Todo data, @MachineSizedUInt long dataLength, Todo processed);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLRead")
    public native int read(Todo data, @MachineSizedUInt long dataLength, Todo processed);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetBufferedReadSize")
    public native int getBufferedReadSize(Todo bufSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLGetDatagramWriteSize")
    public native int getDatagramWriteSize(Todo bufSize);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("SSLClose")
    public native int closeContext();
    
}
