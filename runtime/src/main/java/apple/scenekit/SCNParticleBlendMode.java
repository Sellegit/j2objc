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
@Mapping("SCNParticleBlendMode")
public final class SCNParticleBlendMode extends ObjCEnum {
    
    @GlobalConstant("SCNParticleBlendModeAdditive")
    public static final long Additive = 0L;
    @GlobalConstant("SCNParticleBlendModeSubtract")
    public static final long Subtract = 1L;
    @GlobalConstant("SCNParticleBlendModeMultiply")
    public static final long Multiply = 2L;
    @GlobalConstant("SCNParticleBlendModeScreen")
    public static final long Screen = 3L;
    @GlobalConstant("SCNParticleBlendModeAlpha")
    public static final long Alpha = 4L;
    @GlobalConstant("SCNParticleBlendModeReplace")
    public static final long Replace = 5L;


}
