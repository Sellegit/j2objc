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
@Mapping("SKLabelHorizontalAlignmentMode")
public final class SKLabelHorizontalAlignmentMode extends ObjCEnum {
    
    @GlobalConstant("SKLabelHorizontalAlignmentModeCenter")
    public static final long Center = 0L;
    @GlobalConstant("SKLabelHorizontalAlignmentModeLeft")
    public static final long Left = 1L;
    @GlobalConstant("SKLabelHorizontalAlignmentModeRight")
    public static final long Right = 2L;


}
