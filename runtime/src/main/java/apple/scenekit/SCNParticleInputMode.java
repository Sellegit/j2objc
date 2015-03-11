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
@Mapping("SCNParticleInputMode")
public final class SCNParticleInputMode extends ObjCEnum {
    
    @GlobalConstant("SCNParticleInputModeOverLife")
    public static final long Life = 0L;
    @GlobalConstant("SCNParticleInputModeOverDistance")
    public static final long Distance = 1L;
    @GlobalConstant("SCNParticleInputModeOverOtherProperty")
    public static final long OtherProperty = 2L;
    

}
