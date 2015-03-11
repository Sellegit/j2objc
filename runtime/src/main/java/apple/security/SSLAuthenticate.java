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
@Mapping("SSLAuthenticate")
public final class SSLAuthenticate extends ObjCEnum {
    
    @GlobalConstant("kNeverAuthenticate")
    public static final long NeverAuthenticate = 0L;
    @GlobalConstant("kAlwaysAuthenticate")
    public static final long AlwaysAuthenticate = 1L;
    @GlobalConstant("kTryAuthenticate")
    public static final long TryAuthenticate = 2L;
    

}
