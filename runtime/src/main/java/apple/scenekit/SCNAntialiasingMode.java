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
@Mapping("SCNAntialiasingMode")
public final class SCNAntialiasingMode extends ObjCEnum {
    
    @GlobalConstant("SCNAntialiasingModeNone")
    public static final long None = 0L;
    @GlobalConstant("SCNAntialiasingModeMultisampling2X")
    public static final long Multisampling2X = 1L;
    @GlobalConstant("SCNAntialiasingModeMultisampling4X")
    public static final long Multisampling4X = 2L;


}
