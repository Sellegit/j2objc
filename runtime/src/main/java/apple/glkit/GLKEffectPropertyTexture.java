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

@Library("GLKit/GLKit.h") @Mapping("GLKEffectPropertyTexture")
public class GLKEffectPropertyTexture 
    extends GLKEffectProperty 
     {

    
    
    @Mapping("init")
    public GLKEffectPropertyTexture() { }
    
    
    @Mapping("enabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("name")
    public native int getName();
    @Mapping("setName:")
    public native void setName(int v);
    @Mapping("target")
    public native @Representing("GLKTextureTarget") int getTarget();
    @Mapping("setTarget:")
    public native void setTarget(@Representing("GLKTextureTarget") int v);
    @Mapping("envMode")
    public native @Representing("GLKTextureEnvMode") int getEnvMode();
    @Mapping("setEnvMode:")
    public native void setEnvMode(@Representing("GLKTextureEnvMode") int v);
    
    
    
    
    
}
