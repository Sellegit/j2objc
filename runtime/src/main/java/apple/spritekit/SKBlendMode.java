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
@Mapping("SKBlendMode")
public final class SKBlendMode extends ObjCEnum {
    
    @GlobalConstant("SKBlendModeAlpha")
    public static final long Alpha = 0L;
    @GlobalConstant("SKBlendModeAdd")
    public static final long Add = 1L;
    @GlobalConstant("SKBlendModeSubtract")
    public static final long Subtract = 2L;
    @GlobalConstant("SKBlendModeMultiply")
    public static final long Multiply = 3L;
    @GlobalConstant("SKBlendModeMultiplyX2")
    public static final long MultiplyX2 = 4L;
    @GlobalConstant("SKBlendModeScreen")
    public static final long Screen = 5L;
    @GlobalConstant("SKBlendModeReplace")
    public static final long Replace = 6L;


}
