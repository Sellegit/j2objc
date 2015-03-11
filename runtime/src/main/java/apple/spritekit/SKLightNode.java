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

@Library("SpriteKit") @Mapping("SKLightNode")
public class SKLightNode 
    extends SKNode 
     {

    
    
    public SKLightNode() {}
    @Mapping("initWithCoder:")
    public SKLightNode(NSCoder aDecoder) { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    public native void setEnabled(boolean v);
    @Mapping("lightColor")
    public native UIColor getLightColor();
    public native void setLightColor(UIColor v);
    @Mapping("ambientColor")
    public native UIColor getAmbientColor();
    public native void setAmbientColor(UIColor v);
    @Mapping("shadowColor")
    public native UIColor getShadowColor();
    public native void setShadowColor(UIColor v);
    @Mapping("falloff")
    public native @MachineSizedFloat double getFalloff();
    public native void setFalloff(@MachineSizedFloat double v);
    @Mapping("categoryBitMask")
    public native int getCategoryBitMask();
    public native void setCategoryBitMask(int v);
    
    
    
    
    
}
