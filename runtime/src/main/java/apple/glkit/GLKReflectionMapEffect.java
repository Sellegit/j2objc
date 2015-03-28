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
@Library("GLKit/GLKit.h") @Mapping("GLKReflectionMapEffect")
public class GLKReflectionMapEffect 
    extends GLKBaseEffect 
    implements GLKNamedEffect {

    
    
    @Mapping("init")
    public GLKReflectionMapEffect() { }

    
    @Mapping("textureCubeMap")
    public native GLKEffectPropertyTexture getTextureCubeMap();
    @Mapping("matrix")
    public native GLKMatrix3 getMatrix();
    @Mapping("setMatrix:")
    public native void setMatrix(GLKMatrix3 v);

    
    
    @Mapping("prepareToDraw")
    public native void prepareToDraw();

}
