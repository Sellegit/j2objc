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
@Mapping("SCNSceneSourceStatus")
public final class SCNSceneSourceStatus extends ObjCEnum {
    
    @GlobalConstant("SCNSceneSourceStatusError")
    public static final long Error = -1L;
    @GlobalConstant("SCNSceneSourceStatusParsing")
    public static final long Parsing = 4L;
    @GlobalConstant("SCNSceneSourceStatusValidating")
    public static final long Validating = 8L;
    @GlobalConstant("SCNSceneSourceStatusProcessing")
    public static final long Processing = 12L;
    @GlobalConstant("SCNSceneSourceStatusComplete")
    public static final long Complete = 16L;


}
