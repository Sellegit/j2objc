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

@Library("GLKit") @Mapping("GLKEffectPropertyTexture")
public class GLKEffectPropertyTexture 
    extends GLKEffectProperty 
     {

    
    
    public GLKEffectPropertyTexture() {}
    
    
    @Mapping("enabled")
    public native boolean isEnabled();
    public native void setEnabled(boolean v);
    @Mapping("name")
    public native int getName();
    public native void setName(int v);
    @Mapping("target")
    public native @Representing("GLKTextureTarget") int getTarget();
    public native void setTarget(@Representing("GLKTextureTarget") int v);
    @Mapping("envMode")
    public native @Representing("GLKTextureEnvMode") int getEnvMode();
    public native void setEnvMode(@Representing("GLKTextureEnvMode") int v);
    
    
    
    
    
}
