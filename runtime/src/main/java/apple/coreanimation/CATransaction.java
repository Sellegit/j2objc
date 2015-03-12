package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;





@Library("QuartzCore") @Mapping("CATransaction")
public class CATransaction 
    extends NSObject 
     {

    
    
    public CATransaction() {}
    
    
    
    
    
    
    @Mapping("begin")
    public static native void begin();
    @Mapping("commit")
    public static native void commit();
    @Mapping("flush")
    public static native void flush();
    @Mapping("lock")
    public static native void lock();
    @Mapping("unlock")
    public static native void unlock();
    @Mapping("animationDuration")
    public static native double getAnimationDuration();
    @Mapping("setAnimationDuration:")
    public static native void setAnimationDuration(double dur);
    @Mapping("animationTimingFunction")
    public static native CAMediaTimingFunction getAnimationTimingFunction();
    @Mapping("setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(CAMediaTimingFunction function);
    @Mapping("disableActions")
    public static native boolean disablesActions();
    @Mapping("setDisableActions:")
    public static native void setDisablesActions(boolean flag);
    @Mapping("completionBlock")
    public static native @Block Runnable getCompletionBlock();
    @Mapping("setCompletionBlock:")
    public static native void setCompletionBlock(@Block Runnable block);
    @Mapping("valueForKey:")
    public static native Object get(String key);
    @Mapping("setValue:forKey:")
    protected static native void set(Object anObject, String key);
    
}
