package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;





@Library("QuartzCore") @Mapping("CAEmitterLayer")
public class CAEmitterLayer 
    extends CALayer 
     {

    
    
    public CAEmitterLayer() {}
    @Mapping("initWithLayer:")
    public CAEmitterLayer(Object layer) { }
    
    
    @Mapping("emitterCells")
    public native NSArray<CAEmitterCell> getEmitterCells();
    public native void setEmitterCells(NSArray<CAEmitterCell> v);
    @Mapping("birthRate")
    public native float getBirthRate();
    public native void setBirthRate(float v);
    @Mapping("lifetime")
    public native float getLifetime();
    public native void setLifetime(float v);
    @Mapping("emitterPosition")
    public native CGPoint getEmitterPosition();
    public native void setEmitterPosition(CGPoint v);
    @Mapping("emitterZPosition")
    public native @MachineSizedFloat double getEmitterZPosition();
    public native void setEmitterZPosition(@MachineSizedFloat double v);
    @Mapping("emitterSize")
    public native CGSize getEmitterSize();
    public native void setEmitterSize(CGSize v);
    @Mapping("emitterDepth")
    public native @MachineSizedFloat double getEmitterDepth();
    public native void setEmitterDepth(@MachineSizedFloat double v);
    @Mapping("emitterShape")
    public native CAEmitterShape getEmitterShape();
    public native void setEmitterShape(CAEmitterShape v);
    @Mapping("emitterMode")
    public native CAEmitterMode getEmitterMode();
    public native void setEmitterMode(CAEmitterMode v);
    @Mapping("renderMode")
    public native CAEmitterRenderMode getRenderMode();
    public native void setRenderMode(CAEmitterRenderMode v);
    @Mapping("preservesDepth")
    public native boolean preservesDepth();
    public native void setPreservesDepth(boolean v);
    @Mapping("velocity")
    public native float getVelocity();
    public native void setVelocity(float v);
    @Mapping("scale")
    public native float getScale();
    public native void setScale(float v);
    @Mapping("spin")
    public native float getSpin();
    public native void setSpin(float v);
    @Mapping("seed")
    public native int getSeed();
    public native void setSeed(int v);
    
    
    
    
    
}
