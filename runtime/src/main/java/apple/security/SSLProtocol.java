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






@Mapping("SSLProtocol")
public final class SSLProtocol extends ObjCEnum {
    
    @GlobalConstant("kSSLProtocolUnknown")
    public static final long SSLProtocolUnknown = 0L;
    @GlobalConstant("kSSLProtocol3")
    public static final long SSLProtocol3 = 2L;
    @GlobalConstant("kTLSProtocol1")
    public static final long TLSProtocol1 = 4L;
    @GlobalConstant("kTLSProtocol11")
    public static final long TLSProtocol11 = 7L;
    @GlobalConstant("kTLSProtocol12")
    public static final long TLSProtocol12 = 8L;
    @GlobalConstant("kDTLSProtocol1")
    public static final long DTLSProtocol1 = 9L;
    @GlobalConstant("kSSLProtocol2")
    public static final long SSLProtocol2 = 1L;
    @GlobalConstant("kSSLProtocol3Only")
    public static final long SSLProtocol3Only = 3L;
    @GlobalConstant("kTLSProtocol1Only")
    public static final long TLSProtocol1Only = 5L;
    @GlobalConstant("kSSLProtocolAll")
    public static final long SSLProtocolAll = 6L;
    

}
