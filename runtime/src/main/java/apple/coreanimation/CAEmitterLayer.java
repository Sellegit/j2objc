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





@Library("QuartzCore/QuartzCore.h") @Mapping("CAEmitterLayer")
public class CAEmitterLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public CAEmitterLayer() { }
    @Mapping("initWithLayer:")
    public CAEmitterLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CAEmitterLayer(NSCoder aDecoder) { }
    
    
    @Mapping("emitterCells")
    public native NSArray<CAEmitterCell> getEmitterCells();
    @Mapping("setEmitterCells:")
    public native void setEmitterCells(NSArray<CAEmitterCell> v);
    @Mapping("birthRate")
    public native float getBirthRate();
    @Mapping("setBirthRate:")
    public native void setBirthRate(float v);
    @Mapping("lifetime")
    public native float getLifetime();
    @Mapping("setLifetime:")
    public native void setLifetime(float v);
    @Mapping("emitterPosition")
    public native CGPoint getEmitterPosition();
    @Mapping("setEmitterPosition:")
    public native void setEmitterPosition(CGPoint v);
    @Mapping("emitterZPosition")
    public native @MachineSizedFloat double getEmitterZPosition();
    @Mapping("setEmitterZPosition:")
    public native void setEmitterZPosition(@MachineSizedFloat double v);
    @Mapping("emitterSize")
    public native CGSize getEmitterSize();
    @Mapping("setEmitterSize:")
    public native void setEmitterSize(CGSize v);
    @Mapping("emitterDepth")
    public native @MachineSizedFloat double getEmitterDepth();
    @Mapping("setEmitterDepth:")
    public native void setEmitterDepth(@MachineSizedFloat double v);
    @Mapping("emitterShape")
    public native CAEmitterShape getEmitterShape();
    @Mapping("setEmitterShape:")
    public native void setEmitterShape(CAEmitterShape v);
    @Mapping("emitterMode")
    public native CAEmitterMode getEmitterMode();
    @Mapping("setEmitterMode:")
    public native void setEmitterMode(CAEmitterMode v);
    @Mapping("renderMode")
    public native CAEmitterRenderMode getRenderMode();
    @Mapping("setRenderMode:")
    public native void setRenderMode(CAEmitterRenderMode v);
    @Mapping("preservesDepth")
    public native boolean preservesDepth();
    @Mapping("setPreservesDepth:")
    public native void setPreservesDepth(boolean v);
    @Mapping("velocity")
    public native float getVelocity();
    @Mapping("setVelocity:")
    public native void setVelocity(float v);
    @Mapping("scale")
    public native float getScale();
    @Mapping("setScale:")
    public native void setScale(float v);
    @Mapping("spin")
    public native float getSpin();
    @Mapping("setSpin:")
    public native void setSpin(float v);
    @Mapping("seed")
    public native int getSeed();
    @Mapping("setSeed:")
    public native void setSeed(int v);
    
    
    
    
    
}
