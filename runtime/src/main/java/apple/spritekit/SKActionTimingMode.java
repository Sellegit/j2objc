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
@Mapping("SKActionTimingMode")
public final class SKActionTimingMode extends ObjCEnum {
    
    @GlobalConstant("SKActionTimingLinear")
    public static final long Linear = 0L;
    @GlobalConstant("SKActionTimingEaseIn")
    public static final long EaseIn = 1L;
    @GlobalConstant("SKActionTimingEaseOut")
    public static final long EaseOut = 2L;
    @GlobalConstant("SKActionTimingEaseInEaseOut")
    public static final long EaseInEaseOut = 3L;
    

}
