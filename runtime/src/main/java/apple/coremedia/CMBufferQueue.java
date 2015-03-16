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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia/CoreMedia.h")
public class CMBufferQueue 
    extends CFType 
     {

    
    
    protected CMBufferQueue() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueCreate")
    private static native CMBufferQueueError create(CFAllocator allocator, @MachineSizedSInt long capacity, CMBufferCallbacksStruct callbacks, Todo queueOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueEnqueue")
    public static native CMBufferQueueError enqueue(CMBufferQueue queue, CFType buf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueDequeueAndRetain")
    public static native CFType dequeueAndRetain(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueDequeueIfDataReadyAndRetain")
    public static native CFType dequeueIfDataReadyAndRetain(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetHead")
    public static native CFType getHead(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueIsEmpty")
    public static native boolean isEmpty(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueMarkEndOfData")
    public static native CMBufferQueueError markEndOfData(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueContainsEndOfData")
    public static native boolean containsEndOfData(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueIsAtEndOfData")
    public static native boolean isAtEndOfData(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueReset")
    public static native CMBufferQueueError reset(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueResetWithCallback")
    private static native CMBufferQueueError reset(CMBufferQueue queue, FunctionPtr callback, Todo refcon);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetBufferCount")
    public static native @MachineSizedSInt long getBufferCount(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetDuration")
    public static native CMTime getDuration(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMinDecodeTimeStamp")
    public static native CMTime getMinDecodeTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetFirstDecodeTimeStamp")
    public static native CMTime getFirstDecodeTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMinPresentationTimeStamp")
    public static native CMTime getMinPresentationTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetFirstPresentationTimeStamp")
    public static native CMTime getFirstPresentationTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMaxPresentationTimeStamp")
    public static native CMTime getMaxPresentationTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetEndPresentationTimeStamp")
    public static native CMTime getEndPresentationTimeStamp(CMBufferQueue queue);
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalFunction("CMBufferQueueGetTotalSize")
    public static native @MachineSizedUInt long getTotalSize(CMBufferQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueInstallTrigger")
    private static native CMBufferQueueError installTrigger(CMBufferQueue queue, FunctionPtr triggerCallback, Todo triggerRefcon, CMBufferQueueTriggerCondition triggerCondition, CMTime triggerTime, Todo triggerTokenOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueInstallTriggerWithIntegerThreshold")
    private static native CMBufferQueueError installTrigger(CMBufferQueue queue, FunctionPtr triggerCallback, Todo triggerRefcon, CMBufferQueueTriggerCondition triggerCondition, @MachineSizedSInt long triggerThreshold, Todo triggerTokenOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueRemoveTrigger")
    public static native CMBufferQueueError removeTrigger(CMBufferQueue queue, CMBufferQueueTriggerToken triggerToken);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueTestTrigger")
    public static native boolean testTrigger(CMBufferQueue queue, CMBufferQueueTriggerToken triggerToken);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueCallForEachBuffer")
    private static native CMBufferQueueError callForEachBuffer(CMBufferQueue queue, FunctionPtr callback, Todo refcon);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueSetValidationCallback")
    private static native CMBufferQueueError setValidationCallback(CMBufferQueue queue, FunctionPtr validationCallback, Todo validationRefCon);
    
}
