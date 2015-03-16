package apple.scenekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Library("SceneKit/SceneKit.h") @Mapping("SCNTransaction")
public class SCNTransaction 
    extends NSObject 
     {

    
    
    public SCNTransaction() {}
    
    
    
    
    
    
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
    public static native void setAnimationDuration(double duration);
    @Mapping("animationTimingFunction")
    public static native CAMediaTimingFunction getAnimationTimingFunction();
    @Mapping("setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(CAMediaTimingFunction function);
    @Mapping("disableActions")
    public static native boolean areActionsDisabled();
    @Mapping("setDisableActions:")
    public static native void setActionsDisabled(boolean flag);
    @Mapping("completionBlock")
    public static native @Block Runnable getCompletionBlock();
    @Mapping("setCompletionBlock:")
    public static native void setCompletionBlock(@Block Runnable block);
    @Mapping("valueForKey:")
    public static native Object getValue(String key);
    @Mapping("setValue:forKey:")
    public static native void setValue(Object anObject, String key);
    
}
