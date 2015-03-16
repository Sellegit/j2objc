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
@Mapping("SKTextureFilteringMode")
public final class SKTextureFilteringMode extends ObjCEnum {
    
    @GlobalConstant("SKTextureFilteringNearest")
    public static final long Nearest = 0L;
    @GlobalConstant("SKTextureFilteringLinear")
    public static final long Linear = 1L;
    

}
