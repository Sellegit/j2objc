package apple.coreservices;


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
import apple.foundation.*;


@Library("CFNetwork/CFNetwork.h")
@Mapping("CFStreamErrorCodeType")
public final class CFStreamErrorCodeType extends ObjCEnum {
    
    @GlobalConstant("kCFStreamErrorSOCKSSubDomainNone")
    public static final long SubDomainNone = 0L;
    @GlobalConstant("kCFStreamErrorSOCKSSubDomainVersionCode")
    public static final long SubDomainVersionCode = 1L;
    @GlobalConstant("kCFStreamErrorSOCKS4SubDomainResponse")
    public static final long _4SubDomainResponse = 2L;
    @GlobalConstant("kCFStreamErrorSOCKS5SubDomainUserPass")
    public static final long _5SubDomainUserPass = 3L;
    @GlobalConstant("kCFStreamErrorSOCKS5SubDomainMethod")
    public static final long _5SubDomainMethod = 4L;
    @GlobalConstant("kCFStreamErrorSOCKS5SubDomainResponse")
    public static final long _5SubDomainResponse = 5L;


}
