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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIAccessibilityCustomAction")
public class UIAccessibilityCustomAction 
    extends NSObject 
     {

    
    
    public UIAccessibilityCustomAction() {}
    @Mapping("initWithName:target:selector:")
    public UIAccessibilityCustomAction(String name, Object target, Selector selector) { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("target")
    public native Object getTarget();
    @Mapping("setTarget:")
    public native void setTarget(Object v);
    @Mapping("selector")
    public native Selector getSelector();
    @Mapping("setSelector:")
    public native void setSelector(Selector v);
    
    
    
    
    
}
