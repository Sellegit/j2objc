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
@Mapping("SSLSessionState")
public final class SSLSessionState extends ObjCEnum {
    
    @GlobalConstant("kSSLIdle")
    public static final long Idle = 0L;
    @GlobalConstant("kSSLHandshake")
    public static final long Handshake = 1L;
    @GlobalConstant("kSSLConnected")
    public static final long Connected = 2L;
    @GlobalConstant("kSSLClosed")
    public static final long Closed = 3L;
    @GlobalConstant("kSSLAborted")
    public static final long Aborted = 4L;


}
