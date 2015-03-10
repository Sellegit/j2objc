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






@Mapping("SCNParticleModifierStage")
public final class SCNParticleModifierStage extends ObjCEnum {
    
    @GlobalConstant("SCNParticleModifierStagePreDynamics")
    public static final long PreDynamics = 0L;
    @GlobalConstant("SCNParticleModifierStagePostDynamics")
    public static final long PostDynamics = 1L;
    @GlobalConstant("SCNParticleModifierStagePreCollision")
    public static final long PreCollision = 2L;
    @GlobalConstant("SCNParticleModifierStagePostCollision")
    public static final long PostCollision = 3L;
    

}
