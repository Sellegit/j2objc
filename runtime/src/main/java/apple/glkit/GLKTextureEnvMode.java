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

@Library("GLKit")
@Mapping("GLKTextureEnvMode")
public final class GLKTextureEnvMode extends ObjCEnum {
    
    @GlobalConstant("GLKTextureEnvModeReplace")
    public static final long Replace = 0L;
    @GlobalConstant("GLKTextureEnvModeModulate")
    public static final long Modulate = 1L;
    @GlobalConstant("GLKTextureEnvModeDecal")
    public static final long Decal = 2L;
    

}
