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

@Library("GLKit") @Mapping("GLKEffectPropertyFog")
public class GLKEffectPropertyFog 
    extends GLKEffectProperty 
     {

    
    
    public GLKEffectPropertyFog() {}
    
    
    @Mapping("enabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("mode")
    public native GLKFogMode getMode();
    @Mapping("setMode:")
    public native void setMode(GLKFogMode v);
    @Mapping("color")
    public native GLKVector4 getColor();
    @Mapping("setColor:")
    public native void setColor(GLKVector4 v);
    @Mapping("density")
    public native float getDensity();
    @Mapping("setDensity:")
    public native void setDensity(float v);
    @Mapping("start")
    public native float getStart();
    @Mapping("setStart:")
    public native void setStart(float v);
    @Mapping("end")
    public native float getEnd();
    @Mapping("setEnd:")
    public native void setEnd(float v);
    
    
    
    
    
}
