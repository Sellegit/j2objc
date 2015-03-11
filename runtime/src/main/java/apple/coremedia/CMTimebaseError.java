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





@Library("CoreMedia")
@Mapping("CMTimebaseError")
public final class CMTimebaseError extends ObjCEnum {
    
    @GlobalConstant("kCMTimebaseError_MissingRequiredParameter")
    public static final long MissingRequiredParameter = -12748L;
    @GlobalConstant("kCMTimebaseError_InvalidParameter")
    public static final long InvalidParameter = -12749L;
    @GlobalConstant("kCMTimebaseError_AllocationFailed")
    public static final long AllocationFailed = -12750L;
    @GlobalConstant("kCMTimebaseError_TimerIntervalTooShort")
    public static final long TimerIntervalTooShort = -12751L;
    @GlobalConstant("kCMTimebaseError_ReadOnly")
    public static final long ReadOnly = -12757L;
    

}
