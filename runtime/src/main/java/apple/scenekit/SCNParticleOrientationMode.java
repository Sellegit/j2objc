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





@Library("SceneKit")
@Mapping("SCNParticleOrientationMode")
public final class SCNParticleOrientationMode extends ObjCEnum {
    
    @GlobalConstant("SCNParticleOrientationModeBillboardScreenAligned")
    public static final long BillboardScreenAligned = 0L;
    @GlobalConstant("SCNParticleOrientationModeBillboardViewAligned")
    public static final long BillboardViewAligned = 1L;
    @GlobalConstant("SCNParticleOrientationModeFree")
    public static final long Free = 2L;
    @GlobalConstant("SCNParticleOrientationModeBillboardYAligned")
    public static final long BillboardYAligned = 3L;
    

}
