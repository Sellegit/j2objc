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
@Library("GLKit/GLKit.h") @Mapping("GLKEffectPropertyTransform")
public class GLKEffectPropertyTransform 
    extends GLKEffectProperty 
     {

    
    
    @Mapping("init")
    public GLKEffectPropertyTransform() { }

    
    @Mapping("modelviewMatrix")
    public native GLKMatrix4 getModelviewMatrix();
    @Mapping("setModelviewMatrix:")
    public native void setModelviewMatrix(GLKMatrix4 v);
    @Mapping("projectionMatrix")
    public native GLKMatrix4 getProjectionMatrix();
    @Mapping("setProjectionMatrix:")
    public native void setProjectionMatrix(GLKMatrix4 v);
    @Mapping("normalMatrix")
    public native GLKMatrix3 getNormalMatrix();

    
    


}
