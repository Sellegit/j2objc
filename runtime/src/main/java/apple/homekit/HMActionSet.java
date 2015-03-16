package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HomeKit/HomeKit.h") @Mapping("HMActionSet")
public class HMActionSet 
    extends NSObject 
     {

    
    
    public HMActionSet() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("actions")
    public native NSArray<HMAction> getActions();
    @Mapping("isExecuting")
    public native boolean isExecuting();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("addAction:completionHandler:")
    public native void addAction(HMAction action, @Block VoidBlock1<NSError> completion);
    @Mapping("removeAction:completionHandler:")
    public native void removeAction(HMAction action, @Block VoidBlock1<NSError> completion);
    
}
