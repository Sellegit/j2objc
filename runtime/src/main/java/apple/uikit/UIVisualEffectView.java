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

@Library("UIKit/UIKit.h") @Mapping("UIVisualEffectView")
public class UIVisualEffectView 
    extends UIView 
     {

    
    
    @Mapping("initWithEffect:")
    public UIVisualEffectView(UIVisualEffect effect) { }
    @Mapping("initWithFrame:")
    public UIVisualEffectView(CGRect frame) { }
    @Mapping("init")
    public UIVisualEffectView() { }
    
    
    @Mapping("contentView")
    public native UIView getContentView();
    @Mapping("effect")
    public native UIVisualEffect getEffect();
    
    
    
    
    
}
