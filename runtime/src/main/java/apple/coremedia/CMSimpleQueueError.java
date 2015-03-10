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






@Mapping("CMSimpleQueueError")
public final class CMSimpleQueueError extends ObjCEnum {
    
    @GlobalConstant("kCMSimpleQueueError_AllocationFailed")
    public static final long AllocationFailed = -12770L;
    @GlobalConstant("kCMSimpleQueueError_RequiredParameterMissing")
    public static final long RequiredParameterMissing = -12771L;
    @GlobalConstant("kCMSimpleQueueError_ParameterOutOfRange")
    public static final long ParameterOutOfRange = -12772L;
    @GlobalConstant("kCMSimpleQueueError_QueueIsFull")
    public static final long QueueIsFull = -12773L;
    

}
