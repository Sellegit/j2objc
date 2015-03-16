package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GLKit/GLKit.h")
@Mapping("GLKTextureTarget")
public final class GLKTextureTarget extends ObjCEnum {
    
    @GlobalConstant("GLKTextureTarget2D")
    public static final long _2D = 3553L;
    @GlobalConstant("GLKTextureTargetCubeMap")
    public static final long CubeMap = 34067L;
    @GlobalConstant("GLKTextureTargetCt")
    public static final long Ct = 2L;
    

}
