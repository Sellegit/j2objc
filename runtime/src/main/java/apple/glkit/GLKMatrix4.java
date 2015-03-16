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





@Mapping("GLKMatrix4") @Library("GLKit/GLKit.h")
public class GLKMatrix4 
    extends Struct 
     {

    
    protected GLKMatrix4() {}
    
    
    @DotMapping("m")
    public native FloatBuffer getM();
    
    public static native GLKMatrix4 create(FloatBuffer m) /*-[
        GLKMatrix4 __new = { .m = m };
        return __new;
    ]-*/;
    public static native GLKMatrix4 copyWithm(GLKMatrix4 original, FloatBuffer m) /*-[
        original.m = m;
        return original;
    ]-*/;

    
    @GlobalConstant("GLKMatrix4Identity")
    public static native GLKMatrix4 Identity();
    
    @GlobalFunction("GLKMatrix4Make")
    public static native GLKMatrix4 createPrime(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33);
    @GlobalFunction("GLKMatrix4MakeAndTranspose")
    public static native GLKMatrix4 createAndTranspose(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33);
    @GlobalFunction("GLKMatrix4MakeWithArray")
    public static native GLKMatrix4 createPrime(FloatBuffer values);
    @GlobalFunction("GLKMatrix4MakeWithArrayAndTranspose")
    public static native GLKMatrix4 createAndTranspose(FloatBuffer values);
    @GlobalFunction("GLKMatrix4MakeWithRows")
    public static native GLKMatrix4 createWithRows(GLKVector4 row0, GLKVector4 row1, GLKVector4 row2, GLKVector4 row3);
    @GlobalFunction("GLKMatrix4MakeWithColumns")
    public static native GLKMatrix4 createWithColumns(GLKVector4 column0, GLKVector4 column1, GLKVector4 column2, GLKVector4 column3);
    @GlobalFunction("GLKMatrix4MakeWithQuaternion")
    public static native GLKMatrix4 createPrime(GLKQuaternion quaternion);
    @GlobalFunction("GLKMatrix4MakeTranslation")
    public static native GLKMatrix4 createTranslation(float tx, float ty, float tz);
    @GlobalFunction("GLKMatrix4MakeScale")
    public static native GLKMatrix4 createScale(float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix4MakeRotation")
    public static native GLKMatrix4 createRotation(float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix4MakeXRotation")
    public static native GLKMatrix4 createXRotation(float radians);
    @GlobalFunction("GLKMatrix4MakeYRotation")
    public static native GLKMatrix4 createYRotation(float radians);
    @GlobalFunction("GLKMatrix4MakeZRotation")
    public static native GLKMatrix4 createZRotation(float radians);
    @GlobalFunction("GLKMatrix4MakePerspective")
    public static native GLKMatrix4 createPerspective(float fovyRadians, float aspect, float nearZ, float farZ);
    @GlobalFunction("GLKMatrix4MakeFrustum")
    public static native GLKMatrix4 createFrustum(float left, float right, float bottom, float top, float nearZ, float farZ);
    @GlobalFunction("GLKMatrix4MakeOrtho")
    public static native GLKMatrix4 createOrtho(float left, float right, float bottom, float top, float nearZ, float farZ);
    @GlobalFunction("GLKMatrix4MakeLookAt")
    public static native GLKMatrix4 createLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ);
    @GlobalFunction("GLKMatrix4GetMatrix3")
    public static native GLKMatrix3 getMatrix3(GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrix4GetMatrix2")
    public static native GLKMatrix2 getMatrix2(GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrix4GetRow")
    public static native GLKVector4 getRow(GLKMatrix4 matrix, int row);
    @GlobalFunction("GLKMatrix4GetColumn")
    public static native GLKVector4 getColumn(GLKMatrix4 matrix, int column);
    @GlobalFunction("GLKMatrix4SetRow")
    public static native GLKMatrix4 setRow(GLKMatrix4 matrix, int row, GLKVector4 vector);
    @GlobalFunction("GLKMatrix4SetColumn")
    public static native GLKMatrix4 setColumn(GLKMatrix4 matrix, int column, GLKVector4 vector);
    @GlobalFunction("GLKMatrix4Transpose")
    public static native GLKMatrix4 transpose(GLKMatrix4 matrix);
    @GlobalFunction("GLKMatrix4Invert")
    public static native GLKMatrix4 invert(GLKMatrix4 matrix, Todo isInvertible);
    @GlobalFunction("GLKMatrix4InvertAndTranspose")
    public static native GLKMatrix4 invertAndTranspose(GLKMatrix4 matrix, Todo isInvertible);
    @GlobalFunction("GLKMatrix4Multiply")
    public static native GLKMatrix4 multiply(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight);
    @GlobalFunction("GLKMatrix4Add")
    public static native GLKMatrix4 add(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight);
    @GlobalFunction("GLKMatrix4Subtract")
    public static native GLKMatrix4 subtract(GLKMatrix4 matrixLeft, GLKMatrix4 matrixRight);
    @GlobalFunction("GLKMatrix4Translate")
    public static native GLKMatrix4 translate(GLKMatrix4 matrix, float tx, float ty, float tz);
    @GlobalFunction("GLKMatrix4TranslateWithVector3")
    public static native GLKMatrix4 translateWithVector3(GLKMatrix4 matrix, GLKVector3 translationVector);
    @GlobalFunction("GLKMatrix4TranslateWithVector4")
    public static native GLKMatrix4 translateWithVector4(GLKMatrix4 matrix, GLKVector4 translationVector);
    @GlobalFunction("GLKMatrix4Scale")
    public static native GLKMatrix4 scale(GLKMatrix4 matrix, float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix4ScaleWithVector3")
    public static native GLKMatrix4 scaleWithVector3(GLKMatrix4 matrix, GLKVector3 scaleVector);
    @GlobalFunction("GLKMatrix4ScaleWithVector4")
    public static native GLKMatrix4 scaleWithVector4(GLKMatrix4 matrix, GLKVector4 scaleVector);
    @GlobalFunction("GLKMatrix4Rotate")
    public static native GLKMatrix4 rotate(GLKMatrix4 matrix, float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix4RotateWithVector3")
    public static native GLKMatrix4 rotateWithVector3(GLKMatrix4 matrix, float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKMatrix4RotateWithVector4")
    public static native GLKMatrix4 rotateWithVector4(GLKMatrix4 matrix, float radians, GLKVector4 axisVector);
    @GlobalFunction("GLKMatrix4RotateX")
    public static native GLKMatrix4 rotateX(GLKMatrix4 matrix, float radians);
    @GlobalFunction("GLKMatrix4RotateY")
    public static native GLKMatrix4 rotateY(GLKMatrix4 matrix, float radians);
    @GlobalFunction("GLKMatrix4RotateZ")
    public static native GLKMatrix4 rotateZ(GLKMatrix4 matrix, float radians);
    @GlobalFunction("GLKMatrix4MultiplyVector3")
    public static native GLKVector3 multiplyVector3(GLKMatrix4 matrixLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKMatrix4MultiplyVector3WithTranslation")
    public static native GLKVector3 multiplyVector3WithTranslation(GLKMatrix4 matrixLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKMatrix4MultiplyAndProjectVector3")
    public static native GLKVector3 multiplyAndProjectVector3(GLKMatrix4 matrixLeft, GLKVector3 vectorRight);
    @GlobalFunction("GLKMatrix4MultiplyVector3Array")
    public static native void multiplyVector3Array(GLKMatrix4 matrix, GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    @GlobalFunction("GLKMatrix4MultiplyVector3ArrayWithTranslation")
    public static native void multiplyVector3ArrayWithTranslation(GLKMatrix4 matrix, GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    @GlobalFunction("GLKMatrix4MultiplyAndProjectVector3Array")
    public static native void multiplyAndProjectVector3Array(GLKMatrix4 matrix, GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    @GlobalFunction("GLKMatrix4MultiplyVector4")
    public static native GLKVector4 multiplyVector4(GLKMatrix4 matrixLeft, GLKVector4 vectorRight);
    @GlobalFunction("GLKMatrix4MultiplyVector4Array")
    public static native void multiplyVector4Array(GLKMatrix4 matrix, GLKVector4 vectors, @MachineSizedUInt long vectorCount);
    
}
