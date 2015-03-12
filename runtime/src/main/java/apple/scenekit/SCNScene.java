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





@Library("SceneKit") @Mapping("SCNScene")
public class SCNScene 
    extends NSObject 
     {

    
    
    public SCNScene() {}
    
    
    @Mapping("rootNode")
    public native SCNNode getRootNode();
    @Mapping("physicsWorld")
    public native SCNPhysicsWorld getPhysicsWorld();
    @Mapping("background")
    public native SCNMaterialProperty getBackground();
    @Mapping("fogStartDistance")
    public native @MachineSizedFloat double getFogStartDistance();
    @Mapping("setFogStartDistance:")
    public native void setFogStartDistance(@MachineSizedFloat double v);
    @Mapping("fogEndDistance")
    public native @MachineSizedFloat double getFogEndDistance();
    @Mapping("setFogEndDistance:")
    public native void setFogEndDistance(@MachineSizedFloat double v);
    @Mapping("fogDensityExponent")
    public native @MachineSizedFloat double getFogDensityExponent();
    @Mapping("setFogDensityExponent:")
    public native void setFogDensityExponent(@MachineSizedFloat double v);
    @Mapping("fogColor")
    public native UIColor getFogColor();
    @Mapping("setFogColor:")
    public native void setFogColor(UIColor v);
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("setPaused:")
    public native void setPaused(boolean v);
    @Mapping("particleSystems")
    public native NSArray<SCNParticleSystem> getParticleSystems();
    
    
    
    @Mapping("attributeForKey:")
    public native Object getAttribute(String key);
    @Mapping("setAttribute:forKey:")
    protected native void setAttribute(Object attribute, String key);
    @Mapping("scene")
    public static native SCNScene create();
    @Mapping("sceneNamed:")
    public static native SCNScene create(String name);
    @Mapping("sceneNamed:inDirectory:options:")
    public static native SCNScene create(String name, String directory, NSDictionary<?, ?> options);
    @Mapping("sceneWithURL:options:error:")
    protected static native SCNScene create(NSURL url, NSDictionary<?, ?> options, Todo error);
    @Mapping("addParticleSystem:withTransform:")
    public native void addParticleSystem(SCNParticleSystem system, SCNMatrix4 transform);
    @Mapping("removeAllParticleSystems")
    public native void removeAllParticleSystems();
    @Mapping("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);
    
}
