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
public class DispatchObject 
    extends Object 
     {

    
    
    protected DispatchObject() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_retain")
    public native void retain();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_release")
    public native void release();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_suspend")
    public native void suspend();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_resume")
    public native void resume();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_set_target_queue")
    public native void setTargetQueue(DispatchQueue queue);
    
}
