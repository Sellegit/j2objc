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


@Library("SpriteKit/SpriteKit.h")
@Mapping("SKRepeatMode")
public final class SKRepeatMode extends ObjCEnum {
    
    @GlobalConstant("SKRepeatModeClamp")
    public static final long Clamp = 1L;
    @GlobalConstant("SKRepeatModeLoop")
    public static final long Loop = 2L;


}
