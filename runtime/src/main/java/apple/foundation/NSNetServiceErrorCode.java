package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation")
@Mapping("NSNetServiceErrorCode")
public final class NSNetServiceErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSNetServicesUnknownError")
    public static final long Unknown = -72000L;
    @GlobalConstant("NSNetServicesCollisionError")
    public static final long Collision = -72001L;
    @GlobalConstant("NSNetServicesNotFoundError")
    public static final long NotFound = -72002L;
    @GlobalConstant("NSNetServicesActivityInProgress")
    public static final long ActivityInProgress = -72003L;
    @GlobalConstant("NSNetServicesBadArgumentError")
    public static final long BadArgument = -72004L;
    @GlobalConstant("NSNetServicesCancelledError")
    public static final long Cancelled = -72005L;
    @GlobalConstant("NSNetServicesInvalidError")
    public static final long Invalid = -72006L;
    @GlobalConstant("NSNetServicesTimeoutError")
    public static final long Timeout = -72007L;
    

}
