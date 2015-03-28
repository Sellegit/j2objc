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
@Mapping("CFNetServicesError")
public final class CFNetServicesError extends ObjCEnum {
    
    @GlobalConstant("kCFNetServicesErrorUnknown")
    public static final long Unknown = -72000L;
    @GlobalConstant("kCFNetServicesErrorCollision")
    public static final long Collision = -72001L;
    @GlobalConstant("kCFNetServicesErrorNotFound")
    public static final long NotFound = -72002L;
    @GlobalConstant("kCFNetServicesErrorInProgress")
    public static final long InProgress = -72003L;
    @GlobalConstant("kCFNetServicesErrorBadArgument")
    public static final long BadArgument = -72004L;
    @GlobalConstant("kCFNetServicesErrorCancel")
    public static final long Cancel = -72005L;
    @GlobalConstant("kCFNetServicesErrorInvalid")
    public static final long Invalid = -72006L;
    @GlobalConstant("kCFNetServicesErrorTimeout")
    public static final long Timeout = -72007L;


}
