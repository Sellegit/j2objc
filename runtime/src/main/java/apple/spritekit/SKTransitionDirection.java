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

@Library("SpriteKit")
@Mapping("SKTransitionDirection")
public final class SKTransitionDirection extends ObjCEnum {
    
    @GlobalConstant("SKTransitionDirectionUp")
    public static final long Up = 0L;
    @GlobalConstant("SKTransitionDirectionDown")
    public static final long Down = 1L;
    @GlobalConstant("SKTransitionDirectionRight")
    public static final long Right = 2L;
    @GlobalConstant("SKTransitionDirectionLeft")
    public static final long Left = 3L;
    

}
