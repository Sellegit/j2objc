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


/*<javadoc>*/
/*</javadoc>*/
@Library("GLKit")
public class GLKMatrixStack 
    extends CFType 
     {

    
    
    protected GLKMatrixStack() {}
    
    
    
    
    @GlobalFunction("GLKMatrixStackCreate")
    public static native GLKMatrixStack create(CFAllocator alloc);
    @GlobalFunction("GLKMatrixStackGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("GLKMatrixStackPush")
    public native void push();
    @GlobalFunction("GLKMatrixStackPop")
    public native void pop();
    @GlobalFunction("GLKMatrixStackSize")
    public native int size();
    @GlobalFunction("GLKMatrixStackLoadMatrix4")
    public native void loadMatrix4(GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrixStackGetMatrix4")
    public native GLKMatrix4 getMatrix4();
    @GlobalFunction("GLKMatrixStackGetMatrix3")
    public native GLKMatrix3 getMatrix3();
    @GlobalFunction("GLKMatrixStackGetMatrix2")
    public native GLKMatrix2 getMatrix2();
    @GlobalFunction("GLKMatrixStackGetMatrix4Inverse")
    public native GLKMatrix4 getMatrix4Inverse();
    @GlobalFunction("GLKMatrixStackGetMatrix4InverseTranspose")
    public native GLKMatrix4 getMatrix4InverseTranspose();
    @GlobalFunction("GLKMatrixStackGetMatrix3Inverse")
    public native GLKMatrix3 getMatrix3Inverse();
    @GlobalFunction("GLKMatrixStackGetMatrix3InverseTranspose")
    public native GLKMatrix3 getMatrix3InverseTranspose();
    @GlobalFunction("GLKMatrixStackMultiplyMatrix4")
    public native void multiplyMatrix4(GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrixStackMultiplyMatrixStack")
    public native void multiplyMatrixStack(GLKMatrixStack stackRight);
    @GlobalFunction("GLKMatrixStackTranslate")
    public native void translate(float tx, float ty, float tz);
    @GlobalFunction("GLKMatrixStackTranslateWithVector3")
    public native void translate(GLKVector3 translationVector);
    @GlobalFunction("GLKMatrixStackTranslateWithVector4")
    public native void translate(GLKVector4 translationVector);
    @GlobalFunction("GLKMatrixStackScale")
    public native void scale(float sx, float sy, float sz);
    @GlobalFunction("GLKMatrixStackScaleWithVector3")
    public native void scale(GLKVector3 scaleVector);
    @GlobalFunction("GLKMatrixStackScaleWithVector4")
    public native void scale(GLKVector4 scaleVector);
    @GlobalFunction("GLKMatrixStackRotate")
    public native void rotate(float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrixStackRotateWithVector3")
    public native void rotate(float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKMatrixStackRotateWithVector4")
    public native void rotate(float radians, GLKVector4 axisVector);
    @GlobalFunction("GLKMatrixStackRotateX")
    public native void rotateX(float radians);
    @GlobalFunction("GLKMatrixStackRotateY")
    public native void rotateY(float radians);
    @GlobalFunction("GLKMatrixStackRotateZ")
    public native void rotateZ(float radians);
    
}
