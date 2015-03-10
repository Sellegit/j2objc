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

@Library("GLKit") @Mapping("GLKBaseEffect")
public class GLKBaseEffect 
    extends NSObject 
    implements GLKNamedEffect {

    
    
    public GLKBaseEffect() {}
    
    
    @Mapping("colorMaterialEnabled")
    public native boolean isColorMaterialEnabled();
    public native void setColorMaterialEnabled(boolean v);
    @Mapping("lightModelTwoSided")
    public native boolean isLightModelTwoSided();
    public native void setLightModelTwoSided(boolean v);
    @Mapping("useConstantColor")
    public native boolean usesConstantColor();
    public native void setUsesConstantColor(boolean v);
    @Mapping("transform")
    public native GLKEffectPropertyTransform getTransform();
    @Mapping("light0")
    public native GLKEffectPropertyLight getLight0();
    @Mapping("light1")
    public native GLKEffectPropertyLight getLight1();
    @Mapping("light2")
    public native GLKEffectPropertyLight getLight2();
    @Mapping("lightingType")
    public native @Representing("GLKLightingType") int getLightingType();
    public native void setLightingType(@Representing("GLKLightingType") int v);
    @Mapping("lightModelAmbientColor")
    public native GLKVector4 getLightModelAmbientColor();
    public native void setLightModelAmbientColor(GLKVector4 v);
    @Mapping("material")
    public native GLKEffectPropertyMaterial getMaterial();
    @Mapping("texture2d0")
    public native GLKEffectPropertyTexture getTexture2d0();
    @Mapping("texture2d1")
    public native GLKEffectPropertyTexture getTexture2d1();
    @Mapping("textureOrder")
    public native NSArray<GLKEffectPropertyTexture> getTextureOrder();
    public native void setTextureOrder(NSArray<GLKEffectPropertyTexture> v);
    @Mapping("constantColor")
    public native GLKVector4 getConstantColor();
    public native void setConstantColor(GLKVector4 v);
    @Mapping("fog")
    public native GLKEffectPropertyFog getFog();
    @Mapping("label")
    public native String getLabel();
    public native void setLabel(String v);
    
    
    
    @Mapping("prepareToDraw")
    public native void prepareToDraw();
    
}
