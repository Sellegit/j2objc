package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;






@Mapping("AudioQueueError")
public final class AudioQueueError extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueErr_InvalidBuffer")
    public static final long InvalidBuffer = -66687L;
    @GlobalConstant("kAudioQueueErr_BufferEmpty")
    public static final long BufferEmpty = -66686L;
    @GlobalConstant("kAudioQueueErr_DisposalPending")
    public static final long DisposalPending = -66685L;
    @GlobalConstant("kAudioQueueErr_InvalidProperty")
    public static final long InvalidProperty = -66684L;
    @GlobalConstant("kAudioQueueErr_InvalidPropertySize")
    public static final long InvalidPropertySize = -66683L;
    @GlobalConstant("kAudioQueueErr_InvalidParameter")
    public static final long InvalidParameter = -66682L;
    @GlobalConstant("kAudioQueueErr_CannotStart")
    public static final long CannotStart = -66681L;
    @GlobalConstant("kAudioQueueErr_InvalidDevice")
    public static final long InvalidDevice = -66680L;
    @GlobalConstant("kAudioQueueErr_BufferInQueue")
    public static final long BufferInQueue = -66679L;
    @GlobalConstant("kAudioQueueErr_InvalidRunState")
    public static final long InvalidRunState = -66678L;
    @GlobalConstant("kAudioQueueErr_InvalidQueueType")
    public static final long InvalidQueueType = -66677L;
    @GlobalConstant("kAudioQueueErr_Permissions")
    public static final long Permissions = -66676L;
    @GlobalConstant("kAudioQueueErr_InvalidPropertyValue")
    public static final long InvalidPropertyValue = -66675L;
    @GlobalConstant("kAudioQueueErr_PrimeTimedOut")
    public static final long PrimeTimedOut = -66674L;
    @GlobalConstant("kAudioQueueErr_CodecNotFound")
    public static final long CodecNotFound = -66673L;
    @GlobalConstant("kAudioQueueErr_InvalidCodecAccess")
    public static final long InvalidCodecAccess = -66672L;
    @GlobalConstant("kAudioQueueErr_QueueInvalidated")
    public static final long QueueInvalidated = -66671L;
    @GlobalConstant("kAudioQueueErr_TooManyTaps")
    public static final long TooManyTaps = -66670L;
    @GlobalConstant("kAudioQueueErr_InvalidTapContext")
    public static final long InvalidTapContext = -66669L;
    @GlobalConstant("kAudioQueueErr_RecordUnderrun")
    public static final long RecordUnderrun = -66668L;
    @GlobalConstant("kAudioQueueErr_InvalidTapType")
    public static final long InvalidTapType = -66667L;
    @GlobalConstant("kAudioQueueErr_BufferEnqueuedTwice")
    public static final long BufferEnqueuedTwice = -66666L;
    @GlobalConstant("kAudioQueueErr_EnqueueDuringReset")
    public static final long EnqueueDuringReset = -66632L;
    @GlobalConstant("kAudioQueueErr_InvalidOfflineMode")
    public static final long InvalidOfflineMode = -66626L;
    

}
