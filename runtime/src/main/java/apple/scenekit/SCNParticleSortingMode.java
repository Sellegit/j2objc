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
@Mapping("SCNParticleSortingMode")
public final class SCNParticleSortingMode extends ObjCEnum {
    
    @GlobalConstant("SCNParticleSortingModeNone")
    public static final long None = 0L;
    @GlobalConstant("SCNParticleSortingModeProjectedDepth")
    public static final long ProjectedDepth = 1L;
    @GlobalConstant("SCNParticleSortingModeDistance")
    public static final long Distance = 2L;
    @GlobalConstant("SCNParticleSortingModeOldestFirst")
    public static final long OldestFirst = 3L;
    @GlobalConstant("SCNParticleSortingModeYoungestFirst")
    public static final long YoungestFirst = 4L;
    

}
