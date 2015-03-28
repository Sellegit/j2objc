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
@Mapping("CMBufferQueueTriggerCondition")
public final class CMBufferQueueTriggerCondition extends ObjCEnum {
    
    @GlobalConstant("kCMBufferQueueTrigger_WhenDurationBecomesLessThan")
    public static final long WhenDurationBecomesLessThan = 1L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenDurationBecomesLessThanOrEqualTo")
    public static final long WhenDurationBecomesLessThanOrEqualTo = 2L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenDurationBecomesGreaterThan")
    public static final long WhenDurationBecomesGreaterThan = 3L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenDurationBecomesGreaterThanOrEqualTo")
    public static final long WhenDurationBecomesGreaterThanOrEqualTo = 4L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenMinPresentationTimeStampChanges")
    public static final long WhenMinPresentationTimeStampChanges = 5L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenMaxPresentationTimeStampChanges")
    public static final long WhenMaxPresentationTimeStampChanges = 6L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenDataBecomesReady")
    public static final long WhenDataBecomesReady = 7L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenEndOfDataReached")
    public static final long WhenEndOfDataReached = 8L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenReset")
    public static final long WhenReset = 9L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenBufferCountBecomesLessThan")
    public static final long WhenBufferCountBecomesLessThan = 10L;
    @GlobalConstant("kCMBufferQueueTrigger_WhenBufferCountBecomesGreaterThan")
    public static final long WhenBufferCountBecomesGreaterThan = 11L;


}
