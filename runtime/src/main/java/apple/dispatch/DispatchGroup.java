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
public class DispatchGroup 
    extends DispatchObject 
     {

    
    
    protected DispatchGroup() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_create")
    public static native DispatchGroup create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_async")
    public native void async(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_wait")
    public native @MachineSizedSInt long await(long timeout);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_notify")
    public native void notify(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_enter")
    public native void enter();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_leave")
    public native void leave();
    
}
