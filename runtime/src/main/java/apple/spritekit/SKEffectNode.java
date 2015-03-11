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





@Library("SpriteKit") @Mapping("SKEffectNode")
public class SKEffectNode 
    extends SKNode 
     {

    
    
    public SKEffectNode() {}
    @Mapping("initWithCoder:")
    public SKEffectNode(NSCoder aDecoder) { }
    
    
    @Mapping("filter")
    public native CIFilter getFilter();
    public native void setFilter(CIFilter v);
    @Mapping("shouldCenterFilter")
    public native boolean shouldCenterFilter();
    public native void setShouldCenterFilter(boolean v);
    @Mapping("shouldEnableEffects")
    public native boolean shouldEnableEffects();
    public native void setShouldEnableEffects(boolean v);
    @Mapping("shouldRasterize")
    public native boolean shouldRasterize();
    public native void setShouldRasterize(boolean v);
    @Mapping("blendMode")
    public native @Representing("SKBlendMode") @MachineSizedSInt long getBlendMode();
    public native void setBlendMode(@Representing("SKBlendMode") @MachineSizedSInt long v);
    @Mapping("shader")
    public native SKShader getShader();
    public native void setShader(SKShader v);
    
    
    
    
    
}
