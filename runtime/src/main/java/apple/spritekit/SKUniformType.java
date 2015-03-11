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
 * @since Available in iOS 8.0 and later.
 */

@Library("SpriteKit")
@Mapping("SKUniformType")
public final class SKUniformType extends ObjCEnum {
    
    @GlobalConstant("SKUniformTypeNone")
    public static final long None = 0L;
    @GlobalConstant("SKUniformTypeFloat")
    public static final long Float = 1L;
    @GlobalConstant("SKUniformTypeFloatVector2")
    public static final long FloatVector2 = 2L;
    @GlobalConstant("SKUniformTypeFloatVector3")
    public static final long FloatVector3 = 3L;
    @GlobalConstant("SKUniformTypeFloatVector4")
    public static final long FloatVector4 = 4L;
    @GlobalConstant("SKUniformTypeFloatMatrix2")
    public static final long FloatMatrix2 = 5L;
    @GlobalConstant("SKUniformTypeFloatMatrix3")
    public static final long FloatMatrix3 = 6L;
    @GlobalConstant("SKUniformTypeFloatMatrix4")
    public static final long FloatMatrix4 = 7L;
    @GlobalConstant("SKUniformTypeTexture")
    public static final long Texture = 8L;
    

}
