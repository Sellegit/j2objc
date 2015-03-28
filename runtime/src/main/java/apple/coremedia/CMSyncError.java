package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


@Library("CoreMedia/CoreMedia.h")
@Mapping("CMSyncError")
public final class CMSyncError extends ObjCEnum {
    
    @GlobalConstant("kCMSyncError_MissingRequiredParameter")
    public static final long MissingRequiredParameter = -12752L;
    @GlobalConstant("kCMSyncError_InvalidParameter")
    public static final long InvalidParameter = -12753L;
    @GlobalConstant("kCMSyncError_AllocationFailed")
    public static final long AllocationFailed = -12754L;
    @GlobalConstant("kCMSyncError_RateMustBeNonZero")
    public static final long RateMustBeNonZero = -12755L;


}
