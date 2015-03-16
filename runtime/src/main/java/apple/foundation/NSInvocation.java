package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSInvocation")
public class NSInvocation 
    extends NSObject 
     {

    
    
    public NSInvocation() {}
    
    
    @Mapping("methodSignature")
    public native NSMethodSignature getMethodSignature();
    @Mapping("argumentsRetained")
    public native boolean argumentsRetained();
    @Mapping("target")
    public native Object getTarget();
    @Mapping("setTarget:")
    public native void setTarget(Object v);
    @Mapping("selector")
    public native Selector getSelector();
    @Mapping("setSelector:")
    public native void setSelector(Selector v);
    
    
    
    @Mapping("retainArguments")
    public native void retainArguments();
    @Mapping("getReturnValue:")
    public native void getReturnValue(Todo retLoc);
    @Mapping("setReturnValue:")
    public native void setReturnValue(Todo retLoc);
    @Mapping("getArgument:atIndex:")
    public native void getArgument(Todo argumentLocation, @MachineSizedSInt long idx);
    @Mapping("setArgument:atIndex:")
    public native void setArgument(Todo argumentLocation, @MachineSizedSInt long idx);
    @Mapping("invoke")
    public native void invoke();
    @Mapping("invokeWithTarget:")
    public native void invoke(Object target);
    @Mapping("invocationWithMethodSignature:")
    public static native NSInvocation create(NSMethodSignature sig);
    
}
