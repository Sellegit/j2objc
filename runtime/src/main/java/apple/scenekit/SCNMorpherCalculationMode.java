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
@Mapping("SCNMorpherCalculationMode")
public final class SCNMorpherCalculationMode extends ObjCEnum {
    
    @GlobalConstant("SCNMorpherCalculationModeNormalized")
    public static final long Normalized = 0L;
    @GlobalConstant("SCNMorpherCalculationModeAdditive")
    public static final long Additive = 1L;


}
