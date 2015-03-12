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





@Mapping("GLKMatrix3") @Library("GLKit")
public class GLKMatrix3 
    extends Struct 
     {

    
    protected GLKMatrix3() {}
    
    
    @DotMapping("m")
    public native FloatBuffer getM();
    
    public static native GLKMatrix3 create(FloatBuffer m) /*-[
        GLKMatrix3 __new = { .m = m };
        return __new;
    ]-*/;
    public static native GLKMatrix3 copyWithm(GLKMatrix3 original, FloatBuffer m) /*-[
        original.m = m;
        return original;
    ]-*/;

    
    @GlobalConstant("GLKMatrix3Identity")
    public static native GLKMatrix3 Identity();
    
    @GlobalFunction("GLKMatrix3Make")
    public static native GLKMatrix3 createPrime(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22);
    @GlobalFunction("GLKMatrix3MakeAndTranspose")
    public static native GLKMatrix3 createAndTranspose(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22);
    @GlobalFunction("GLKMatrix3MakeWithArray")
    public static native GLKMatrix3 createPrime(FloatBuffer values);
    @GlobalFunction("GLKMatrix3MakeWithArrayAndTranspose")
    public static native GLKMatrix3 createAndTranspose(FloatBuffer values);
    @GlobalFunction("GLKMatrix3MakeWithRows")
    public static native GLKMatrix3 createWithRows(GLKVector3 row0, GLKVector3 row1, GLKVector3 row2);
    @GlobalFunction("GLKMatrix3MakeWithColumns")
    public static native GLKMatrix3 createWithColumns(GLKVector3 column0, GLKVector3 column1, GLKVector3 column2);
    @GlobalFunction("GLKMatrix3MakeWithQuaternion")
    public static native GLKMatrix3 createPrime(GLKQuaternion quaternion);
    @GlobalFunction("GLKMatrix3MakeScale")
    public static native GLKMatrix3 createScale(float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix3MakeRotation")
    public static native GLKMatrix3 createRotation(float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix3MakeXRotation")
    public static native GLKMatrix3 createXRotation(float radians);
    @GlobalFunction("GLKMatrix3MakeYRotation")
    public static native GLKMatrix3 createYRotation(float radians);
    @GlobalFunction("GLKMatrix3MakeZRotation")
    public static native GLKMatrix3 createZRotation(float radians);
    @GlobalFunction("GLKMatrix3GetMatrix2")
    public native GLKMatrix2 getMatrix2();
    @GlobalFunction("GLKMatrix3GetRow")
    public native GLKVector3 getRow(int row);
    @GlobalFunction("GLKMatrix3GetColumn")
    public native GLKVector3 getColumn(int column);
    @GlobalFunction("GLKMatrix3SetRow")
    public native GLKMatrix3 setRow(int row, GLKVector3 vector);
    @GlobalFunction("GLKMatrix3SetColumn")
    public native GLKMatrix3 setColumn(int column, GLKVector3 vector);
    @GlobalFunction("GLKMatrix3Transpose")
    public native GLKMatrix3 transpose();
    @GlobalFunction("GLKMatrix3Invert")
    public native GLKMatrix3 invert(Todo isInvertible);
    @GlobalFunction("GLKMatrix3InvertAndTranspose")
    public native GLKMatrix3 invertAndTranspose(Todo isInvertible);
    @GlobalFunction("GLKMatrix3Multiply")
    public native GLKMatrix3 multiply(GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Add")
    public native GLKMatrix3 add(GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Subtract")
    public native GLKMatrix3 subtract(GLKMatrix3 matrixRight);
    @GlobalFunction("GLKMatrix3Scale")
    public native GLKMatrix3 scale(float sx, float sy, float sz);
    @GlobalFunction("GLKMatrix3ScaleWithVector3")
    public native GLKMatrix3 scale(GLKVector3 scaleVector);
    @GlobalFunction("GLKMatrix3ScaleWithVector4")
    public native GLKMatrix3 scale(GLKVector4 scaleVector);
    @GlobalFunction("GLKMatrix3Rotate")
    public native GLKMatrix3 rotate(float radians, float x, float y, float z);
    @GlobalFunction("GLKMatrix3RotateWithVector3")
    public native GLKMatrix3 rotate(float radians, GLKVector3 axisVector);
    @GlobalFunction("GLKMatrix3RotateWithVector4")
    public native GLKMatrix3 rotate(float radians, GLKVector4 axisVector);
    @GlobalFunction("GLKMatrix3RotateX")
    public native GLKMatrix3 rotateX(float radians);
    @GlobalFunction("GLKMatrix3RotateY")
    public native GLKMatrix3 rotateY(float radians);
    @GlobalFunction("GLKMatrix3RotateZ")
    public native GLKMatrix3 rotateZ(float radians);
    @GlobalFunction("GLKMatrix3MultiplyVector3")
    public native GLKVector3 multiplyVector3(GLKVector3 vectorRight);
    @GlobalFunction("GLKMatrix3MultiplyVector3Array")
    public native void multiplyVector3Array(GLKVector3 vectors, @MachineSizedUInt long vectorCount);
    
}
