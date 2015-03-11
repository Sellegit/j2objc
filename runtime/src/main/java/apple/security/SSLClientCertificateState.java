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





@Library("Security")
@Mapping("SSLClientCertificateState")
public final class SSLClientCertificateState extends ObjCEnum {
    
    @GlobalConstant("kSSLClientCertNone")
    public static final long None = 0L;
    @GlobalConstant("kSSLClientCertRequested")
    public static final long Requested = 1L;
    @GlobalConstant("kSSLClientCertSent")
    public static final long Sent = 2L;
    @GlobalConstant("kSSLClientCertRejected")
    public static final long Rejected = 3L;
    

}
