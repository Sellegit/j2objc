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
@Mapping("SSLConnectionType")
public final class SSLConnectionType extends ObjCEnum {
    
    @GlobalConstant("kSSLStreamType")
    public static final long StreamType = 0L;
    @GlobalConstant("kSSLDatagramType")
    public static final long DatagramType = 1L;
    

}
