package apple.corefoundation;


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
import apple.foundation.*;





@Library("CoreFoundation")
@Mapping("CFStreamErrorDomain")
public final class CFStreamErrorDomain extends ObjCEnum {
    
    @GlobalConstant("kCFStreamErrorDomainCustom")
    public static final long Custom = -1L;
    @GlobalConstant("kCFStreamErrorDomainPOSIX")
    public static final long POSIX = 1L;
    @GlobalConstant("kCFStreamErrorDomainMacOSStatus")
    public static final long MacOSStatus = 2L;
    

}
