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
public class CMSimpleQueue 
    extends CFType 
     {

    
    
    protected CMSimpleQueue() {}
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueCreate")
    private static native CMSimpleQueueError create(CFAllocator allocator, int capacity, Todo queueOut);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueEnqueue")
    public static native CMSimpleQueueError enqueue(CMSimpleQueue queue, Todo element);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueDequeue")
    public static native Todo dequeue(CMSimpleQueue queue);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetHead")
    public static native Todo getHead(CMSimpleQueue queue);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueReset")
    public static native CMSimpleQueueError reset(CMSimpleQueue queue);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetCapacity")
    public static native CMSimpleQueueError getCapacity(CMSimpleQueue queue);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetCount")
    public static native CMSimpleQueueError getCount(CMSimpleQueue queue);
    
}
