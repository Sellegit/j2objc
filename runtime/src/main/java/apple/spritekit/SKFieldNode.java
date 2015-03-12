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

@Library("SpriteKit") @Mapping("SKFieldNode")
public class SKFieldNode 
    extends SKNode 
     {

    
    
    public SKFieldNode() {}
    @Mapping("initWithCoder:")
    public SKFieldNode(NSCoder aDecoder) { }
    
    
    @Mapping("region")
    public native SKRegion getRegion();
    @Mapping("setRegion:")
    public native void setRegion(SKRegion v);
    @Mapping("strength")
    public native float getStrength();
    @Mapping("setStrength:")
    public native void setStrength(float v);
    @Mapping("falloff")
    public native float getFalloff();
    @Mapping("setFalloff:")
    public native void setFalloff(float v);
    @Mapping("minimumRadius")
    public native float getMinimumRadius();
    @Mapping("setMinimumRadius:")
    public native void setMinimumRadius(float v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("isExclusive")
    public native boolean isExclusive();
    @Mapping("setExclusive:")
    public native void setExclusive(boolean v);
    @Mapping("categoryBitMask")
    public native int getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
    public native void setCategoryBitMask(int v);
    @Mapping("direction")
    public native SKVector3 getDirection();
    @Mapping("setDirection:")
    public native void setDirection(SKVector3 v);
    @Mapping("smoothness")
    public native float getSmoothness();
    @Mapping("setSmoothness:")
    public native void setSmoothness(float v);
    @Mapping("animationSpeed")
    public native float getAnimationSpeed();
    @Mapping("setAnimationSpeed:")
    public native void setAnimationSpeed(float v);
    @Mapping("texture")
    public native SKTexture getTexture();
    @Mapping("setTexture:")
    public native void setTexture(SKTexture v);
    
    
    
    @Mapping("dragField")
    public static native SKFieldNode createDragField();
    @Mapping("vortexField")
    public static native SKFieldNode createVortexField();
    @Mapping("radialGravityField")
    public static native SKFieldNode createRadialGravityField();
    @Mapping("linearGravityFieldWithVector:")
    public static native SKFieldNode createLinearGravityField(SKVector3 direction);
    @Mapping("velocityFieldWithVector:")
    public static native SKFieldNode createVelocityField(SKVector3 direction);
    @Mapping("velocityFieldWithTexture:")
    public static native SKFieldNode createVelocityField(SKTexture velocityTexture);
    @Mapping("noiseFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode createNoiseField(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Mapping("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode createTurbulenceField(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Mapping("springField")
    public static native SKFieldNode createSpringField();
    @Mapping("electricField")
    public static native SKFieldNode createElectricField();
    @Mapping("magneticField")
    public static native SKFieldNode createMagneticField();
    
}
