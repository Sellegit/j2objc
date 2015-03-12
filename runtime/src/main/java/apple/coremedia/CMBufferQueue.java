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
@Library("CoreMedia")
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
    public native CMBufferQueueError enqueue(CFType buf);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueDequeueAndRetain")
    public native CFType dequeueAndRetain();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueDequeueIfDataReadyAndRetain")
    public native CFType dequeueIfDataReadyAndRetain();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetHead")
    public native CFType getHead();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueIsEmpty")
    public native boolean isEmpty();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueMarkEndOfData")
    public native CMBufferQueueError markEndOfData();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueContainsEndOfData")
    public native boolean containsEndOfData();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueIsAtEndOfData")
    public native boolean isAtEndOfData();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueReset")
    public native CMBufferQueueError reset();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueResetWithCallback")
    private native CMBufferQueueError reset(FunctionPtr callback, Todo refcon);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetBufferCount")
    public native @MachineSizedSInt long getBufferCount();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetDuration")
    public native CMTime getDuration();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMinDecodeTimeStamp")
    public native CMTime getMinDecodeTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetFirstDecodeTimeStamp")
    public native CMTime getFirstDecodeTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMinPresentationTimeStamp")
    public native CMTime getMinPresentationTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetFirstPresentationTimeStamp")
    public native CMTime getFirstPresentationTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetMaxPresentationTimeStamp")
    public native CMTime getMaxPresentationTimeStamp();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueGetEndPresentationTimeStamp")
    public native CMTime getEndPresentationTimeStamp();
    /**
     * @since Available in iOS 7.1 and later.
     */
    @GlobalFunction("CMBufferQueueGetTotalSize")
    public native @MachineSizedUInt long getTotalSize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueInstallTrigger")
    private native CMBufferQueueError installTrigger(FunctionPtr triggerCallback, Todo triggerRefcon, CMBufferQueueTriggerCondition triggerCondition, CMTime triggerTime, Todo triggerTokenOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueInstallTriggerWithIntegerThreshold")
    private native CMBufferQueueError installTrigger(FunctionPtr triggerCallback, Todo triggerRefcon, CMBufferQueueTriggerCondition triggerCondition, @MachineSizedSInt long triggerThreshold, Todo triggerTokenOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueRemoveTrigger")
    public native CMBufferQueueError removeTrigger(CMBufferQueueTriggerToken triggerToken);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueTestTrigger")
    public native boolean testTrigger(CMBufferQueueTriggerToken triggerToken);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueCallForEachBuffer")
    private native CMBufferQueueError callForEachBuffer(FunctionPtr callback, Todo refcon);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMBufferQueueSetValidationCallback")
    private native CMBufferQueueError setValidationCallback(FunctionPtr validationCallback, Todo validationRefCon);
    
}
