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
@Mapping("CFSocketError")
public final class CFSocketError extends ObjCEnum {
    
    @GlobalConstant("kCFSocketSuccess")
    public static final long Success = 0L;
    @GlobalConstant("kCFSocketError")
    public static final long Error = -1L;
    @GlobalConstant("kCFSocketTimeout")
    public static final long Timeout = -2L;
    

}
