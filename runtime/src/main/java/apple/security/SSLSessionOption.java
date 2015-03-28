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
@Mapping("SSLSessionOption")
public final class SSLSessionOption extends ObjCEnum {
    
    @GlobalConstant("kSSLSessionOptionBreakOnServerAuth")
    public static final long BreakOnServerAuth = 0L;
    @GlobalConstant("kSSLSessionOptionBreakOnCertRequested")
    public static final long BreakOnCertRequested = 1L;
    @GlobalConstant("kSSLSessionOptionBreakOnClientAuth")
    public static final long BreakOnClientAuth = 2L;
    @GlobalConstant("kSSLSessionOptionFalseStart")
    public static final long FalseStart = 3L;
    @GlobalConstant("kSSLSessionOptionSendOneByteRecord")
    public static final long SendOneByteRecord = 4L;
    @GlobalConstant("kSSLSessionOptionFallback")
    public static final long Fallback = 6L;


}
