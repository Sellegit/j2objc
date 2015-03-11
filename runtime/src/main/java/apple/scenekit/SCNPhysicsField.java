package apple.scenekit;


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
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Library("SceneKit") @Mapping("SCNPhysicsField")
public class SCNPhysicsField 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNPhysicsField() {}
    
    
    @Mapping("strength")
    public native @MachineSizedFloat double getStrength();
    @Mapping("setStrength:")
    public native void setStrength(@MachineSizedFloat double v);
    @Mapping("falloffExponent")
    public native @MachineSizedFloat double getFalloffExponent();
    @Mapping("setFalloffExponent:")
    public native void setFalloffExponent(@MachineSizedFloat double v);
    @Mapping("minimumDistance")
    public native @MachineSizedFloat double getMinimumDistance();
    @Mapping("setMinimumDistance:")
    public native void setMinimumDistance(@MachineSizedFloat double v);
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("isExclusive")
    public native boolean isExclusive();
    @Mapping("setExclusive:")
    public native void setExclusive(boolean v);
    @Mapping("halfExtent")
    public native SCNVector3 getHalfExtent();
    @Mapping("setHalfExtent:")
    public native void setHalfExtent(SCNVector3 v);
    @Mapping("usesEllipsoidalExtent")
    public native boolean usesEllipsoidalExtent();
    @Mapping("setUsesEllipsoidalExtent:")
    public native void setUsesEllipsoidalExtent(boolean v);
    @Mapping("scope")
    public native @Representing("SCNPhysicsFieldScope") @MachineSizedSInt long getScope();
    @Mapping("setScope:")
    public native void setScope(@Representing("SCNPhysicsFieldScope") @MachineSizedSInt long v);
    @Mapping("offset")
    public native SCNVector3 getOffset();
    @Mapping("setOffset:")
    public native void setOffset(SCNVector3 v);
    @Mapping("direction")
    public native SCNVector3 getDirection();
    @Mapping("setDirection:")
    public native void setDirection(SCNVector3 v);
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    
    
    
    @Mapping("dragField")
    public static native SCNPhysicsField createDragField();
    @Mapping("vortexField")
    public static native SCNPhysicsField createVortexField();
    @Mapping("radialGravityField")
    public static native SCNPhysicsField createRadialGravityField();
    @Mapping("linearGravityField")
    public static native SCNPhysicsField createLinearGravityField();
    @Mapping("noiseFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField createNoiseField(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Mapping("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField createTurbulenceField(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Mapping("springField")
    public static native SCNPhysicsField createSpringField();
    @Mapping("electricField")
    public static native SCNPhysicsField createElectricField();
    @Mapping("magneticField")
    public static native SCNPhysicsField createMagneticField();
    @Mapping("customFieldWithEvaluationBlock:")
    public static native SCNPhysicsField createCustomField(@Block Block5<SCNVector3, SCNVector3, Float, Float, Double, SCNVector3> block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
