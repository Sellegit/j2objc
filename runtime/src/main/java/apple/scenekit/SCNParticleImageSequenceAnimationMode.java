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


@Library("SceneKit/SceneKit.h")
@Mapping("SCNParticleImageSequenceAnimationMode")
public final class SCNParticleImageSequenceAnimationMode extends ObjCEnum {
    
    @GlobalConstant("SCNParticleImageSequenceAnimationModeRepeat")
    public static final long Repeat = 0L;
    @GlobalConstant("SCNParticleImageSequenceAnimationModeClamp")
    public static final long Clamp = 1L;
    @GlobalConstant("SCNParticleImageSequenceAnimationModeAutoReverse")
    public static final long AutoReverse = 2L;


}
