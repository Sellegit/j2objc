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


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("SceneKit/SceneKit.h")
@Mapping("SCNPhysicsFieldScope")
public final class SCNPhysicsFieldScope extends ObjCEnum {
    
    @GlobalConstant("SCNPhysicsFieldScopeInsideExtent")
    public static final long InsideExtent = 0L;
    @GlobalConstant("SCNPhysicsFieldScopeOutsideExtent")
    public static final long OutsideExtent = 1L;


}
