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





@Library("SceneKit/SceneKit.h") @Mapping("SCNParticleSystem")
public class SCNParticleSystem 
    extends NSObject 
    implements NSCopying, SCNAnimatable {

    
    
    @Mapping("init")
    public SCNParticleSystem() { }
    
    
    @Mapping("emissionDuration")
    public native @MachineSizedFloat double getEmissionDuration();
    @Mapping("setEmissionDuration:")
    public native void setEmissionDuration(@MachineSizedFloat double v);
    @Mapping("emissionDurationVariation")
    public native @MachineSizedFloat double getEmissionDurationVariation();
    @Mapping("setEmissionDurationVariation:")
    public native void setEmissionDurationVariation(@MachineSizedFloat double v);
    @Mapping("idleDuration")
    public native @MachineSizedFloat double getIdleDuration();
    @Mapping("setIdleDuration:")
    public native void setIdleDuration(@MachineSizedFloat double v);
    @Mapping("idleDurationVariation")
    public native @MachineSizedFloat double getIdleDurationVariation();
    @Mapping("setIdleDurationVariation:")
    public native void setIdleDurationVariation(@MachineSizedFloat double v);
    @Mapping("loops")
    public native boolean loops();
    @Mapping("setLoops:")
    public native void setLoops(boolean v);
    @Mapping("birthRate")
    public native @MachineSizedFloat double getBirthRate();
    @Mapping("setBirthRate:")
    public native void setBirthRate(@MachineSizedFloat double v);
    @Mapping("birthRateVariation")
    public native @MachineSizedFloat double getBirthRateVariation();
    @Mapping("setBirthRateVariation:")
    public native void setBirthRateVariation(@MachineSizedFloat double v);
    @Mapping("warmupDuration")
    public native @MachineSizedFloat double getWarmupDuration();
    @Mapping("setWarmupDuration:")
    public native void setWarmupDuration(@MachineSizedFloat double v);
    @Mapping("emitterShape")
    public native SCNGeometry getEmitterShape();
    @Mapping("setEmitterShape:")
    public native void setEmitterShape(SCNGeometry v);
    @Mapping("birthLocation")
    public native @Representing("SCNParticleBirthLocation") @MachineSizedSInt long getBirthLocation();
    @Mapping("setBirthLocation:")
    public native void setBirthLocation(@Representing("SCNParticleBirthLocation") @MachineSizedSInt long v);
    @Mapping("birthDirection")
    public native @Representing("SCNParticleBirthDirection") @MachineSizedSInt long getBirthDirection();
    @Mapping("setBirthDirection:")
    public native void setBirthDirection(@Representing("SCNParticleBirthDirection") @MachineSizedSInt long v);
    @Mapping("spreadingAngle")
    public native @MachineSizedFloat double getSpreadingAngle();
    @Mapping("setSpreadingAngle:")
    public native void setSpreadingAngle(@MachineSizedFloat double v);
    @Mapping("emittingDirection")
    public native SCNVector3 getEmittingDirection();
    @Mapping("setEmittingDirection:")
    public native void setEmittingDirection(SCNVector3 v);
    @Mapping("acceleration")
    public native SCNVector3 getAcceleration();
    @Mapping("setAcceleration:")
    public native void setAcceleration(SCNVector3 v);
    @Mapping("isLocal")
    public native boolean isLocal();
    @Mapping("setLocal:")
    public native void setLocal(boolean v);
    @Mapping("particleAngle")
    public native @MachineSizedFloat double getParticleAngle();
    @Mapping("setParticleAngle:")
    public native void setParticleAngle(@MachineSizedFloat double v);
    @Mapping("particleAngleVariation")
    public native @MachineSizedFloat double getParticleAngleVariation();
    @Mapping("setParticleAngleVariation:")
    public native void setParticleAngleVariation(@MachineSizedFloat double v);
    @Mapping("particleVelocity")
    public native @MachineSizedFloat double getParticleVelocity();
    @Mapping("setParticleVelocity:")
    public native void setParticleVelocity(@MachineSizedFloat double v);
    @Mapping("particleVelocityVariation")
    public native @MachineSizedFloat double getParticleVelocityVariation();
    @Mapping("setParticleVelocityVariation:")
    public native void setParticleVelocityVariation(@MachineSizedFloat double v);
    @Mapping("particleAngularVelocity")
    public native @MachineSizedFloat double getParticleAngularVelocity();
    @Mapping("setParticleAngularVelocity:")
    public native void setParticleAngularVelocity(@MachineSizedFloat double v);
    @Mapping("particleAngularVelocityVariation")
    public native @MachineSizedFloat double getParticleAngularVelocityVariation();
    @Mapping("setParticleAngularVelocityVariation:")
    public native void setParticleAngularVelocityVariation(@MachineSizedFloat double v);
    @Mapping("particleLifeSpan")
    public native @MachineSizedFloat double getParticleLifeSpan();
    @Mapping("setParticleLifeSpan:")
    public native void setParticleLifeSpan(@MachineSizedFloat double v);
    @Mapping("particleLifeSpanVariation")
    public native @MachineSizedFloat double getParticleLifeSpanVariation();
    @Mapping("setParticleLifeSpanVariation:")
    public native void setParticleLifeSpanVariation(@MachineSizedFloat double v);
    @Mapping("systemSpawnedOnDying")
    public native SCNParticleSystem getSystemSpawnedOnDying();
    @Mapping("setSystemSpawnedOnDying:")
    public native void setSystemSpawnedOnDying(SCNParticleSystem v);
    @Mapping("systemSpawnedOnCollision")
    public native SCNParticleSystem getSystemSpawnedOnCollision();
    @Mapping("setSystemSpawnedOnCollision:")
    public native void setSystemSpawnedOnCollision(SCNParticleSystem v);
    @Mapping("systemSpawnedOnLiving")
    public native SCNParticleSystem getSystemSpawnedOnLiving();
    @Mapping("setSystemSpawnedOnLiving:")
    public native void setSystemSpawnedOnLiving(SCNParticleSystem v);
    @Mapping("particleImage")
    public native UIImage getParticleImage();
    @Mapping("setParticleImage:")
    public native void setParticleImage(UIImage v);
    @Mapping("imageSequenceColumnCount")
    public native @MachineSizedUInt long getImageSequenceColumnCount();
    @Mapping("setImageSequenceColumnCount:")
    public native void setImageSequenceColumnCount(@MachineSizedUInt long v);
    @Mapping("imageSequenceRowCount")
    public native @MachineSizedUInt long getImageSequenceRowCount();
    @Mapping("setImageSequenceRowCount:")
    public native void setImageSequenceRowCount(@MachineSizedUInt long v);
    @Mapping("imageSequenceInitialFrame")
    public native @MachineSizedFloat double getImageSequenceInitialFrame();
    @Mapping("setImageSequenceInitialFrame:")
    public native void setImageSequenceInitialFrame(@MachineSizedFloat double v);
    @Mapping("imageSequenceInitialFrameVariation")
    public native @MachineSizedFloat double getImageSequenceInitialFrameVariation();
    @Mapping("setImageSequenceInitialFrameVariation:")
    public native void setImageSequenceInitialFrameVariation(@MachineSizedFloat double v);
    @Mapping("imageSequenceFrameRate")
    public native @MachineSizedFloat double getImageSequenceFrameRate();
    @Mapping("setImageSequenceFrameRate:")
    public native void setImageSequenceFrameRate(@MachineSizedFloat double v);
    @Mapping("imageSequenceFrameRateVariation")
    public native @MachineSizedFloat double getImageSequenceFrameRateVariation();
    @Mapping("setImageSequenceFrameRateVariation:")
    public native void setImageSequenceFrameRateVariation(@MachineSizedFloat double v);
    @Mapping("imageSequenceAnimationMode")
    public native @Representing("SCNParticleImageSequenceAnimationMode") @MachineSizedSInt long getImageSequenceAnimationMode();
    @Mapping("setImageSequenceAnimationMode:")
    public native void setImageSequenceAnimationMode(@Representing("SCNParticleImageSequenceAnimationMode") @MachineSizedSInt long v);
    @Mapping("particleColor")
    public native UIColor getParticleColor();
    @Mapping("setParticleColor:")
    public native void setParticleColor(UIColor v);
    @Mapping("particleColorVariation")
    public native SCNVector4 getParticleColorVariation();
    @Mapping("setParticleColorVariation:")
    public native void setParticleColorVariation(SCNVector4 v);
    @Mapping("particleSize")
    public native @MachineSizedFloat double getParticleSize();
    @Mapping("setParticleSize:")
    public native void setParticleSize(@MachineSizedFloat double v);
    @Mapping("particleSizeVariation")
    public native @MachineSizedFloat double getParticleSizeVariation();
    @Mapping("setParticleSizeVariation:")
    public native void setParticleSizeVariation(@MachineSizedFloat double v);
    @Mapping("blendMode")
    public native @Representing("SCNParticleBlendMode") @MachineSizedSInt long getBlendMode();
    @Mapping("setBlendMode:")
    public native void setBlendMode(@Representing("SCNParticleBlendMode") @MachineSizedSInt long v);
    @Mapping("isBlackPassEnabled")
    public native boolean isBlackPassEnabled();
    @Mapping("setBlackPassEnabled:")
    public native void setBlackPassEnabled(boolean v);
    @Mapping("orientationMode")
    public native @Representing("SCNParticleOrientationMode") @MachineSizedSInt long getOrientationMode();
    @Mapping("setOrientationMode:")
    public native void setOrientationMode(@Representing("SCNParticleOrientationMode") @MachineSizedSInt long v);
    @Mapping("sortingMode")
    public native @Representing("SCNParticleSortingMode") @MachineSizedSInt long getSortingMode();
    @Mapping("setSortingMode:")
    public native void setSortingMode(@Representing("SCNParticleSortingMode") @MachineSizedSInt long v);
    @Mapping("isLightingEnabled")
    public native boolean isLightingEnabled();
    @Mapping("setLightingEnabled:")
    public native void setLightingEnabled(boolean v);
    @Mapping("affectedByGravity")
    public native boolean isAffectedByGravity();
    @Mapping("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean v);
    @Mapping("affectedByPhysicsFields")
    public native boolean isAffectedByPhysicsFields();
    @Mapping("setAffectedByPhysicsFields:")
    public native void setAffectedByPhysicsFields(boolean v);
    @Mapping("particleDiesOnCollision")
    public native boolean particleDiesOnCollision();
    @Mapping("setParticleDiesOnCollision:")
    public native void setParticleDiesOnCollision(boolean v);
    @Mapping("colliderNodes")
    public native NSArray<SCNNode> getColliderNodes();
    @Mapping("setColliderNodes:")
    public native void setColliderNodes(NSArray<SCNNode> v);
    @Mapping("particleMass")
    public native @MachineSizedFloat double getParticleMass();
    @Mapping("setParticleMass:")
    public native void setParticleMass(@MachineSizedFloat double v);
    @Mapping("particleMassVariation")
    public native @MachineSizedFloat double getParticleMassVariation();
    @Mapping("setParticleMassVariation:")
    public native void setParticleMassVariation(@MachineSizedFloat double v);
    @Mapping("particleBounce")
    public native @MachineSizedFloat double getParticleBounce();
    @Mapping("setParticleBounce:")
    public native void setParticleBounce(@MachineSizedFloat double v);
    @Mapping("particleBounceVariation")
    public native @MachineSizedFloat double getParticleBounceVariation();
    @Mapping("setParticleBounceVariation:")
    public native void setParticleBounceVariation(@MachineSizedFloat double v);
    @Mapping("particleFriction")
    public native @MachineSizedFloat double getParticleFriction();
    @Mapping("setParticleFriction:")
    public native void setParticleFriction(@MachineSizedFloat double v);
    @Mapping("particleFrictionVariation")
    public native @MachineSizedFloat double getParticleFrictionVariation();
    @Mapping("setParticleFrictionVariation:")
    public native void setParticleFrictionVariation(@MachineSizedFloat double v);
    @Mapping("particleCharge")
    public native @MachineSizedFloat double getParticleCharge();
    @Mapping("setParticleCharge:")
    public native void setParticleCharge(@MachineSizedFloat double v);
    @Mapping("particleChargeVariation")
    public native @MachineSizedFloat double getParticleChargeVariation();
    @Mapping("setParticleChargeVariation:")
    public native void setParticleChargeVariation(@MachineSizedFloat double v);
    @Mapping("dampingFactor")
    public native @MachineSizedFloat double getDampingFactor();
    @Mapping("setDampingFactor:")
    public native void setDampingFactor(@MachineSizedFloat double v);
    @Mapping("speedFactor")
    public native @MachineSizedFloat double getSpeedFactor();
    @Mapping("setSpeedFactor:")
    public native void setSpeedFactor(@MachineSizedFloat double v);
    @Mapping("stretchFactor")
    public native @MachineSizedFloat double getStretchFactor();
    @Mapping("setStretchFactor:")
    public native void setStretchFactor(@MachineSizedFloat double v);
    @Mapping("fresnelExponent")
    public native @MachineSizedFloat double getFresnelExponent();
    @Mapping("setFresnelExponent:")
    public native void setFresnelExponent(@MachineSizedFloat double v);
    @Mapping("propertyControllers")
    public native Map<SCNParticleProperty, SCNParticlePropertyController> getPropertyControllers();
    @Mapping("setPropertyControllers:")
    public native void setPropertyControllers(Map<SCNParticleProperty, SCNParticlePropertyController> v);
    
    
    
    @Mapping("reset")
    public native void reset();
    @Mapping("removeModifiersOfStage:")
    public native void removeModifiersOfStage(@Representing("SCNParticleModifierStage") @MachineSizedSInt long stage);
    @Mapping("removeAllModifiers")
    public native void removeAllModifiers();
    @Mapping("particleSystem")
    public static native SCNParticleSystem create();
    @Mapping("particleSystemNamed:inDirectory:")
    public static native SCNParticleSystem create(String name, String directory);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("addAnimation:forKey:")
    public native void addAnimation(CAAnimation animation, String key);
    @Mapping("removeAllAnimations")
    public native void removeAllAnimations();
    @Mapping("removeAnimationForKey:")
    public native void removeAnimation(String key);
    @Mapping("animationKeys")
    public native List<String> getAnimationKeys();
    @Mapping("animationForKey:")
    public native CAAnimation getAnimation(String key);
    @Mapping("pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    @Mapping("resumeAnimationForKey:")
    public native void resumeAnimation(String key);
    @Mapping("isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Mapping("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    
}
