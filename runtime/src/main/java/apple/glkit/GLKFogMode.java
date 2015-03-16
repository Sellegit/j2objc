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
@Mapping("GLKFogMode")
public final class GLKFogMode extends ObjCEnum {
    
    @GlobalConstant("GLKFogModeExp")
    public static final long Exp = 0L;
    @GlobalConstant("GLKFogModeExp2")
    public static final long Exp2 = 1L;
    @GlobalConstant("GLKFogModeLinear")
    public static final long Linear = 2L;
    

}
