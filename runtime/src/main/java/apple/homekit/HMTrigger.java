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

@Library("HomeKit") @Mapping("HMTrigger")
public class HMTrigger 
    extends NSObject 
     {

    
    
    public HMTrigger() {}
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("actionSets")
    public native NSArray<HMActionSet> getActionSets();
    @Mapping("lastFireDate")
    public native NSDate getLastFireDate();
    
    
    
    @Mapping("updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Mapping("addActionSet:completionHandler:")
    public native void addActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Mapping("removeActionSet:completionHandler:")
    public native void removeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Mapping("enable:completionHandler:")
    public native void enable(boolean enable, @Block VoidBlock1<NSError> completion);
    
}
