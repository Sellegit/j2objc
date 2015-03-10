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





@Library("SpriteKit") @Mapping("SKEmitterNode")
public class SKEmitterNode 
    extends SKNode 
     {

    
    
    public SKEmitterNode() {}
    @Mapping("initWithCoder:")
    public SKEmitterNode(NSCoder aDecoder) { }
    
    
    @Mapping("particleTexture")
    public native SKTexture getParticleTexture();
    public native void setParticleTexture(SKTexture v);
    @Mapping("particleZPosition")
    public native @MachineSizedFloat double getParticleZPosition();
    public native void setParticleZPosition(@MachineSizedFloat double v);
    @Mapping("particleZPositionRange")
    public native @MachineSizedFloat double getParticleZPositionRange();
    public native void setParticleZPositionRange(@MachineSizedFloat double v);
    @Mapping("particleZPositionSpeed")
    public native @MachineSizedFloat double getParticleZPositionSpeed();
    public native void setParticleZPositionSpeed(@MachineSizedFloat double v);
    @Mapping("particleBlendMode")
    public native @Representing("SKBlendMode") @MachineSizedSInt long getParticleBlendMode();
    public native void setParticleBlendMode(@Representing("SKBlendMode") @MachineSizedSInt long v);
    @Mapping("particleColor")
    public native UIColor getParticleColor();
    public native void setParticleColor(UIColor v);
    @Mapping("particleColorRedRange")
    public native @MachineSizedFloat double getParticleColorRedRange();
    public native void setParticleColorRedRange(@MachineSizedFloat double v);
    @Mapping("particleColorGreenRange")
    public native @MachineSizedFloat double getParticleColorGreenRange();
    public native void setParticleColorGreenRange(@MachineSizedFloat double v);
    @Mapping("particleColorBlueRange")
    public native @MachineSizedFloat double getParticleColorBlueRange();
    public native void setParticleColorBlueRange(@MachineSizedFloat double v);
    @Mapping("particleColorAlphaRange")
    public native @MachineSizedFloat double getParticleColorAlphaRange();
    public native void setParticleColorAlphaRange(@MachineSizedFloat double v);
    @Mapping("particleColorRedSpeed")
    public native @MachineSizedFloat double getParticleColorRedSpeed();
    public native void setParticleColorRedSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorGreenSpeed")
    public native @MachineSizedFloat double getParticleColorGreenSpeed();
    public native void setParticleColorGreenSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorBlueSpeed")
    public native @MachineSizedFloat double getParticleColorBlueSpeed();
    public native void setParticleColorBlueSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorAlphaSpeed")
    public native @MachineSizedFloat double getParticleColorAlphaSpeed();
    public native void setParticleColorAlphaSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorSequence")
    public native SKKeyframeSequence getParticleColorSequence();
    public native void setParticleColorSequence(SKKeyframeSequence v);
    @Mapping("particleColorBlendFactor")
    public native @MachineSizedFloat double getParticleColorBlendFactor();
    public native void setParticleColorBlendFactor(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorRange")
    public native @MachineSizedFloat double getParticleColorBlendFactorRange();
    public native void setParticleColorBlendFactorRange(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorSpeed")
    public native @MachineSizedFloat double getParticleColorBlendFactorSpeed();
    public native void setParticleColorBlendFactorSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorSequence")
    public native SKKeyframeSequence getParticleColorBlendFactorSequence();
    public native void setParticleColorBlendFactorSequence(SKKeyframeSequence v);
    @Mapping("particlePosition")
    public native CGPoint getParticlePosition();
    public native void setParticlePosition(CGPoint v);
    @Mapping("particlePositionRange")
    public native CGVector getParticlePositionRange();
    public native void setParticlePositionRange(CGVector v);
    @Mapping("particleSpeed")
    public native @MachineSizedFloat double getParticleSpeed();
    public native void setParticleSpeed(@MachineSizedFloat double v);
    @Mapping("particleSpeedRange")
    public native @MachineSizedFloat double getParticleSpeedRange();
    public native void setParticleSpeedRange(@MachineSizedFloat double v);
    @Mapping("emissionAngle")
    public native @MachineSizedFloat double getEmissionAngle();
    public native void setEmissionAngle(@MachineSizedFloat double v);
    @Mapping("emissionAngleRange")
    public native @MachineSizedFloat double getEmissionAngleRange();
    public native void setEmissionAngleRange(@MachineSizedFloat double v);
    @Mapping("xAcceleration")
    public native @MachineSizedFloat double getXAcceleration();
    public native void setXAcceleration(@MachineSizedFloat double v);
    @Mapping("yAcceleration")
    public native @MachineSizedFloat double getYAcceleration();
    public native void setYAcceleration(@MachineSizedFloat double v);
    @Mapping("particleBirthRate")
    public native @MachineSizedFloat double getParticleBirthRate();
    public native void setParticleBirthRate(@MachineSizedFloat double v);
    @Mapping("numParticlesToEmit")
    public native @MachineSizedUInt long getNumParticlesToEmit();
    public native void setNumParticlesToEmit(@MachineSizedUInt long v);
    @Mapping("particleLifetime")
    public native @MachineSizedFloat double getParticleLifetime();
    public native void setParticleLifetime(@MachineSizedFloat double v);
    @Mapping("particleLifetimeRange")
    public native @MachineSizedFloat double getParticleLifetimeRange();
    public native void setParticleLifetimeRange(@MachineSizedFloat double v);
    @Mapping("particleRotation")
    public native @MachineSizedFloat double getParticleRotation();
    public native void setParticleRotation(@MachineSizedFloat double v);
    @Mapping("particleRotationRange")
    public native @MachineSizedFloat double getParticleRotationRange();
    public native void setParticleRotationRange(@MachineSizedFloat double v);
    @Mapping("particleRotationSpeed")
    public native @MachineSizedFloat double getParticleRotationSpeed();
    public native void setParticleRotationSpeed(@MachineSizedFloat double v);
    @Mapping("particleSize")
    public native CGSize getParticleSize();
    public native void setParticleSize(CGSize v);
    @Mapping("particleScale")
    public native @MachineSizedFloat double getParticleScale();
    public native void setParticleScale(@MachineSizedFloat double v);
    @Mapping("particleScaleRange")
    public native @MachineSizedFloat double getParticleScaleRange();
    public native void setParticleScaleRange(@MachineSizedFloat double v);
    @Mapping("particleScaleSpeed")
    public native @MachineSizedFloat double getParticleScaleSpeed();
    public native void setParticleScaleSpeed(@MachineSizedFloat double v);
    @Mapping("particleScaleSequence")
    public native SKKeyframeSequence getParticleScaleSequence();
    public native void setParticleScaleSequence(SKKeyframeSequence v);
    @Mapping("particleAlpha")
    public native @MachineSizedFloat double getParticleAlpha();
    public native void setParticleAlpha(@MachineSizedFloat double v);
    @Mapping("particleAlphaRange")
    public native @MachineSizedFloat double getParticleAlphaRange();
    public native void setParticleAlphaRange(@MachineSizedFloat double v);
    @Mapping("particleAlphaSpeed")
    public native @MachineSizedFloat double getParticleAlphaSpeed();
    public native void setParticleAlphaSpeed(@MachineSizedFloat double v);
    @Mapping("particleAlphaSequence")
    public native SKKeyframeSequence getParticleAlphaSequence();
    public native void setParticleAlphaSequence(SKKeyframeSequence v);
    @Mapping("particleAction")
    public native SKAction getParticleAction();
    public native void setParticleAction(SKAction v);
    @Mapping("fieldBitMask")
    public native int getFieldBitMask();
    public native void setFieldBitMask(int v);
    @Mapping("targetNode")
    public native SKNode getTargetNode();
    public native void setTargetNode(SKNode v);
    @Mapping("shader")
    public native SKShader getShader();
    public native void setShader(SKShader v);
    
    
    
    @Mapping("advanceSimulationTime:")
    public native void advanceSimulationTime(double sec);
    @Mapping("resetSimulation")
    public native void resetSimulation();
    
}
