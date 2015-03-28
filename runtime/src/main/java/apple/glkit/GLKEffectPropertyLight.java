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
@Library("GLKit/GLKit.h") @Mapping("GLKEffectPropertyLight")
public class GLKEffectPropertyLight 
    extends GLKEffectProperty 
     {

    
    
    @Mapping("init")
    public GLKEffectPropertyLight() { }

    
    @Mapping("enabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("position")
    public native GLKVector4 getPosition();
    @Mapping("setPosition:")
    public native void setPosition(GLKVector4 v);
    @Mapping("ambientColor")
    public native GLKVector4 getAmbientColor();
    @Mapping("setAmbientColor:")
    public native void setAmbientColor(GLKVector4 v);
    @Mapping("diffuseColor")
    public native GLKVector4 getDiffuseColor();
    @Mapping("setDiffuseColor:")
    public native void setDiffuseColor(GLKVector4 v);
    @Mapping("specularColor")
    public native GLKVector4 getSpecularColor();
    @Mapping("setSpecularColor:")
    public native void setSpecularColor(GLKVector4 v);
    @Mapping("spotDirection")
    public native GLKVector3 getSpotDirection();
    @Mapping("setSpotDirection:")
    public native void setSpotDirection(GLKVector3 v);
    @Mapping("spotExponent")
    public native float getSpotExponent();
    @Mapping("setSpotExponent:")
    public native void setSpotExponent(float v);
    @Mapping("spotCutoff")
    public native float getSpotCutoff();
    @Mapping("setSpotCutoff:")
    public native void setSpotCutoff(float v);
    @Mapping("constantAttenuation")
    public native float getConstantAttenuation();
    @Mapping("setConstantAttenuation:")
    public native void setConstantAttenuation(float v);
    @Mapping("linearAttenuation")
    public native float getLinearAttenuation();
    @Mapping("setLinearAttenuation:")
    public native void setLinearAttenuation(float v);
    @Mapping("quadraticAttenuation")
    public native float getQuadraticAttenuation();
    @Mapping("setQuadraticAttenuation:")
    public native void setQuadraticAttenuation(float v);
    @Mapping("transform")
    public native GLKEffectPropertyTransform getTransform();
    @Mapping("setTransform:")
    public native void setTransform(GLKEffectPropertyTransform v);

    
    


}
