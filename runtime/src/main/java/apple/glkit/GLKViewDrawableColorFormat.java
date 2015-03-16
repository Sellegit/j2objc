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
@Mapping("GLKViewDrawableColorFormat")
public final class GLKViewDrawableColorFormat extends ObjCEnum {
    
    @GlobalConstant("GLKViewDrawableColorFormatRGBA8888")
    public static final long RGBA8888 = 0L;
    @GlobalConstant("GLKViewDrawableColorFormatRGB565")
    public static final long RGB565 = 1L;
    @GlobalConstant("GLKViewDrawableColorFormatSRGBA8888")
    public static final long SRGBA8888 = 2L;
    

}
