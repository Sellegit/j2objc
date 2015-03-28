package apple.dispatch;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("dispatch/dispatch.h")
public class DispatchSemaphore 
    extends DispatchObject 
     {

    
    
    protected DispatchSemaphore() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_semaphore_create")
    public static native DispatchSemaphore create(@MachineSizedSInt long value);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_semaphore_wait")
    public static native @MachineSizedSInt long await(DispatchSemaphore dsema, long timeout);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_semaphore_signal")
    public static native @MachineSizedSInt long signal(DispatchSemaphore dsema);

}
