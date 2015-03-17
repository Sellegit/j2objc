package apple.coretelephony;


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





@Library("CoreTelephony/CTCall.h")
@Mapping("CTErrorDomain")
public final class CTErrorDomain extends ObjCEnum {
    
    @GlobalConstant("kCTErrorDomainNoError")
    public static final long NoError = 0L;
    @GlobalConstant("kCTErrorDomainPOSIX")
    public static final long POSIX = 1L;
    @GlobalConstant("kCTErrorDomainMach")
    public static final long Mach = 2L;
    

}
