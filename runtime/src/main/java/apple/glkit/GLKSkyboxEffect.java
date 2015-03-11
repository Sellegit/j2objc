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

@Library("GLKit") @Mapping("GLKSkyboxEffect")
public class GLKSkyboxEffect 
    extends NSObject 
    implements GLKNamedEffect {

    
    
    public GLKSkyboxEffect() {}
    
    
    @Mapping("center")
    public native GLKVector3 getCenter();
    @Mapping("setCenter:")
    public native void setCenter(GLKVector3 v);
    @Mapping("xSize")
    public native float getXSize();
    @Mapping("setXSize:")
    public native void setXSize(float v);
    @Mapping("ySize")
    public native float getYSize();
    @Mapping("setYSize:")
    public native void setYSize(float v);
    @Mapping("zSize")
    public native float getZSize();
    @Mapping("setZSize:")
    public native void setZSize(float v);
    @Mapping("textureCubeMap")
    public native GLKEffectPropertyTexture getTextureCubeMap();
    @Mapping("transform")
    public native GLKEffectPropertyTransform getTransform();
    @Mapping("label")
    public native String getLabel();
    @Mapping("setLabel:")
    public native void setLabel(String v);
    
    
    
    @Mapping("prepareToDraw")
    public native void prepareToDraw();
    @Mapping("draw")
    public native void draw();
    
}
