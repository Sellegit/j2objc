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
@Library("System")
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
    public native @MachineSizedSInt long await(long timeout);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_semaphore_signal")
    public native @MachineSizedSInt long signal();
    
}
