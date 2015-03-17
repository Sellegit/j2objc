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
public class DispatchObject 
    extends Object 
     {

    
    
    protected DispatchObject() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_retain")
    public static native void retain(DispatchObject object);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_release")
    public static native void release(DispatchObject object);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_suspend")
    public static native void suspend(DispatchObject object);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_resume")
    public static native void resume(DispatchObject object);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_set_target_queue")
    public static native void setTargetQueue(DispatchObject object, DispatchQueue queue);
    
}
