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
@Mapping("GLKMatrixStackRef") @Library("GLKit/GLKit.h")
public class GLKMatrixStack 
    extends CFType 
     {

    
    
    protected GLKMatrixStack() {}

    
    
    
    @GlobalFunction("GLKMatrixStackCreate")
    public static native GLKMatrixStack create(CFAllocator alloc);
    @GlobalFunction("GLKMatrixStackGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("GLKMatrixStackPush")
    public static native void push(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackPop")
    public static native void pop(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackSize")
    public static native int size(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackLoadMatrix4")
    public static native void loadMatrix4(GLKMatrixStack stack, GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrixStackGetMatrix4")
    public static native GLKMatrix4 getMatrix4(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix3")
    public static native GLKMatrix3 getMatrix3(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix2")
    public static native GLKMatrix2 getMatrix2(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix4Inverse")
    public static native GLKMatrix4 getMatrix4Inverse(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix4InverseTranspose")
    public static native GLKMatrix4 getMatrix4InverseTranspose(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix3Inverse")
    public static native GLKMatrix3 getMatrix3Inverse(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackGetMatrix3InverseTranspose")
    public static native GLKMatrix3 getMatrix3InverseTranspose(GLKMatrixStack stack);
    @GlobalFunction("GLKMatrixStackMultiplyMatrix4")
    public static native void multiplyMatrix4(GLKMatrixStack stack, GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrixStackMultiplyMatrixStack")
    public static native void multiplyMatrixStack(GLKMatrixStack stackLeft, GLKMatrixStack stackRight);
    @GlobalFunction("GLKMatrixStackTranslate")
    public static native void translate(GLKMatrixStack stack, float tx, float ty, float tz);
    @GlobalFunction("GLKMatrixStackTranslateWithVector3")
    public static native void translate(GLKMatrixStack stack, GLKVector3 translationVector);
    @GlobalFunction("GLKMatrixStackTranslateWithVector4")
    public static native void translate(GLKMatrixStack stack, GLKVector4 translationVector);
    @GlobalFunction("GLKMatrixStackScale")
    public static native void scale(GLKMatrixStack stack, float sx, float sy, float sz);
    @GlobalFunction("GLKMatrixStackScaleWithVector3")
    public static native void scale(GLKMatrixStack stack, GLKVector3 scaleVector);
    @GlobalFunction("GLKMatrixStackScaleWithVector4")
    public static native void scale(GLKMatrixStack stack, GLKVector4 scaleVector);
    @GlobalFunction("GLKMatrixStackRotate")
    public static native void rotate(GLKMatrixStack stack, float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrixStackRotateWithVector3")
    public static native void rotate(GLKMatrixStack stack, float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKMatrixStackRotateWithVector4")
    public static native void rotate(GLKMatrixStack stack, float radians, GLKVector4 axisVector);
    @GlobalFunction("GLKMatrixStackRotateX")
    public static native void rotateX(GLKMatrixStack stack, float radians);
    @GlobalFunction("GLKMatrixStackRotateY")
    public static native void rotateY(GLKMatrixStack stack, float radians);
    @GlobalFunction("GLKMatrixStackRotateZ")
    public static native void rotateZ(GLKMatrixStack stack, float radians);

}
