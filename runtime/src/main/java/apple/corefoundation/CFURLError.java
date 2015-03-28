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


/**
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated
@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFURLError")
public final class CFURLError extends ObjCEnum {
    
    @GlobalConstant("kCFURLUnknownError")
    public static final long UnknownError = -10L;
    @GlobalConstant("kCFURLUnknownSchemeError")
    public static final long UnknownSchemeError = -11L;
    @GlobalConstant("kCFURLResourceNotFoundError")
    public static final long ResourceNotFoundError = -12L;
    @GlobalConstant("kCFURLResourceAccessViolationError")
    public static final long ResourceAccessViolationError = -13L;
    @GlobalConstant("kCFURLRemoteHostUnavailableError")
    public static final long RemoteHostUnavailableError = -14L;
    @GlobalConstant("kCFURLImproperArgumentsError")
    public static final long ImproperArgumentsError = -15L;
    @GlobalConstant("kCFURLUnknownPropertyKeyError")
    public static final long UnknownPropertyKeyError = -16L;
    @GlobalConstant("kCFURLPropertyKeyUnavailableError")
    public static final long PropertyKeyUnavailableError = -17L;
    @GlobalConstant("kCFURLTimeoutError")
    public static final long TimeoutError = -18L;


}
