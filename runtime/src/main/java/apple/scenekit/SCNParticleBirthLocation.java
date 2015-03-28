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
@Mapping("SCNParticleBirthLocation")
public final class SCNParticleBirthLocation extends ObjCEnum {
    
    @GlobalConstant("SCNParticleBirthLocationSurface")
    public static final long Surface = 0L;
    @GlobalConstant("SCNParticleBirthLocationVolume")
    public static final long Volume = 1L;
    @GlobalConstant("SCNParticleBirthLocationVertex")
    public static final long Vertex = 2L;


}
