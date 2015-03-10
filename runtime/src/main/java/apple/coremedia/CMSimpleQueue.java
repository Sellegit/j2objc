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
    public native CMSimpleQueueError enqueue(Todo element);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueDequeue")
    public native Todo dequeue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetHead")
    public native Todo getHead();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueReset")
    public native CMSimpleQueueError reset();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetCapacity")
    public native CMSimpleQueueError getCapacity();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CMSimpleQueueGetCount")
    public native CMSimpleQueueError getCount();
    
}
