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

@Library("GLKit") @Mapping("GLKEffectPropertyLight")
public class GLKEffectPropertyLight 
    extends GLKEffectProperty 
     {

    
    
    public GLKEffectPropertyLight() {}
    
    
    @Mapping("enabled")
    public native boolean isEnabled();
    public native void setEnabled(boolean v);
    @Mapping("position")
    public native GLKVector4 getPosition();
    public native void setPosition(GLKVector4 v);
    @Mapping("ambientColor")
    public native GLKVector4 getAmbientColor();
    public native void setAmbientColor(GLKVector4 v);
    @Mapping("diffuseColor")
    public native GLKVector4 getDiffuseColor();
    public native void setDiffuseColor(GLKVector4 v);
    @Mapping("specularColor")
    public native GLKVector4 getSpecularColor();
    public native void setSpecularColor(GLKVector4 v);
    @Mapping("spotDirection")
    public native GLKVector3 getSpotDirection();
    public native void setSpotDirection(GLKVector3 v);
    @Mapping("spotExponent")
    public native float getSpotExponent();
    public native void setSpotExponent(float v);
    @Mapping("spotCutoff")
    public native float getSpotCutoff();
    public native void setSpotCutoff(float v);
    @Mapping("constantAttenuation")
    public native float getConstantAttenuation();
    public native void setConstantAttenuation(float v);
    @Mapping("linearAttenuation")
    public native float getLinearAttenuation();
    public native void setLinearAttenuation(float v);
    @Mapping("quadraticAttenuation")
    public native float getQuadraticAttenuation();
    public native void setQuadraticAttenuation(float v);
    @Mapping("transform")
    public native GLKEffectPropertyTransform getTransform();
    public native void setTransform(GLKEffectPropertyTransform v);
    
    
    
    
    
}
