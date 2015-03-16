package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIDynamicBehavior")
public class UIDynamicBehavior 
    extends NSObject 
     {

    
    
    public UIDynamicBehavior() {}
    
    
    @Mapping("childBehaviors")
    public native NSArray<UIDynamicBehavior> getChildBehaviors();
    @Mapping("action")
    public native @Block Runnable getAction();
    @Mapping("setAction:")
    public native void setAction(@Block Runnable v);
    @Mapping("dynamicAnimator")
    public native UIDynamicAnimator getDynamicAnimator();
    
    
    
    @Mapping("addChildBehavior:")
    public native void addChildBehavior(UIDynamicBehavior behavior);
    @Mapping("removeChildBehavior:")
    public native void removeChildBehavior(UIDynamicBehavior behavior);
    @Mapping("willMoveToAnimator:")
    public native void willMoveToAnimator(UIDynamicAnimator dynamicAnimator);
    
}
