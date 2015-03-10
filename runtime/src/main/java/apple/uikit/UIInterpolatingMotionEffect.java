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

@Library("UIKit") @Mapping("UIInterpolatingMotionEffect")
public class UIInterpolatingMotionEffect 
    extends UIMotionEffect 
     {

    
    
    public UIInterpolatingMotionEffect() {}
    @Mapping("initWithKeyPath:type:")
    public UIInterpolatingMotionEffect(String keyPath, @Representing("UIInterpolatingMotionEffectType") @MachineSizedSInt long type) { }
    
    
    @Mapping("keyPath")
    public native String getKeyPath();
    @Mapping("type")
    public native @Representing("UIInterpolatingMotionEffectType") @MachineSizedSInt long getType();
    @Mapping("minimumRelativeValue")
    public native NSValue getMinimumRelativeValue();
    @Mapping("setMinimumRelativeValue:")
    public native void setMinimumRelativeValue(NSValue v);
    @Mapping("maximumRelativeValue")
    public native NSValue getMaximumRelativeValue();
    @Mapping("setMaximumRelativeValue:")
    public native void setMaximumRelativeValue(NSValue v);
    
    
    
    
    
}
