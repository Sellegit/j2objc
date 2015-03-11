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






@Mapping("SCNParticleEvent")
public final class SCNParticleEvent extends ObjCEnum {
    
    @GlobalConstant("SCNParticleEventBirth")
    public static final long Birth = 0L;
    @GlobalConstant("SCNParticleEventDeath")
    public static final long Death = 1L;
    @GlobalConstant("SCNParticleEventCollision")
    public static final long Collision = 2L;
    

}
