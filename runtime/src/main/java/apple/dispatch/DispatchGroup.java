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
@Library("System/System.h")
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
    public static native void async(DispatchGroup group, DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_wait")
    public static native @MachineSizedSInt long await(DispatchGroup group, long timeout);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_notify")
    public static native void notify(DispatchGroup group, DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_enter")
    public static native void enter(DispatchGroup group);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_group_leave")
    public static native void leave(DispatchGroup group);
    
}
