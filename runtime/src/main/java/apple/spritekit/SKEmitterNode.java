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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKEmitterNode")
public class SKEmitterNode 
    extends SKNode 
     {

    
    
    @Mapping("init")
    public SKEmitterNode() { }
    @Mapping("initWithCoder:")
    public SKEmitterNode(NSCoder aDecoder) { }
    
    
    @Mapping("particleTexture")
    public native SKTexture getParticleTexture();
    @Mapping("setParticleTexture:")
    public native void setParticleTexture(SKTexture v);
    @Mapping("particleZPosition")
    public native @MachineSizedFloat double getParticleZPosition();
    @Mapping("setParticleZPosition:")
    public native void setParticleZPosition(@MachineSizedFloat double v);
    @Mapping("particleZPositionRange")
    public native @MachineSizedFloat double getParticleZPositionRange();
    @Mapping("setParticleZPositionRange:")
    public native void setParticleZPositionRange(@MachineSizedFloat double v);
    @Mapping("particleZPositionSpeed")
    public native @MachineSizedFloat double getParticleZPositionSpeed();
    @Mapping("setParticleZPositionSpeed:")
    public native void setParticleZPositionSpeed(@MachineSizedFloat double v);
    @Mapping("particleBlendMode")
    public native @Representing("SKBlendMode") long getParticleBlendMode();
    @Mapping("setParticleBlendMode:")
    public native void setParticleBlendMode(@Representing("SKBlendMode") long v);
    @Mapping("particleColor")
    public native UIColor getParticleColor();
    @Mapping("setParticleColor:")
    public native void setParticleColor(UIColor v);
    @Mapping("particleColorRedRange")
    public native @MachineSizedFloat double getParticleColorRedRange();
    @Mapping("setParticleColorRedRange:")
    public native void setParticleColorRedRange(@MachineSizedFloat double v);
    @Mapping("particleColorGreenRange")
    public native @MachineSizedFloat double getParticleColorGreenRange();
    @Mapping("setParticleColorGreenRange:")
    public native void setParticleColorGreenRange(@MachineSizedFloat double v);
    @Mapping("particleColorBlueRange")
    public native @MachineSizedFloat double getParticleColorBlueRange();
    @Mapping("setParticleColorBlueRange:")
    public native void setParticleColorBlueRange(@MachineSizedFloat double v);
    @Mapping("particleColorAlphaRange")
    public native @MachineSizedFloat double getParticleColorAlphaRange();
    @Mapping("setParticleColorAlphaRange:")
    public native void setParticleColorAlphaRange(@MachineSizedFloat double v);
    @Mapping("particleColorRedSpeed")
    public native @MachineSizedFloat double getParticleColorRedSpeed();
    @Mapping("setParticleColorRedSpeed:")
    public native void setParticleColorRedSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorGreenSpeed")
    public native @MachineSizedFloat double getParticleColorGreenSpeed();
    @Mapping("setParticleColorGreenSpeed:")
    public native void setParticleColorGreenSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorBlueSpeed")
    public native @MachineSizedFloat double getParticleColorBlueSpeed();
    @Mapping("setParticleColorBlueSpeed:")
    public native void setParticleColorBlueSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorAlphaSpeed")
    public native @MachineSizedFloat double getParticleColorAlphaSpeed();
    @Mapping("setParticleColorAlphaSpeed:")
    public native void setParticleColorAlphaSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorSequence")
    public native SKKeyframeSequence getParticleColorSequence();
    @Mapping("setParticleColorSequence:")
    public native void setParticleColorSequence(SKKeyframeSequence v);
    @Mapping("particleColorBlendFactor")
    public native @MachineSizedFloat double getParticleColorBlendFactor();
    @Mapping("setParticleColorBlendFactor:")
    public native void setParticleColorBlendFactor(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorRange")
    public native @MachineSizedFloat double getParticleColorBlendFactorRange();
    @Mapping("setParticleColorBlendFactorRange:")
    public native void setParticleColorBlendFactorRange(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorSpeed")
    public native @MachineSizedFloat double getParticleColorBlendFactorSpeed();
    @Mapping("setParticleColorBlendFactorSpeed:")
    public native void setParticleColorBlendFactorSpeed(@MachineSizedFloat double v);
    @Mapping("particleColorBlendFactorSequence")
    public native SKKeyframeSequence getParticleColorBlendFactorSequence();
    @Mapping("setParticleColorBlendFactorSequence:")
    public native void setParticleColorBlendFactorSequence(SKKeyframeSequence v);
    @Mapping("particlePosition")
    public native CGPoint getParticlePosition();
    @Mapping("setParticlePosition:")
    public native void setParticlePosition(CGPoint v);
    @Mapping("particlePositionRange")
    public native CGVector getParticlePositionRange();
    @Mapping("setParticlePositionRange:")
    public native void setParticlePositionRange(CGVector v);
    @Mapping("particleSpeed")
    public native @MachineSizedFloat double getParticleSpeed();
    @Mapping("setParticleSpeed:")
    public native void setParticleSpeed(@MachineSizedFloat double v);
    @Mapping("particleSpeedRange")
    public native @MachineSizedFloat double getParticleSpeedRange();
    @Mapping("setParticleSpeedRange:")
    public native void setParticleSpeedRange(@MachineSizedFloat double v);
    @Mapping("emissionAngle")
    public native @MachineSizedFloat double getEmissionAngle();
    @Mapping("setEmissionAngle:")
    public native void setEmissionAngle(@MachineSizedFloat double v);
    @Mapping("emissionAngleRange")
    public native @MachineSizedFloat double getEmissionAngleRange();
    @Mapping("setEmissionAngleRange:")
    public native void setEmissionAngleRange(@MachineSizedFloat double v);
    @Mapping("xAcceleration")
    public native @MachineSizedFloat double getXAcceleration();
    @Mapping("setXAcceleration:")
    public native void setXAcceleration(@MachineSizedFloat double v);
    @Mapping("yAcceleration")
    public native @MachineSizedFloat double getYAcceleration();
    @Mapping("setYAcceleration:")
    public native void setYAcceleration(@MachineSizedFloat double v);
    @Mapping("particleBirthRate")
    public native @MachineSizedFloat double getParticleBirthRate();
    @Mapping("setParticleBirthRate:")
    public native void setParticleBirthRate(@MachineSizedFloat double v);
    @Mapping("numParticlesToEmit")
    public native @MachineSizedUInt long getNumParticlesToEmit();
    @Mapping("setNumParticlesToEmit:")
    public native void setNumParticlesToEmit(@MachineSizedUInt long v);
    @Mapping("particleLifetime")
    public native @MachineSizedFloat double getParticleLifetime();
    @Mapping("setParticleLifetime:")
    public native void setParticleLifetime(@MachineSizedFloat double v);
    @Mapping("particleLifetimeRange")
    public native @MachineSizedFloat double getParticleLifetimeRange();
    @Mapping("setParticleLifetimeRange:")
    public native void setParticleLifetimeRange(@MachineSizedFloat double v);
    @Mapping("particleRotation")
    public native @MachineSizedFloat double getParticleRotation();
    @Mapping("setParticleRotation:")
    public native void setParticleRotation(@MachineSizedFloat double v);
    @Mapping("particleRotationRange")
    public native @MachineSizedFloat double getParticleRotationRange();
    @Mapping("setParticleRotationRange:")
    public native void setParticleRotationRange(@MachineSizedFloat double v);
    @Mapping("particleRotationSpeed")
    public native @MachineSizedFloat double getParticleRotationSpeed();
    @Mapping("setParticleRotationSpeed:")
    public native void setParticleRotationSpeed(@MachineSizedFloat double v);
    @Mapping("particleSize")
    public native CGSize getParticleSize();
    @Mapping("setParticleSize:")
    public native void setParticleSize(CGSize v);
    @Mapping("particleScale")
    public native @MachineSizedFloat double getParticleScale();
    @Mapping("setParticleScale:")
    public native void setParticleScale(@MachineSizedFloat double v);
    @Mapping("particleScaleRange")
    public native @MachineSizedFloat double getParticleScaleRange();
    @Mapping("setParticleScaleRange:")
    public native void setParticleScaleRange(@MachineSizedFloat double v);
    @Mapping("particleScaleSpeed")
    public native @MachineSizedFloat double getParticleScaleSpeed();
    @Mapping("setParticleScaleSpeed:")
    public native void setParticleScaleSpeed(@MachineSizedFloat double v);
    @Mapping("particleScaleSequence")
    public native SKKeyframeSequence getParticleScaleSequence();
    @Mapping("setParticleScaleSequence:")
    public native void setParticleScaleSequence(SKKeyframeSequence v);
    @Mapping("particleAlpha")
    public native @MachineSizedFloat double getParticleAlpha();
    @Mapping("setParticleAlpha:")
    public native void setParticleAlpha(@MachineSizedFloat double v);
    @Mapping("particleAlphaRange")
    public native @MachineSizedFloat double getParticleAlphaRange();
    @Mapping("setParticleAlphaRange:")
    public native void setParticleAlphaRange(@MachineSizedFloat double v);
    @Mapping("particleAlphaSpeed")
    public native @MachineSizedFloat double getParticleAlphaSpeed();
    @Mapping("setParticleAlphaSpeed:")
    public native void setParticleAlphaSpeed(@MachineSizedFloat double v);
    @Mapping("particleAlphaSequence")
    public native SKKeyframeSequence getParticleAlphaSequence();
    @Mapping("setParticleAlphaSequence:")
    public native void setParticleAlphaSequence(SKKeyframeSequence v);
    @Mapping("particleAction")
    public native SKAction getParticleAction();
    @Mapping("setParticleAction:")
    public native void setParticleAction(SKAction v);
    @Mapping("fieldBitMask")
    public native int getFieldBitMask();
    @Mapping("setFieldBitMask:")
    public native void setFieldBitMask(int v);
    @Mapping("targetNode")
    public native SKNode getTargetNode();
    @Mapping("setTargetNode:")
    public native void setTargetNode(SKNode v);
    @Mapping("shader")
    public native SKShader getShader();
    @Mapping("setShader:")
    public native void setShader(SKShader v);
    
    
    
    @Mapping("advanceSimulationTime:")
    public native void advanceSimulationTime(double sec);
    @Mapping("resetSimulation")
    public native void resetSimulation();
    
}
