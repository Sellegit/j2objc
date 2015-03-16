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

@Library("GLKit/GLKit.h") @Mapping("GLKEffectPropertyMaterial")
public class GLKEffectPropertyMaterial 
    extends GLKEffectProperty 
     {

    
    
    public GLKEffectPropertyMaterial() {}
    
    
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
    @Mapping("emissiveColor")
    public native GLKVector4 getEmissiveColor();
    @Mapping("setEmissiveColor:")
    public native void setEmissiveColor(GLKVector4 v);
    @Mapping("shininess")
    public native float getShininess();
    @Mapping("setShininess:")
    public native void setShininess(float v);
    
    
    
    
    
}
