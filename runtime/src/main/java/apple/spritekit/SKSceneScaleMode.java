package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("SpriteKit/SpriteKit.h")
@Mapping("SKSceneScaleMode")
public final class SKSceneScaleMode extends ObjCEnum {
    
    @GlobalConstant("SKSceneScaleModeFill")
    public static final long Fill = 0L;
    @GlobalConstant("SKSceneScaleModeAspectFill")
    public static final long AspectFill = 1L;
    @GlobalConstant("SKSceneScaleModeAspectFit")
    public static final long AspectFit = 2L;
    @GlobalConstant("SKSceneScaleModeResizeFill")
    public static final long ResizeFill = 3L;


}
