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





@Library("Security/Security.h")
@Mapping("SSLProtocolSide")
public final class SSLProtocolSide extends ObjCEnum {
    
    @GlobalConstant("kSSLServerSide")
    public static final long ServerSide = 0L;
    @GlobalConstant("kSSLClientSide")
    public static final long ClientSide = 1L;
    

}
