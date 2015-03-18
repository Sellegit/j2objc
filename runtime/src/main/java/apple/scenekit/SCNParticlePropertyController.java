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





@Library("SceneKit/SceneKit.h") @Mapping("SCNParticlePropertyController")
public class SCNParticlePropertyController 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public SCNParticlePropertyController() { }
    
    
    @Mapping("animation")
    public native CAAnimation getAnimation();
    @Mapping("setAnimation:")
    public native void setAnimation(CAAnimation v);
    @Mapping("inputMode")
    public native @Representing("SCNParticleInputMode") @MachineSizedSInt long getInputMode();
    @Mapping("setInputMode:")
    public native void setInputMode(@Representing("SCNParticleInputMode") @MachineSizedSInt long v);
    @Mapping("inputScale")
    public native @MachineSizedFloat double getInputScale();
    @Mapping("setInputScale:")
    public native void setInputScale(@MachineSizedFloat double v);
    @Mapping("inputBias")
    public native @MachineSizedFloat double getInputBias();
    @Mapping("setInputBias:")
    public native void setInputBias(@MachineSizedFloat double v);
    @Mapping("inputOrigin")
    public native SCNNode getInputOrigin();
    @Mapping("setInputOrigin:")
    public native void setInputOrigin(SCNNode v);
    @Mapping("inputProperty")
    public native SCNParticleProperty getInputProperty();
    @Mapping("setInputProperty:")
    public native void setInputProperty(SCNParticleProperty v);
    
    
    
    @Mapping("controllerWithAnimation:")
    public static native SCNParticlePropertyController create(CAAnimation animation);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
