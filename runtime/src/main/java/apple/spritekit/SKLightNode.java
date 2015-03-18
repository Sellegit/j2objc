package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit/SpriteKit.h") @Mapping("SKLightNode")
public class SKLightNode 
    extends SKNode 
     {

    
    
    @Mapping("init")
    public SKLightNode() { }
    @Mapping("initWithCoder:")
    public SKLightNode(NSCoder aDecoder) { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("lightColor")
    public native UIColor getLightColor();
    @Mapping("setLightColor:")
    public native void setLightColor(UIColor v);
    @Mapping("ambientColor")
    public native UIColor getAmbientColor();
    @Mapping("setAmbientColor:")
    public native void setAmbientColor(UIColor v);
    @Mapping("shadowColor")
    public native UIColor getShadowColor();
    @Mapping("setShadowColor:")
    public native void setShadowColor(UIColor v);
    @Mapping("falloff")
    public native @MachineSizedFloat double getFalloff();
    @Mapping("setFalloff:")
    public native void setFalloff(@MachineSizedFloat double v);
    @Mapping("categoryBitMask")
    public native int getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
    public native void setCategoryBitMask(int v);
    
    
    
    
    
}
