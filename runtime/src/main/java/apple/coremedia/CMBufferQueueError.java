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






@Mapping("CMBufferQueueError")
public final class CMBufferQueueError extends ObjCEnum {
    
    @GlobalConstant("kCMBufferQueueError_AllocationFailed")
    public static final long AllocationFailed = -12760L;
    @GlobalConstant("kCMBufferQueueError_RequiredParameterMissing")
    public static final long RequiredParameterMissing = -12761L;
    @GlobalConstant("kCMBufferQueueError_InvalidCMBufferCallbacksStruct")
    public static final long InvalidCMBufferCallbacksStruct = -12762L;
    @GlobalConstant("kCMBufferQueueError_EnqueueAfterEndOfData")
    public static final long EnqueueAfterEndOfData = -12763L;
    @GlobalConstant("kCMBufferQueueError_QueueIsFull")
    public static final long QueueIsFull = -12764L;
    @GlobalConstant("kCMBufferQueueError_BadTriggerDuration")
    public static final long BadTriggerDuration = -12765L;
    @GlobalConstant("kCMBufferQueueError_CannotModifyQueueFromTriggerCallback")
    public static final long CannotModifyQueueFromTriggerCallback = -12766L;
    @GlobalConstant("kCMBufferQueueError_InvalidTriggerCondition")
    public static final long InvalidTriggerCondition = -12767L;
    @GlobalConstant("kCMBufferQueueError_InvalidTriggerToken")
    public static final long InvalidTriggerToken = -12768L;
    @GlobalConstant("kCMBufferQueueError_InvalidBuffer")
    public static final long InvalidBuffer = -12769L;
    

}
