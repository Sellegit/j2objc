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

@Library("SceneKit")
@Mapping("SCNActionTimingMode")
public final class SCNActionTimingMode extends ObjCEnum {
    
    @GlobalConstant("SCNActionTimingModeLinear")
    public static final long Linear = 0L;
    @GlobalConstant("SCNActionTimingModeEaseIn")
    public static final long EaseIn = 1L;
    @GlobalConstant("SCNActionTimingModeEaseOut")
    public static final long EaseOut = 2L;
    @GlobalConstant("SCNActionTimingModeEaseInEaseOut")
    public static final long EaseInEaseOut = 3L;
    

}
