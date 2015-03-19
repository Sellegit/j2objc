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

@Library("UIKit/UIKit.h") @Mapping("UIInterpolatingMotionEffect")
public class UIInterpolatingMotionEffect 
    extends UIMotionEffect 
     {

    
    
    @Mapping("initWithKeyPath:type:")
    public UIInterpolatingMotionEffect(String keyPath, @Representing("UIInterpolatingMotionEffectType") long type) { }
    @Mapping("initWithCoder:")
    public UIInterpolatingMotionEffect(NSCoder aDecoder) { }
    @Mapping("init")
    public UIInterpolatingMotionEffect() { }
    
    
    @Mapping("keyPath")
    public native String getKeyPath();
    @Mapping("type")
    public native @Representing("UIInterpolatingMotionEffectType") long getType();
    @Mapping("minimumRelativeValue")
    public native NSValue getMinimumRelativeValue();
    @Mapping("setMinimumRelativeValue:")
    public native void setMinimumRelativeValue(NSValue v);
    @Mapping("maximumRelativeValue")
    public native NSValue getMaximumRelativeValue();
    @Mapping("setMaximumRelativeValue:")
    public native void setMaximumRelativeValue(NSValue v);
    
    
    
    
    
}
