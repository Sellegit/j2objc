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
public class DispatchQueueAttr 
    extends DispatchObject 
     {

    
    
    protected DispatchQueueAttr() {}
    
    
    
    
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("_dispatch_queue_attr_concurrent")
    public static native DispatchQueueAttr Concurrent();
    
}
