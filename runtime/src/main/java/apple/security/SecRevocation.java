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






@Mapping("SecRevocation")
public final class SecRevocation extends ObjCEnum {
    
    @GlobalConstant("kSecRevocationOCSPMethod")
    public static final long OCSPMethod = 1L;
    @GlobalConstant("kSecRevocationCRLMethod")
    public static final long CRLMethod = 2L;
    @GlobalConstant("kSecRevocationPreferCRL")
    public static final long PreferCRL = 4L;
    @GlobalConstant("kSecRevocationRequirePositiveResponse")
    public static final long RequirePositiveResponse = 8L;
    @GlobalConstant("kSecRevocationNetworkAccessDisabled")
    public static final long NetworkAccessDisabled = 16L;
    @GlobalConstant("kSecRevocationUseAnyAvailableMethod")
    public static final long UseAnyAvailableMethod = 3L;
    

}
