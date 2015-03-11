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
@Mapping("SCNShadowMode")
public final class SCNShadowMode extends ObjCEnum {
    
    @GlobalConstant("SCNShadowModeForward")
    public static final long Forward = 0L;
    @GlobalConstant("SCNShadowModeDeferred")
    public static final long Deferred = 1L;
    @GlobalConstant("SCNShadowModeModulated")
    public static final long Modulated = 2L;
    

}
