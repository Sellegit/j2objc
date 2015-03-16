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
@Mapping("GLKViewDrawableDepthFormat")
public final class GLKViewDrawableDepthFormat extends ObjCEnum {
    
    @GlobalConstant("GLKViewDrawableDepthFormatNone")
    public static final long None = 0L;
    @GlobalConstant("GLKViewDrawableDepthFormat16")
    public static final long _16 = 1L;
    @GlobalConstant("GLKViewDrawableDepthFormat24")
    public static final long _24 = 2L;
    

}
