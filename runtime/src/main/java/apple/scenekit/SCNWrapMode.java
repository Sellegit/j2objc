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
@Mapping("SCNWrapMode")
public final class SCNWrapMode extends ObjCEnum {
    
    @GlobalConstant("SCNWrapModeClamp")
    public static final long Clamp = 1L;
    @GlobalConstant("SCNWrapModeRepeat")
    public static final long Repeat = 2L;
    @GlobalConstant("SCNWrapModeClampToBorder")
    public static final long ClampToBorder = 3L;
    @GlobalConstant("SCNWrapModeMirror")
    public static final long Mirror = 4L;
    

}
